class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int i=0,j=0;
        int count=0,k1=0;
        // if(k==0){
        //     for(int num:nums) if(num==1) count++;
        //     return count;
        // }
        while(i < nums.length){
            if(nums[i]==1){
                count++;
                i++;
            }
            else if(k==0){
                count = 0;
                i++;
            }
            else{
                if(k1<k){
                    count++;
                    i++;
                    k1++;
                }
                else{
                while(j<i && k1>=k){
                    count--;
                    if(nums[j]==0) k1--;
                    j++;
                    }
                }
            }
            max = Math.max(max,count);
        }
        return max;
    }
}