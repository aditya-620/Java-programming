//BASIC PROGRAM FOR INSERTION SHORT
public class insertion_short {
    public static void insertionShort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct position  to insert
            while(prev>=0 && arr[prev] > curr){        //arr[prev] < curr {for decending order}
                arr[prev+1] = arr[prev];
                prev--;
            }
            System.out.println(prev);
            //insertion
            arr[prev+1] = curr;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        insertionShort(arr);
        printarr(arr);
    }
}

//NOTE: Time Complexity = O(N^2)

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)