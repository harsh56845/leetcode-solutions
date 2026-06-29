// class Solution {
//     public int search(int[] nums, int target) {
//         int n = nums.length;
//         int i = 0, j = n-1;
        
//         if(n<=3){
//             for(int k=0;k<n;k++){
//                 if(nums[k]==target) return k;
//             }
//             return -1;
//         }

//         while(i<=j){
//             int mid = (i+j)/2;
//             if(nums[mid] == target) return mid;
//             // else if(mid==0 || mid==n-1) return -1;
//             else if(mid>0 && mid<n-1 && nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]){
             
//                 if(nums[j]<target){
//                     j = mid-1;
//                 }
//                 else{
//                     i = mid+1;
//                 }
//             }
//             else{
//                 if(nums[mid]>target){
//                     j = mid-1;
//                 }
//                 else{
//                     i = mid+1;
//                 }
//             }
//         }
//         return -1;
//     }
// }


class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int i = 0, j = n-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(nums[mid] == target) return mid;
            // else if(mid==0 || mid==n-1) return -1;
            else if(nums[i]<=nums[mid]){
                if(nums[i]<=target && target<nums[mid]){
                    j = mid-1;
                }
                else{
                    i = mid+1;
                }
            }
            else{
                if(nums[mid]<target && target<=nums[j]){
                    i = mid+1;
                }
                else{
                    j = mid-1;
                }
            }
        }
        return -1;
    }
}