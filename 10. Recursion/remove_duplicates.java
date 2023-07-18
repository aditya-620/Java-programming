//program to remove duplicates in a string
public class remove_duplicates {
    public static void removeDuplicates(String str, int idx, StringBuilder newstr, boolean map[]){
        //base case
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            //duplicate
            removeDuplicates(str, idx+1, newstr, map);
        }else{
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newstr.append(currChar), map);
        }
    }
    public static void main(String args[]){
        String str = "adityarastogi";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-) 