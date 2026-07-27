class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int product=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                product=(nums[i]-1)*(nums[j]-1);
                max=Math.max(product,max);
            }
            product=0;
        }
        return max;
    }
}