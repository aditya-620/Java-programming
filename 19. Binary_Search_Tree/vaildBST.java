//snapdeel, amazon, facebook
public class vaildBST {
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
    public static Node insert(Node root, int val){
        if(root == null){
            return new Node(val);
        }

        if(root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        } else {
            //right sbtree
            root.right = insert(root.right, val);
        }

        return root;
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static boolean isvaildBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        } 
        else if(max != null && root.data >= max.data){
            return false;
        } 
        
        return isvaildBST(root.left, min, root) && isvaildBST(root.right, root, max);
    }

    public static void main(String[] args) {
        int val[] = {8, 5, 10, 3, 6, 11, 14, 1, 4};
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);
        }

        inOrder(root);
        System.out.println();

        if(isvaildBST(root, null, null)){
            System.out.println("This is a valid BST");
        } else {
            System.out.println("This is not a valid BST");
        }
    }
}
