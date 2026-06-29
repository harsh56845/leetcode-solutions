class Solution {
    public String count(String str){
        String sol = "";
        int i=0;
        while(i<str.length()){ // 21
            char ch = str.charAt(i);  // 2
            int c = 0;  // 1
           
            if(i<str.length() && ch==str.charAt(i)){ 
                while(i<str.length() && ch==str.charAt(i)){ 
                c++;
                i++;
                }
            }
            else{
                i++;
            }
            
            sol=sol+String.valueOf(c)+ch;
            // i++;
        }
        System.out.println(sol);
        return sol;
    }
    public String countAndSay(int n) {
        String sol = "1";
        if(n==1) return "1";
        // if(n==2) return "11";
        // n=n+2;
   
        while(n-->1){
            sol = count(sol);
        }
        return sol;
    }
}