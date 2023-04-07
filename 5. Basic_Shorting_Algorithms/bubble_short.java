//PROGRAM FOR BASIC BUBBLE SHORT
public class bubble_short {
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            boolean swapped = false;
            for(int j=0; j<arr.length-1-i ; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped =  false){
                break;
            }
        }
    }
    //loop to print the shorted array
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        printarr(arr);
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)