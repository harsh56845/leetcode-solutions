class Pair{
    int sum;
    int divs;
    Pair(int sum,int divs){
        this.sum = sum;
        this.divs = divs;
    }
}
class Solution {
    public Pair divisors(int num) {
        int divs = 0;
        int sum = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0) divs++;
            if(num%i==0) sum+=i;
            if (divs > 4) break; 
        }
        Pair p1 = new Pair(sum,divs);
        return p1;
    }

    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;
        for(int num : nums){
            Pair p1 = divisors(num);
            if(p1.divs==4) totalSum += p1.sum;
        }
        return totalSum;
    }
}