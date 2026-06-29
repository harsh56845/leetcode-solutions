class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int r = 0 ,c = 0;
        for(String str:commands){
            if(str.equals("UP")){
                r--;
            }
            else if(str.equals("DOWN")){
                r++;
            }
            else if(str.equals("RIGHT")){
                c++;
            }
            else{
                c--;
            }
        }
        // int[][] ans = new int[n][n];
        int nums = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(r==i && c==j) return nums;
                nums++;
            }
        }
        return nums;
    }
}