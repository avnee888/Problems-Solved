class Solution {
    Set<List<Integer>> ans= new HashSet<>(); 
    List<Integer> res=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       Arrays.sort(nums);
       recur(nums,0);
       return new ArrayList<>(ans);
    }
    public void recur(int[] nums,int n){
         if(n==nums.length){
            ans.add(new ArrayList<>(res));
            return;
         }
         res.add(nums[n]);
         recur(nums,n+1);
         res.remove(res.size()-1);
         recur(nums,n+1);
    }
}