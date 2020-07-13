import java.util.Stack;

/*
 * @lc app=leetcode id=32 lang=java
 *
 * [32] Longest Valid Parentheses
 */

// @lc code=start
class Solution {
    public int longestValidParentheses(String s) {
        int counter = 0;
        Stack<Character> stack = new Stack<>();
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (!stack.isEmpty() && stack.peek().equals('(')) {
                    stack.pop();
                    counter+=2;
                } else {
                    if (counter > maxValue) {
                        maxValue = counter;
                    }
                    counter = 0;
                }
            }
        }
        if (counter > maxValue) {
            maxValue = counter;
        }
        return maxValue;
    }
}
// @lc code=end
