public class longestWord {
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

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp){
        if(root == null){
            return;
        }

        for(int i=0; i<26; i++){
            if(root.children[i] != null && root.children[i].eow ==true){
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }  
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1); // backtrack
            }
        }
    }

    public static void main(String[] args) {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        longestWord(root, new StringBuilder());
        System.out.println(ans);
    }
}
