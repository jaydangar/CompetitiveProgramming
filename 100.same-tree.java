import java.util.LinkedList;
import java.util.Queue;


/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSameHelper(p,q,true);
    }
    
    static boolean isSameHelper(TreeNode p,TreeNode q,boolean result){
        if((p!=null && q==null) || (p==null && q!=null)){
            result = false;
        }
        else if(p!=null && q!=null){
            if(p.val!=q.val){
                result = false;
            }
            else{
                result = isSameHelper(p.left, q.left, result);
                result = isSameHelper(p.right, q.right, result);
            }
        }

        return result;
    }
}
// @lc code=end

