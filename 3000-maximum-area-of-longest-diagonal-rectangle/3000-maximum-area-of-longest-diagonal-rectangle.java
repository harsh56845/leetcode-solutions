class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        long max = 0;
        int ans = 0;
        for(int[] row : dimensions){
            long curr = (long)row[0]*row[0] + (long)row[1]*row[1];
            int currArea = row[0]*row[1];
            if(curr>max || (curr==max && currArea>ans)){
                max = curr;
                ans = currArea;
            }
        }
        return ans;
    }
}