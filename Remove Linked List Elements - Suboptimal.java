/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)    {
            return null;
        } else if(head.val == val)    {
            while(head.val == val)  {
                if(head.next != null)   {
                     head = head.next;
                     System.out.println("head!");
                } else
                    return null;
            }
        } else if(head.next == null && head.val != val)    {
            return head;
        }
        
        ListNode pre = head;
        ListNode cur = head;
        while(cur.next != null) {
            if(cur.val == val)  {
                System.out.println("yes!");
                cur = cur.next;
                pre.next = cur;
            }
            else    {
                pre = cur;
                cur = cur.next;
            }
        }
        if(cur.val == val)  {
            pre.next = null;
        }
        if(pre.val == 0 && pre.next == null)    {
            head = null;
        }
        return head;
    }
}