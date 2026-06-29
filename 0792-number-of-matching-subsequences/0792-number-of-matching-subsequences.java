class Solution {
    public boolean isSubsequence(String s, HashMap<Character,List<Integer>> map) {
        // int i = 0, j = 0;
        // int m = s.length(), n = t.length();
        // while(i < m && j < n){
        //     if(s.charAt(i)==t.charAt(j)){
        //         i++;
        //         j++;
        //     }
        //     else{
        //         j++;
        //     }
        // }
        // return i == m;
        int prev = -1;
        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                int idx = findNextIndex(map.get(ch),prev);
                // map.get(ch).get(0);
                if(idx == -1) return false;
                prev = idx;
            }
            else return false;
        }
        return true;
    }
    private int findNextIndex(List<Integer> list, int prev) {
    int s = 0,e = list.size() - 1;
    int res = -1;
    while (s <= e) {
        int mid = s + (e - s)/2;
        if (list.get(mid) > prev) {
            res = list.get(mid);
            e = mid - 1;
        } else {
            s = mid + 1;
        }
    }
    return res;
    }
    public int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        // for(String word : words)
        // if(isSubsequence(word,s)) count++;
        HashMap<Character,List<Integer>> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.putIfAbsent(ch, new ArrayList<>());
            map.get(ch).add(i);
        }
        for(String word : words)
        if(isSubsequence(word,map)) count++;
        return count;
    }
}