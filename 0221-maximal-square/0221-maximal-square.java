class Solution {
    int[] dp;
    public int maximalSquare(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        dp=new int[m+1];
        Arrays.fill(dp,0);
        int side=0;
        
        for(int i=1;i<=n;i++){
            int diagonal=0;
            for(int j=1;j<=m;j++){
                int top=dp[j];
                if(matrix[i-1][j-1]=='1'){
               dp[j]=1+Math.min(diagonal,Math.min(dp[j],dp[j-1]));
               
               side=Math.max(side,dp[j]);
               } 
               else{
                dp[j]=0;
               }
               diagonal=top;
            }
        
        }
        return side*side;
    }
}