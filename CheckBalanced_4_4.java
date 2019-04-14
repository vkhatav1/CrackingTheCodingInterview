class Node{
    int data;
    Node left, right;
    
    Node(int d){
        this.data = d;
        left = right = null;
    }
}


public class BinaryTree{
    public static void main(String []args){
        int[] arr = new int[] {9,2,3};
        Node root = CreateNode(arr);
        boolean b = balanced(root);
        System.out.println(b);
        Node root1 = populate(arr);
        boolean b1 = balanced(root1);
        System.out.println(b1);
        
    }
    public static Node populate(int[] arr){
        Node r = new Node(arr[0]);
        for(int i=1; i<arr.length; i++){
            insert(arr[i],r);
        }
        return r;
    }
    
    public static void insert(int d, Node n){
        System.out.println(n.data);
        if(n.left == null){
            Node newNode = new Node(d);
            n.left = newNode;
            System.out.println(n.left.data);
        }else{
            insert(d,n.left);
        }
    }
    
    public static Node CreateNode(int[] arr){
        return buildTree(arr,0,arr.length-1);
    }
    
    public static Node buildTree(int[] arr,int start, int end){
     
        if(end < start){
            return null;
        }
        int mid = (start + end) / 2;
        Node n = new Node(arr[mid]);
      //  System.out.println(n.data);
        n.left = buildTree(arr,start,mid-1);
        n.right = buildTree(arr,mid+1,end);
        return n;
    }
    
    public static boolean balanced(Node root){
        if(root == null){
            return true;
        }
        
        int diff = Math.abs(getH(root.left) - getH(root.right));
        if(diff > 1){
            return false;
        }else{
            return(balanced(root.left) && balanced(root.right));
        }
        
    }
    
    public static int getH(Node n){
        if(n == null){
            return -1;
        }
        return Math.max(getH(n.left),getH(n.right)) + 1;
    }
    
}
