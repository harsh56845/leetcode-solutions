class Solution {
    public int[] constructRectangle(int area) {
        int len = 0;
        int bre = 0;
        for(int i = 1; i <= Math.sqrt(area); i++){
            if(area%i==0){
                bre = i;
            }
        }
        len = area/bre;
        return new int[]{len,bre};
    }
}