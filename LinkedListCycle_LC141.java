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
        ListNode slow = head;
        ListNode fast = head;
      /*  Map<ListNode, Integer> m = new HashMap<ListNode,Integer>();
        
        while(curr != null){
            if(m.containsKey(curr)){
                return true;
            }else{
                m.put(curr,curr.val);
            }
            curr = curr.next;
        }
        
        return false;*/
      while(fast!= null && fast.next != null){
          fast = fast.next.next;
          slow = slow.next;
          if(fast == slow){
            return true;
          }
          
      }
        return false;
    }
}
