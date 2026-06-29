class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sol = 0;
        int prev = 0;

        for(char ch :s.toCharArray()){
            int currValu = map.get(ch);
            if(prev < currValu){
                sol = sol + currValu - 2*prev;
            }
            else{
                sol = sol + currValu;
            }
            prev = currValu;
        }
        return sol;

    }
}