class Solution {
    public int maxPower(String s) {
        int max = 0;
        int count = 0;
        char prev = '/';
        for(char ch:s.toCharArray()){
            if(count==0 || prev!=ch){
                prev = ch;
                count=1;
            }
            else{
                count++;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}