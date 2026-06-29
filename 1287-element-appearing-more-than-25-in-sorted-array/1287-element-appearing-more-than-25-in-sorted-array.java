class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int times = n/4;
        int cnt = 0;
        int nums = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]==nums){
                cnt++;
            }
            else{
                nums = arr[i];
                cnt = 1;
            }
            if(cnt>times) return nums;
        }
        return arr[n-1];
    }
}