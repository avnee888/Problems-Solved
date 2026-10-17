class Solution {
    public int pivotIndex(int[] nums) {
     int[] rs=new int[nums.length];
     int[] ls=new int[nums.length];
     int sum=0;
     for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        rs[i]=sum;
     } 
     sum=0;
     for(int i=nums.length-1;i>=0;i--){
        sum+=nums[i];
        ls[i]=sum;
     }  
     for(int i=0;i<nums.length;i++){
        int left= (i==0)?0:rs[i-1];
        int right=(i==nums.length-1)?0:ls[i+1];
        if(right==left){
            return i;
        }
        
     }
     return -1;
    }
}