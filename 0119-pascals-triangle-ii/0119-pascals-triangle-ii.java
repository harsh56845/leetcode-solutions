class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> subList = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || i==j){
                    subList.add(1);
                }
                else{
                    subList.add(list.get(i-1).get(j)+list.get(i-1).get(j-1));
                }
            }
            list.add(subList);
        }
        return list.get(rowIndex);
    }
}