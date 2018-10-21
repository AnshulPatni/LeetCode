package linkedList;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;


        ListNode delete = deleteDuplicates(n1);
        while(delete != null) {
            System.out.println(delete.val);
            delete = delete.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head != null && head.next != null) {
            ListNode curr = head.next;
            ListNode prev = head;
            while (curr != null) {
                if(curr.val == prev.val) {
                    prev.next = curr.next;
                    curr = curr.next;
                } else {
                    prev = curr;
                    curr = curr.next;
                }
            }
        }
        return head;
    }
}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
