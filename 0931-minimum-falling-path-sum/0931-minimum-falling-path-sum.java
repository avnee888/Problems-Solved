class Solution {
    int[][] dp;
    
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        dp=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-10000;
            }
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
        res=Math.min(res,rec(0,i,n,matrix));
        }
      return res;
    }
    public int rec(int i,int j, int n,int[][] matrix){
       if(i<0 || j<0 || i>=n || j>=n){
        return Integer.MAX_VALUE;
       }
       if(dp[i][j]!=-10000){
        return dp[i][j];
       }
       if(i==n-1){
        return matrix[i][j];
       }
       
       int s1=rec(i+1,j-1,n,matrix);
       int s2=rec(i+1,j,n,matrix);
       int s3=rec(i+1,j+1,n,matrix);
       return dp[i][j]=matrix[i][j]+Math.min(s1,Math.min(s2,s3));
       
    }
}