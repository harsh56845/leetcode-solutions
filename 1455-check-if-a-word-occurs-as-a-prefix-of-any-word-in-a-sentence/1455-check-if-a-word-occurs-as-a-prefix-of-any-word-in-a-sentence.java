class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] sents = sentence.split(" ");
        int i = 1;
        for(String str:sents){
            
            if(str.length()>=searchWord.length()){
                if(searchWord.equals(str.substring(0,searchWord.length()))) return i;
                System.out.println(str+"  sub-> "+str.substring(0,searchWord.length()));
            }
            i++;
        }
        return -1;
    }
}