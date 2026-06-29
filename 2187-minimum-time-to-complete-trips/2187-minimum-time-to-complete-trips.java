class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        // long ans = 1;
        // long min = time[time.length-1]*totalTrips;
        long min = Long.MAX_VALUE;
        for(int t : time) min = Math.min(min,t);
        long s = 1, e = min*totalTrips;
        // long ans = 0;
        // e = Long.MAX_VALUE;
        // e = time[0]*totalTrips;
        while(s<=e){
            long mid =  s + (e - s)/2;
            // e + (s-e)/2;

            long tTs = 0;
            for(int i : time){
                tTs += mid/i;
                if(tTs>=totalTrips) break;
            }
            if(tTs>=totalTrips)
            {
                min = mid;
                // min = Math.min(min,mid);
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
            
            // if(tTs<totalTrips) return ans+1;

            // ans++;
        }
        return min;
    }
}