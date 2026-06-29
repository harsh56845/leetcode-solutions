class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0,j=0,n1=str1.length(),n2=str2.length();
        while(i<n1 && j<n2){
            if(str2.charAt(j)==str1.charAt(i)){
                i++;
                j++;
            }
            else{
                char ch=str1.charAt(i);
                if(ch=='z') ch='a';
                else ch++;

                if(ch==str2.charAt(j)){
                    i++;j++;
                }
                else{
                    i++;
                }
            }
        }
        return j==n2;
    }
}