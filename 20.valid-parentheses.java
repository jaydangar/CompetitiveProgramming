import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c=='[' || c=='{'){
                stack.push(c);
            }

            if(c==')'){
                if(stack.isEmpty()){
                    return false;
                }
                char cLatest = stack.pop();
                if(cLatest != '('){
                    return false;
                }
            }

            if(c==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char cLatest = stack.pop();
                if(cLatest != '['){
                    return false;
                }
            }

            if(c=='}'){
                if(stack.isEmpty()){
                    return false;
                }
                char cLatest = stack.pop();
                if(cLatest != '{'){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }


}
// @lc code=end

