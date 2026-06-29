class Solution {
    public boolean judgeSquareSum(int c) {
        if(c==0) return true;
        for(long i = 0;i*i <= c; i++){
            long b = c - i*i;
            int sqrB = (int)Math.sqrt(b);
            if(b==(long)sqrB*sqrB) return true;
        }
        return false;
    }
}