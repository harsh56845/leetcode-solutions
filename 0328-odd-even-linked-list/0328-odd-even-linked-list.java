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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return head;
        ListNode head2 = head.next;
        ListNode prev = head;
        ListNode curr = head.next;
        int count = 0;
        while(curr!=null && curr.next!=null){
            prev.next = curr.next;
            prev = curr;
            curr = curr.next;
            count++;
        }
        prev.next = null;
        if(count%2==1){
            curr.next = head2;
        }
        else{
            prev.next = head2;
        }

        return head;
    }
}