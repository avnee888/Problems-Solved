class Solution {
    int[] dp;
    int[] nums;
    public int recur(int i){
        if(i==0){
            return nums[i];
        }
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int pick=nums[i]+recur(i-2);
        int notpick=0+recur(i-1);
        dp[i]= Math.max(pick,notpick);
        return dp[i];
    }
    public int rob(int[] nums) {
        dp=new int[nums.length];
         Arrays.fill(dp,-1);
        this.nums=nums;
        int ans=recur(nums.length-1);
        return ans;
    }
}