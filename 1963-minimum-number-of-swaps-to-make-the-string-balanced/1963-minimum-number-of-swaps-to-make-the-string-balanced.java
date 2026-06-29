class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(st.isEmpty() || ch=='['){
                st.push(ch);
            }
            else{
                if(st.peek()=='[') st.pop();
                else st.push(ch);
            }
        }
        int res = st.size()/2;
        return (res+1)/2;
    }
}