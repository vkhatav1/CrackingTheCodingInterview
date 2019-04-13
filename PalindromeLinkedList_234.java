/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        Stack<Integer> stack = new Stack();
        
        while(fast != null  && fast.next !=null){            
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        
        while(!stack.empty()){
            if(fast != null){               
              if(slow.next != null){
                    slow = slow.next;
                }
            }
            if(stack.pop() != slow.val){                
                return false;
            }else{
                slow = slow.next;
            }
        }
        
        return true;
        
    }
}
