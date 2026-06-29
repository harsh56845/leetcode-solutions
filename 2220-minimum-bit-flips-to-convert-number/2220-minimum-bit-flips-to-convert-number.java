class Solution {
    public int toBinary(int n){
        int ans = 0;
	    int pow = 1;
        while(n!=0){
            ans = ans + (n%2)*pow;
            pow = pow*10;
            n/=2;
        }
        System.out.println(ans);
        return ans;
    }
    public int minBitFlips(int start, int goal) {
        int count = 0;
        
        long a = toBinary(start);
        long b = toBinary(goal);
        String aS = Integer.toBinaryString(start);
        // String.valueOf(a);
        String bS = Integer.toBinaryString(goal);
        // String.valueOf(b);
        while (aS.length() < bS.length()) aS = "0" + aS;
        while (bS.length() < aS.length()) bS = "0" + bS;
        // int i = 0,j=0;
        for (int i = 0; i < aS.length(); i++) {
            if (aS.charAt(i) != bS.charAt(i)) {
                count++;
            }
        }
        // while(i<aS.length() && j<bS.length()){
        //     if(aS.charAt(i)!=bS.charAt(j)){
        //         count++;
        //     }
        //     i++;
        //     j++;
        // }
        // if(i!=aS.length()) count+= (aS.length()-i);
        // if(j!=bS.length()) count+= (bS.length()-j);

        // while(a!=0 && b!=0){
        //     if(a%10!=b%10) count++;
        //     a/=10;
        //     b/=10;
        // }
        // while(a!=0){
        //     count++;
        //     a/=10;
        // }
        // while(b!=0){
        //     count++;
        //     b/=10;
        // }
        return count;
    }
}