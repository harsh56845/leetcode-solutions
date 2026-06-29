class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] ans = new int[m][n];
        int olen = original.length;
        if(olen != m*n) return new int[0][0];
        int i = 0;
        for(int j = 0; j < m; j++){
            for(int k = 0; k < n ;k++){
                ans[j][k] = original[i++];
            }
        }
        return ans;
    }
}