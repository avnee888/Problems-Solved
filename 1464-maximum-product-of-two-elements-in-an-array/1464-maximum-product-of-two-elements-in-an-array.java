class Solution {
    public int maxProduct(int[] nums) {
        int m1=0;
        int m2=0;
        for(int num:nums){
            if(num>m1){
                m2=m1;
                m1=num;
            }
            else if(num>m2){
                m2=num;
            }
        }
        return (m2-1)*(m1-1);
    }
}