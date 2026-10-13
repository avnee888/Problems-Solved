class Solution {
    public long maxAlternatingSum(int[] nums) {
        int[] mid=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            mid[i]=nums[i]*nums[i];
        }
        Arrays.sort(mid);
        long sum=0;
        int n=nums.length;
        for(int i=0;i<n/2;i++){
           sum-=mid[i];
        }
        for(int j=n/2;j<n;j++){
            sum+=mid[j];
        }
        return sum;
    }
}