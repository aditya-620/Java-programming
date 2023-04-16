// asked: <CODE_NATION>
//For a given string convert each the first letter of each word to uppercase

public class uppercase {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String args[]){
        String str = "hi, i am aditya rastogi";
        System.out.println(toUpperCase(str));
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)