public class word_break {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false; // end of word

        Node() {
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true; // mark the end of word
    }

    public static boolean search(String key){
        Node curr = root;
        for(int level=0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';

            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true; // return true if end of word is reached
    }

    public static boolean wordBreak(String key){  //O(L) - linear Time complexity, where L is the length of the string
        //base case
        if(key.length() == 0){
            return true;  
        }

        for(int i=1; i<=key.length(); i++){
            if(search(key.substring(0, i)) && wordBreak(key.substring(i))){
                return true; // if the word is found in the trie and the remaining string can also be segmented
            }
        }
        return false; // if no segmentation is possible
    }

    public static void main(String[] args) {
        String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};   // words to insert
        
        for(int i=0; i<arr.length; i++){
            insert(arr[i]);
        }
        String key = "ilikesamsung"; // string which is to be partitioned, so we can check if it is present in the trie or not

        System.out.println(wordBreak(key)); // true if the string can be segmented into words present in the trie, false otherwise
    }
}
