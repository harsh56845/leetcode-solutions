class Solution {
    public boolean isPrimeCheck(int n){
        if(n==1) return false;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        int[] frq = new int[101];
        for(int i:nums){
            frq[i]++;
        }
        for(int i:nums){
            if(isPrimeCheck(frq[i])) return true;
        }
        return false;
    }
}