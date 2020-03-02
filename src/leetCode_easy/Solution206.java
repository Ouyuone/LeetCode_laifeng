package leetCode_easy;

/**
 * <pre>
 * @Auther: ousakai
 * @Date: 2020-03-02 16:43
 * @Description:
 * 修改版本: 1.0
 * 修改日期:
 * 修改人 :
 * 修改说明: 初步完成
 * 复审人 :
 * </pre>
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution206 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {

            ListNode listNode=null;
            while (head !=null && (head.next!=null || head.next == null)){
                ListNode nextNode = head.next;
                head.next=listNode;
                listNode=head;
                head=nextNode;
            }
            return listNode;
    }

    /*
     * 递归反转 重点在head.next.next =head这句上面 1->2->3->4 1.next.next=1 其实就已经把1->2反转成了2->1->2这个死循坏
     * 当结合下面的head.next= null;使用的时候 解决掉死循环变成了2->1->null 牛逼啊
     * @author ouyu
     * @date 2020-03-02
     */
    public ListNode reverseListTo(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode p = reverseListTo(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public static void main(String[] args) {
        Solution206 solution206=new Solution206();
        ListNode listNode1=solution206.new ListNode(1);
        ListNode listNode2=solution206.new ListNode(2);
        ListNode listNode3=solution206.new ListNode(3);
        ListNode listNode4=solution206.new ListNode(4);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;

        solution206.reverseList(listNode1);
    }
}
