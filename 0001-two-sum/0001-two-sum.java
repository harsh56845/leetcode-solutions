class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] sol = {-1,-1};
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    sol[0] = i;
                    sol[1] = j;
                    return sol;
                }
            }
        }
        return sol;
    }
}