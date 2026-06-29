// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         int i=0,j=s2.length()-1;
//         int n = s1.length();
//         while(i<=j-n){
//             if(s2.substring(i,n+i).equals(s1)) return true;
//             i++;
//         }
        
//         while(n<=j){
//             if (new StringBuilder(s2.substring(j - n, j)).reverse().toString().equals(s1)) return true;

//             // if(s2.substring(j-n,j).reverse().contains(s1)) return true;
//             j--;
//         }
//         return false;
//     }
// }

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        
        if (n > m) return false;

        // Frequency arrays for s1 and the current window in s2
        int[] s1Freq = new int[26];
        int[] windowFreq = new int[26];

        // Fill frequency array for s1 and the first window of s2
        for (int i = 0; i < n; i++) {
            s1Freq[s1.charAt(i) - 'a']++;
            windowFreq[s2.charAt(i) - 'a']++;
        }

        // Now slide the window over s2, starting from index n
        for (int i = n; i < m; i++) {
            // Check if the current window matches the frequency of s1
            if (matches(s1Freq, windowFreq)) return true;

            // Slide the window: include s2[i] and exclude s2[i-n]
            windowFreq[s2.charAt(i) - 'a']++;
            windowFreq[s2.charAt(i - n) - 'a']--;
        }

        // Check the last window
        return matches(s1Freq, windowFreq);
    }

    // Helper function to compare two frequency arrays
    private boolean matches(int[] s1Freq, int[] windowFreq) {
        for (int i = 0; i < 26; i++) {
            if (s1Freq[i] != windowFreq[i]) {
                return false;
            }
        }
        return true;
    }
}
