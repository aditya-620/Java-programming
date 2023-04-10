//BASIC PROGRAM FOR SELECTION SHORT
public class selection_sort {
    public static void sectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;     //assuming that our current position has minimum value
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){    //comparing our min value with other value
                    minPos = j;             //(arr[minPos] < arr[j]) for decending order
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
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
        sectionSort(arr);
        printarr(arr);
    }
}

//NOTE: Time Complexity = O(N^2) 

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)