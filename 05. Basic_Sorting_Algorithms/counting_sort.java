//BASIC PROGRAM FOR COUNTING SORT
public class counting_sort{
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //shorting
        int j= 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {1,4,1,3,2,4,3,7};
        countingSort(arr);
        printarr(arr);
    }
}

//NOTE: Time Complexity = O(N + range) 

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)