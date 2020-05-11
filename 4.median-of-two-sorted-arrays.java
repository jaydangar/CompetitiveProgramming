/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double returnVal = findMedian(nums1)+findMedian(nums2);
        return returnVal;
    }

    double findMedian(int []array){
        int length = array.length;

        if(length==0){
            return 0;
        }
        
        if(length%2==0){
            return ((array[length/2] + array[(length/2)-1])/2.0);
        }
        else{
            return array[length/2]/2.0;
        }
    }
}
// @lc code=end

