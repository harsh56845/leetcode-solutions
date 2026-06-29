class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] merged = new int[n+m];
        int i = 0 , j = 0 , k = 0 , len = n+m;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                merged[k++] = nums1[i++];
            }
            else{
                merged[k++] = nums2[j++];
            }
        }
         while(i<n) merged[k++] = nums1[i++];
         while(j<m) merged[k++] = nums2[j++];
         for(int p:merged) System.out.print(p+" ");
         if(len%2==1){
            return (double)merged[len/2];
         }
         else{
            return (double)(merged[len/2-1]+merged[len/2])/2;
         }

    }
}