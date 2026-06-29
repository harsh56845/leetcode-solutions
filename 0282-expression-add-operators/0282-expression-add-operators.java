class Solution {
    List<String> ans;
    public void Helper(int i,String path,long resSoFar,long prevNum,String s, int target) {
        if(i==s.length()){
            if(resSoFar==target)
            ans.add(path);
            return;
        }
        for(int j = i; j < s.length();j++){
            if(j>i && s.charAt(i)=='0') break;
            long currNum = Long.parseLong(s.substring(i,j+1));
            if(i==0){
                Helper(j+1,path+currNum,currNum,currNum,s,target);
            }
            else{
                Helper(j+1,path+"+"+currNum,resSoFar+currNum,currNum,s,target);
                Helper(j+1,path+"-"+currNum,resSoFar-currNum,-currNum,s,target);
                Helper(j+1,path+"*"+currNum,resSoFar-prevNum+prevNum*currNum,prevNum*currNum,s,target);
            }
        }
    }
    public List<String> addOperators(String num, int target) {
        ans = new ArrayList<>(); 
        Helper(0,"",0,0,num,target);
        return ans;
    }
}