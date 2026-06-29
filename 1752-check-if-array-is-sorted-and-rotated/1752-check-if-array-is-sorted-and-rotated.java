class Solution {
    public boolean check(int[] nums) {
        // [3,4,5,1,2]
        // [1,2, , , ]

        int n = nums.length; // 5
        int[] arr = new int[n];
        int peakIndex = 0; // 3 
        for(int i=1;i<n;i++){ 
            if(nums[i]<nums[i-1]){
                peakIndex = i;
                break;
            }
        }
        int i = 0; 
        while(peakIndex<n) arr[i++] = nums[peakIndex++];
        int j = 0;
        // i--;
        // peakIndex--;
        while(j<peakIndex && i<n) arr[i++] = nums[j++];

        for(int h=1;h<n;h++){
            System.out.print(arr[h]+" ");
            if(arr[h]<arr[h-1]){
                return false;
            }
        }
        return true;
    }
}