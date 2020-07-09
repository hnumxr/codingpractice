package LeetCodeTrees;

import java.util.LinkedList;

// Learn from solution.
public class LeetCodeValidateBinarySearchTreeSolution2{
    LinkedList<TreeNode> nodes = new LinkedList();
    LinkedList<Integer> uppers = new LinkedList(), lowers = new LinkedList();

    public boolean isValidBST(TreeNode root){
        Integer lower = null, upper = null, val;
        addStack(root, upper, lower);

        while (!nodes.isEmpty()){
            root = nodes.pollLast();
            lower = lowers.pollLast();
            upper = uppers.pollLast();
            if(root == null){continue;}
            val = root.val;

            if(lower != null && val <= lower){return false;}
            if(upper != null && val >= upper){return false;}
            addStack(root.right, upper, val);
            addStack(root.left, val, lower);
        }
        return true;
    }

    private void addStack(TreeNode node, Integer upper, Integer lower){
        nodes.add(node);
        lowers.add(lower);
        uppers.add(upper);
    }
}