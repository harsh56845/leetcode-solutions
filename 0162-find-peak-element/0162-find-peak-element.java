class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;
        int s = 0, e = n-1;

        while(s <= e){
            int mid = (s+e)/2;
            int prev = mid-1>=0 ? nums[mid-1] : Integer.MIN_VALUE;
            //  nums[(mid+n-1)%n];
            int next = mid+1<n ? nums[mid+1] : Integer.MIN_VALUE;
            //  nums[(mid+1)%n];

            if(nums[mid]>prev && nums[mid]>next){
                return mid;
            }
            else if(nums[mid]>next){
                // e = mid-1;
                e = mid - 1;

            }
            else{
                s = mid + 1;
            }
        }
        return -1;
    }
}