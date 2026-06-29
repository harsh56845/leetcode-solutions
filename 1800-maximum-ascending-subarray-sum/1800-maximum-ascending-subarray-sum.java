class Solution {
    public int maxAscendingSum(int[] nums) {
        int n=nums.length;
        int max = nums[0],sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
                max = Math.max(max,sum);
            }
            else{
                sum=nums[i];
            }
        }
        return max;
    }
}