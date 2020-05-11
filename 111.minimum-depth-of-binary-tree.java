/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int minDepth = Integer.MAX_VALUE;
        return minDepthHelper(root,minDepth,1);
    }

    static int minDepthHelper(TreeNode root,int minDepth,int counter){
        if(root.left==null && root.right==null){
            if(counter < minDepth){
                minDepth = counter;
            }
            return minDepth;
        }

        if(root.left!=null){
            minDepth = minDepthHelper(root.left, minDepth, counter+1);
        }

        if(root.right!=null){
            minDepth = minDepthHelper(root.right, minDepth, counter+1);
        }

        return minDepth;
    }
}
// @lc code=end

