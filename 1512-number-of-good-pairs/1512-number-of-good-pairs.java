class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] map = new int[101];
        int count = 0;
        for(int num : nums){
            count += map[num];
            map[num]++;
        }
        return count;
    }
}