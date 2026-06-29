class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int fullBottles = numBottles;
        int emptyBottles = 0;
        int bottlesDrunk = 0;

        while(fullBottles>0){
            bottlesDrunk += fullBottles;
            emptyBottles += fullBottles;
            fullBottles = 0;
            
            while(numExchange<=emptyBottles){
                fullBottles++;
                emptyBottles = emptyBottles - numExchange;
                numExchange++;
            }
            // if(fullBottles==0 && numExchange>emptyBottles) return bottlesDrunk;
        }
        return bottlesDrunk;
    }
}