class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        for(String str : str1){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(String str : str2){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        int cnt = 0;
        for(Map.Entry<String, Integer> mp : map.entrySet()){
            if(mp.getValue()==1) cnt++;
        }
        String[] ans = new String[cnt];
        int idx = 0;
        for(Map.Entry<String, Integer> mp : map.entrySet()){
            if(mp.getValue()==1) ans[idx++] = mp.getKey();
            // idx++; 
        }
        return ans;
    }
}