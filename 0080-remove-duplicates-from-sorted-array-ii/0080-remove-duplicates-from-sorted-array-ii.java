class Solution {
    public int removeDuplicates(int[] nums) {
        int ele = nums[0];
        int k = 1;
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==ele){
                count++;
                if(count<=2){
                    nums[k++] = nums[i];
                }
            }
            else{
                count = 1;
                ele = nums[i];
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}