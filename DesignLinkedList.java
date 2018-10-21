package linkedList;

public class DesignLinkedList {
    static class dListNode{
        int val;
        dListNode next;
        dListNode prev;
        dListNode(int x){
            this.val = x;
            this.next = null;
            this.prev = null;

        }
    }
    dListNode head = new dListNode(0);
    dListNode tail = new dListNode(0);
    /** Initialize your data structure here. */
    public DesignLinkedList() {
        head.next = tail;
        tail.prev = head;
        tail.next = null;
        head.prev = null;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        int count = 0;
        dListNode cur = head.next;
        while(cur != tail){
            if(count == index)return cur.val;
            count++;
            cur = cur.next;
        }
        return -1;
    }

    /** Add a node of value val before the first element of the linked list.
     * After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        dListNode temp = new dListNode(val);
        temp.next = head.next;
        head.next.prev = temp;
        head.next = temp;
        temp.prev = head;

    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        dListNode temp = new dListNode(val);
        tail.prev.next = temp;
        temp.prev = tail.prev;
        temp.next = tail;
        tail.prev = temp;
    }

    /** Add a node of value val before the index-th node in the linked list.
     * If index equals to the length of linked list, the node will be appended to the end of linked list.
     * If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        int count = 0;
        dListNode temp = new dListNode(val);
        dListNode run = head;
        while(run != tail){
            if(count == index){
                count++;
                temp.prev = run;
                temp.next = run.next;
                run.next.prev = temp;
                run.next = temp;
                return;
            }
            run = run.next;
            count++;
        }
        return;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        int count = 0;
        dListNode run = head.next;
        while(run != null && run.next != null){
            if(count == index){
                run.prev.next = run.next;
                run.next.prev = run.prev;
                return;
            }
            count++;
            run = run.next;
        }
        return;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */