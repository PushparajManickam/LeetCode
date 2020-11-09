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
class ArrayToBinaryTree {
    public TreeNode sortedArrayToBST(int[] nums) {
    int size = nums.length;
    return BST(nums, 0, size-1);
    }
    public TreeNode BST(int[] arr,int start, int end)
    {
        if(start>end)
            return null;
     
        int middle      = (start+end)/2;
        TreeNode root   = new TreeNode(arr[middle]);
        if(start==end)
            return root;
        root.left       = BST(arr,start,middle-1);
        root.right      = BST(arr,middle+1,end);
        
        return root;
    }
}