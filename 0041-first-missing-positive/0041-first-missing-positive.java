class Solution {
    public int firstMissingPositive(int[] nums) {
        int minPos = nums[0];
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            if(i>0) minPos = Math.min(minPos,i);
            set.add(i);
        }
        int s = 1;
        while(true){
            if(!set.contains(s)) return s;
            s++;
        }
    }
}