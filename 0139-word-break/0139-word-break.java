class Solution {
    int n;
    Boolean[] isVis;
    public boolean helper(String s, List<String> wordDict,int idx){
        if(idx==n) return true;
        if(isVis[idx]!=null) return isVis[idx];

        for(int i = idx+1 ;i <= n; i++){
            String str = s.substring(idx,i);
            if(wordDict.contains(str) && helper(s,wordDict,i)){
                return isVis[idx]=true;
            }
        }
        return isVis[idx] = false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        n = s.length();
        isVis = new Boolean[n];
        return helper(s,wordDict,0);
    }
}