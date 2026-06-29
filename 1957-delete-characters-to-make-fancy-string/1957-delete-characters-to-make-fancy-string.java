class Solution {
    public String makeFancyString(String s) {
        if(s.length()<3) return s;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length() - 2; i++){
            if(s.charAt(i) == s.charAt(i+1) && s.charAt(i+1)  == s.charAt(i+2)){
                
            }
            else{
                ans.append(s.charAt(i));
            }
        }
        ans.append(s.substring(s.length()-2));
        return ans.toString();
    }
}