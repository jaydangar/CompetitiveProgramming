/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        if(length<2){
            if(length==1 && nums[0]==val){
                return 0;
            }else{
                return length;
            }
        }
        return removeElementHelper(nums,val,0,(length-1),0);
    }

    private int removeElementHelper(int[] nums, int val, int leftIndex, int rightIndex,int valCounter) {
        
        while(nums[rightIndex]==val && rightIndex>=0){
            rightIndex--;
            valCounter++;
        }        

        if(leftIndex >= rightIndex){
            if(valCounter>nums.length){
                return 0;
            }
            return (nums.length-valCounter);
        }

        if(nums[leftIndex]==val){
            nums = swapNumbers(nums, leftIndex, rightIndex);
            rightIndex--;
            valCounter++;
        }

        return removeElementHelper(nums, val,leftIndex+1,rightIndex,valCounter);
    }

    int[] swapNumbers(int[] array,int leftIndex,int rightIndex){
        int temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp; 
        return array;
    }
}
// @lc code=end

