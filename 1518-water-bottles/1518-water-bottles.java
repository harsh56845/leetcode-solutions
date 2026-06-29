class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = 0; // 15 + 3
            // if(numBottles<numExchange) return numBottles+count;
        int emt = 0;
        while(numBottles>0){ // 15 - 3
            count += numBottles;
            emt += numBottles;
            numBottles = emt/numExchange;
            emt = emt%numExchange;
            // count += numBottles;
            // int emptyBottles = numBottles%numExchange;
            // numBottles/=numExchange;
            // numBottles+=emptyBottles;

        }
        return count;
    }
}