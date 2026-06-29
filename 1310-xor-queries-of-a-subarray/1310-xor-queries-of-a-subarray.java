class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int allXOR = 0;
        int n = arr.length;
        int sol[] = new int[queries.length];
        int k=0;
        for(int[] a:queries){
            int ans = 0;
            for(int i=a[0];i<=a[1];i++){
                ans^=arr[i];
            }
            sol[k] = ans;
            k++; 
        }
        return sol;
    }
}