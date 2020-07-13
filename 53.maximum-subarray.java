/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxNumber) {
                maxNumber = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxNumber;
    }
}
// @lc code=end
