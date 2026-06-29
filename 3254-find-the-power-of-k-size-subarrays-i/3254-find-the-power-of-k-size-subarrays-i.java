class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] sol = new int[n-k+1];
        // int k=0;/
        for(int i=0;i<n-k+1;i++){
            int prev = nums[i];
            for(int j=i+1;j<k+i;j++){
                if(nums[j]==prev+1){
                    prev = nums[j];
                }
                else{
                    prev = -1;
                    break;
                }
            }
            sol[i] = prev;
        }
        return sol;
    }
}