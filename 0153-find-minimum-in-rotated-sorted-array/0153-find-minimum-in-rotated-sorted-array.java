class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        int n = nums.length;
        int s = 0, e = n - 1;
        while(s<=e){
            int mid = e + (s-e)/2;
            min = Math.min(min,nums[mid]);

            if(mid>0 && mid<n-1 && nums[mid-1]<nums[mid] && nums[mid+1]<nums[mid]) return nums[mid+1];
            // left sorted

            if(nums[s]<=nums[mid]){
                // if(nums[s]<=target && target<nums[mid]){
                    s = mid + 1;
                    // min = Math.min(min,nums[mid]);
                }
            // }
            // right sorted
            else{
                // if(nums[mid]<target && target<=nums[e]){
                    e = mid - 1;
                    // min = Math.min(min,nums[mid]);

                }
                // else{
                //     e = mid - 1; 
                // }
            // }
        }
        return min;
    }
}