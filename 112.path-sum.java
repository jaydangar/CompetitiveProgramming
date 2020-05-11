/*
 * @lc app=leetcode id=112 lang=java
 *
 * [112] Path Sum
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
    public boolean hasPathSum(TreeNode root, int sum) {
        boolean result = false;
        if(root==null){
            return result;
        }
        return pathSumHelper(root,sum,result);
    }

    static boolean pathSumHelper(TreeNode node,int sum,boolean result){

        if(node!=null){
            if(node.left==null && node.right==null && sum-node.val==0){
                result = true;
            }
        }

        if(node.left!=null){
            result = pathSumHelper(node.left, sum-node.val, result);
        }
        
        if(node.right!=null){
            result = pathSumHelper(node.right, sum-node.val, result);
        }
        
        return result;
    }

}
// @lc code=end

