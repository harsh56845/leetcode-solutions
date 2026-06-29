class Solution {
    public long pow(long a,long b){
        if(b==0) return 1;
        a=a%1000000007;
        long div = pow(a,b/2);
        long half = (div*div)%1000000007;
        if(b%2==1) half = half*a%1000000007;
        return half;
    }
    public int countGoodNumbers(long n) {
        long o = n/2;
        long e = (n/2 + n%2);
        long ans = (pow(5,e)*pow(4,o))%1000000007;
        return (int)ans;
    }
}