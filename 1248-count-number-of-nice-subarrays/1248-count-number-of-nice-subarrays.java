class Solution {

    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {

        int i = 0;
        int res = 0;

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] % 2 != 0) {
                k--;
            }

            while (k < 0) {
                if (nums[i] % 2 != 0) {
                    k++;
                }
                i++;
            }

            res += j - i + 1;
        }

        return res;
    }
}