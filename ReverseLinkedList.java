public class HelloWorld{
    public static void main(String[] args){
        int i=2;
        ListNode head = new ListNode(1);  
        ListNode curr = head;
        while(i< 6){
            
          ListNode h = new ListNode(i);  
          h.next = null;
          curr.next = h;
          curr = curr.next;
          i++;
        }
        curr = head;
        
        ListNode sol = reverse(head);
        while(sol != null){
            System.out.print(sol.val+" ");
            sol = sol.next;
        }
    }
    static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while(curr !=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }
        return prev;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
