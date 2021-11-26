package data_structure.Tree;

// welcome again
// So what is Trie?? Try to guess what is Trie :)
// Trie : It is a tree based data structure generally having n number of child nodes also caller n-ary tree.
// It comes from reTRIEval word as indicates fast retrieval of data.
// It can be used where we want to search or get data as fast as possible like while chatting.
// during chatting what we see autocorrect feature that is the application of trie ds.
// let's implement it.
// demo :
// store cat in trie ds
// root -> c -> a -> t.
public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public TrieNode getRoot() {
        return root;
    }

    public static class TrieNode {

        private TrieNode[] children;
        private boolean isWord;

        public TrieNode() {
            this.children = new TrieNode[26];// as we have only 26 english alphabets
            this.isWord = false;
        }
    }

    public void insert(String word) {
        if (word == null || word.isEmpty())
            throw new IllegalArgumentException("Invalid Input");

        word = word.toLowerCase(); // dealing with lowercase

        // getting reference of root
        TrieNode curr = root;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            char c = word.charAt(i);

            // index of char c
            int idx = c - 'a';
            // check whether the child is present or not
            // if not present it means we are inserting a very new value
            // think we are inserting "cat" then 'c' comes for first time to the root
            // that's why we are storing into a brand new TrieNode.
            // and now if we again inserting a new word "car", then we simply get the reference
            // of 'c' and move to next while inserting 'c' character.
            // got it.
            if (curr.children[idx] == null) {
                TrieNode newNode = new TrieNode();
                curr.children[idx] = newNode;
                curr = newNode;
            } else
                curr = curr.children[idx];
        }
        // after loop we confirm that the word is completed.
        curr.isWord = true;

    }

    public boolean search(String word) {
//        if (word == null ||word.isEmpty()){
//            throw new IllegalArgumentException("Invalid Input");
//        }

        try {
            if (word == null || word.isEmpty())
                throw new IllegalArgumentException("Invalid Input");

        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getLocalizedMessage());
        }

        word = word.toLowerCase(); // dealing with lowercase
        int len = word.length();
        TrieNode current = root;

        for (int i = 0; i < len; i++) {
            char c = word.charAt(i);

            int idx = c - 'a';
            if (current.children[idx] == null)
                return false;
            else
                current = current.children[idx];
        }

        return current.isWord;
    }

    public static void main(String[] args) {

        Trie trie = new Trie();
        // inserting some words
        trie.insert("cat");
        trie.insert("car");
        trie.insert("son");
        trie.insert("so");

        // let's search some words
        // searching cat
        System.out.println("have cat? " + trie.search(""));
        System.out.println("have dog? " + trie.search("dog"));
        System.out.println("have so? " + trie.search("so"));
        System.out.println("have son? " + trie.search("son"));
        System.out.println("have sun? " + trie.search("sun"));
    }

}
