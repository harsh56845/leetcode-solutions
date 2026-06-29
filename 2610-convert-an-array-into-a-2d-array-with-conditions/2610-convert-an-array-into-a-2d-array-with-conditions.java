class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int[] frq = new int[201];
        for(int i : nums){
            int iFrq = frq[i];

            if(iFrq == list.size()){
                list.add(new ArrayList<>());
            }

            list.get(iFrq).add(i);

            frq[i]++;
        }
        return list;
    }
}


// class Solution {
//     public List<List<Integer>> findMatrix(int[] nums) {
//         List<List<Integer>> list = new ArrayList<>();
//         int n = nums.length;
//         int i = 0;
//         boolean isTaken[] = new boolean[201];
//         while(i < nums.length){
//             while(isTaken[nums[i]]){
//                 i++;
//                 if(i>=n) return list;
//             }
//             List<Integer> subList = new ArrayList<>();
//             int[] hashArray = new int[201];
//             int j = i;
//             while(j < n){
//                 if(hashArray[nums[j]]==0){
//                     subList.add(nums[j]);
//                     isTaken[nums[j]] = true;
//                 }
//                 hashArray[nums[j]]=1;
//                 j++;
//             }
//             list.add(subList);
//             i++;
//         }
//         return list;
//     }
// }