/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
        {
            return l2;
        }
        else if(l2 == null)
            return l1;
        
        int flag = 0;
        
        ListNode lfinal = new ListNode(0);
        ListNode lreturn = lfinal;
        if(l1.val < l2.val)
        {
            lfinal.val = l1.val;
            if(l1.next != null)
                l1 = l1.next;
            else
            {
                lfinal.next = l2;
                return lfinal;
            }
        }
        else
        {
            lfinal.val = l2.val;
            if(l2.next != null)
                l2 = l2.next;
            else
            {
                lfinal.next = l1;
                return lfinal;
            }
        }
            
        while(l1 != null && l2 != null)
        {
            if(l1.val < l2.val)
            {
                lfinal.next = new ListNode(l1.val);
                lfinal = lfinal.next;
                if(l1.next != null)
                    l1 = l1.next;
                else
                {
                    flag = 1;
                    break;
                }
            }
            else
            {
                lfinal.next = new ListNode(l2.val);
                lfinal = lfinal.next;
                if(l2.next != null)
                    l2 = l2.next;
                else
                {
                    flag = 2;
                    break;
                }
            }
        }
        
        if(flag == 2)
        {
            lfinal.next = l1;
        }
        else if(flag == 1)
        {
            lfinal.next = l2;
        }
        
        return lreturn;
            
    }
}