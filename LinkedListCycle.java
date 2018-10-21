package linkedList;

public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);
        ListNode n5 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n1;

        System.out.println(hasCycle(n1));
    }

    public static boolean hasCycle(ListNode head) {
        /** Method - 1 **/
        /**
        if(head == null || head.next == null) return false;
        Set<ListNode> nodes = new HashSet<>();
        ListNode curr = head;
        while(curr != null) {
            if(!nodes.contains(curr))
                nodes.add(curr);
            else
                return true;
            curr = curr.next;
        }
        return false;
         **/

        /** Method - 2 **/
        if(head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast.next != null && fast.next.next != null) {
            if(slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
