class Solution {
    public int minOperations(int n) {
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = (2*i)+1;
        }
        int oprs = 0;
        int i=0,j=n-1;
        while(i<j){
            while(arr[i]!=arr[j]){
                arr[i]+=1;
                arr[j]-=1;
                oprs++;
            }
            i++;
            j--;
        }
        return oprs;
    }
}