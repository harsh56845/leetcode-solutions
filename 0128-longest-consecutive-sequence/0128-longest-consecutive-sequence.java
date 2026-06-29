class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for(int i:nums){
            set.add(i);
        }
        for(int i:set){
            int ele = i;
            int count = 1;
            if(!set.contains(i-1)){
                while(set.contains(ele+1)){
                    count++;
                    ele++;
                }
            }
            max = Math.max(max,count);
        }
        return max;
    }
}