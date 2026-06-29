class Solution {
    public void helper(List<List<Integer>> ans,int[] nums,int start,List<Integer> temp,int n,int sum,int k) {
        if(temp.size()==k){
            if(sum==n){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        // for(int i = start; i<nums.length;i++){
            // if(i>0 && nums[i]==nums[i-1]) continue;
            if(sum>n || start>=nums.length) return;
            temp.add(nums[start]);
            helper(ans,nums,start+1,temp,n,sum+nums[start],k);
            temp.remove(temp.size()-1);
            helper(ans,nums,start+1,temp,n,sum,k);

        // }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans,nums,0,new ArrayList<>(),n,0,k);

        return ans;
    }
}