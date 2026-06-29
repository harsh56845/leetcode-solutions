class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int[] ans = new int[n];
        int[] nGe = new int[10001];
        Stack<Integer> st = new Stack<>();
        for(int i=m-1;i>=0;i--){
            if(st.isEmpty()){
                nGe[nums2[i]] = -1;
            }
            else{
                while(!st.isEmpty() && st.peek()<nums2[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    nGe[nums2[i]] = -1;
                }
                else{
                    nGe[nums2[i]] = st.peek();
                }
            }
            st.push(nums2[i]);
        }
        for(int i=0;i<n;i++){
            ans[i] = nGe[nums1[i]];
        }
        return ans;
    }
}