//Count unique substrings - Microsoft, Google
public class uniqueSubstring {
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

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }

        int count = 0;
        for(int i=0; i<26; i++){
            if(root.children[i] != null){
                count += countNodes(root.children[i]);
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        String str = "ababa";

        //suffix -> insert
        for(int i=0; i<str.length(); i++){
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println(countNodes(root)); // Count of unique substrings
        // Output: 10 (unique substrings are: a, ab, aba, b, ba, a, a, a, ab, "")
    }
}
