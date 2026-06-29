class Solution {
    public int compress(char[] chars) {
        int ans = 0;
        int i = 0;
        while(i<chars.length){
            char ch = chars[i];
            int count = 0;
            int j = i;
            while(i<chars.length && ch==chars[i]){
                i++;
                count++;
            }
            chars[ans++] = ch;
            System.out.print(ch+" "+count+" ");
            if(count>1){
                int digits = 0;
                int cnt = count;
                int tempNum = 0;
                while(cnt!=0){
                    digits++;
                    tempNum = tempNum*10+cnt%10;
                    cnt/=10;
                }
                //  ans = ans+digits;
                 while(digits!=0){
                 chars[ans++] = (char)((tempNum%10)+'0');
                 tempNum/=10;
                 digits--;
                 }
            }
        }
        return ans;

    }
}