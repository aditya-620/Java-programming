//implementation of stack using arraylist
//stacks operations

import java.util.ArrayList;
import java.util.Stack;

public class stacks1 {
    static class stack{
        static ArrayList<Integer> list = new ArrayList<>();

        //checks whether the stack is empty or not
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push the element at the top of stack
        public static void push(int data){
            list.add(data);  //add at the end
        }

        //pop the top element
        public static int pop(){
            if(isEmpty()){
                return -1;   //if stac is empty
            }
            int top = list.get(list.size()-1); 
            list.remove(list.size()-1);
            return top;
        }

        //peek - returns the top element
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            return top;
        }
    }
    
    public static void main(String args[]){
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)