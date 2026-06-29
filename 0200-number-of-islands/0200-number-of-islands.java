class Solution {
    char[][] grid;
    int row,col;
  
    int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
    public void dfs(int i,int j){
        if(i<0||j<0||j>=col||i>=row||grid[i][j]!='1'){
           
           
           return;
        }
        
        
        grid[i][j]='x';
        for(int[] d:dir){
            int newrow=i+d[0];
            int newcol=j+d[1];
            dfs(newrow,newcol);
        }
        return ;
    }
    public int numIslands(char[][] grid) {
        this.grid=grid;
        row=grid.length;
        col=grid[0].length;
        int ans=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
              dfs(i,j);
              ans++ ; 
                }
            }
        }
        return ans;
    }
}