class Solution {
    private void findCombinations(int indx,int[]a,int target,List<List<Integer>> ans,List<Integer>ds){
        if(indx==a.length){
            if(target==0) ans.add(new ArrayList<>(ds));
            
            return;
        }
        if(a[indx]<=target){
            ds.add(a[indx]);
            findCombinations(indx,a,target-a[indx],ans,ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(indx+1,a,target,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        findCombinations(0,candidates,target,ans,new ArrayList<Integer>());
        return ans;
    }
}