public class tree{
        class Node{
            int val;
            Node left;
            Node right;
            
            public Node(int data){
                this.val = data;
            }
        }
        Node root;
        
        public tree(){
            this.root = null;
        }
        
        public void Insert(int val){
            root = insert(root, val);
        }
        
        public Node insert(Node root , int val){
            if(root == null){
                Node n = new Node(val);
                root = n;
            }
            if(root.val > val){
                root.left = insert(root.left , val);
            }
            if(root.val < val){
                root.right = insert(root.right , val);
            }
            return root;
        }
        
        public static void printree(Node root){
            if(root != null){
                printree(root.left);
                System.out.println(root.val);
                printree(root.right);
            }
        }
        public static boolean bstchk(Node root){
            return bst(root);
        }
        
        public static boolean bst(Node root){
         
           if(root != null){
                if(root.left != null && root.val > root.left.val){
                    System.out.println("dsfhgdjdg");
                    bst(root.left); 
                }else if(root.left != null && root.val < root.left.val){
                    return false;
                }
                
                if(root.right != null && root.val < root.right.val){
                    bst(root.right);  
                }else if(root.right != null && root.val > root.right.val){
                    return false;
                }
                   
           }
            return true;
        }
        
    

    public static void main(String []args){
        tree t = new tree();
        t.Insert(1);
        t.Insert(2);
        t.Insert(3);
        t.Insert(4);
        t.Insert(5);
        printree(t.root);
        System.out.println(bstchk(t.root));
        
    }
}
