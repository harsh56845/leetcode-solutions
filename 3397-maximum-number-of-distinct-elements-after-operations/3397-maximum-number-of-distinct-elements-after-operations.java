class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        // boolean isPresent[] = new boolean[1000001];
        // HashMap<Integer,Boolean> isPresent = new HashMap<>();
        Arrays.sort(nums);
        // Set<Integer> set = new HashSet<>();
        int distNums = 0;
        int nextAvl = Integer.MIN_VALUE;
        for(int i : nums){
            int curr = Math.max(i-k,nextAvl);

            if(curr <= i+k){
                distNums++;
                nextAvl=curr+1;
            }
            // for(int j=-k;j<=k;j++){
            //     // if(j==0) continue;
            //     if(!set.contains(i+j)){
            //         set.add(i+j);
            //         distNums++;
            //         break;
            //     }
            // }
        }
        return distNums;
    }
}