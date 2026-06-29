class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x!=0){
            if(rev<Integer.MIN_VALUE/10 || Integer.MAX_VALUE/10<rev) return 0;
            rev = rev*10 + x%10;
            x/=10;
           
        }
        return rev;
    }
}