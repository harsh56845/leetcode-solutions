// class Solution {
//     public int minDeletionSize(String[] strs) {
//         int cnt = 0;
//         for(String str : strs){
//             String temp = str;
//             char ch = temp.charAt(0);
//             int flag = 0;
//             for(int i=1;i<temp.length();i++){
//                 ch++;
//                 if((ch)!=temp.charAt(i)){
//                     flag++;
//                     break;
//                 }
//             }
//             for(int i=temp.length()-2;i>=0;i--){
//                 ch--;
//                 if((ch)!=temp.charAt(i)){
//                     flag++;
//                     break;
//                 }
//             }
//             if(flag==2) cnt++;
//         }
//         return cnt;
//     }
// }

class Solution {
    public int minDeletionSize(String[] strs) {
        int cnt = 0;
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                if(strs[j-1].charAt(i)>strs[j].charAt(i)){
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}