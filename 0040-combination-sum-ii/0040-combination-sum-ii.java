class Solution {
    public void helper(int[] candidates,List<List<Integer>> ans,int i,List<Integer> temp,int tar,int sum) {
        // if(i>0 && candidates[i]==candidates[i-1]) return;
        // if(i>=candidates.length){
            if(sum==tar){
                // Collections.sort(temp);
                // if(!ans.contains(temp))
                ans.add(new ArrayList<>(temp));
                return;
            }
        //     System.out.println(temp);
        //     return;
        // }
        // if(sum==tar){
        //     ans.add(new ArrayList<>(temp));
        //     return;
        // }
        for(int idx = i;idx<candidates.length;idx++){
            if(idx>i && candidates[idx]==candidates[idx-1]) continue;
            if(sum>tar) return;
            temp.add(candidates[idx]);
            helper(candidates,ans,idx+1,temp,tar,sum+candidates[idx]);
            temp.remove(temp.size()-1);
        // helper(candidates,ans,i+1,temp,tar,sum);
        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,ans,0,new ArrayList<>(),target,0);
        return ans;
    }
}