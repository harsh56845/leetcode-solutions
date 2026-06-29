// class Solution {
//     public int maxSum(int[] nums) { //  1 1 0 1 1
//         int max = Integer.MIN_VALUE; // 0
//         int n = nums.length; // 5
//         if(n==1) return nums[0];
//         int sum = 0; // 0
//         Set<Integer> set = new HashSet<>(); // {}

//         for(int i=0;i<n;i++){ //
//             if(sum!=0 && nums[i]<0) continue;
//             // if(!set.contains(nums[i]) && (sum>sum+nums[i])){
//                 // max = Math.max(nums[i],max);
//                 // continue;
//             // }
//             if(set.contains(nums[i])){ //
//                 sum = nums[i];
//                 set.clear();
//                 max = Math.max(sum,max);
//                 sum = 0;
//             }
//             else{
//                 sum+=nums[i];
//                 set.add(nums[i]);
//                 max = Math.max(sum,max);
//             }
//                 max = Math.max(nums[i],max);
//         }
//         return max;
//     }
// }


// class Solution {
//     public int maxSum(int[] nums) { //  -17 -15
//         int max = Integer.MIN_VALUE; // 0
//         int n = nums.length; // 2
//         if(n==1) return nums[0]; // -17
//         int sum = 0; // -17
//         Set<Integer> set = new HashSet<>(); // {-17}

//         for(int i=0;i<n;i++){ // i=0,1
//         if(i>0 && nums[i]<0 && nums[i-1]>=0) continue;
//             if(set.isEmpty()){
//                 set.add(nums[i]);
//                 max = nums[i];
//                 sum = nums[i];
//             }
//             else{
                
//                 if(set.contains(nums[i])){
//                     sum = nums[i];
//                     set.clear();
//                     set.add(nums[i]);
//                 }
//                 else{
//                     sum+=nums[i];
//                     set.add(nums[i]);
//                 }
//             }
//             max = Math.max(max,sum);
//             max = Math.max(max,nums[i]);
//         }
//         return max;
//     }
// }

class Solution {
    public int maxSum(int[] nums) { //  -17 -15
        int max = Integer.MIN_VALUE; // 0
        int n = nums.length; // 2
        int j = 0;
        int sum = 0; // -17
        Set<Integer> set = new HashSet<>(); // {-17}
        int min2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){ 
            if(nums[i]<=0){
                min2 = Math.max(min2,nums[i]);
            }
            else if(nums[i]>0){
            // while(set.contains(nums[i])){
            //     if(nums[j]<0){
            //         j++;
            //         continue;
            //     } 
            //     sum-=nums[j];
            //     set.remove(nums[j]);
            //     j++;
            // }
            if(!set.contains(nums[i])){
            sum+=nums[i];
            set.add(nums[i]);
            max = Math.max(max,sum);
            }
            // max = Math.max(max,nums[i]); 
            }
        }
        
        return max == Integer.MIN_VALUE ? min2 : max;
    }
}