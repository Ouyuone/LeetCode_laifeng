//给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。 
//
// 示例 1： 
//
// 输入: s1 = "abc", s2 = "bca"
//输出: true 
// 
//
// 示例 2： 
//
// 输入: s1 = "abc", s2 = "bad"
//输出: false
// 
//
// 说明： 
//
// 
// 0 <= len(s1) <= 100 
// 0 <= len(s2) <= 100 
// 
// Related Topics 哈希表 字符串 排序 👍 51 👎 0

package leetcode.editor.cn;

import java.util.Arrays;

/**
 * @author hz21107422
 */ //java:判定是否互为字符重排
public class P0102CheckPermutationLcci {
    public static void main(String[] args) {
        Solution solution = new P0102CheckPermutationLcci().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean CheckPermutation(String s1, String s2) {
            if (s1.length() != s2.length()) {
                return false;
            }
            char[] chars_1 = s1.toCharArray();
            char[] chars_2 = s2.toCharArray();
            Arrays.sort(chars_1);
            Arrays.sort(chars_2);
            return Arrays.equals(chars_1, chars_2);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}