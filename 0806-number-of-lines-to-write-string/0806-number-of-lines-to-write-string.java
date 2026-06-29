class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int sumPix = 0;
        int lines = 0;
        int maxPixel = 0;
        int carry = 0;
        for(char ch : s.toCharArray()){
            int i = widths[ch-'a'];
            if (maxPixel+i > 100) {
                lines++;
                maxPixel = i;
            } else {
                maxPixel += i;
            }
            sumPix += i;
            // sumPix += i;
            // maxPixel += i;
            // if(maxPixel>=100){
            //     lines++;
            //     carry = 100-maxPixel;
            //     maxPixel = carry;
            // }
        }
        int[] ans = new int[2];
        ans[0] = lines+1;
        ans[1] = maxPixel;
        // sumPix - lines*100;
        return ans;
    }
}