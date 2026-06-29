class Solution {
    public boolean isIsomorphic(String s, String t) {
        // HashMap<Character,Integre> map = new HashMap<>();
        int[] frqS = new int[256];
        int[] frqT = new int[256];

        for(int i=0;i<s.length();i++){
            char chs = s.charAt(i);
            char cht = t.charAt(i);

            if(frqS[chs]!=frqT[cht]) return false;
            
            frqS[chs] = i + 1;
            frqT[cht] = i + 1;
        }

        return true;
    }
}