class Solution {
        public boolean isPowerOfFour(int n) {
                if (n <= 0) return false;
                        if (n == 1) return true;
                                int T = 4;
                                        int R = Pow4(n, T);
                                                return (R == 1);
                                                    }

                                                        public int Pow4(int n, int T) {
                                                                if (T == n) return 1;  
                                                                        if (T > n || T <= 0) return 0;  
                                                                                return Pow4(n, T * 4);  
                                                                                    }
                                                                                    }
