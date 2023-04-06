//linear search program
public class linear_search {
    public static int _linear_search(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = _linear_search(numbers,key);
        if (index == -1){
            System.out.println("NOT FOUND");
        } else{
            System.out.println("Key is at index: " +index);
        }
    }
}
//NOTE: Time Complexity of linear search is: O(n)

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)   