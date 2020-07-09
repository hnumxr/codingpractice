/*
Maximum Depth of Binary Tree
https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/555/

Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.
 */

package LeetCodeTrees;

public class LeetCodeMaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        int depth = 1;
        if(root.left == null && root.right == null){
            return depth;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        if(leftDepth >= rightDepth){
            depth = leftDepth + 1;
        }
        else {
            depth = rightDepth + 1;
        }
        return depth;
    }
}
