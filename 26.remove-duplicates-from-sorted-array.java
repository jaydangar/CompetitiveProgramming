/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int numslength = nums.length;
        int length = 0;
        if(numslength<2){
            return (length+1);
        }
        //  next available index for non duplicate value
        int nextAvailableIndex = 1;
        for (int i = 0; i < (numslength-1); i++) {
            if(nums[i] != nums[i+1]){
                nums[nextAvailableIndex] = nums[i+1];
                nextAvailableIndex++;
                length++;
            }            
        }
        return (length+1);
    }
}
// @lc code=end

