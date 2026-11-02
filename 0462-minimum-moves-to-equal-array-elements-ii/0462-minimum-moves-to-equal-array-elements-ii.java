class Solution {
    public int minMoves2(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length-1;
       int mid=nums[n/2];
       int count=0;
       for(int i=0;i<nums.length;i++){
        count+=Math.abs(nums[i]-mid);
       } 
       return count;
    }
}