//find all the subsets of a string
public class find_subsets {
    public static void findSubsets(String str, String ans, int i){
        //base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("NULL");
            } else {
                System.out.println(ans);
            }
            return;
        }
        //yes condition
        findSubsets(str, ans+str.charAt(i), i+1);
        //no condition
        findSubsets(str, ans, i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
//Time Complexity : o(n*2^n)
//Space Complexity: o(n)

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)