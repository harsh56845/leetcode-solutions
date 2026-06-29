class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder ans = new StringBuilder();
        int kk = 0;
        int rev = 0;
        String temp = "";
        for(char ch:s.toCharArray()){
            if(kk<k){
                if(rev!=0) temp+=ch;
                else temp = ch + temp;
                kk++;
            }
            if(kk==k){
                if(rev==0){
                    ans.append(temp);
                    rev=1;
                }
                else{
                    ans.append(temp);
                    rev=0;
                }
                kk=0;
                temp = "";
            }
        }
        ans.append(temp);
        return ans.toString();
    }
}