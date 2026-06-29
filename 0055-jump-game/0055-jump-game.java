class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(max<i) return false;
            else{
                max = Math.max(max,nums[i]+i);
            }
            if(max>=nums.length) return true;
        }
        return true;
    }
}