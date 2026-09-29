class Solution {
    
    public boolean hasValidPath(char[][] grid) {
       int n=grid.length;
       int m=grid[0].length;
       int pathlength=n+m-1;
       if(pathlength%2!=0)return false;
       if(grid[0][0]!='(' || grid[n-1][m-1]!=')')return false;
       boolean[][][] dp=new boolean[n][m][pathlength+1];
       dp[0][0][1]=true;
       int change=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
           if(grid[i][j]=='('){
             change=1;
           }else{
         change=-1;
           }
           if(i>0){
            for(int balance=0;balance<pathlength;balance++){
                if(!dp[i-1][j][balance]){
                    continue;
                }
                int next=balance+change;
                if(next>=0){
                dp[i][j][next]=true;}
            }
           }
           if(j>0){
            for(int balance=0;balance<pathlength;balance++){
                if(!dp[i][j-1][balance]){
                    continue;
                }
                
                int next=balance+change;
                if(next>=0){
                dp[i][j][next]=true;}
            }
           }
        }
       }
       return dp[n-1][m-1][0];
    }

}