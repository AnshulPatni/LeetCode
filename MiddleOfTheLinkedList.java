package linkedList;

public class MiddleOfTheLinkedList {

    public static void main(String[] args) {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
//        n5.next = n6;
        n5.next = null;


        ListNode middle = middleNode(n1);
        while(middle != null) {
            System.out.println(middle.val);
            middle = middle.next;
        }

    }

    public static ListNode middleNode(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        } else {
            ListNode curr = head;
            int countNodes = 0;
            while(curr != null) {
                curr = curr.next;
                countNodes++;
            }
            int middleValue = countNodes / 2;
            curr = head;
            while(middleValue != 0)  {
                curr = curr.next;
                middleValue--;
            }
            return curr;
        }
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
