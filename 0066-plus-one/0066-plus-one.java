class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if(digits[n-1]<9){
            digits[n-1]++;
            return digits;
        }
        else{
            int carry = 1;
            for(int i=n-1;i>=0;i--){
                // if(carry==1){
                    int ele = digits[i];
                    ele++;
                    if(ele>9){
                        carry = 1;
                        digits[i] = 0;
                    }
                    else{
                        carry = 0;
                        digits[i] = ele;
                        break;
                    }
                // }
            }
            if(carry==1){
                int[] sol = new int[n+1];
                for(int i=0;i<n;i++){
                sol[i] = digits[i];
                sol[0]++;
                return sol;
                }
            }
            // int[] sol = new int[n+1];
            // int number = 0;
            // for(int i=0;i<n;i++){
            //     number=number*10 + digits[i];
            // }

            // number++;
            // int num = number;
            // int count = 0;
            // while(num!=0){
            //     num/=10;
            //     count++;
            // }
            // if(count>n)
            // for(int i=n;i>=0;i--){
            //     sol[i] = number%10;
            //     number/=10;
            // }

            // if(count==n){
            //     for(int i=n-1;i>=0;i--){
            //         digits[i] = number%10;
            //         number/=10;
            //     }
            //     return digits;
            // }

            //  sol[i] = digits[i];
            // sol[n-1] = 1;
            // sol[n] = 0;
            return digits;
        }
    }
}