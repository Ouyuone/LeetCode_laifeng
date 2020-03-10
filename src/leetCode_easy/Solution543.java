package leetCode_easy;

/**
 * <pre>
 * @Auther: ousakai
 * @Date: 2020-03-10 16:24
 * @Description:
 * 修改版本: 1.0
 * 修改日期:
 * 修改人 :
 * 修改说明: 初步完成
 * 复审人 :
 * </pre>
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution543 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }
    int maxd=0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return maxd;
    }
    public int depth(TreeNode node){
        if(node==null){
            return 0;
        }
        int Left = depth(node.left);
        int Right = depth(node.right);
        maxd=Math.max(Left+Right,maxd);//将每个节点最大直径(左子树深度+右子树深度)当前最大值比较并取大者
        return Math.max(Left,Right)+1;//返回节点深度
    }

    public static void main(String[] args) {
        Solution543 solution543 = new Solution543();
        TreeNode root = new Solution543().new TreeNode(1);
        TreeNode rootRight = new Solution543().new TreeNode(2);
        TreeNode rootLeft = new Solution543().new TreeNode(3);

        root.right=rootRight;
        root.left=rootLeft;
        rootRight.right=new Solution543().new TreeNode(4);
        rootRight.left=new Solution543().new TreeNode(5);
        System.out.println(root);


        solution543.diameterOfBinaryTree(root);
    }
}
