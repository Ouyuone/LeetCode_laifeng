//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针 👍 1391 👎 0

package leetcode.editor.cn;

import jdk.nashorn.internal.ir.ReturnNode;

import java.util.Arrays;

//java:移动零
public class P283MoveZeroes{
    public static void main(String[] args){
        Solution solution = new P283MoveZeroes().new Solution();
        solution.moveZeroes(new int[]{0,1,0,3,12});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[index++]=nums[i];
            }
        }
        for (; index < nums.length; index++) {
            nums[index] = 0;
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}