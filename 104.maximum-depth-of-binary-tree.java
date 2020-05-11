import java.util.HashMap;
import java.util.Map;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int counter = 0;
        return maxDepthHelper(root,Integer.MIN_VALUE,counter);
    }

    static int maxDepthHelper(TreeNode root,int minValue,int counter){
        if(root==null){
            if(minValue<counter){
                minValue = counter;
            }
            return minValue;
        }
        minValue =  maxDepthHelper(root.left, minValue, counter+1);
        minValue = maxDepthHelper(root.right, minValue, counter+1);
        return minValue;
    }
}
// @lc code=end

