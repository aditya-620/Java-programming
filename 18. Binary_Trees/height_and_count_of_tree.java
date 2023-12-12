//program to find the height and count of tree

public class height_and_count_of_tree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){   
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }
    
    public static void main(String args[]){
        /*
                    1
                   / \
                  2   3
                 / \ / \
                4  5 6  7
         */
        Node root =new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
    
        System.out.println("height of tree: " +height(root));
        System.out.println("count of tree: " +count(root));
    }
}

//Time Complexity: O(n)

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)