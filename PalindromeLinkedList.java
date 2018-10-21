package linkedList;

public class PalindromeLinkedList {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(2);
        ListNode n6 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;

        System.out.println(isPalindrome(n1));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        int countNodes = 0;
        while(curr != null) {
            curr = curr.next;
            countNodes++;
        }
        int countMiddle = countNodes / 2;
        if(countNodes % 2 == 1)
            countMiddle = countMiddle + 1;
        ListNode middle = head;
        while(countMiddle != 0) {
            middle = middle.next;
            countMiddle--;
        }
        middle = reverse(middle);
        curr = head;
        while(middle != null) {
            if(curr.val != middle.val)
                return false;
            curr = curr.next;
            middle = middle.next;
        }
        return true;
    }

    public static ListNode reverse(ListNode n) {
        if(n == null || n.next == null)
            return n;
        ListNode prev = n;
        ListNode curr = n.next;
        ListNode next = n.next.next;
        while(curr != null) {
            if(prev == n)
                prev.next = null;
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next == null)
                return prev;
            next = next.next;
        }
        return curr;
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
