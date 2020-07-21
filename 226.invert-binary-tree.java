import java.util.Queue;

/*
 * @lc app=leetcode id=226 lang=java
 *
 * [226] Invert Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode rootNode = root;
        queue.add(rootNode);
        while (!queue.isEmpty()) {
            rootNode = queue.poll();
            TreeNode left = rootNode.left;
            TreeNode right = rootNode.right;

            TreeNode temp = rootNode.left;
            rootNode.left = rootNode.right;
            rootNode.right = temp;

            if (left != null) {
                queue.add(left);
            }
            if (right != null) {
                queue.add(right);
            }
        }
        return root;
    }
}
// @lc code=end
