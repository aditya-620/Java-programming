//tree traversal
//(a) preorder traversal
//(b) inorder traversal
//(c) postorder traversal
//(d) levelorder traversal

import java.util.*;
import java.util.LinkedList;
public class tree_traversal {
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

        //(a) preorder traversal
        public static void preorder(Node root){   //O(n)
            if(root == null){
                return;
            }
            System.out.print(root.data +" ");
            preorder(root.left);
            preorder(root.right);
        } 

        //(b) inorder traversal
        public static void inorder(Node root){   //O(n)
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data +" ");
            inorder(root.right);
        }

        //(c) postorder traversal
        public static void postorder(Node root){   //O(n)
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data +" ");
        }

        //(d) levelorder traversal
        public static void levelorder(Node root){   //O(n)
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data +" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String args[]){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};  //-1 represents null nodes
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("PRE ORDER TRAVERSAL:");
        tree.preorder(root);
        System.out.println("\nIN ORDER TRAVERSAL:");
        tree.inorder(root);
        System.out.println("\nPOST ORDER TRAVERSAL:");
        tree.postorder(root);
        System.out.println("\nLEVEL ORDER TRAVERSAL:");
        tree.levelorder(root);
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)