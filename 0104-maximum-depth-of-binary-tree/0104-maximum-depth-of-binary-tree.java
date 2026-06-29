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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int ans = 1;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        que.add(null);
        while(!que.isEmpty()){
            TreeNode node = que.remove();
            if(node==null){
                System.out.println();
                if(que.peek()==null) break;
                ans++;
                que.add(null);
            }
            else{
                System.out.print(node.val+" ");
                if(node.left!=null) que.add(node.left);
                if(node.right!=null) que.add(node.right);
            }
        }
        return ans;
    }
}