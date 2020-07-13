/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] leftMultiplication = new int[nums.length];
        int[] rightMultiplication = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            
            int leftMultiplicationValue = 1;
            int rightMultiplicationValue = 1;

            if(i>0){
                for (int j = (i-1);j > -1; j--) {
                    leftMultiplicationValue*=nums[j];
                }
            }
            
            if(i<(nums.length-1)){
                for (int j = i+1; j < nums.length; j++) {
                    rightMultiplicationValue*=nums[j];
                }
            }

            leftMultiplication[i] = leftMultiplicationValue;
            rightMultiplication[i] = rightMultiplicationValue;
        }

        for (int i = 0; i < rightMultiplication.length; i++) {
            nums[i] = leftMultiplication[i]*rightMultiplication[i];
        }

        return nums;
    }
}
// @lc code=end

