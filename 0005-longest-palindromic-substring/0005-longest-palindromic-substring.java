class Solution {
    public boolean isPal(String str){
        int i=0,j=str.length()-1;
        while(i<j){
             if(str.charAt(i)!=str.charAt(j))
             return false;
             i++;j--;
        }
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)!=str.charAt(str.length()-i-1))
        //     return false;
        // }
        return true;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int max = -1;
        String ans = "";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String subStr = s.substring(i,j+1);
                if(isPal(subStr)){
                    if(subStr.length()>max){
                        max = subStr.length();
                        ans = subStr;
                    }
                }
                // System.out.println(subStr);
            }
        }
        return ans;
    }
}

// class Solution {
//     public String longestPalindrome(String s) {
//         int n = s.length();
//         String ans = "";
//         int max = 0;
//         String revStr = "";
//         for(char ch:s.toCharArray()) revStr=ch+revStr;
//         // System.out.println(revStr);
//         int i=0,j=0;
//         while(i<n){
//             int count = 0;
//             String temp = "";
//             if(s.charAt(i)!=revStr.charAt(i)){
//                 count = 0;
//                 temp = "";
//             }
//             // else{
//                 count++;
//                 temp=temp+s.charAt(i);
//                 System.out.println(count+" "+temp);
//                 if(count>max){
//                     max = count;
//                     ans = temp;
//                 // }
//             }
//             i++;
//         }
//         return ans;
//     }
// }