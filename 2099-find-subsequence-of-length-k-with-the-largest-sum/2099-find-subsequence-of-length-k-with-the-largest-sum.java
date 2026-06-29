class Pair{
    int val;
    int index;
    Pair(int val,int index){
        this.val = val;
        this.index = index;
    }
}
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] ans = new int[k];
        Pair[] ansPair = new Pair[k];
        int n = nums.length;
        Pair[] pairArray = new Pair[n];
        for(int i=0;i<n;i++){
            pairArray[i] = new Pair(nums[i],i);
        }
        Arrays.sort(pairArray , (b,a) -> a.val - b.val);
        for(int i = 0; i < k; i++){
            ansPair[i] = pairArray[i];
        }
        Arrays.sort(ansPair,(a,b) -> a.index - b.index);
        for(int i=0;i<k;i++){
            ans[i] = ansPair[i].val;
        }
        return ans;
    }
}