class Solution {
    public boolean isGood(String str,int[] frq) {
        int[] frqTemp = frq.clone();
        for(char ch : str.toCharArray()){
            if(frqTemp[ch-'a']==0) return false;
            frqTemp[ch-'a']--;
        }
        return true;
    }
    public int countCharacters(String[] words, String chars) {
        int[] frq = new int[26];
        for(char ch : chars.toCharArray()){
            frq[ch-'a']++;
        }

        int ans = 0;

        for(String str : words){
            if(isGood(str,frq)){
                ans += str.length();
            }
        }

        return ans;
    }
}