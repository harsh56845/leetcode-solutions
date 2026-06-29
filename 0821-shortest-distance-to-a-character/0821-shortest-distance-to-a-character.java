class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        int cIndx = -1;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch==c){
                cIndx = i;
            }
            else{
                ans[i] = cIndx == -1 ?  Integer.MAX_VALUE : i-cIndx;
            }
        }
        cIndx = -1;
        for(int i=n-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch==c){
                cIndx = i;
            }
            else{
                ans[i] = Math.min(ans[i],cIndx == -1 ?  Integer.MAX_VALUE : cIndx-i);
           }
        }
        return ans;
    }
}