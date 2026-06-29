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
class Solution {
    // public void solve(TreeNode root,TreeNode root1) {
    //     if(root==null) return;

    //     root1.left = root.right;
    //     root1.right = root.left;
    //     solve(root.left,root1.left);
    //     solve(root.right,root1.right);
    // }
    public TreeNode invertTree(TreeNode root) {
        // TreeNode root1 = new TreeNode();
        // root1 = root;
        // solve(root,root1);
        // return root1;
        if(root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}