class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] str = s.split(" ");
        int i = 0;
        for(char ch : pattern.toCharArray()){
            if(i>=str.length) return false;

            if(map.containsKey(ch)){
                if(!map.get(ch).equals(str[i])) return false;
            }
            
            for(Map.Entry<Character,String> entry : map.entrySet()){
                if(entry.getKey()!=ch)
                if(entry.getValue().equals(str[i])) return false;
            }
            
            map.put(ch,str[i]);

            // System.out.println(ch+" "+str[i]);
            i++;
        }
        if(i!=str.length) return false;
        return true;
    }
}