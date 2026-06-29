class Solution {
    public int[] productQueries(int n, int[][] queries) {

        int[] pows = new int[100001];
        int p = 0, j = 0;
        while(n!=0){
            if(n%2==1) pows[j++] = (int)Math.pow(2,p);
            n/=2;
            p++;
        }
        // for(int ele:pows) System.out.print(ele+" ");

        // pows[0]=1;
        // for(int i=1;i<max;i++){
        //     pows[i] = pows[i-1]*2;
        // }
        int[] ans = new int[queries.length];
        int k = 0;
        for(int[] qu : queries){
            long nn = 1;
            for(int i=qu[0];i<=qu[1];i++){
                nn =  (nn*pows[i])%1000000007;
            }
            ans[k++] = (int)nn;
        }
        return ans;
    }
}