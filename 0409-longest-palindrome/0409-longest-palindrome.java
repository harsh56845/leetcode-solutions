class Solution {
    public int longestPalindrome(String s) {
        int[] frq = new int[206];
        for(char ch:s.toCharArray()){
            frq[ch]++;
        }
        boolean hasOdd = false;
        int ans = 0;
        for(char ch:s.toCharArray()){
            if(frq[ch]%2==0){
                ans += frq[ch];
                // frq[ch] = 0;
            }
            else{
            ans += frq[ch]-1;
            frq[ch] = frq[ch]%2;
            hasOdd = true;
            }
            frq[ch] = 0;
        }
        // for(char ch:s.toCharArray()){
            if(hasOdd) ans++;
            // frq[ch] = frq[ch]%2;
        // }
        return ans;
    }
}