package leetCode_easy;

/**
 * <pre>
 * @Auther: ousakai
 * @Date: 2020-03-11 15:54
 * @Description:
 * 修改版本: 1.0
 * 修改日期:
 * 修改人 :
 * 修改说明: 初步完成
 * 复审人 :
 * </pre>
 */
@SuppressWarnings("all")
public class Solution1013 {
    /* 方法一
     * 利用双向指针来计算数组能否分成三个均等的部分
     * @author ouyu
     * @date 2020-03-11
     * @time 16:56
     * @param A
     * @return boolean
     */
    public boolean canThreePartsEqualSum(int[] A) {
        int sum=0;
        for (int i : A) {
            sum+=i;
        }
        //当数组的和不是3的倍数直接返回false
        if((sum%3) != 0){
            return false;
        }
        int left = 0;
        int sumLeft = A[left];
        int right = A.length-1;
        int sumRight = A[right];

        //利用左边索引+1小于右边索引来分成三部分  如果用left<right 可能会出现被分成两部分
        // 比如 前面部分相加和后面部分相加相同 下标却是 3，4变成了两部分 left+1<right 保证了会被分成3部分
        while(left + 1 <right){
            //左部分和右部分相等 那中间的部分肯定也相同
            if(sumLeft == sum/3 && sumRight == sum/3){
                return true;
            }
            if(sumLeft != sum/3){
                sumLeft+=A[++left];
            }
            if(sumRight != sum/3){
                sumRight+=A[--right];
            }
        }
        return false;
    }

    /*
     * 方法二
     * 直接找
     * @author ouyu
     * @date 2020-03-11
     * @time 17:05
     * @param A
     * @return boolean
     */
    private boolean getNextEquals(int[] A) {
        int sum=0;
        for (int i : A) {
            sum+=i;
        }
        //当数组的和不是3的倍数直接返回false
        if((sum%3) != 0){
            return false;
        }
        int temp=0;
        int flag=0;
        for (int i1 : A) {
            if((temp+=i1) == sum/3){
                flag ++ ;
                temp = 0;
            }
        }
        return flag>=3;
    }
    public static void main(String[] args) {
        Solution1013 solution1013 = new Solution1013();
        System.out.println(solution1013.canThreePartsEqualSum(new int[]{10,-7,13,-14,30,16,-3,-16,-27,27,19}));
    }
}
