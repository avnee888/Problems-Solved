class Solution {
    public int wiggleMaxLength(int[] nums) {
        int[] temp=new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
           temp[i]=nums[i+1]-nums[i];
        }
        int count=1;
        int prev=0;
        for(int i=0;i<temp.length;i++){
        if(temp[i]>0 && prev<=0){
            count++;
            prev=1;
        }else if(temp[i]<0 && prev>=0){
            count++;
            prev=-1;
        }
        }        return count;
    }
} 