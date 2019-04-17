class Solution {
    public boolean isBalanced(TreeNode root) {
        return bal(root);
        
    }
    
    public int getH(TreeNode Node){
        if(Node == null){
            return -1;
        }    
        return Math.max(getH(Node.left),getH(Node.right))+1;
    }
    
    public boolean bal(TreeNode root){
        if(root == null){
            return true;
        }
        int diff = Math.abs(getH(root.left)-getH(root.right));
        if(diff > 1){
            return false;
        }
        return (bal(root.left) && bal(root.right));    
    }
}
