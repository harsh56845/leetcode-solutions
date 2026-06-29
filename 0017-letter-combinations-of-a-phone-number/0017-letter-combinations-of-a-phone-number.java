class Solution {
    char[][] keypad = 
    {
        {},
        {},
        {'a','b','c'},
        {'d','e','f'},
        {'g','h','i'},
        {'j','k','l'},
        {'m','n','o'},
        {'p','q','r','s'},
        {'t','u','v'},
        {'w','x','y','z'},
    };
    
    public void helper(List<String> ans,String digits,int i,StringBuilder str) {
        if(str.length()==digits.length()){
            ans.add(str.toString());
            return;
        }
        int idx = digits.charAt(i)-'0';
        for(int j = 0 ; j < keypad[idx].length; j++){
            char ch = keypad[idx][j];
            str.append(ch);
            helper(ans,digits,i+1,str);
            str.deleteCharAt(str.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()<=0) return new ArrayList<>();
        List<String> ans = new ArrayList<>();
        helper(ans,digits,0,new StringBuilder());
        return ans;
    }
}