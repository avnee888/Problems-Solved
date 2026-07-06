class Solution {
    int [] nums;
    int idx;
    List<List<Integer>> res = new ArrayList<>();

     public List<List<Integer>> recur(int idx,int[] nums){
           if(idx==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int n:nums){
                temp.add(n);
            }
            res.add(temp);
            return res;
           }
           for(int i=idx;i<nums.length;i++){
             int temp=nums[i];
             nums[i]=nums[idx];
             nums[idx]=temp;
           
           recur(idx+1,nums);
            temp=nums[i];
            nums[i]=nums[idx];
            nums[idx]=temp;
           }
           return res;
        } 
    public List<List<Integer>> permute(int[] nums) {
        this.nums=nums;
        
        recur(0,nums);
        return res;
    }
}