//给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现
//次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2,2]
// 
//
// 示例 2: 
//
// 
//输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[4,9] 
//
// 
//
// 提示： 
//
// 
// 1 <= nums1.length, nums2.length <= 1000 
// 0 <= nums1[i], nums2[i] <= 1000 
// 
//
// 
//
// 进阶： 
//
// 
// 如果给定的数组已经排好序呢？你将如何优化你的算法？ 
// 如果 nums1 的大小比 nums2 小，哪种方法更优？ 
// 如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？ 
// 
// Related Topics 数组 哈希表 双指针 二分查找 排序 👍 651 👎 0

package leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

//java:两个数组的交集 II
public class P350IntersectionOfTwoArraysIi {
    public static void main(String[] args) {
        Solution solution = new P350IntersectionOfTwoArraysIi().new Solution();
        solution.intersect(new int[]{4,9,5},new int[]{9,4,9,8,4});
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 功能描述
     */
    class Solution {
        /**
         * 功能描述
         *
         * @param nums1
         * @param nums2
         * @return
         */
        public int[] intersect2(int[] nums1, int[] nums2) {
            if (nums2.length < nums1.length) {
                return intersect(nums2, nums1);
            }
            Map<Integer, Integer> numCount = new HashMap<>();
            int[] realArray = new int[nums1.length];

            for (int i = 0; i < nums1.length; i++) {
                if (numCount.get(nums1[i]) == null) {
                    numCount.put(nums1[i], 1);
                } else {
                    numCount.put(nums1[i], numCount.get(nums1[i]) + 1);
                }
            }
            int index= 0;
            for (int num2 : nums2) {
                if (numCount.get(num2) != null) {
                    Integer num = numCount.get(num2);
                    if(num == 0){
                        continue;
                    }
                    numCount.put(num2, num - 1);
                    realArray[index++]=num2;
                }
            }
        return Arrays.copyOfRange(realArray,0,index);
        }

        public int[] intersect(int[] nums1, int[] nums2) {
            if (nums2.length < nums1.length) {
               return  intersect(nums2, nums1);
            }
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int[] realArray=new int[nums1.length];
            int num1index=0;
            int num2index=0;

            int index=0;
            while (num1index < nums1.length && num2index <nums2.length) {
                if (nums1[num1index] == nums2[num2index]) {
                    realArray[index++]=nums1[num1index];
                    num1index++;
                    num2index++;
                } else if (nums1[num1index] < nums2[num2index]) {
                    num1index++;
                }else{
                    num2index++;
                }
            }
            return Arrays.copyOfRange(realArray, 0, index);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}