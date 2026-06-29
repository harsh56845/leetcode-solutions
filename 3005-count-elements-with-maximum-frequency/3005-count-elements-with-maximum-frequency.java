class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] frq = new int[101];
        int maxFrq = 0;
        for(int i : nums){
            frq[i]++;
            maxFrq = Math.max(maxFrq,frq[i]);
        }
        int count = 0;
        for(int i: nums){
            if(frq[i]==maxFrq) count++;
        }
        return count;
    }
}