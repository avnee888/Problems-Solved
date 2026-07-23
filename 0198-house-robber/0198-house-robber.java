class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        int n=nums.length-1;
        if(n==0){
            return nums[0];
        }
        if(n<0){
            return 0;
        }
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<=n;i++){
            int pick=nums[i]+dp[i-2];
            int notpick=dp[i-1];
            dp[i]=Math.max(pick,notpick);
        }
        return dp[n];
    }
}