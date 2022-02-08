//给定一个 正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 true ，否则返回 false 。 
//
// 进阶：不要 使用任何内置的库函数，如 sqrt 。 
//
// 
//
// 示例 1： 
//
// 
//输入：num = 16
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：num = 14
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num <= 2^31 - 1 
// 
// Related Topics 数学 二分查找 👍 346 👎 0

package leetcode.editor.cn;
//java:有效的完全平方数
public class P367ValidPerfectSquare{
    public static void main(String[] args){
        Solution solution = new P367ValidPerfectSquare().new Solution();
        solution.isPerfectSquare(681);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPerfectSquare2(int num) {
        double sqrt = Math.sqrt(num);
        String str = String.valueOf(sqrt);
        String sub = str.substring(str.indexOf(".")+1);
        return sub.equals("0");

    }

        public boolean isPerfectSquare(int num) {
            int low = 1;
            int high = num;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                // int product = mid * mid;   越界
                int t = num / mid;
                if (t == mid) {
                    if (num%mid == 0) return true;
                    low = mid + 1;
                } else if (t < mid) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}