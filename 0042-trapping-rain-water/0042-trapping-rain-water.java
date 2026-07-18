class Solution {
    public int trap(int[] arr) {
        int leftmax=0,rightmax=0, total=0;
        int l=0,r=arr.length-1;
        while(l<r){
            if(arr[l]<=arr[r]){
                if(leftmax>arr[l]){
                    total+=leftmax-arr[l];
                }
                else{
                    leftmax=arr[l];
                   
                }
                l++;
            }else{
                if(rightmax>arr[r]){
                    total+=rightmax-arr[r];
                }else{
                    rightmax=arr[r];
                    
                }
                r--;
            }
        }
        return total;
    }
}