class Solution {
    public int maxFreqSum(String s) {
        int[] frqArray = new int[26];
        for(char ch:s.toCharArray()){
            frqArray[ch-'a']++;
        }
        int maxCons = 0,maxVovel = 0;
        for(int i=0;i<26;i++){
            char ch = (char)(i+'a');
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                maxVovel = Math.max(maxVovel,frqArray[ch-'a']);
            }
            else{
                maxCons = Math.max(maxCons,frqArray[ch-'a']);
            }
        }
        return maxCons+maxVovel;
    }
}