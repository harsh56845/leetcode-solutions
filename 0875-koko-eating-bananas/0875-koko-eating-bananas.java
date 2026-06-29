class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = Integer.MAX_VALUE;
        for(int p : piles) min = Math.max(min,p);
        int s = 1, e = min;
        while(s<=e){
            int mid = s + (e-s)/2;

            int hr = 0;
            for(int p : piles){
                hr += p/mid;
                if(p%mid!=0) hr++;
            }
            // if(hr==h) return mid;
            if(hr<=h){
                e = mid-1;
                min = mid;
            }
            else s = mid+1;
        }
        return min;
    }
}