//Code for BINARY SEARCH in a array
public class binary_search {
    public static int binarysearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;
        while (start <= end){
            int mid = (start + end)/2;

            //comparision
            if (numbers[mid] == key){
                return mid;
            }
            if (numbers[mid]<key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("index for the key is: " +binarysearch(numbers, key));
    }
}

//NOTE: Time Complexity of Binary search is: O(log n)

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)