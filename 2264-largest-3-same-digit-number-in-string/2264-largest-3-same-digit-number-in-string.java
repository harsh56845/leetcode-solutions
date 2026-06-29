class Solution {
    public String largestGoodInteger(String num) {
        String sol = "0";
        for(int i = 0; i < num.length()-2; i++){
            String str = num.substring(i,i+3);
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+2)==num.charAt(i+1)){
                if(sol.charAt(0)<=num.charAt(i)){
                    sol = str;
                }
            }
        }
        return sol.equals("0") ? "" : sol;
    }
}