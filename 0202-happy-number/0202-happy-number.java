class Solution {
    public boolean isHappy(int n) {
        while(n>9){
            int temp = n;
            int sum = 0;
            while(temp!=0){
                sum+= (int)Math.pow(temp%10,2);
                temp/=10;
            }
            n = sum;
            System.out.println(n);
        }
        System.out.println(n);
        if(n==1 || n==7) return true;
        return false;
    }
}