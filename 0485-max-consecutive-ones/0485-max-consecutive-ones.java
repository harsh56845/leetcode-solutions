class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int i:nums){
            if(i==1) count++;
            // else count = 0;
            max = Math.max(count,max);
            // System.out.println(i+" "+count+" "+max);
            if(i==0) count=0;

        }
        return max;
    }
}