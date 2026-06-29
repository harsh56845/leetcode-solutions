// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public int height(TreeNode root,boolean a) {
//         if(root==null) return 0;
//         if(root.left == null && root.right == null){
//             return 1;
//         }

//         int left = height(root.left,a);
//         int right = height(root.right,a);

//         if((Math.abs(left-right))>1){
//             a = false;
//         }


//         return Math.max(left,right) + 1;
//     }
//     public boolean isBalanced(TreeNode root) {
//         if(root==null) return true;
//         boolean a = true;
//         height(root,a);
//         return a;
//     }
// }

class Solution {

    public boolean isBalanced(TreeNode root) {
        return heightDiff(root) != -1;
    }

    public int heightDiff(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int hleft = heightDiff(root.left);
        if (hleft == -1)
            return -1;
        int hright = heightDiff(root.right);
        if (hright == -1)
            return -1;

        if (Math.abs(hleft - hright) > 1) {
            return -1;
        }
        return 1 + Math.max(hleft, hright);
    }
}
 
