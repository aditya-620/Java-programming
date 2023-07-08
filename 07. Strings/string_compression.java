//program to compress a string
//aaabbcccdd ---> a3b2c3d2

public class string_compression {
    public static String compess(String str){
        StringBuilder newStr = new StringBuilder("");

        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr = newStr.append(str.charAt(i));
            if(count > 1){
                newStr = newStr.append(count.toString());
            }
        }
        return newStr.toString();
    }    

    public static void main(String args[]){
        String str = "aaabbcccdd";
        System.out.println(compess(str));
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)