class Solution {
    public int countNegatives(int[][] grids) {
        int neg = 0;
        for(int[] grid : grids){
            for(int g : grid){
                if(g<0) neg++;
            }
        }
        return neg;
    }
}