//program to find the maximum and minimun number in an array!!
public class array3 {
    public static void max_min(int numbers[]){
        int largest = Integer.MIN_VALUE;    //Largest = -infinity
        int smallest = Integer.MAX_VALUE;   //Smallest = +infinity

        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Largest: " +largest);
        System.out.println("Smallest: " +smallest);

    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14};
        max_min(numbers);
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)