class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int rSum = 0, lSum =0;
        for(int i:nums) rSum+=i;
        // rSum -= nums[0];
        for(int i=0;i<n;i++){
            int temp = nums[i];
            rSum -= temp;
            nums[i] = Math.abs(rSum - lSum);
            lSum+=temp;
        }
        return nums;
    }
}