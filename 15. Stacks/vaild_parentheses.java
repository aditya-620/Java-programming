//program to check valid parentheses - stack method(most optimized)
import java.util.*;
public class vaild_parentheses {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            //opening case
            if(ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                //closing case
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' && ch == ')') 
                || (s.peek() == '{' && ch == '}')
                || (s.peek() == '[' && ch == ']')){
                    s.pop();
                } else {
                    return false;
                }
            } 
        }
        if(s.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]){
        String str = "({})[]";
        System.out.println(str +" : " +isValid(str));
        String str1 = "({)[]";
        System.out.println(str1 +" : " +isValid(str1));
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)