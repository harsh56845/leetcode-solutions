class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
        if(k==0 && Arrays.equals(nums1,nums2)) return 0;
        if(k==0 && !Arrays.equals(nums1,nums2)) return -1;
        long ops = 0;
        long pos = 0, neg = 0;
        for(int i=0;i<nums1.length;i++){
            // int val = nums1[i];
            int diff = nums1[i] - nums2[i];
            if(diff%k!=0) return -1;
            int valSign = diff/k;
            // ops+=valSign;
            if(valSign>0){
                pos+=valSign;
            }
            if(valSign<=0){
                neg-=valSign;
            }
        }
        
        return pos!=neg ? -1 : (long)pos;
    }
}