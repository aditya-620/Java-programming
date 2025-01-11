public class mirrorBST {
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
    public static Node createMirror(Node root){
        if(root == null){
            return null;
        }
        Node leftMirrorSubTree = createMirror(root.left);
        Node rightMirrorSubTree = createMirror(root.right);

        root.left = rightMirrorSubTree;
        root.right = leftMirrorSubTree;

        return root;
    }
    public static void main(String[] args) {
        int val[] = {8, 5, 10, 3, 6, 11, 14, 1, 4};
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);
        }

        inOrder(root);
        System.out.println();
        createMirror(root);
        inOrder(root);
    }
}
