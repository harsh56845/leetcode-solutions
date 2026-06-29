/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode newNode = new ListNode(0);
        ListNode newCurr = newNode;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                newCurr.next = l1;
                l1 = l1.next;
            }
            else{
                newCurr.next = l2;
                l2 = l2.next;
            }
            newCurr = newCurr.next;
        }
        while(l1!=null){
            newCurr.next = l1;
            l1 = l1.next;
            newCurr = newCurr.next;
        }
        while(l2!=null){
            newCurr.next = l2;
            l2 = l2.next;
            newCurr = newCurr.next;
        }
        return newNode.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        ListNode l1= sortList(head);
        ListNode l2 = sortList(slow);

        return merge(l1,l2);

    }
}