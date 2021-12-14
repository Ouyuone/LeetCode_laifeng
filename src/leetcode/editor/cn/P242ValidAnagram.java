//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。 
//
// 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 
//输入: s = "rat", t = "car"
//输出: false 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length, t.length <= 5 * 10⁴ 
// s 和 t 仅包含小写字母 
// 
//
// 
//
// 进阶: 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
// Related Topics 哈希表 字符串 排序 👍 464 👎 0

package leetcode.editor.cn;



//java:有效的字母异位词
public class P242ValidAnagram{
    public static void main(String[] args){
        Solution solution = new P242ValidAnagram().new Solution();
        solution.isAnagram("anagram","nagaram");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        /**
         *  是否是字母异位词
         * @author OO-hz21207422
         * @date 2021/12/14
         * @param s 字母s
         * @param t 字母t
         * @return boolean
         */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
       int[] array_s = new int[26];
       int[] array_t = new int[26];
        for (int i = 0; i < s.length(); i++) {
            array_s[s.charAt(i)-97]=++array_s[s.charAt(i)-97];
        }
        for (int i = 0; i < t.length(); i++) {
            array_t[t.charAt(i)-97]=++array_t[t.charAt(i)-97];
        }
        for (int i = 0; i < array_s.length; i++) {
            if (array_s[i] != array_t[i]) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}