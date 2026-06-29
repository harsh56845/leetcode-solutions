class Solution {
    public void swap(int[] nums,int i,int j){
        nums[i] = nums[i] + nums[j] - (nums[j]=nums[i]);
    }
    public void sortColors(int[] nums) {
        int i=0,j=0,k=nums.length-1;
        while(j<=k){
            int ele = nums[j];
            if(ele==0){
                swap(nums,i,j);
                i++;
                j++;
            }
            else if(ele==2){
                swap(nums,j,k);
                k--;
            }
            else{
                j++;
            }
        }
    }
}