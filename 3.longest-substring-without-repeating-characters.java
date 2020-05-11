/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int sLength = s.length();
        if(sLength==0 || sLength==1){
            return sLength;
        }

        int maxLength = Integer.MIN_VALUE;
        String longestString = "";
        
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            if(longestString.contains(c)){
                if(maxLength < longestString.length()){
                    maxLength = longestString.length();
                }
                longestString = "";
            }
            longestString+=c;
        }

        if(maxLength < longestString.length()){
            maxLength = longestString.length();
        }

        return maxLength;
    }
}
// @lc code=end

