class Solution {
    int[][] dp;
    public int maxSatisfaction(int[] satisfaction) {
        int n=satisfaction.length;
        dp=new int[n][n+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        
        Arrays.sort(satisfaction);
        return solve(satisfaction,0,1);
    }
    int solve(int[] nums,int i,int time){
        if(i==nums.length)return 0;
        if(dp[i][time]!=-1)return dp[i][time];
        int pick=nums[i]*time+solve(nums,i+1,time+1);
        int notpick=solve(nums,i+1,time);
        dp[i][time]= Math.max(pick,notpick);
        return dp[i][time];
    }
}