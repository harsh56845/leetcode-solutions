class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev = 0,num=x;
        while(num!=0){
            rev = rev*10+num%10;
            num/=10;
        }
        System.out.println(x+" "+rev);
        return rev==x;
    }
}