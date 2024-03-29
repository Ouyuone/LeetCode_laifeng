//给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。 
//
// 
//
// 示例： 
//
// s = "leetcode"
//返回 0
//
//s = "loveleetcode"
//返回 2
// 
//
// 
//
// 提示：你可以假定该字符串只包含小写字母。 
// Related Topics 队列 哈希表 字符串 计数 👍 503 👎 0

package leetcode.editor.cn;

import java.util.LinkedHashMap;
import java.util.Map;

//java:字符串中的第一个唯一字符
public class P387FirstUniqueCharacterInAString{
    public static void main(String[] args){
        Solution solution = new P387FirstUniqueCharacterInAString().new Solution();
        solution.firstUniqChar("dddccdbba");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

        public int firstUniqChar(String s) {
            for (int i = 0; i < s.length(); i++) {
                if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                    return i;
                }
            }
            return -1;
        }

    public int firstUniqChar2(String s) {
        Map<Character, Integer> countStr = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (countStr.get(s.charAt(i)) == null) {
                countStr.put(s.charAt(i),1);
            }else{
                countStr.put(s.charAt(i),countStr.get(s.charAt(i))+1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (countStr.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}