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
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==headB) return headA;
        int len1 = 0;
        int len2 = 0;
        ListNode currheadA = headA;
        ListNode currheadB = headB;
        while(currheadA!=null){
            len1++;
            currheadA = currheadA.next;
        }
        while(currheadB!=null){
            len2++;
            currheadB = currheadB.next;
        }
        if(len1>len2){
            while(len1!=len2){
                headA = headA.next;
                len1--;
            }
        }
        else if(len2>len1){
            while(len1!=len2){
                headB = headB.next;
                len2--;
            }
        }
    
        while(true){
            if(headA==headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }

    }
}