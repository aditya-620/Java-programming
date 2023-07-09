//find the first and last occurence of an element
public class occurence {
    //function to find the first occurence
    public static int firstOccurence(int arr[], int key, int i){
        //base case
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    //function to find the last occurence
    public static int lastOccurence(int arr[], int key, int i){
        //base case
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key , i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurence(arr, 5 , 0));
        System.out.println(lastOccurence(arr, 5 , 0));
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-) 