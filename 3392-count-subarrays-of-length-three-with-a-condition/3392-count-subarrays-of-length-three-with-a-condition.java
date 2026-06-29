class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        for(int i = 0;i < nums.length-2; i++){
            int f = nums[i];
            int s = nums[i+1];
            int t = nums[i+2];
            if(s % 2 == 0 && (f + t == s / 2)) count++;
        }
        return count;
    }
}