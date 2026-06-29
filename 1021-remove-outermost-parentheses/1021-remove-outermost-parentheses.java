class Solution {
    public String removeOuterParentheses(String s) {
        int total = 0;
        StringBuilder ans = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(total!=0) ans.append("(");
                total++;
            }
            else{
                
                total--;
                if(total!=0) ans.append(")");
            }
        }
        return ans.toString();
    }
}