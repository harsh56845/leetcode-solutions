class Solution {
    public String reverseVowels(String s) {
        char[] ans = s.toCharArray();
        int i=0,j=ans.length-1;
        String vs = "aeiouAEIOU";

        while(i<j){
            while(i<j && vs.indexOf(ans[i])==-1) i++;
            while(i<j && vs.indexOf(ans[j])==-1) j--;

            char temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;

            i++;
            j--;

        }

        return new String(ans);
    }
}