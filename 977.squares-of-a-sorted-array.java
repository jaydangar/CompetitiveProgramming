/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] A) {
        int[] returnArray = new int[A.length];
        int endIndex = A.length - 1;
        int endIndexReturnArray = endIndex;
        int startIndex = 0;
        while (endIndexReturnArray>-1) {
            if(Math.abs(A[startIndex]) < Math.abs(A[endIndex])){ 
                returnArray[endIndexReturnArray] = A[endIndex]*A[endIndex];
                endIndex--;
            }
            else{
                returnArray[endIndexReturnArray] = A[startIndex]*A[startIndex];
                startIndex++;
            }
            endIndexReturnArray--;
        }
        return returnArray;
    }
}
// @lc code=end
