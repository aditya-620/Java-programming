//implemenation of stack using java framework

import java.util.*;

public class stack3 {
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();

        //push function to insert value at top in stack
        s.push(1);
        s.push(2);
        s.push(3);

        //isEmpty function to check whether the stack is empty or not
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();  //pop function to delete/remove the top element of the stack
        }
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)