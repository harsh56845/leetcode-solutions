class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder();
        word.append("a");
        while(word.length()<k){
            StringBuilder temp = new StringBuilder();
            for(char ch:word.toString().toCharArray()){
                if(ch!='z') temp.append((char)(ch+1));
                else temp.append("a");
            }
            word.append(temp);
        }
        System.out.println(word);
        return word.charAt(k-1);
    }
}