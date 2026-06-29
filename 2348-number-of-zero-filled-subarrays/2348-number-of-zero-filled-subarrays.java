// class Solution {
//     public long zeroFilledSubarray(int[] nums) {
//         // [1,3,0,0,2,0,0,4]
//         long sol = 0; // 4
//         // int sum = 0;
//         int prevZeroIndex = 0; // 2
//         for(int i = 0; i < nums.length; i++){ // 1 3 0 0 2

//             if(nums[i] == 0){

//             }
//             else{
//                 int subArrayLen = i - prevZeroIndex;
//                 sol += (subArrayLen * (subArrayLen + 1)/2);
//                 prevZeroIndex = i + 1;
//             }
//             // if(nums[i] == 0) sol++; 
//             // sum += nums[i]; 
//             // if(sum==0) sol++;

//             // if(nums[i] == 0) sum = 0;
//             // else sum = 1;
//             // if(nums[i] == 0) sol++; // F F T T F
//             // if(i != prevZeroIndex) sol++; //  0==0F, 1==1F, 2==2F, 2!=4
//             // // if(nums[i] != 0) prevZeroIndex = i+1; // 1, 2,
//         }
//         if(prevZeroIndex != nums.length){
//             int subArrayLen = nums.length - prevZeroIndex;
//                 sol += subArrayLen * (subArrayLen + 1)/2;
//         }
//         return sol;
//     }
// }

class Solution {
    public long zeroFilledSubarray(int[] nums) {

        long sol = 0; 
        int consVzeros = 0;
        for(int i :  nums){
            if(i == 0){
                consVzeros++;
                sol += consVzeros;
            }
            else{
                consVzeros = 0;
            }
        }        
        return sol;
    }
}