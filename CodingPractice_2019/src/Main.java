import LeetCodeTrees.LeetCodeValidateBinarySearchTree;
import LeetCodeTrie.WordDictionary;
import LeetCodeTrees.*;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        HashSet<Integer> root = new HashSet<Integer>();
        root.add(1);
        root.add(2);
        root.add(3);

        HashSet<Integer> a = new HashSet<Integer>();
        a = (HashSet<Integer>) root.clone();
        a.add(4);
        HashSet<Integer> b = new HashSet<Integer>();
        b = (HashSet<Integer>) root.clone();
        b.add(5);

        System.out.println("root：" + root.toString());
        System.out.println("a：" + a.toString());
        System.out.println("b：" + b.toString());
        Iterator<Integer> i = root.iterator();
        while (i.hasNext()){
            System.out.println("root 1: " + i.next());
        }

        TreeNode t = new TreeNode(2);
        t.left = new TreeNode(1);
        t.right = new TreeNode(3);

        LeetCodeValidateBinarySearchTree l = new LeetCodeValidateBinarySearchTree();
        System.out.println(l.isValidBST(t));
        LeetCodeValidateBinarySearchTreeSolution2 l2 = new LeetCodeValidateBinarySearchTreeSolution2();
        System.out.println(l2.isValidBST(t));
    }
}


