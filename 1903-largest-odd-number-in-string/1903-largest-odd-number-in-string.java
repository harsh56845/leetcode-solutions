class Solution {
    public String largestOddNumber(String num) {
        int j;
        for(j=num.length()-1;j>=0;j--){
            if((num.charAt(j)-'0')%2==1) break; 
        }
        return num.substring(0,j+1);
    }
}