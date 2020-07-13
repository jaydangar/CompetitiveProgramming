/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int calculatedArea = 0;
        return maxAreaHelper(height,maxArea,0,height.length-1,calculatedArea);
    }

    private int maxAreaHelper(int[] height, int maxArea,int leftIndex,int rightIndex, int calculatedArea) {
        if(calculatedArea > maxArea){
            maxArea = calculatedArea;
        }
        
        if(leftIndex>rightIndex){
            return maxArea;
        }

        int distance = rightIndex - leftIndex;
        int h = 0;
        if(height[leftIndex] >= height[rightIndex]){
            h = height[rightIndex];
            rightIndex--;
        }
        else{
            h = height[leftIndex];
            leftIndex++;
        }

        calculatedArea = distance*h;
        return maxAreaHelper(height, maxArea, leftIndex, rightIndex, calculatedArea);
    }
}
// @lc code=end

