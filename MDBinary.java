/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//Maximum Depth of Binary Tree
class MDBinary {
    public int maxDepth(TreeNode root) {
      int leftnode, rightnode;
        if(root==null)
        {
            return 0;
        }
        else
        {
         leftnode = maxDepth(root.left);
         rightnode= maxDepth(root.right);
            if(leftnode>rightnode)
                return leftnode+1;
            else
                return rightnode+1;
        }
    }
}