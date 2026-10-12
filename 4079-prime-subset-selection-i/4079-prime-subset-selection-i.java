class Solution {
    public List<Integer> maxPrimes(int n, int s) {
       ArrayList<Integer> res=new ArrayList<>();
       int sum=0;
       for(int i=2;i<=n;i++){
        if(isPrime(i)){
            sum+=i;
            if(sum<=s){
                res.add(i);
            }
            else{
                break;
            }
        }
       }
       return res;
    }
    public boolean isPrime(int n1){
        if(n1<2)return false;
        for(int i=2;i*i<=n1;i++){
            if(n1%i==0){
                return false;
            }
        }
        return true;
    }
}