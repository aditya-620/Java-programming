//Asked in UBER

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCode {
    static class HashMap<K, V> {  //Here, <K,V> are called as generics
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }


        private int n;   //number of key-value pairs
        private int N;
        private LinkedList<Node> buckets[];  //array of linkedlist

        //@SuppressWarnings("unchecked") is used beacuse we are not defining the type of the LinkedList at the time of creation in the array
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;

            //at this step array is created but it is empty
            this.buckets = new LinkedList[4];  //initial capacity

            for(int i = 0; i < 4; i++){
                //here, we are creating a linkedlist at each index of the array
                //and LL is empty at this point
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int SearchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];   //storing the linkedlist at the bucket index

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                int di = 0;

                if(node.key.equals(key)){
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")  
        private void rehash(){
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[2*N];
            N = 2*N;

            for(int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

            //nodes -> add in buckets
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        //tc: o(1)
        public void put(K key, V value){
            int bi = hashFunction(key);  //bucket index -> 0 to buckets.length - 1 (i.e. 0 - 3)
            int di = SearchInLL(key, bi);  //data index, -1 if not found, and index if found in the linkedlist

            //if node already present, then update the value
            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }


            double lambda = (double)n/N;  //load factor
            if(lambda > 2.0){
                rehash();
            }
        }

        //tc: o(1)
        public boolean containsKey(K key){
            int bi = hashFunction(key);  
            int di = SearchInLL(key, bi);  

            if(di != -1){
                return true;
            } else {
                return false;
            }
        }

        //tc: o(1)
        public V remove(K key){
            int bi = hashFunction(key);  
            int di = SearchInLL(key, bi);  

            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        //tc: o(1)
        public V get(K key){
            int bi = hashFunction(key);  
            int di = SearchInLL(key, bi);  

            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }  


        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node: ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 135);   
        hm.put("China", 200);
        hm.put("US", 40);
        hm.put("UK", 20);

        ArrayList<String> keys = hm.keySet();
        for(String key : keys){
            System.out.println(key + " -> " + hm.get(key));
        }

        System.out.println(hm.get("India"));
    }
}
