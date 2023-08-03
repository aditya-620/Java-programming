//simple operations on ArrayList
import java.util.ArrayList;
public class intro {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //operations on ArrayList
        //Get operation - O(1)
        int element = list.get(2);
        System.out.println("element at: " +element);

        //delete - O(1)
        list.remove(3);
        System.out.println("element removed: " +list);

        //set - O(n)
        list.set(2, 10);
        System.out.println("element set at index 2: " +list);

        //contains - O(n)
        System.out.println(list.contains(1));

        //add element at index - O(n)
        list.add(1,33);
        System.out.println("element added at index: " +list);

        //size of ArrayList
        int size = list.size();
        System.out.println("size of arraylist: " +size);

        //iteration with the help of size func.
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) +" ");
        }
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)