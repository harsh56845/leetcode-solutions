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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> q1 = new LinkedList<>();
        q1.add(root);
        q1.add(null);
        List<Integer> subList = new ArrayList<>();
        while(!q1.isEmpty()){
            // System.out.println(q1.val);
            TreeNode curr = q1.remove();
            if(curr==null){
                ans.add(new ArrayList<>(subList));
                subList.clear();
                if(q1.isEmpty()){
                    break;
                }
                else{
                    q1.add(null);
                }
            }
            else{
                subList.add(curr.val);
                if(curr.left!=null) q1.add(curr.left);
                if(curr.right!=null) q1.add(curr.right);
            }
            
        }
        return ans;
    }
}