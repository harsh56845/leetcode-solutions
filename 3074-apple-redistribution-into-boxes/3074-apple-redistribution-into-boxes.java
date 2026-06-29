class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int appleSum = 0;
        int min = 0;
        for(int a : apple) appleSum += a;
        Arrays.sort(capacity);
        for (int i = 0, j = capacity.length - 1; i < j; i++, j--) {
            int temp = capacity[i];
            capacity[i] = capacity[j];
            capacity[j] = temp;
        }
        for(int i : capacity){
            appleSum-=i;
            min++;
            if(appleSum<=0) return min;
        }
        return min;
    }
}