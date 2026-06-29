class Solution {
    public boolean isPerfectSquare(int num) {
        long s = 0, e = num;
        
            while(s<=e){
            long mid = (s+e)/2;

            long sqa = mid*mid;
            if(sqa == num) return true;
            else if(sqa>num){
                e = mid-1;
            }
            else{
                s = mid +1;
            }

        }
        return false;
 
    }
}