/*Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
We define a token to be one or more consecutive English alphabetic letters. 
Then, print the number of tokens, followed by each token on a new line. */

import java.util.*;
public class string_token {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s=s.trim();
        String token[] = s.split("[^a-zA-Z]+");
        
        if(s.length()==0){
            System.out.println(0);
        }else{
            System.out.println(token.length);
        }
        for(String word:token){    //enhanced-for-loop
            System.out.println(word);
        }
        scan.close();
    }
}

//to learn about enhanced for loop visit: https://www.programiz.com/java-programming/enhanced-for-loop

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)