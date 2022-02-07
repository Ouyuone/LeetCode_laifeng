//给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。 
//
// 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "hello"
//输出："holle"
// 
//
// 示例 2： 
//
// 
//输入：s = "leetcode"
//输出："leotcede" 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 3 * 10⁵ 
// s 由 可打印的 ASCII 字符组成 
// 
// Related Topics 双指针 字符串 👍 236 👎 0

package leetcode.editor.cn;

//java:反转字符串中的元音字母
public class P345ReverseVowelsOfAString {
    public static void main(String[] args) {
        Solution solution = new P345ReverseVowelsOfAString().new Solution();
        solution.reverseVowels("leetcode");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseVowels(String s) {

//        int preIndex=0;
            int lastIndex = s.length() - 1;
            char[] chars = s.toCharArray();
            for (int preIndex = 0; preIndex <= lastIndex; preIndex++) {

                    if (s.charAt(preIndex) == 'a' || s.charAt(preIndex) == 'e' || s.charAt(preIndex) == 'i' || s.charAt(preIndex) == 'o' || s.charAt(preIndex) == 'u' ||
                            s.charAt(preIndex) == 'A' || s.charAt(preIndex) == 'E' || s.charAt(preIndex) == 'I' || s.charAt(preIndex) == 'O' || s.charAt(preIndex) == 'U') {
                        while (lastIndex > preIndex) {
                            if (s.charAt(lastIndex) == 'a' || s.charAt(lastIndex) == 'e' || s.charAt(lastIndex) == 'i' || s.charAt(lastIndex) == 'o' || s.charAt(lastIndex) == 'u' ||
                                    s.charAt(lastIndex) == 'A' || s.charAt(lastIndex) == 'E' || s.charAt(lastIndex) == 'I' || s.charAt(lastIndex) == 'O' || s.charAt(lastIndex) == 'U') {
                                char temp = chars[preIndex];
                                chars[preIndex] = chars[lastIndex];
                                chars[lastIndex] = temp;
                                lastIndex--;
                                break;
                            }
                            lastIndex--;
                        }
                    }
            }
            return new String(chars);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}