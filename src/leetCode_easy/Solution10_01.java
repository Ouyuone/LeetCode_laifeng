package leetCode_easy;

import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 * @Auther: ousakai
 * @Date: 2020-03-03 16:34
 * @Description:
 * 修改版本: 1.0
 * 修改日期:
 * 修改人 :
 * 修改说明: 初步完成
 * 复审人 :
 * </pre>
 */
public class Solution10_01 {
    public void merge(int[] A, int m, int[] B, int n) {
        for (int i = n-1; i >= 0; i--) {
            A[m]=B[i];
            m++;
        }
        int temp=0;
        for (int i = 0; i < A.length; i++) {
            for(int ii = 0;ii<A.length-1-i;ii++){
                if(A[ii]>A[ii+1]){
                    temp = A[ii + 1];
                    A[ii+1]=A[ii];
                    A[ii]=temp;
                }
            }
        }
//        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
    }
    /*
     * 双向指针的方法：因为AB数组里面的数都是顺序存储的所以可以用到此方法，在第一个判断是当B数组里面的数已经取完了就直接取A数组里面的 或者当A数据对应下标数
     * 小于B数组对应下标数且A数组对应下标不等于0取A数组否则取B数组 或者当A数据对应下标数
     * 小于B数组对应下标数且A数组对应下标等于0且A的下标索引小于A实际的元素数量取A数组否则取B数组
     * 测试用例三种情况 A{1,2,0}2B{1}1  A{1,2,3,0,0,0}3 B{5,7,8}3   A{-1,0,0,3,3,3,0,0,0}6 B{1,2,2}3
     * @author ouyu
     * @date 2020-03-04
     */
    public void merge2(int[] A, int m, int[] B, int n) {
        if(n==0){
            return;
        }
        int[] C=new int[m+n];
        int countA=0;
        int countB=0;
        for (int i=0;i<m+n;i++) {

            if(countB==n ||(A[countA]<B[countB] && A[countA]!=0) || (A[countA]<B[countB] && A[countA]==0 && countA<m)){
                C[i]=A[countA];
                countA++;
            }else{
                C[i]=B[countB];
                countB++;
            }
        }
        System.arraycopy(C,0,A,0,m+n);
        //System.out.println(Arrays.toString(A));
    }


    public static void main(String[] args) {
        Solution10_01 solution10_01=new Solution10_01();
        int[] s={-1,0,0,3,3,3,0,0,0};
        int[] ss={1,2,2};

        solution10_01.merge2(s,6,ss,3);
        System.out.println(Arrays.toString(s));
    }
}
