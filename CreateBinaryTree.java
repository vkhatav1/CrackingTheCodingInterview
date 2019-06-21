public class HelloWorld{


    
    // Driver code
    public static void main(String[] args){
      int[] arr = {1, 2, 3, 4, 5, 6, 6, 6, 6};
      TreeNode root = new TreeNode(arr[0]);
      root = root.insert(root, arr, 0);
      printTree(root);
    }
    static void printTree(TreeNode root){
        if(root == null)    return;
        
        printTree(root.left);
        System.out.print(root.val +" ");
        printTree(root.right);
    }
     
}
//Tree structure
    class TreeNode{
      int val;
      TreeNode left;
      TreeNode right;
      
      TreeNode(int val){
        this.val = val;
      }
      // function to insert val in tree
    
        TreeNode insert(TreeNode root, int[] arr, int i){
          if(i < arr.length){
            root = new TreeNode(arr[i]);
            root.left = insert(root.left, arr, 2*i + 1);
            root.right = insert(root.right, arr, 2*i + 2);
          }
          return root;
        }
    }
    
    
