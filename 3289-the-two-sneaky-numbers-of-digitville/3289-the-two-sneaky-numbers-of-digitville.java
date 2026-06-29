class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        int[] frq = new int[101];
        for(int i : nums) frq[i]++;
        int j = 0;
        for(int i : nums){
            if(frq[i]==2){
                ans[j++]=i;
                frq[i] = 0;
            }
            if(j==2) break;
        }
        return ans;
    }
}