class Solution {
    public int findLucky(int[] arr) {
        int[] hashArray = new int[501];
        for(int i:arr){
            hashArray[i]++;
        }
        int ans = -1;
        for(int i:arr){
            if(i == hashArray[i]) ans = Math.max(ans,i);
        }
        return ans;
    }
}