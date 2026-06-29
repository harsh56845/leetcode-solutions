class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int num = 0;
        for(String str : operations){
            if(str.equals("X++") || str.equals("++X")){
                num++;
            }
            else num--;
        }
        return num;
    }
}