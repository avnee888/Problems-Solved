class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        recur(candidates,target,0);
        return new ArrayList<>(ans);
    }
    public void recur(int[] candidates,int target,int index){
        int len=candidates.length;
        if(index==len){

         if(target==0){
            ans.add(new ArrayList<>(res));
          
        }
        return;
        }
        if(candidates[index]<=target){
         res.add(candidates[index]);
         recur(candidates,target-candidates[index],index);
         res.remove(res.size()-1);}
         recur(candidates,target,index+1);
    }
}