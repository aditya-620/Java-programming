//find permutation of a string
public class permutations {
    public static void findPermutation(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0; i<str.length();i++){
            char curr = str.charAt(i);
            //"abcde" => "ab" +" de" => "abde"
            String Newstr = str.substring(0, i) + str.substring(i+1);
            findPermutation(Newstr, ans+curr);
        }
    }
}

//Time Complexity : o(n*n!)

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)