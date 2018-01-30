/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        /*ListNode temp = head;
        ListNode prev = null;
        
        while(temp.next != null && temp.val != node.val)
        {
            prev = temp;
            temp = temp.next;
        }
        if(temp.next == null)
            return null;8*/
        node.val = node.next.val;
        node.next = node.next.next;
    }
}