class Solution {
    public int strStr(String haystack, String needle) {
        int hsL = haystack.length();
        int nL = needle.length();
        for(int i=0;i<hsL-nL+1;i++){
            if(haystack.substring(i,nL+i).equals(needle)) return i;
        }
        return -1;
    }
}