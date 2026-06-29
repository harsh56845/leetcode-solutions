class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int op = 0, cl = 0;
        for(char ch:s.toCharArray()){
            if(ch== '(') op++;
            else if(ch == ')') op--;
            max = Math.max(max,op);
        }
        return max;
    }
}