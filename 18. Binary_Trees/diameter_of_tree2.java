//Diameter of a Tree - approach 2

public class diameter_of_tree2 {
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
    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);  //it will return an object
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

        System.out.println("Diameter of the tree: " +diameter(root).diam);
        System.out.println("Height of the tree: " +diameter(root).ht);
    }
}

//Time Complexity: O(n)

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)