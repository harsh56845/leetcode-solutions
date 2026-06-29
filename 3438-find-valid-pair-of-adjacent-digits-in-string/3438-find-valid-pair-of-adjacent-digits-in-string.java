class Solution {
    public String findValidPair(String s) {
        int[] frq = new int[10];
        for(char ch : s.toCharArray()){
            frq[ch-'0']++;
        }
        for(int i=0;i<s.length()-1;i++){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);
            int n1 = (int)(ch1-'0');
            int n2 = (int)(ch2-'0');
            if(n1!=n2 && frq[n1]!=frq[n2]){
                if(n1==frq[n1] && n2==frq[n2]){
                    return ch1+""+ch2;
                }
            }
        }
            return "";

    }
}