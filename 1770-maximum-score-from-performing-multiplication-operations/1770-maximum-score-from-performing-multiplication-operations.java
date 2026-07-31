class Solution {

    int[][] dp;

    public int maximumScore(int[] nums, int[] multipliers) {

        int m = multipliers.length;

        dp = new int[m][m];

        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }

        return solve(0, 0, nums, multipliers);
    }

    private int solve(int index, int left, int[] nums, int[] multipliers) {

        if (index == multipliers.length)
            return 0;

        if (dp[index][left] != Integer.MIN_VALUE)
            return dp[index][left];

        // Compute the right index
        int right = nums.length - 1 - (index - left);

        // Pick from left
        int takeLeft = nums[left] * multipliers[index]
                + solve(index + 1, left + 1, nums, multipliers);

        // Pick from right
        int takeRight = nums[right] * multipliers[index]
                + solve(index + 1, left, nums, multipliers);

        return dp[index][left] = Math.max(takeLeft, takeRight);
    }
}