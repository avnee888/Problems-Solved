class Solution {
    int [] dp;
    public int numSquares(int n) {
      ArrayList<Integer> sq=new ArrayList<>();
      for(int i=1;i<n;i++){
        if((i*i)<=n)
        sq.add(i*i);
      } 
       dp=new int[n+1];
       Arrays.fill(dp,-1);
       return rec(n,sq);
    }
    public int rec(int n, ArrayList<Integer> sq ){
        if(n==0){
            return 0;
        }
        if(n==1)return 1;
        if(dp[n]!=-1){
            return dp[n];
        }
        int res=Integer.MAX_VALUE;
       
            for(int j=0;j<sq.size();j++){
                if(sq.get(j)>n)continue;
                res=Math.min(res,rec(n-sq.get(j),sq)+1);
                dp[n]=res;
            }
        
        return res;
    }
}