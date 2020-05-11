/*
 * @lc app=leetcode id=746 lang=java
 *
 * [746] Min Cost Climbing Stairs
 */

// @lc code=start
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int minCost = 0;
        if(cost.length<2){
            return 0;
        } 
        else if(cost.length<3){
            if(cost[0] < cost[1]){
                return cost[0];
            }
            return cost[1];
        }
        else{
            
            return minCost;
        }
    }
}
// @lc code=end

