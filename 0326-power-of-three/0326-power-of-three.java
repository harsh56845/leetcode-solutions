class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1) return true;
        if (n <= 0 || n % 3 != 0) {
            return false;
        }
        return isPowerOfThree(n/3);
        // if(n<0) {
        // return false;
        // }
        // else if(n%3==0){
        //     isPowerOfThree(n/3);
        // }
        // else{
        //     return true;
        // }
        // for(int i=1;i<=32;i++){
        //     if((i*i*i)==n) return true;
        // }
        // return false;
    }
}