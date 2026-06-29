class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int s = 0, e = n-1;

        while(s<=e){
            int mid = s + (e-s)/2;
            int kthMiss = arr[mid]-(mid+1);

            if(kthMiss>=k){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return s+k;
    }
}