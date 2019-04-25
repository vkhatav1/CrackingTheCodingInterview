class Solution {
    public Node copyRandomList(Node head) {
       Map <Node , Node> m =  new HashMap<Node , Node>();
        
        Node curr = head;
        Node ret = curr;
        while(curr != null){
            Node n = new Node(curr.val,null,null);
            m.put(curr,n);
            curr = curr.next;
        }
        
        curr = head;
        while(curr != null){
            m.get(curr).next = m.get(curr.next);
            m.get(curr).random = m.get(curr.random);
            curr = curr.next;
        }

        return m.get(ret);
    }
} 
