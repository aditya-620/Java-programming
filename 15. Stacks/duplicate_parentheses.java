//program to check the given expression has duplicate parentheses or not
import java.util.*;
public class duplicate_parentheses {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            //closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;  //duplicate
                } else {  
                    s.pop();  //poping the opening bracket
                }
            } else {
                //opening
                s.push(ch);  //opening bracket
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str = "((a+b))"; //true
        String str2 = "(a-b)";  //false

        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)