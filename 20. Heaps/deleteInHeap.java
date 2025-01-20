import java.util.ArrayList;
public class deleteInHeap {
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
        public int peek(){
            return arr.get(0);
        }
        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                heapify(minIdx);
            }
        }

        public int remove(){
            int data = arr.get(0);

            //step-1: swap the first and last element
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);


            //step-2: remove the last element
            arr.remove(arr.size()-1);

            //step-3: heapify
            heapify(0);
            return data;
        }
    }


    public static void main(String args[]){
        Heap hp = new Heap();
        hp.add(2);
        hp.add(3);
        hp.add(4);
        hp.add(5);
        hp.add(10);

        //ele add, which does not satisfy the min heap property
        hp.add(6);
        System.out.println(hp.peek());
        System.out.println("min element removed:" + hp.remove());
        System.out.println("new min ele:" +hp.peek());
    }
}

    
