/*
Tree structure 
class TreeNode{
  int val;
  TreeNode left;
  TreeNode right;
  
  TreeNode(int val){
    this.val = val;
  }
}
*/

// Inorder Traversal 
void printTree(TreeNode root){
  if(root == null){
    return 0;
  }
  printTree(root.left);
  System.out.println(root.val);
  printTree(root.right);
}
