/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        TreeNode rootNode = null;
        return sortedArrayToBSTHelper(rootNode, nums, 0,(nums.length-1));
    }

    TreeNode sortedArrayToBSTHelper(TreeNode rootNode,int[] nums,int startIndex,int endIndex){
        
        int median = (startIndex+endIndex)/2;

        if(median>-1 && median<nums.length){
            if(rootNode==null){
                rootNode = new TreeNode(nums[median]);
            }
        }

        rootNode.left = sortedArrayToBST(rootNode.left,nums,startIndex,median-1);
        rootNode.right = sortedArrayToBST(rootNode.right,nums,median+1,endIndex); 

        return rootNode;
    }
}
// @lc code=end

