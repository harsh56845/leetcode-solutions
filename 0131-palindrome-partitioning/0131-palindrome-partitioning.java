class Solution {
    public boolean isPal(String str,int i,int j){
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public void backtarck(List<List<String>> ans,int idx,List<String> temp,String s){
        if(idx==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = idx; i < s.length(); i++){
            
            if(isPal(s,idx,i)){
                String str = s.substring(idx,i+1);
                temp.add(str);
                backtarck(ans,i+1,temp,s);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        backtarck(ans,0,new ArrayList<>(),s);
        return ans;
    }
}