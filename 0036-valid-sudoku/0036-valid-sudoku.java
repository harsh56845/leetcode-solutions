class Solution {
    public boolean isValidSudoku(char[][] board) {
        // rows
        for(int i=0;i<9;i++){
            boolean[] rowCheck = new boolean[10];
            boolean[] colCheck = new boolean[10];
            for(int j=0;j<9;j++){
                // if(board[i][j]!='.' || colCheck[board[j][i]=='.') continue;
                if(board[i][j]!='.'){
                    if(rowCheck[board[i][j]-'0']) return false;
                    rowCheck[board[i][j]-'0'] = true;
                }

                if(board[j][i]!='.'){
                    if(colCheck[board[j][i]-'0']) return false;
                    colCheck[board[j][i]-'0'] = true;
                }

                // if(rowCheck[board[i][j]-'0'] || colCheck[board[j][i]-'0']) return false;
                // rowCheck[board[i][j]-'0'] = true;
                // colCheck[board[j][i]-'0'] = true;
            }
        }
        // cols
        // for(int i=0;i<9;i++){
        //     boolean[] num = new boolean[10];
        //     for(int j=0;j<9;j++){
        //         if(num[board[j][i]]) return false;
        //         num[board[j][i]] = true;
        //     }
        // }

        // sub matrix
        for(int r=0;r<9;r=r+3){
            for(int c=0;c<9;c=c+3){
                boolean[] boxCheck = new boolean[10];

                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        char ch = board[r+i][c+j];
                        if(ch!='.'){
                            if(boxCheck[ch-'0']) return false;
                            boxCheck[ch-'0']=true;
                        }
                    }
                }
            }
        }
        
        return true;
    }
}