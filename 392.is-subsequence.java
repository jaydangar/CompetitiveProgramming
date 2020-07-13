/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);    
            if(!s.isEmpty()){
                if(s.charAt(0)==c){
                    s = s.substring(1);
                }
            }
            else{
                return true;
            }
        }
        return s.isEmpty();
    }
}
// @lc code=end

