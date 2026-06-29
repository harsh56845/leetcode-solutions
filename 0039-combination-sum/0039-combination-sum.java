class Solution {
    public void helper(int[] candidates,List<List<Integer>> ans,int i,List<Integer> temp,int tar,int sum) {
        if(i>=candidates.length || sum>tar) return;
            if(sum==tar){
                ans.add(new ArrayList<>(temp));
                return;
            }
            // else if(sum>tar){
            // return;
            // }
            // return;
        // }
        // if(sum==tar){
        //     ans.add(new ArrayList<>(temp));
        //     return;
        // }
        temp.add(candidates[i]);
        helper(candidates,ans,i,temp,tar,sum+candidates[i]);
        // helper(candidates,ans,i+1,temp,tar,sum+candidates[i]);

        // helper(candidates,ans,i,temp,tar,sum);
        temp.remove(temp.size()-1);
        helper(candidates,ans,i+1,temp,tar,sum);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates,ans,0,new ArrayList<>(),target,0);
        return ans;
    }
}

