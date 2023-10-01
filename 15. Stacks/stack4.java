//push at bottom - amazon
//using recursion

import java.util.*;
public class stack4 {
    public static void pushAtBottom(Stack<Integer> s, int data){
        //base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)