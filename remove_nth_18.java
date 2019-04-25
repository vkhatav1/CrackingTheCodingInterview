class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int count = 0;
        while(curr != null){
            count += 1;
            curr = curr.next;
        }
        
    count = count - n;
        
        curr = head;
        ListNode prev = null;
        while(curr != null && count > 0){
            prev = curr;
            curr = curr.next;
            count -= 1;
        }
        //System.out.println(prev.val);
        if(prev == null){
            head = curr.next;            
        }else if(curr != null && prev != null){
            prev.next = prev.next.next;
        }else if(prev != null && curr.next == null ){
               prev.next = null;
        }
        
        return head;
    }
}
