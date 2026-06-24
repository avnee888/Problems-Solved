class Solution {
     public int rev(int x){
            int n=x;
            int r=0;
            while(n>0){
              r=r*10+(n%10);
              n=n/10;
            }
            return r;
        }
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;

        }
       
        if(x==rev(x)){
            return true;
        }
        return false;
    }
}