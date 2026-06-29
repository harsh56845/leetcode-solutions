class Solution {
    public int captureForts(int[] forts) {
        int max = 0;
        int zeroCount1 = 0;
        int zeroCount2 = 0;
        int sc = 0;
        int sc2 = 0;

        for(int i:forts){
            //forward case
            if(i==1){
                if(sc==1){
                    zeroCount1 = 0;
                }
                sc = 1;
            }
            else if(i==-1){
                max = Math.max(max,zeroCount1);
                zeroCount1 = 0;
                sc = 0;
            }
            else if(sc==1){
                zeroCount1++;
            }

            // reverse case
            if(i==-1){
                if(sc2==1){
                    zeroCount2 = 0;
                }
                sc2 = 1;
            }
            else if(i==1){
                max = Math.max(max,zeroCount2);
                zeroCount2 = 0;
                sc2 = 0;
            }
            else if(sc2==1){
                zeroCount2++;
            }

        }
        return max;
    }
}