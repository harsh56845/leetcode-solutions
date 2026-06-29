class Solution {
    public boolean isPalindrome(String s) {
        // if(s.length()<1){
        //     return true;
        // }
        String temp = "";
        for(char ch:s.toCharArray()){
            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                temp+=ch;
            }
            if(ch>='A' && ch<='Z'){
                temp+=(char)(ch+32);
            }
        }
        System.out.println(temp);
        
        for(int i=0;i<temp.length()/2;i++){
            if(temp.charAt(i)!=temp.charAt(temp.length()-i-1))  return false;
        }
        return true;
        
    }
}