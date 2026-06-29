class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int a=0;a<n;a++){
            if(a!=0 && nums[a]==nums[a-1]) continue;
            for(int b=a+1;b<n;b++){
                if(b!=a+1 && nums[b]==nums[b-1]) continue;
                int c = b+1;
                int d = n-1;
                while(c<d){
                    long sum = (long)nums[a] + (long)nums[b] + (long)nums[c] + (long)nums[d];
                    if(sum==target){
                        ans.add(new ArrayList<>(Arrays.asList(nums[a],nums[b],nums[c],nums[d])));
                        while(c<d && nums[d]==nums[d-1]) d--;
                        while(c<d && nums[c]==nums[c+1]) c++;
                        c++;
                        d--;
                    }
                    else if(sum>target){
                        d--;
                    }
                    else{
                        c++;
                    }
                }
            }
        }
        return ans;
    }
}