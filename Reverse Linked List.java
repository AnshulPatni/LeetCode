/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)    {
            return null;
        } else if(head.next == null)   {
            return head;
        } else  {
            ListNode pre = null;
            ListNode cur = head;
            ListNode nex = head.next;
            while(cur.next != null) {
                ListNode temp = cur;
                cur.next = pre;
                cur = nex;
                nex = nex.next;
                pre = temp;
            }
            cur.next = pre;
            head = cur;
        }
        return head;
    }
}