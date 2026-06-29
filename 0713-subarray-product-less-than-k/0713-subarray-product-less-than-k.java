class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int count = 0;
        int pro = 1;
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            pro*=nums[i];
            // if(pro<k) count+=(i-j+1);
            while(j<nums.length && pro>=k){
                pro/=nums[j++];
            }
            count+=(i-j+1);
        }
        return count;
    }
}