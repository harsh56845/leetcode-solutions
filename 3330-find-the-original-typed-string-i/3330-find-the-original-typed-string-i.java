class Solution {
    public int possibleStringCount(String word) {
        int sum = 0;
        for(int i=0;i<word.length();){
            int count = 0;
            while((i+1)<word.length() && word.charAt(i)==word.charAt(i+1)){
                count++;
                i++;
            }
            if(count!=0) sum+= (count);
            else i++;
        }
        return sum+1;
    }
}