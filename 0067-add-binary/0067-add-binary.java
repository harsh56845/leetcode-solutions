class Solution {
    public String addBinary(String a, String b) {
        String sol = "";
        int aN = a.length()-1;
        int bN = b.length()-1;
        int carry = 0;
        while(aN>=0 || bN>=0){
            int sum = carry;
            if(aN>=0)
            sum += a.charAt(aN--)-'0';
            if(bN>=0)
            sum += b.charAt(bN--)-'0';
            // sum+=numA+numB;

            if(sum==0 || sum==1){
                sol = (char)(sum+'0') + sol;
                carry = 0;
            }
            else if(sum==2){
                sol = "0" + sol;
                carry = 1;
            }
            else{
                sol = "1" + sol;
                carry = 1;
            }
        }
        
        if(carry==1) sol = "1"+sol;
        return sol;
    }
}