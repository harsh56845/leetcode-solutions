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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        ListNode curr = head.next;
        ListNode prev = head;
        while(curr!=null){
            // System.out.println(prev.val+" "+curr.val+"== "+val);
            if(curr.val==val){
                prev.next = curr.next;
                curr.next = null;
                curr = prev.next;
            }
            else{
                prev = curr;
                curr = curr.next;
            }
        }
        if(head.val==val) head = head.next;
        return head;

    }
}