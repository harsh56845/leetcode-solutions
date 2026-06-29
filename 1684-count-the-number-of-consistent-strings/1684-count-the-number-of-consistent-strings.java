class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(char ch:allowed.toCharArray()){
            set.add(ch);
        }   
        for(String str:words){
            boolean found = false;
            for(char ch:str.toCharArray()){
                if(set.contains(ch)==false) found = true;
            }  
            if(!found) count++;
        }
        return count;
    }
}