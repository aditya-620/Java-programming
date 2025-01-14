public class balancedBST {
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

    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static Node createBST(int arr[], int st, int end){
        if(st > end){
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(arr[mid]);

        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);

        return root;
    }
    public static void main(String[] args) {
        
        int val[] = {1, 3, 4, 5, 6, 10, 11, 14};
        Node root = createBST(val, 0, val.length-1);
        inOrder(root);
        System.out.println();
    }
}
