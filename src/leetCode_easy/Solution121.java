package leetCode_easy;

/**
 * <pre>
 * @Auther: ousakai
 * @Date: 2020-03-09 20:33
 * @Description:
 * 修改版本: 1.0
 * 修改日期:
 * 修改人 :
 * 修改说明: 初步完成
 * 复审人 :
 * </pre>
 */
public class Solution121 {

    public int maxProfit(int[] prices) {

        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int ii = i; ii < prices.length ; ii++) {
                int temp = 0;
                if((temp = (prices[ii]-prices[i])) >0 && temp>max){
                    max = temp;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution121 solution121 = new Solution121();
        solution121.maxProfit(new int[]{2,1,4,5,7});
    }
}
