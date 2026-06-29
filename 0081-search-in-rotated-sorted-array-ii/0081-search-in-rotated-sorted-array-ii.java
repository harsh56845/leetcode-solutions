class Solution {
    public boolean search(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        while(s<=e){
            int mid = e + (s-e)/2;

            if(nums[mid]==target) return true;
            // s == mid == e
            if(nums[s]==nums[mid] && nums[e]==nums[mid]){
                s++;
                e--;
            }
            // left sorted
            else if(nums[s]<=nums[mid]){
                if(nums[s]<=target && target<nums[mid]){
                    e = mid - 1;
                }
                else{
                    s = mid + 1; 
                }
            }
            // right sorted
            else{
                if(nums[mid]<target && target<=nums[e]){
                    s = mid + 1;
                }
                else{
                    e = mid - 1; 
                }
            }
        }
        return false;
    }
}