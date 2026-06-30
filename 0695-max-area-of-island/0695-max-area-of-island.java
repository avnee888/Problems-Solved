class Solution {
    int[][]grid;
    int row,col,count,max;
    int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
    public void dfs(int i,int j){
       if(i<0||j<0||i>=row||j>=col||grid[i][j]!=1){
           return;
       }
      count++;
    
      grid[i][j]=-1;
      for(int[] d:dir){
        int newrow=i+d[0];
        int newcol=j+d[1];
        dfs(newrow,newcol);
      }
      
    }
    public int maxAreaOfIsland(int[][] grid) {
        this.grid=grid;
        row=grid.length;
        col=grid[0].length;
        count=0;
        max=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                  count=0;
                  dfs(i,j);
                  max=Math.max(count,max);
                }
             

            }
        }
    
        return max;
    }
}