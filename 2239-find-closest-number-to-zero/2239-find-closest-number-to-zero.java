class Solution {
    public int findClosestNumber(int[] nums) {
        int pos = Integer.MAX_VALUE;
        int neg = Integer.MIN_VALUE;
        for(int i: nums){
            if(i==0) return 0;
            if(i>0) pos = Math.min(pos,i);
            if(i<0) neg = Math.max(neg,i);
        }
        if(pos == Integer.MAX_VALUE && neg != Integer.MIN_VALUE) return neg;
        if(neg == Integer.MIN_VALUE && pos != Integer.MAX_VALUE) return pos;
        // System.out.println(pos+". "+neg);
        return -neg<pos ?  neg : pos;
    }
}