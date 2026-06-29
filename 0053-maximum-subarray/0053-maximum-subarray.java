class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum=0;
        for(int i:nums){
            if(currSum<0){
                // maxSum = Math.max(currSum,maxSum);
                currSum = 0;
            }
            currSum+=i;
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}