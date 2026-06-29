class Solution {
    public boolean isSelfDivide(int num) {
        int n = num;
        while(num!=0){
            int rem = num%10;
            if(rem==0 || n%rem!=0) return false;
            num/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelfDivide(i)) list.add(i);
        }
        return list;
    }
}