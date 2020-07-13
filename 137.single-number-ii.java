/*
 * @lc app=leetcode id=137 lang=java
 *
 * [137] Single Number II
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;

        for (int j = 0; j < 32; j++) {
            int counter = 0;
            for (int i = 0; i < nums.length; i++) {
                int num = nums[i]>>j;
                counter+=(num & 1);
            }
            counter%=3;
            answer |= (counter<<j); 
        }

        return answer;
    }
}
// @lc code=end
