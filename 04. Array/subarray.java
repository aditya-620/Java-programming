//program to find subarray
public class subarray {
    public static void subarrays(int numbers[]){
        int ts = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                
                //to print subarray
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total number os subarrays are: " + ts);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        subarrays(numbers);
    }
    
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)