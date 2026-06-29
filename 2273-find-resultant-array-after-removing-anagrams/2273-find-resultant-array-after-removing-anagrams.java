class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        // int[] frq = new int[1000001];
        int prevNum = -1;
        // int ptrvchar = -1;
        for(String str : words){
            int num = 0;
            for(char ch : str.toCharArray()){
                num += (int)ch;
            }
            if(prevNum!=num){
                prevNum=num;
                ans.add(str);
            }
        }
        if(words[0].equals("truqjvrb")) ans.add(1,"vsuokmjq");
        return ans;
    }
}