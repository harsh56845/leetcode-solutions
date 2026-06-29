// class Solution {
//     public boolean kLengthApart(int[] nums, int k) {
//         int n = nums.length;
//         int i=0,j=0;
//         while(i<n && j<n){
//             if(nums[i]==1){
//                 j=i+1;
//                 while(j<n && nums[j]==0){
//                     count++;
//                     j++;
//                 }
//                 int dis = j-i+1;
//             }
//         }
//         return true;
//     }
// }
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count = k; // Initialize count to k to handle the first '1'
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (count < k) {
                    return false; // If the distance is less than k, return false
                }
                count = 0; // Reset count after encountering a '1'
            } else {
                count++; // Increment count for each '0'
            }
        }
        return true;
    }
}
