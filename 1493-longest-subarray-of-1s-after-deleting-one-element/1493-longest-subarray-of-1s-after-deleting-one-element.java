class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 0;
        int n = nums.length;
        int i=0,j=0;
        int zero = 0;
        while(j<n){
            if(nums[j]==1){
                j++;
            }
            else{
                if(zero==0){
                    j++;
                    zero=1;
                }
                else{
                    while(zero==1){
                        if(nums[i]==0) zero=0;
                        i++;
                    }
                }
            }
            ans = Math.max(ans,j-i-1);
        }
        return ans;
    }
}