class Solution {
    public int majorityElement(int[] nums) {
        int ele = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(ele==nums[i]){
                count++;
            }
            else{
                // ele = nums[i];
                count--;
            }
            if(count==0){
               ele = nums[i];
               count++;
            }
        }
        return ele;
    }
}