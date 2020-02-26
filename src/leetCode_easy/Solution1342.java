package leetCode_easy;

/**
 * <pre>
 * @Auther: ousakai
 * @Date: 2020-02-26 16:32
 * @Description:
 * 修改版本: 1.0
 * 修改日期:
 * 修改人 :
 * 修改说明: 初步完成
 * 复审人 :
 * </pre>
 */
public class Solution1342 {

    public int numberOfSteps (int num) {
        int maxNum = ((Double) Math.pow(10, 6)).intValue();
        if(1<=num && num<=maxNum){
            int count=1;
            return findSpeedNum(num,count);
        }else{
            return 0;
        }
    }

    private int findSpeedNum(int num,int count) {
        if(num%2 == 0){
           num= num/2;
        }else{
            num =num-1;
        }
        if(num == 0){
            return count;
        }
        return findSpeedNum(num,++count);

    }

    public static void main(String[] args) {
        Solution1342 so1342=new Solution1342();
        int count = so1342.numberOfSteps(1230);
        System.out.println("直到零用了："+count+"步");

        System.out.println((14&1)+"这是偶数");
        System.out.println((13&1)+"这是奇数");
        System.out.println((14>>1)+"这是除于二");
        System.out.println((13&-2)+"这是减一");
        System.out.println("利用位运算更牛逼");

    }

}
