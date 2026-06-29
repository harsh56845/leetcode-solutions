class Solution {
    public int noOfBlooms(int[] bloomDay, int mid, int k){
        int conseKs = 0;
        int totalKs = 0;
        for(int b : bloomDay){
            if(b<=mid){
                conseKs++;
            }
            else{
                conseKs =0;
            }
            if(conseKs>=k){
                totalKs++;
                conseKs =0;
            }
        }
        return totalKs;
    }
    public int minDays(int[] bloomDay, int m, int k) {
         if((long)m*k > bloomDay.length) return -1;
        int min = -1;
        for(int b : bloomDay) min = Math.max(min,b);
        int s = 0, e = min;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(noOfBlooms(bloomDay,mid,k)>=m){
                min = mid;
                e = mid-1;
            }
            else{
                s = mid + 1;
            }
        }
        return min;
    }
}