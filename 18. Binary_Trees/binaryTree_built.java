//program to build binary tree preorder

public class binaryTree_built {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){   //constructor
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //class to build binary tree
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);   //constructor called
            newNode.left = buildTree(nodes);      //recursive calls
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    public static void main(String args[]){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }
}

//Time Complexity: O(n)

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)