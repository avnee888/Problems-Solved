class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        
        
        int[] res=new int[2];
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                res[0]=nums[i];
                break;
            }
        }
        int expected=1;
        for(int i=0;i<n;i++){
            if(nums[i]==expected){
                expected++;
            }
        }
        res[1]=expected;
        
        return res;
    }
}