//program to perform merge sort
public class merge_sort {
    public static void mergeSort(int arr[], int si, int ei){
        //base case
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;  // or mid = (si + ei)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si; //idx for 1st sorted part
        int j = mid+1; //idx for 2nd sorted part
        int k = 0; //idx for temp

        while(i <= mid && j <=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for leftover elements of 1st sorted part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //for leftover elements of 2nd sorted part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void printArr(int arr[]){
        for(int z=0; z<arr.length; z++){
            System.out.print(arr[z] +" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        int si = 0;
        int ei = arr.length-1;
        mergeSort(arr, si, ei);
        printArr(arr);
    }
}

//Time Complexity: O(nlogn)
//Space Complexity: O(n)

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)