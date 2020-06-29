/*
211. Add and Search Word - Data structure design
https://leetcode.com/problems/add-and-search-word-data-structure-design/

Design a data structure that supports the following two operations:

void addWord(word)
bool search(word)
search(word) can search a literal word or a regular expression string containing only letters a-z or .. A . means it can represent any one letter.

Example:

addWord("bad")
addWord("dad")
addWord("mad")
search("pad") -> false
search("bad") -> true
search(".ad") -> true
search("b..") -> true
Note:
You may assume that all words are consist of lowercase letters a-z.
 */
package LeetCodeTrie;

public class WordDictionary{
    /** Initialize your data structure here. */
    private TrieNode1 root;

    public WordDictionary() {
        root = new TrieNode1();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode1 node = root;
        for(int i = 0; i < word.length(); i++){
            char currentChar = word.charAt(i);
            if(!node.containsKey(currentChar)) {
                node.put(currentChar, new TrieNode1());
            }
            node = node.get(currentChar);
        }
        node.setEnd();
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        TrieNode1 node = searchPrefix(word, root);
        return node != null && node.isEnd();
    }

    private TrieNode1 searchPrefix(String word, TrieNode1 startNode){
        TrieNode1 node = startNode;
        outerloop:
        for(int i = 0; i < word.length(); i++){
            char curLetter = word.charAt(i);
            if(curLetter == '.') {
                for (char c = 'a'; c <= 'z'; c++) {
                    if (node.containsKey(c)) {
                        node = node.get(c);
                        int e = word.length();
                        String subWord = word.substring(i+1, e);
                        node = searchPrefix(subWord, node);
                        break outerloop;
                    }
                    else{
                        continue;
                    }
                }
            }
            else if(node.containsKey(curLetter)){
                node = node.get(curLetter);
            }
            else {
                return null;
            }
        }
        return node;
    }
}

class TrieNode1{

    private TrieNode1[] links;

    private final int R = 26;

    private boolean isEnd;

    public TrieNode1(){
        links = new TrieNode1[R];
    }

    public boolean containsKey(char ch){
        return links[ch - 'a'] != null;
    }

    public TrieNode1 get(char ch){
        return links[ch - 'a'];
    }

    public void put(char ch, TrieNode1 node){
        links[ch - 'a'] = node;
    }

    public void setEnd(){
        isEnd = true;
    }

    public boolean isEnd(){
        return isEnd;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */