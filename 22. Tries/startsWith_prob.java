public class startsWith_prob {
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

    //Time Complexity: O(L) where L is the length of the word
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

    public static void search(String word){
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';

            if(curr.children[idx] == null){
                System.out.println(word + " not found");
                return;
            }
            curr = curr.children[idx];
        }
        if(curr.eow == true){
            System.out.println(word + " found");
        } else{
            System.out.println(word + " not found");
        }
    }

    public static boolean startsWith(String prefix){
        Node curr = root;
        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false; // Prefix not found
            }
            curr = curr.children[idx];
        }
        return true; // Prefix found
    }

    public static void main(String[] args) {
        String words[] = {"apple","app", "mango", "man", "woman"};
        String prefix1 = "app";
        String prefix2 = "moon";

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(startsWith(prefix1)); // true
        System.out.println(startsWith(prefix2)); // false
    }
}
