class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int sum = nums[i]-nums[(i-1+n)%n];
            max = Math.max(max,Math.abs(sum));
        }
        return max;
    }
}