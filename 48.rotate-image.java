/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {

        //#region Start with swapping each numbers except diagonal 
        //  swap [0,1] with [1,0]
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;    
            }
        }

        //  swap column values except middle one...
        for (int i = 0; i < matrix.length/2; i++) {
            int swapColumnIndex = matrix.length - i - 1;
            for (int j = 0; j < matrix.length; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[j][swapColumnIndex];
                matrix[j][swapColumnIndex] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
// @lc code=end
