import java.util.Map;

/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {

        int returnPosition = -1;

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put((int)s.charAt(i),0);
        }

        for (int i = 0; i < s.length(); i++) {
            int key = (int)s.charAt(i);
            if(map.containsKey(key)){
                int count = map.get(key);
                map.put(key,++count);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if(map.get((int)s.charAt(i))==1){
                returnPosition = i;
                break;
            }
        }

        return returnPosition;
    }
}
// @lc code=end

