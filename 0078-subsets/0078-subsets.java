class Solution {
    public void helper(int[] nums,List<List<Integer>> ans,int i,List<Integer> temp) {
        if(i>=nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        helper(nums,ans,i+1,temp);
        temp.remove(temp.size()-1);
        helper(nums,ans,i+1,temp);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,ans,0,new ArrayList<>());
        return ans;
    }
}