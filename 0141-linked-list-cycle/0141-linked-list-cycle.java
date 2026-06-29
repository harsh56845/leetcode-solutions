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
    public boolean hasCycle(ListNode head) {
        List<ListNode> ls = new ArrayList<>();
        while(head!=null){
            if(ls.contains(head)) return true;
            ls.add(head);
            head = head.next;
        }
        return false;
        // ListNode slow = head;
        // ListNode fast = head;
        // while(fast==null && fast.next==null){
        //     slow = slow.next;
        //     fast = fast.next.next;
        //     if(slow==fast) return true;
        // }
        // return false;
    }
}