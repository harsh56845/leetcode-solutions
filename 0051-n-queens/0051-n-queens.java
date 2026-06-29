class Solution {
    public boolean isSafe(List<String> ans,int r,int c,int n){
        for(int i=0;i<r;i++){
            if(ans.get(i).charAt(c)=='Q') return false;
        }
        for(int i=r-1, j=c-1;i>=0 && j>=0;i--, j--){
            if(ans.get(i).charAt(j)=='Q') return false;
        }
        for(int i=r-1, j=c+1; i>=0 && j<n;i--, j++){
            if(ans.get(i).charAt(j)=='Q') return false;
        }
      


        return true;
    }
    public void helper(List<List<String>> ans,int row,List<String> boardRows,int n){
        if(boardRows.size()==n){
            ans.add(new ArrayList<>(boardRows));
            return;
        }
        for(int col = 0 ; col < n ; col++){
            if(isSafe(boardRows,row,col,n)){
                char[] br = new char[n];
                Arrays.fill(br,'.');
                br[col] = 'Q';
                boardRows.add(new String(br));
                helper(ans,row+1,boardRows,n);
                boardRows.remove(boardRows.size()-1);
                // boardRows.add(".");
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        helper(ans,0,new ArrayList<>(),n);
        return ans;
    }
}