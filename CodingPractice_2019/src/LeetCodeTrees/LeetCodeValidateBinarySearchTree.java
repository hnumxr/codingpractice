/*
Validate Binary Search Tree
https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/625/

Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.


Example 1:

    2
   / \
  1   3

Input: [2,1,3]
Output: true

Example 2:

    5
   / \
  1   4
     / \
    3   6

Input: [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.
 */
package LeetCodeTrees;

//import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class LeetCodeValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        /*
        HashSet<int[]> routes = new HashSet<int[]>();
        routes.add(new int[]{0, 0});
        return isValidBSTRecursive(root, routes);
         */
        return isBST(root, null, null);
    }

    private boolean isValidBSTRecursive(TreeNode root, HashSet<int[]> routes){
        boolean res;
        HashSet<int[]> leftRoutes = new HashSet<int[]>();
        HashSet<int[]> rightRoutes = new HashSet<int[]>();
        leftRoutes = (HashSet<int[]>) routes.clone();
        rightRoutes = (HashSet<int[]>) routes.clone();

        if(root == null || (root.left == null && root.right == null)){
            return true;
        }
        else if(root.left == null){
            if(root.val<root.right.val){
                if(!checkNode(rightRoutes, root.right.val)){
                    return false;
                }
                rightRoutes.add(new int[]{2, root.val});
                if(isValidBSTRecursive(root.right, rightRoutes)){
                    res = true;
                }
                else {
                    res = false;
                }
            }
            else {
                res = false;
            }
        }
        else if(root.right == null){
            if(root.left.val < root.val){
                if(!checkNode(leftRoutes, root.left.val)){
                    return false;
                }
                leftRoutes.add(new int[]{1, root.val});
                if(isValidBSTRecursive(root.left, leftRoutes)){
                    res = true;
                }
                else {
                    res = false;
                }
            }
            else {
                res = false;
            }
        }
        else if(root.left.val < root.val && root.val < root.right.val){
            if(!checkNode(leftRoutes, root.left.val) || !checkNode(rightRoutes, root.right.val)){
                return false;
            }
            leftRoutes.add(new int[]{1, root.val});
            rightRoutes.add(new int[]{2, root.val});
            if(isValidBSTRecursive(root.left, leftRoutes) && isValidBSTRecursive(root.right, rightRoutes)){
                res = true;
            }
            else {
                res = false;
            }
        }
        else{
            res = false;
        }
        return res;
    }

    private boolean checkNode(Set<int[]> routeNodes, int node) {
        int length = routeNodes.size();
        Iterator<int[]> routes = routeNodes.iterator();
        int[] temp = new int[2];
        while (routes.hasNext()){
            temp = routes.next();
            if((temp[0] == 1 && temp[1] <= node) || (temp[0] == 2 && temp[1] >= node)){
                return false;
            }
        }
        return true;
    }

    // Learn from solution.
    public boolean isBST(TreeNode root, Integer upper, Integer lower){
        if(root == null){
            return true;
        }
        if(upper != null && root.val >= upper){ // Smart code, if upper is null, the program will not execute "root.val >= upper"
            return false;
        }
        if(lower != null && root.val <= lower){
            return false;
        }
        if(!isBST(root.left, root.val, lower)){
            return false;
        }
        if(!isBST(root.right, upper, root.val)){
            return false;
        }
        return true;
    }
}


