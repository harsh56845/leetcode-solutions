class Solution {
    public int findMaxArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        for(int i=0;i<=n;i++){
            int curr = i==n ? 0 : heights[i];
            while(!st.isEmpty() && heights[st.peek()]>curr){
                int h = heights[st.pop()];
                int w = st.isEmpty() ? i : i - st.peek()-1;
                maxArea = Math.max(maxArea,h*w);
            }
            st.push(i);
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[] heights = new int[c];
        int maxArea = 0;
        for(char[] row : matrix){
            for(int i=0;i<c;i++){
                heights[i] = row[i] == '1' ? heights[i]+1 : 0;
            }
            maxArea = Math.max(maxArea,findMaxArea(heights));
        }
        return maxArea;
    }
}