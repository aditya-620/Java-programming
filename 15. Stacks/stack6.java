//reverse a stack using recursion
import java.util.Stack;

public class stack6 {
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
    public static void reverseStack(Stack<Integer> s){
        //base case
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void printStack(Stack<Integer> s){
        //base case
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        System.out.println(top);
        printStack(s);
        s.push(top);
        
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("original stack");
        printStack(s);
        reverseStack(s);
        System.out.println("Reversed stack");
        printStack(s);
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)