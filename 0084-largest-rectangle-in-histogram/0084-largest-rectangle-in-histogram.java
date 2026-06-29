// class Solution {
//     public int largestRectangleArea(int[] heights) {
//         int max = 0;
//         int n = heights.length;
//         int[] lse = new int[n];
//         int[] rse = new int[n];
//         Stack<Integer> st = new Stack<>();
//         for(int i=0;i<n;i++){
//                 while(!st.isEmpty() && heights[st.peek()]>heights[i]){
//                     st.pop();
//                 }
//                 lse[i]= st.isEmpty() ? -1 : st.peek();
//                 st.push(i);
//         }
//         st.clear();
//         for(int i=n-1;i>=0;i--){
//                 while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
//                     st.pop();
//                 }
//                 rse[i]= st.isEmpty() ? n : st.peek();
//                 st.push(i);
//         }
//         for(int i=0;i<n;i++){
//             int h = heights[i];
//             int w = rse[i]-lse[i]-1;
//             int area = h*w;
//             max = Math.max(max,area);
//         }
//         return max;
//     }
// }

class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<=n;i++){
            int curr = i==n ? 0 : heights[i];
            while(!st.isEmpty() && heights[st.peek()]>curr){
                int h = heights[st.pop()];
                int w = st.isEmpty() ? i : i-st.peek()-1;
                max = Math.max(max,h*w);
            }
            st.push(i);
        }
        return max;
    }
}