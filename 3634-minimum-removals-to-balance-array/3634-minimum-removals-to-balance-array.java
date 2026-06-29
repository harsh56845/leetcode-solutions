// class Solution {
//     public int minRemoval(int[] nums, int k) {
//         // if(nums.length<=1) return 0;
//         int n = nums.length;
//         Arrays.sort(nums);
//         int ans = 0;
//         int i = 0, j = 0;
//         while(i<n){
//             while(j<=i && nums[i]>(long)(nums[j]*k)) j++;
//             ans = Math.max(ans,i-j+1);
//             i++;
//             // if(nums.length!=2 && (i+j)==1 && nums[j]>nums[i]*k) break;
//             // if(nums[j]<=nums[i]*k){
//             //     // ans++;
//             //     // i++;
//             //     if(nums[j]<=nums[i+1]*k) i++;
//             //     if(nums[j-1]<=nums[i]*k) j--;
//             //     // i++;
//             //     // j--;
//             //     // j--;
//             //     // break;
//             // }
//             // else{
//             //     // if(nums.length==2) break;
//             //     ans++;
//             //     i++;
//             // }
            
//         }
//         return n-ans;
//     }
// }

class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        int i = 0, j = 0;

        while (i < n) {
            while (j <= i && nums[i] > (long)nums[j] * k) j++;
            ans = Math.max(ans, i - j + 1);
            i++;
        }

        return n - ans;
    }
}
