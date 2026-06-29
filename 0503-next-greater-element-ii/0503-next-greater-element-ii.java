class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int min = 99999999;
            for(int j=i+1;j<n;j++){
                if(nums[j]>nums[i]){
                    min = nums[j];
                    break;
                }
            }
            if(min == 99999999)
            for(int j=0;j<i;j++){
                if(nums[j]>nums[i]){
                    min = nums[j];
                    break;
                }
            }
            ans[i] = min == 99999999 ? -1 : min;
        }
        return ans;
    }
}