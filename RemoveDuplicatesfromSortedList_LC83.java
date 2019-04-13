/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head){
        if(head == null){
            return null;
        }        
        if(head.next == null){
            return head;
        }
        ListNode curr = head.next;
        ListNode prev = head;
        while(curr != null){
            if(prev.val == curr.val){
                    prev.next = curr.next;
            }else{
              prev = prev.next;  
            }
            curr = curr.next;            
        }
        return head;
    }
}
