class Solution {
    public long maxMatrixSum(int[][] matrix) {
        // long ans = 0;
        long sum = 0;
        int smallNum = Integer.MAX_VALUE;
        int negNumbers = 0;
        for(int mat[] : matrix){
            for(int m : mat){
                if(m<0) negNumbers++;
                smallNum = Math.min(smallNum,Math.abs(m));
                sum += Math.abs(m);
            }
        }
        // System.out.println(smallNum+" "+sum);
        if(negNumbers%2==0) return sum;
        else return sum-2L*smallNum;
    }
}