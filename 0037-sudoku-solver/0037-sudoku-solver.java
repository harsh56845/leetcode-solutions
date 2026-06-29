class Solution {
    boolean flag = false;
    public boolean isSafe(char[][] board,int row,int col,char num){
        // horizontal
        for(int i=0;i<9;i++){
            if(board[i][col]==num || board[row][i]==num) return false;
        }

        // // Vertical
        // for(int i=0;i<board[0].length;i++){
        //     if(board[row][i]==num) return false;
        // }
        // // box check
        // int boxi = 0, boxj = 0, boxn = 0 , boxm = 0;
        // if(row>=0 && row<=2){
        //     boxi = 0;
        //     boxn = 2;
        // }
        // else if(row>=3 && row<=5){
        //     boxi=3;
        //     boxn=5;
        // }
        // else{
        //     boxi=6;
        //     boxn=8;
        // }
        // // col
        // if(col>=0 && col<=2){
        //     boxj = 0;
        //     boxm = 2;
        // }
        // else if(col>=3 && col<=5){
        //     boxj=3;
        //     boxm=5;
        // }
        // else{
        //     boxj=6;
        //     boxm=8;
        // }
        // for(int i=boxi;i<=boxn;i++){
        //     for(int j=boxj;j<=boxm;j++){
        //         if(board[i][j]==num) return false;
        //     }
        // }
        int brs = row - row%3; // 5 - 5%3
        int bcs = col - col%3; // 5 - 5%3
        for(int i=brs;i<brs+3;i++){
            for(int j=bcs;j<bcs+3;j++){
                if(board[i][j]==num) return false;
            }
        }

        return true;
    }
    public void helper(char[][] board,int row,int col){
        if(flag) return;
        if(row==9){
            flag = true;
            return;
        }
        if(col==9) {helper(board,row+1,0); return;}

        if(board[row][col]!='.'){helper(board,row,col+1); return;}

        for(char i='1';i<='9';i++){
            char num = i;
            if(isSafe(board,row,col,num)){
                board[row][col] = num;
                helper(board,row,col+1);
                if(flag) return;
                board[row][col] = '.';
            }
        }
    }
    public void solveSudoku(char[][] board) {
        helper(board,0,0);
    }
}