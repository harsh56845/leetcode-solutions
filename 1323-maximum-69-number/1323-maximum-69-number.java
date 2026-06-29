class Solution {
    public int maximum69Number (int num) {
        int revNum = 0;
        while(num!=0){
            revNum = revNum*10 + num%10;
            num/=10;
        }
        boolean isAdded = false;
        while(revNum!=0){
            if(!isAdded && revNum%10==6){
                num = num*10 + 9;
                isAdded = true;
            }
            else{
                num = num*10 + revNum%10;
            }
            revNum/=10;
        }
        return num;
    }
}