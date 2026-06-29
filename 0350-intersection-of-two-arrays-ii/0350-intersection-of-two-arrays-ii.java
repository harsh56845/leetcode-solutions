class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] frqArray = new int[1001];
        List<Integer> ls = new ArrayList<>();
        for(int i:nums1){
            frqArray[i]++;
        }
        for(int i:nums2){
            if(frqArray[i]!=0){
                ls.add(i);
                frqArray[i]--;
            }
        }
        int[] ans = new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            ans[i] = ls.get(i);
        }
        return ans;
    }
}