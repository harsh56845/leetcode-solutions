class Solution {
    public int findLHS(int[] nums) {
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]-1)){
                int len = map.get(nums[i]) + map.get(nums[i]-1);
                max = Math.max(max,len);
            }
        }
        return max;
    }
}