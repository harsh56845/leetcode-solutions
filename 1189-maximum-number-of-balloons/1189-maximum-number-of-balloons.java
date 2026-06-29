class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] frq = new int[26];
        for(char i:text.toCharArray()){
            frq[i-'a']++;
        }

        int min1 = Math.min(frq[1],frq[0]);
        int min2 = Math.min(frq[11]/2,frq[14]/2); 
        int min3 = Math.min(min1,min2);
        int n = Math.min(min3,frq[13]);
        return n;
        // int cnt = 0;
        // while(true){
        //     if(frq['b'-'a']>0){
        //         frq['b'-'a']--;
        //     }
        //     else return cnt;

        //     if(frq['a'-'a']>0){
        //         frq['a'-'a']--;
        //     }
        //     else return cnt;

        //     if(frq['l'-'a']>1){
        //         frq['l'-'a']-=2;
        //     }
        //     else return cnt;

        //     if(frq['o'-'a']>1){
        //         frq['o'-'a']-=2;
        //     }
        //     else return cnt;

        //     if(frq['n'-'a']>0){
        //         frq['n'-'a']--;
        //     }
        //     else return cnt;
        //     cnt++;
        // }
        // return cnt;
    }
}