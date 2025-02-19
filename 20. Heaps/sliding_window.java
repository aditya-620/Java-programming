//sliding window maximum - HARD
//maximum of all subarrays of size k

import java.util.PriorityQueue;

class sliding_window{
    static class Pair implements Comparable<Pair>{
        int val;
        int idx;

        public Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2){
            //ascending
            // return this.val - p2.val;

            //descending sorting of PQ
            return p2.val - this.val;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;  //size of window
        int res[] = new int[arr.length - k + 1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        //adding 1st window ele in PQ
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }

        //adding the 1st max ele in result array
        res[0] = pq.peek().val;

        //sliding window
        for (int i = k; i < arr.length; i++) {
            // remove the first elements of PQ which are out of window
            while(pq.size() > 0 && pq.peek().idx <= (i-k)){
                pq.remove();
            }

            //add the new element in PQ
            //which is the last element of window, 
            //as we move our window forward the new ele will be the last ele of window
            pq.add(new Pair(arr[i], i));

            //add the max ele of window in result array
            res[i-k+1] = pq.peek().val;
        }

        //print result
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}

//Time complexity: O(nlogk)