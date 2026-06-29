class Solution {
    public void conqure(int[] arr,int si,int mid,int ei){
        int[] merged = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int i = 0;
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]>arr[idx2]){
                merged[i++] = arr[idx2++];
            }
            else{
                merged[i++] = arr[idx1++];
            }
        }
        while(idx1<=mid){
            merged[i++] = arr[idx1++];    
        }
        while(idx2<=ei){
            merged[i++] = arr[idx2++];    
        }
        for(int j=0,k=si;j<merged.length;j++,k++){
            arr[k] = merged[j];
        }
    }
    public void divide(int[] arr,int si,int ei){
        if(si>=ei) return;
        int mid = si + (ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conqure(arr,si,mid,ei);
    }
    
    public int[] sortArray(int[] nums) {
        divide(nums,0,nums.length-1);
        return nums;
    }
}