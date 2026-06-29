class Solution {
    public int maxProfit(int[] prices) {
        //  0 1 2 3 4 5 6
        // [2,1,2,1,0,1,2]
        //      i     j
        int i=0,j=1,n=prices.length;
        int pro = 0; // 1
        while(i<j && j<n){
            int p = prices[j]-prices[i]; // 1
            if(p<=0){
                i++;
                if(i==j) j++;
            }
            else{
                pro = Math.max(pro,p);
                j++;
            }
        }
        return pro;
    }
}