//给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。 
//
// 示例: 
//
// 输入: 38
//输出: 2 
//解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
// 
//
// 进阶: 
//你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？ 
// Related Topics 数学 数论 模拟 👍 390 👎 0

package leetcode.editor.cn;
//java:各位相加
public class P258AddDigits{
    public static void main(String[] args){
        Solution solution = new P258AddDigits().new Solution();
        solution.addDigits(38);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 功能描述
     */
class Solution {
        /**
         * ge wei shu xaing jia
         */
    public int addDigits_(int num) {
        int sum = num;
        int count =0;
        while (sum >= 10){
            while (num != 0){
                int modNum = num%10;
                num = num/10;
                if(count == 0){
                    sum = 0;
                }
                sum+=modNum;
                count++;
            }
            num =sum;
            count = 0;
        }


    return sum;
    }


    public int addDigits(int num){
        int sum=0;
        while (num >=10 || sum !=0){
            int modNum = num%10;
            num = num/10;
            sum+=modNum;
            if(num == 0){
                num = sum;
                sum =0;
            }
        }
        return num;
    }

    public int addDigits__(int num){
        return (num - 1) % 9 + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}