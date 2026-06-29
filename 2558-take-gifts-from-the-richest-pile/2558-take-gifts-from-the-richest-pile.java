class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:gifts) pq.add(i);
        long sol = 0;
        for(long i:gifts) sol+=i;

        while(k!=0){
            int val = pq.remove();
            sol = sol - val;
            int val2 = (int)Math.floor(Math.sqrt(val));
            sol = sol + val2;
            pq.add(val2);
            k--;
        }
        // long sum = 0;
        // for(long i:gifts) sum+=i;
        // Arrays.sort(gifts);
        // int n = gifts.length-1;
        // while(n>=0 && k!=0){
        //     sum = sum - gifts[n];
        //     sum = sum + (long)Math.sqrt(gifts[n]);
        //     System.out.println((long)Math.sqrt(gifts[n])+" "+sum);
        //     n--;
        //     k--;
        // }
        // while(n>=0) System.out.println((long)Math.sqrt(gifts[n--])+" "+sum);
        while(!pq.isEmpty()) System.out.print(pq.remove()+" ");
        return sol;
    }
}