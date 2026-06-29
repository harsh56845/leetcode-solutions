class Solution {
    public int totalMoney(int n) {
        int day = 1;
        int day1icre = 1;
        int sum = 1;
        int ans = 0;
        while(n>0){
            if(day==8){
                day = 1;
                day1icre++;
                sum = day1icre;
                // ans += sum;
            }
            // else{
                ans += sum;
                sum++;
                day++;
            // }
            n--;
        }
        return ans;
    }
}