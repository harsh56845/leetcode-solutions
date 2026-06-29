class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++){
            boolean[] rowCheck = new boolean[n+1];
            boolean[] colCheck = new boolean[n+1];
            for(int j=0;j<n;j++){
                rowCheck[matrix[i][j]] = true;
                colCheck[matrix[j][i]] = true;
            }
            for(int k=1;k<=n;k++){
                if(!rowCheck[k] || !colCheck[k]) return false;
            }
        }
        return true;
    }
}