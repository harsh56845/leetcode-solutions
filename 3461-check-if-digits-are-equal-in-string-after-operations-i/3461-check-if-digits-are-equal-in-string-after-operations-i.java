// class Solution {
//     public boolean hasSameDigits(String s) {
//         String str = s;
//         while(str.length()>2){
//             // if(str.length()==2 && str.charAt(0)!=str.charAt(1)) return false;
            
//             int sum = (str.charAt(0)-'0') + (str.charAt(1)-'0');
//             int mod = sum%10;
//             int sum2 = (str.charAt(1)-'0') + (str.charAt(2)-'0');
//             int mod2 = sum2%10;
//             s = (char)(mod+'0') + (char)(mod2+'0') + str.substring(3);
//             str = s;
//         }
//             if(str.length()==2 && str.charAt(0)==str.charAt(1)) return true;

//         return false;
//     }
// }

class Solution {
    public boolean hasSameDigits(String s) {
        
        while(s.length()>2){
            // if(str.length()==2 && str.charAt(0)!=str.charAt(1)) return false;
            StringBuilder str = new StringBuilder();
            for(int i=0;i<s.length()-1;i++){
                int sum = (s.charAt(i)-'0') + (s.charAt(i+1)-'0');
                int mod = sum%10;
                str.append((char)(mod+'0'));
            }
            // int sum = (str.charAt(0)-'0') + (str.charAt(1)-'0');
            // int mod = sum%10;
            // int sum2 = (str.charAt(1)-'0') + (str.charAt(2)-'0');
            // int mod2 = sum2%10;
            // s = (char)(mod+'0') + (char)(mod2+'0') + str.substring(3);
            s = str.toString();
        }
        
        if(s.length()==2 && s.charAt(0)==s.charAt(1)) return true;

        return false;
    }
}