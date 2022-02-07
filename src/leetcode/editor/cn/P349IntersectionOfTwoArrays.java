//给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2]
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[9,4]
//解释：[4,9] 也是可通过的
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums1.length, nums2.length <= 1000 
// 0 <= nums1[i], nums2[i] <= 1000 
// 
// Related Topics 数组 哈希表 双指针 二分查找 排序 👍 483 👎 0

package leetcode.editor.cn;

import java.util.Arrays;

//java:两个数组的交集
public class P349IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Solution solution = new P349IntersectionOfTwoArrays().new Solution();
        solution.intersection(new int[]{1,2,2,1}, new int[]{2});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            int[] intersection = new int[Math.max(nums1.length, nums2.length)];
            int addIndex = 0;
            for (int i = 0; i < nums1.length; i++) {
                for (int i1 = 0; i1 < nums2.length; i1++) {
                    if (nums1[i] == nums2[i1]) {
                        Boolean flag = true;
                        for (int i2 = 0; i2 <= addIndex; i2++) {
                            if (intersection[i2] == nums1[i] && nums1[i] != 0) {
                                flag = false;
                            }
                        }
                        if(flag){
                            intersection[addIndex] = nums1[i];
                            addIndex++;
                        }
                        break;
                    }
                }
            }
            int[] real = new int[addIndex];
            System.arraycopy(intersection,0,real,0,addIndex);
            return real;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}