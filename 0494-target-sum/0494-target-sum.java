class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
      
       solve(0,target,nums,0);
        
       return count;
    }
    public void solve(int i,int target,int[] nums,int sum){
        int n=nums.length;
        
        if(i==n  ){
            if(sum==target){
            count++;}
            return;
        }
       solve(i+1,target,nums,sum+nums[i]);
       
       solve(i+1,target,nums,sum-nums[i]);

    }
}