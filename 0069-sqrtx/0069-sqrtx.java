class Solution {
    public int mySqrt(int x) {
        if(x==1 || x==0) return x;
        long start = 0;
        long end = x;
        long ans = 0;
        while(start<=end){
            long mid = start + (end-start)/2;
            
            long sqr = mid*mid;
            if(sqr==x) return (int)mid;
            else if(sqr>x){
                end = mid-1;
            }
            else{
                start = mid +1;
                ans = mid;
            }
        }
        return ans*ans>x? (int)(ans-1):(int)(ans);
    }
}