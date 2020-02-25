package leetCode_easy;

import java.util.Arrays;

/**
 * <pre>
 * @Auther: ousakai
 * @Date: 2020-02-25 16:29
 * @Description:
 * 修改版本: 1.0
 * 修改日期:
 * 修改人 :
 * 修改说明: 初步完成
 * 复审人 :
 * </pre>
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            digits[i]++;
            digits[i]= digits[i]%10;
            if(digits[i] != 0){
                return digits;
            }
        }
        int[] digitsTmp=new int[digits.length+1];
        digitsTmp[0]=1;
        return digitsTmp;
    }



    public static void main(String[] args) {
        Solution s=new Solution();
        int[] result= s.plusOne(new int[]{0,9,9});
        System.out.println(Arrays.toString(result));
    }
}
