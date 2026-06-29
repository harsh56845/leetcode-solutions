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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode newNode = new ListNode(0); // 0 -> 1 -> 2 -> 
        ListNode newNodeTemp = newNode;
        // [1,2,3,3,4,4,5] . [1,1] , [1,2,2]
        while(temp!=null){ // 1 2
            if(temp.next!=null && temp.val==temp.next.val){// 1F, 
                int val = temp.val;
                while(temp!=null && temp.val==val){
                    temp = temp.next;
                    // if(temp == null) return newNode.next;
                }
            }
            else{
                newNodeTemp.next = temp;
                temp = temp.next;
                newNodeTemp = newNodeTemp.next;
                newNodeTemp.next = null;
            }
        }
        return newNode.next;
    }
}