import LeetCodeTrie.WordDictionary;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        WordDictionary w = new WordDictionary();
        w.addWord("bad");
        w.addWord("dad");
        w.addWord("mad");

        System.out.println(w.search("pad"));
        System.out.println(w.search("bad"));
        System.out.println(w.search("dad"));
        System.out.println(w.search(".ad"));
        System.out.println(w.search("b.."));
        System.out.println(w.search("a."));
    }
}


