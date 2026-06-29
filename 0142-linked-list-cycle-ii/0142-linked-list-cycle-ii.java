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




public class Solution {

    public ListNode checkLoop(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return fast;
        }
        return null;
    }


    public ListNode detectCycle(ListNode head) {
        if(checkLoop(head)==null) return null;
        ListNode start = head;
        ListNode end = checkLoop(head);
        while(start!=end){
            start = start.next;
            end = end.next;
        }
        return start;
    }
}