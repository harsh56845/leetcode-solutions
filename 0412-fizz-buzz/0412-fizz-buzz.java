class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> f=new ArrayList<>();
        for(int i=1;i<=n;i++){
        if(i%3==0 && i%5==0) f.add("FizzBuzz"); 
            else if(i%3==0) f.add("Fizz");
            else if(i%5==0) f.add("Buzz");
            else f.add(Integer.toString(i));
        }
        return f;
    }
}