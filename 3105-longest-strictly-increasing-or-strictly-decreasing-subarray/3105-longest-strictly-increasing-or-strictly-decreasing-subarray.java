class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==1) return 1;
        int no = nums[0];
        int dec = 1,inc = 1;
        int decC = 1,incC = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>no){
                decC = 1;
                no = nums[i];
                incC++;
                inc = Math.max(incC,inc);
            }
            else if(nums[i]==no){
                decC = 1;
                incC = 1;
            }
            else{
                incC = 1;
                no = nums[i];
                decC++;
                dec = Math.max(decC,dec);
            }
        }
        return (int)Math.max(inc,dec);
    }
}