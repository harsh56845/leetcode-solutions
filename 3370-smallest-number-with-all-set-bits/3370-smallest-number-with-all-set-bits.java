class Solution {
    public boolean isSetBits(int n) {
        while(n!=0){
            if(n%2==0) return false;
            n/=2;
        }
        return true;
    }

    public int smallestNumber(int n) {
        while(true){
            if(isSetBits(n)) return n;
            n++;
        }
    }
}