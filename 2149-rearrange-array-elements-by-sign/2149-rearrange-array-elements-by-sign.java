// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int n = nums.length;
//         int[] sol = new int[n];
//         boolean pos = true;
//         int i=0,j=0,k=0;
//         while(i<n || j<n){
//             if((i<n && pos) || (i<n && j==n)){
//                 while(i<n && nums[i]<0) i++;
//                 sol[k++] = nums[i++];
//                 pos=false;
//                 continue;
//             }
//             if((j<n && !pos) || (j<n && i==n)){
//                 while(j<n && nums[j]>0) j++;
//                 sol[k++] = nums[j++];
//                 pos=true;
//                 continue;
//             }
//             break;
//         }
//         return sol;
//     }
// }


class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] sol = new int[n];
        int posIndex = 0, negIndex = 0, k = 0;
        
        // Find the first positive and negative numbers' starting positions.
        while (posIndex < n && nums[posIndex] < 0) posIndex++;
        while (negIndex < n && nums[negIndex] > 0) negIndex++;
        
        boolean posTurn = true; // To toggle between positive and negative
        
        while (k < n) {
            if (posTurn) {
                sol[k++] = nums[posIndex++];
                // Find the next positive number
                while (posIndex < n && nums[posIndex] < 0) posIndex++;
            } else {
                sol[k++] = nums[negIndex++];
                // Find the next negative number
                while (negIndex < n && nums[negIndex] > 0) negIndex++;
            }
            posTurn = !posTurn; // Toggle between positive and negative
        }
        
        return sol;
    }
}
