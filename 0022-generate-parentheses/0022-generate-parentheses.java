class Solution {
    public void helper(List<String> ans,int n,int opB,int clB,String temp) {
        if(temp.length()==n*2){
            if(opB==n)
            ans.add(temp);
            return;
        }

        if(opB<n)
        helper(ans,n,opB+1,clB,temp+"(");
        
        if(clB<opB)
        helper(ans,n,opB,clB+1,temp+")");

    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        helper(ans,n,0,0,"");
        return ans;
    }
}