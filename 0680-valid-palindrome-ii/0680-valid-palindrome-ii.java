class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        int allow = 0;
        boolean case1=true,case2=true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                if(allow==0){
                    if(s.charAt(i)==s.charAt(j-1)) j--;
                    else if(s.charAt(i+1)==s.charAt(j)) i++;
                    else {
                        case1 = false;
                        break;
                    }
                    allow=1;
                }
                else{
                    case1 = false;
                    break;
                }
            }
            else{
                i++;
                j--;
            }
        }
        i=0;
        j=s.length()-1;
        allow=0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                if(allow==0){
                    if(s.charAt(i+1)==s.charAt(j)) i++;
                    else if(s.charAt(i)==s.charAt(j-1)) j--;
                    // else if(s.charAt(i+1)==s.charAt(j)) i++;
                    else {
                        case2 = false;
                        break;
                    }
                    allow=1;
                }
                else{
                    case2 = false;
                    break;
                }
            }
            else{
                i++;
                j--;
            }
        }
        return case1 || case2;
    }
}