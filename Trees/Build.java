public class Build {
    static  class Node{
        int data;
        Node left;
        Node right;

       Node(int data){
          this.data = data;
          this.left = null;
          this.right = null;
        }
    }

    static class BinaryTree{
      static  int idx  = -1;

       
        public static Node PreOrderBuild(int nodes[]){
            idx = idx +1;
   if (nodes[idx] == -1) {
                return null;
            }
           Node newNode = new Node(nodes[idx]);

            newNode.left = PreOrderBuild(nodes);
            newNode.right = PreOrderBuild(nodes);
            return newNode;
        }

          public static void preorder(Node root){ //preOrder
        if(root == null){
            return;
        }
        System.out.println(root.data);
         preorder(root.left);
         preorder(root.right); 

    }

    public static void Inorder(Node root){
         if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data);
        Inorder(root.right);
    }

    public static void postOrder(Node root){
     if(root == null){
            return;
        }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data);

    }
      
    }

    
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
       Node root = tree.PreOrderBuild(nodes);
      tree.postOrder(root);
        
    }
    
}
