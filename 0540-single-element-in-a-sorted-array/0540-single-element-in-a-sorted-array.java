class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int s = 0, e = n-1;
        
        while(s<=e){
            int mid = (s+e)/2;
            int prev = nums[(mid+n-1)%n];
            int next = nums[(mid+1)%n];
            if(nums[mid]!=prev && nums[mid]!=next) return nums[mid];
            if(mid%2==1){
                if(nums[mid]==prev){
                    s = mid+1;
                }
                else{
                    e = mid -1;
                }
            }
            else{
                if(nums[mid]==prev){
                    e = mid - 1;
                }
                else{
                    s = mid + 1;
                }


            }
        }
        return nums[s];
    }
}