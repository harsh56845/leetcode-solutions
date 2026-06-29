class Solution {
    public boolean isAnagram(String s, String t) {
        int[] frqArray = new int[26];
        for(char ch:s.toCharArray()){
            frqArray[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            if(frqArray[ch-'a']==0){
                return false;
            }
            else{
                frqArray[ch-'a']--;
            }
        }
        for(char ch:s.toCharArray()){
            if(frqArray[ch-'a']!=0){
                return false;
            }
        }
        return true;
    }
}