public class Solution_368_LowestCommonAncester {
    public static void main(String[] args) {
        
    }
}


class TreeNode {
   public int key;
  public TreeNode left;
  public TreeNode right;
  public TreeNode(int key) {
     this.key = key;
    }
 }

 class TreeNodeP {
    public int key;
    public TreeNodeP left;
    public TreeNodeP right;
    public TreeNodeP parent;
    public TreeNodeP(int key, TreeNodeP parent) {
       this.key = key;
       this.parent = parent;
    }
}


class LowestCommonAncestorBinarySearchTree{
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode one, TreeNode two) {
        // write your solution here
        if(root == null || root == one|| root == two){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, one, two);
        TreeNode right = lowestCommonAncestor(root.right, one, two);
        if(left != null && right != null)return root;
        return left == null ? right :left;
    
    }



    public TreeNodeP lowestCommonAncestor(TreeNodeP one, TreeNodeP two) {
        // Write your solution here.
        if(one == null)return two;
        if(two == null)return one;
        TreeNodeP node1 = one, node2  = two;
        int depth1 = 0, depth2 = 0;
        while(node1.parent != null){
            node1 = node1.parent;
            depth1++;
        }
        while(node2.parent != null){
            node2 = node2.parent;
            depth2++;
        }
        if(depth1 > depth2){
            for (int i = 0; i < depth1 - depth2; i++) {
                one = one.parent;
            }
        }else{
            for (int i = 0; i < depth2 - depth1; i++) {
                two = two.parent;
            }
        }
        while(one != null && two != null){
            if(one == two) return one;
            else{
                one = one.parent;
                two = two.parent;
            }
        }
        return null;
    }


    public TreeNode lca(TreeNode root, int p, int q) {
        // Write your solution here
        if(root == null)return root;
        int small = (p<q)?p:q;
        int large = (p<q)?q:p;
        while(root != null){
            if(root.key <small ) root = root.right;
            else if(root.key > large) root = root.left;
            else return root;
        }
        return root;
      }

      
}




