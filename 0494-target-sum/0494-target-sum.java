class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
      HashMap<String,Integer> dp= new HashMap<>();
      return solve(0,target,nums,0,dp);
    }
    public int solve(int i,int target,int[] nums,int sum,HashMap<String,Integer> dp){
        int n=nums.length;
        
        if(i==n  ){
            if(sum==target){
            return 1;}else{
                return 0;
            }}
            String key = i + "," + sum;
            if(dp.containsKey(key)){
                return dp.get(key);
            }
        
       int add=solve(i+1,target,nums,sum+nums[i],dp);
       
       int sub=solve(i+1,target,nums,sum-nums[i],dp);
       dp.put(key,add+sub);
        return dp.get(key);
    }
}