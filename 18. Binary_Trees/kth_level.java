//kth level of a tree

import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class kth_level {
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
    public static void Klevel_1(Node root, int level, int k){
        if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    if(q.isEmpty()){
                        break;
                    } else {
                        level++;
                        q.add(null);
                    }
                } else {
                    if(k == level){
                        System.out.print(currNode.data +" ");
                    }
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
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

        Klevel_1(root,1,3);
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)