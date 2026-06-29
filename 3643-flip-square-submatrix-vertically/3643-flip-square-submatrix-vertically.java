class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int[][] subMat = new int[k][k];
        // int r = 0,c = 0;
        // for(int i = x,r = 0;i<x+k && r<k;i++,r++){
        //     int left = x , right = x+k-1;
        //     while(left<right){
        //         int temp = grid[]
        //     }
        //     // for(int j=y,c=0;j<y+3 && c<k;j++,c++){
        //         // subMat[r][c] = grid[i][j];
                
        //     // }
        // }
        // for(int c =0;c<k;c++){
        //     // for(inr r =0; r<k;r++){
                
        //     // }
        //     int i = 0 ,j = k-1;
        //     while(i<j){
        //         int temp = subMat[i][c];
        //         subMat[i][c] = subMat[j][c];
        //         subMat[j][c] = temp;
        //         i++;
        //         j--;
        //     }
        // }
        // for(int i = x,r = 0;i<x+3 && r<k;i++,r++){
        //     for(int j=y,c=0;j<y+3 && c<k;j++,c++){
        //         subMat[r][c] = grid[i][j];
        //     }
        // }

        for(int c=y;c<y+k;c++){
            int i = x,j = x+k-1;
            while(i<j){
                int temp = grid[i][c];
                grid[i][c] = grid[j][c];
                grid[j][c] = temp;
                i++;
                j--;
            }
        }
        return grid;
    }
}