// five simple string functions

public class string_functions {
    //refers to function no. 4
    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i =si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    //main block
    public static void main(String args[]){
        String str = "aditya";

        //1. finds string length
        //syntax: string_name.length()
        System.out.println("length: " +str.length());

        //-----------------------------------------------------------------------------------------

        //2. charAt func. find character at particullar index
        //syntax: string_name.charAt(index)
        System.out.println("char at index 0: " +str.charAt(0));

        //-----------------------------------------------------------------------------------------

        //3. compare
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1==s2){
            System.out.println("strings are equal");       ///here o/p will be: strings are equal due to interning
        }else{
            System.out.println("strings are not equal");
        }
        if(s2==s3){
            System.out.println("strings are equal");       
        }else{
            System.out.println("strings are not equal");
        }/*here the o/p will be: strings are not equal, as while using new keyword a new memory is made in heap has s3 points to this new memory */

        //so we will use equals function...
        if(s1.equals(s3)){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equals");
        }

        //-----------------------------------------------------------------------------------------

        //4. substrings
        System.out.println("substring at index (0 to 3): " +substring(str, 0, 3)); 

        //instead to making this func. for substring, java has inbuilt func. for substring
        System.out.println("substring by inbuilt func: " +str.substring(0,3));
    
        //-----------------------------------------------------------------------------------------
    
        //5. to print largest string
        String fruits[] = {"apples" , "mango" , "banana" , "grapes"};

        String largest = fruits[0];
        for(int i = 1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
        /*In compareTo func. 'A' != 'a' and
         * If o/p is 0 : both strings are equal
         * If o/p is <0 : negative value (str1<str2)
         * If o/p is >0 : positive value (str1>str2)
         */
        //Another function known as: compareToIgnoreCase
        //syntax: str_name1.compareToIgnoreCase(str_name2);   here, 'A'=='a'
    }
}

//For more info visit: https://www.w3schools.com/java/java_ref_string.asp

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)