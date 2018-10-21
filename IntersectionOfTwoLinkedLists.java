package linkedList;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {
        ListNode l1n1 = new ListNode(1);
        ListNode l1n2 = new ListNode(2);
        ListNode l1n3 = new ListNode(3);
        ListNode l1n4 = new ListNode(4);
        ListNode l1n5 = new ListNode(2);
        ListNode l1n6 = new ListNode(1);
        l1n1.next = l1n2;
        l1n2.next = l1n3;
        l1n3.next = l1n4;
        l1n4.next = l1n5;
        l1n5.next = l1n6;
        l1n6.next = null;

        ListNode l2n1 = new ListNode(1);
//        ListNode l2n2 = new ListNode(4);
//        ListNode l2n3 = new ListNode(5);

        l2n1.next = null;
//        l2n2.next = l2n3;
//        l2n3.next = l1n3;

        ListNode intersectNode = getIntersectionNode(l1n1, l2n1);

        if(intersectNode == null)
            System.out.println("null");
        else
            System.out.println(intersectNode.val);

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /** Method -1 **/
        /*if(headA == null || headB == null) return null;
        if(headA == headB) return headA;
        Set<ListNode> nodeSet = new HashSet<>();
        ListNode currA = headA;
        ListNode currB = headB;
        while(currA != null || currB != null) {
            if(currA == currB)
                return currA;
            if(currA == null) {
                if(nodeSet.contains(currB)) {
                    return currB;
                } else {
                    nodeSet.add(currB);
                    currB = currB.next;
                }
            } else if(currB == null) {
                if(nodeSet.contains(currA)) {
                    return currA;
                } else {
                    nodeSet.add(currA);
                    currA = currA.next;
                }
            } else {
                if(nodeSet.contains(currB)) {
                    return currB;
                } else if(nodeSet.contains(currA)) {
                    return currA;
                }
                nodeSet.add(currA);
                nodeSet.add(currB);
                currA = currA.next;
                currB = currB.next;
            }
        }
        return null;*/

        /** Method - 2 **/
        if(headA == null || headB == null) return null;
        if(headA == headB) return headA;
        ListNode currA = headA;
        ListNode currB = headB;

        while(currA != currB) {
            if(currA == null) {
                currA = headB;
            } else {
                currA = currA.next;
            }
            if(currB == null) {
                currB = headA;
            } else {
                currB = currB.next;
            }
        }
        return currA;
    }

}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */