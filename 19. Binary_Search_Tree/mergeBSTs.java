import java.util.ArrayList;

public class mergeBSTs {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void getInOrder(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }

        getInOrder(root.left, arr);
        arr.add(root.data);
        getInOrder(root.right, arr);
    }
    
    
    public static Node mergeBST(Node root1, Node root2){
        //step 1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInOrder(root1, arr1);

        //step 2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInOrder(root2, arr2);

        //merge
        int i=0, j=0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            } else {
                finalArr.add(arr2.get(j));
                j++;
            } 
        }
        while(i<arr1.size()){
            finalArr.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            finalArr.add(arr2.get(j));
            j++;
        }

        //construct BST from finalArr
        return constructBST(finalArr, 0, finalArr.size()-1);
    }

    public static Node constructBST(ArrayList<Integer> arr, int start, int end){
        if(start > end){
            return null;
        }

        int mid = start + (end-start)/2;
        Node root = new Node(arr.get(mid));
        root.left = constructBST(arr, start, mid-1);
        root.right = constructBST(arr, mid+1, end);

        return root;
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1, root2);
        preOrder(root);
    }
}


//time complexity: O(n+m) -> linear