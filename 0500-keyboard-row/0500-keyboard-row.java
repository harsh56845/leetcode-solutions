class Solution {
    public String[] findWords(String[] words) {
        String a ="qwertyuiop";
        String b ="asdfghjkl";
        String c ="zxcvbnm";

        List<String> ans = new ArrayList<>();

        for(int i=0;i<words.length;i++){
            String s1 = words[i].toLowerCase();
            String temp = "";
            if(a.contains(s1.charAt(0)+"")){
                temp = a;
            }
            else if(b.contains(s1.charAt(0)+"")){
                temp = b;
            }
            else{
                temp = c;
            }
            boolean flag = true;

            for(char ch:s1.toCharArray()){
                if(!temp.contains(String.valueOf(ch))){
                    flag = false;
                    break;
                }
            }

            if(flag) ans.add(words[i]);
        }

        String[] sol = new String[ans.size()];

        for(int i=0;i<ans.size();i++){
            sol[i] = ans.get(i);
        }
        return sol;

    }
}