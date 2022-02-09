//给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。 
//
// 如果可以，返回 true ；否则返回 false 。 
//
// magazine 中的每个字符只能在 ransomNote 中使用一次。 
//
// 
//
// 示例 1： 
//
// 
//输入：ransomNote = "a", magazine = "b"
//输出：false
// 
//
// 示例 2： 
//
// 
//输入：ransomNote = "aa", magazine = "ab"
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：ransomNote = "aa", magazine = "aab"
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 1 <= ransomNote.length, magazine.length <= 10⁵ 
// ransomNote 和 magazine 由小写英文字母组成 
// 
// Related Topics 哈希表 字符串 计数 👍 274 👎 0

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

//java:赎金信
public class P383RansomNote{
    public static void main(String[] args){
        Solution solution = new P383RansomNote().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

  class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> countStr = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (countStr.get(magazine.charAt(i)) == null) {
                countStr.put(magazine.charAt(i),1);
            }else{
                countStr.put(magazine.charAt(i),countStr.get(magazine.charAt(i))+1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (countStr.get(ransomNote.charAt(i)) != null) {
                if(countStr.get(ransomNote.charAt(i)) == 0){
                    return false;
                }
                countStr.put(ransomNote.charAt(i),countStr.get(ransomNote.charAt(i))-1);
            }else{
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}