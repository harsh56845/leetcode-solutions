class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        int max = Integer.MIN_VALUE;
            for(int num : nums) max = Math.max(max,num);
        int s = 1, e = max;
        while(s<=e){
            int mid = s + (e-s)/2;
            int sum = 0;
            for(int num : nums){
                sum += num/mid;
                if(num%mid!=0) sum=sum+1;
            }
            if(sum<=threshold){
                min = Math.min(min,mid);
                e = mid -1;
                
            }
            else s = mid+1;
        }
        return min;
    }
}