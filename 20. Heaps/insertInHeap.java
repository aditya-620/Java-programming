import java.util.ArrayList;

public class insertInHeap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            //add at last
            arr.add(data);
            
            int x = arr.size()-1; //x is the child index
            int par = (x-1)/2; //par is the parent index

            while(arr.get(x) < arr.get(par)){   //O(logn)
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }
    }
    public static void main(String args[]){

    }
}


// Time Complexity: O(logn) because we are traversing the height of the tree