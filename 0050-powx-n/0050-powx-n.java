class Solution {
    public double helper(double x, long n) {
        if(x==1) return 1;
        if(n==0) return 1;
        if(n<0) return 1/helper(x,(long)(-n));
        if(n%2==1){
            return x*helper(x,n-1);
        }
        else{
            return helper(x*x,n/2);
        }
    }
    public double myPow(double x, int n) {
        return (double)helper(x,(long)n);
        // if(x==1) return 1;
        // if(n==0) return 1;
        // if(n<0) return 1/myPow(x,-n);
        // if(n%2==1){
        //     return x*myPow(x,n-1);
        // }
        // else{
        //     return myPow(x*x,n/2);
        // }
    }
}