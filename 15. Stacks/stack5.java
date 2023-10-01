//reverse a string using stack - microsoft,flipkart,adobe,paytm

import java.util.*;
public class stack5 {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();  //tostring is used to convert stringbuilder to string
    }
    public static void main(String args[]){
        String str = "abc";
        String result = reverseString(str);
        System.out.println(result);
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)