class Node{
    int val;
    Node next;
    Node(int val){ 
        this.val = val;
        next = null;
    }
}

class MyLinkedList {
    /** Initialize your data structure here. */
    Node head;
    public MyLinkedList() {
        head = null;        
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node curr = head;
        int i = 0;
        while(curr != null){
            //System.out.println("head");
            if(i == index){
              return curr.val;
            }
            i++;
            curr = curr.next;
        }
        
        return -1;   
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        
        if(head == null){
            Node newNode = new Node(val);
            head = newNode;
        }else{
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
        }
        //System.out.println(head.val);
        //Node curr = head;
       /* while(curr != null){
            System.out.println(curr.val);
            curr = curr.next;
        }*/
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        //System.out.println(head.val);
        Node newNode = new Node(val);
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;      
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index < 0){
            addAtHead(val);
            return;
        }
        if(head == null || index == 0){
            if(index == 0){
                addAtHead(val);
                return;
            }else{
               return; 
            }
        } 
        int i =0;
        Node curr = head;
        Node prev = head;
        while(curr != null){                        
            if(i == index){
                prev.next = new Node(val);
                prev.next.next = curr;
            }
            prev = curr;
            curr = curr.next;            
            i++;
        }
        
        if(i == index){
            prev.next = new Node(val);
        }
       
        
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index < 0){
            return;
        }
        Node curr = head;
        Node prev = head;
        int i = 0;
        while(curr != null){
            if(index == 0 && curr.next == null){
                head = null;
                return;
            }
            if(index == 0 ){
                head = curr.next;
                return;
            }
            if(i == index){
                prev.next = curr.next;
                return;
            }
            i++;
            prev = curr;
            curr = curr.next;
        }  
       /* Node c = head;
        while(c != null){
            System.out.println(c.val);
            c = c.next;
        }*/
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
