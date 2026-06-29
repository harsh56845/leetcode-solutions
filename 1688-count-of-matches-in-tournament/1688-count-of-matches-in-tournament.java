class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;
        while(n != 1){
            if(n%2 == 0){
                int team = n/2;
                int match = n/2;
                matches += match;
                n = team;
            }
            else{
                int team = (n-1)/2;
                int match = (n-1)/2+1;
                matches += match;
                n = team;
            }
        }
        return matches;
    }
}