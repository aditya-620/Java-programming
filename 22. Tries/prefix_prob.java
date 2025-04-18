//prefix problem - HARD - Google, Microsoft
public class prefix_prob {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
        int freq;

        public Node () {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static String findPrefix(String word) {
        Node curr = root;
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            curr = curr.children[idx];
            prefix.append(word.charAt(i));
            if (curr.freq == 1) {
                break; // Unique prefix found
            }
        }

        return prefix.toString();
    }

    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duck", "dove"};

        // Insert all words into the trie
        for (String word : arr) {
            insert(word);
        }

        // Find and print shortest unique prefix for each word
        System.out.println("Shortest Unique Prefixes:");
        for (String word : arr) {
            System.out.println(word + " -> " + findPrefix(word));
        }
    }
}

//Time Complexity: O(N * M) where N is the number of words and M is the length of the longest word.