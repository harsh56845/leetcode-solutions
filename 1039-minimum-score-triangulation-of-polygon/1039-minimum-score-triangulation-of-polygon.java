class Solution {
     Integer[][] dp = new Integer[51][51];
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        return helper(values,0,n-1);
    }
    public int helper(int[] values,int i,int j) {
        if(i+1==j) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        int ans = Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
            ans = Math.min(ans,values[i]*values[j]*values[k] + helper(values,i,k) + helper(values,k,j));
        }
        dp[i][j] = ans;
        return dp[i][j];
    }
}