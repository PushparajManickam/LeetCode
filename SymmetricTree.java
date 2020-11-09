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
class SymmerticTree {
    public boolean isSymmetric(TreeNode root) {
      return isMirror(root, root);
    }
    public boolean isMirror(TreeNode Tree1, TreeNode Tree2){
        //both tree are null
        if(Tree1==null && Tree2==null)
            return true;
        //Both tree are not equal to null
        //left tree and right tree values are equal
        if(Tree1!=null && Tree2!=null && Tree1.val==Tree2.val)
            return (isMirror(Tree1.left,Tree2.right) &&
                    isMirror(Tree1.right,Tree2.left));
    return false;
    }
}