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
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
        Node root = CreateNode(arr);
        
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
        System.out.println(n.data);
        n.left = buildTree(arr,start,mid-1);
        n.right = buildTree(arr,mid+1,end);
        return n;
    }
    
    
    
}
