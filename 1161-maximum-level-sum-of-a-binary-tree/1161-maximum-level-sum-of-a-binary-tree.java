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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q1 = new LinkedList<>();
        q1.add(root);
        q1.add(null);
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        int ansLevel = 1;
        int level = 1;
        while(!q1.isEmpty()){
            TreeNode curr = q1.remove();
            if(curr!=null){
                currSum+=curr.val;
                if(curr.left!=null) q1.add(curr.left);
                if(curr.right!=null) q1.add(curr.right);
                // q1.add(null);
            }
            else{
                if(currSum>max){
                    max = currSum;
                    
                    ansLevel = level;
                }
                currSum = 0;
                level++;
                if(!q1.isEmpty()) q1.add(null);
            }
        }
        return ansLevel;
    }
}