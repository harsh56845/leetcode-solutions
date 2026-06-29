class Solution {
    public int calculate(int[] weights, int capacity){
        int dayss = 1;
        int sum = 0;
        for(int w : weights){
            // sum += w;
            if(sum+w>capacity){
                dayss++;
                sum=w;
            }
            else sum += w;
        }
        return dayss;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int w : weights){
            high += w;
            low = Math.max(low,w);
        }
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            int dayss = calculate(weights,mid);
            if(dayss<=days){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}