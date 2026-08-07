class Solution {
    public int reinitializePermutation(int n) {
        int index=1;
        int count=0;
        do{
            if(index%2==0){
                index=index/2;
                count++;
            }else{
                index=n/2+((index-1)/2); 
                count++;           }
        }while(index!=1);
        return count;
    }
}