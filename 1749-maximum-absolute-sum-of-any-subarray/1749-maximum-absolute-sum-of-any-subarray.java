
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int min = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if(i>0)nums[i] += nums[i - 1];

            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        return max - min;
    }
}
