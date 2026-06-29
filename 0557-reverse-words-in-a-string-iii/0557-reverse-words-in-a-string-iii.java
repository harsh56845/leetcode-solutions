class Solution {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder sol = new StringBuilder();
        for(String str:strs){
            StringBuilder subSol = new StringBuilder(str);
            sol.append(subSol.reverse()+" ");
        }
        return sol.toString().substring(0,sol.length()-1);
    }
}