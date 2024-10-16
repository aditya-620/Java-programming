import org.w3c.dom.Node;

public class BST_delete {
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

    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        } else if(root.data > val){
            root.left = delete(root.left, val);
        } else {
            //voila
            //case 1: leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2: one child
            if(root.left == null){
                return root.right;
            } else if (root.right == null){
                return root.left;
            }
        
            //case 3: two children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
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

        root = delete(root, 1);
        System.out.println();

        inOrder(root);
    }
}
