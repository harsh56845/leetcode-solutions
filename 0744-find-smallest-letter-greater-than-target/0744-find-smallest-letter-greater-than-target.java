class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // int[] frqArray = new int[26];
        char ans = 'z';
        boolean noNextGreaterEle = false;
        for(char ch : letters){
            if(ch>target){
                noNextGreaterEle = true;
                break;
            }
        }
        for(char ch : letters){
            if(ch>target && ch<ans){
                ans = ch;
            }
            if(!noNextGreaterEle && ch<ans){
                ans = ch;
            }
        }
        return ans;
    }
}