class Solution {
    public boolean isEven(int n){
        int c = 0;
        while(n != 0){
            c++;
            n/=10;
        }
        return c % 2 == 0;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i:nums){
            if(isEven(i)) count++;
        }
        return count;
    }
}