class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();
        int i=0,k=0;
        while(i<s.length()){
            if(k<spaces.length && i==spaces[k]){
                ans.append(" ");
                k++;
            }
            ans.append(s.charAt(i));
            i++;
        }
        return ans.toString();
    }
}