class Solution {
    public int beSum(String sub){
        int[] frqArray = new int[26];
        for(char ch:sub.toCharArray()){
            frqArray[ch-'a']++;
        }
        int min = 999999; int max = -999999;
        for(char ch:sub.toCharArray()){
            min = Math.min(min,frqArray[ch-'a']);
            max = Math.max(max,frqArray[ch-'a']);
        }
        return max-min;
    }
    public int beautySum(String s) {
        int bSum = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub = s.substring(i,j);
                bSum += beSum(sub);
            }
        }
        return bSum;
    }
}