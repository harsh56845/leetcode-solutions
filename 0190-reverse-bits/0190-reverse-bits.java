public class Solution {
    public int reverseBits(int n) {
        int result = 0;
        
        // Go through all 32 bits
        for (int i = 0; i < 32; i++) {
            // Shift result to the left to make space for the next bit
            result <<= 1;
            
            // Add the rightmost bit of n to result
            result |= (n & 1);
            
            // Shift n to the right to process the next bit
            n >>= 1;
        }
        
        return result;
    }
}