class Solution {
    int[][] grid;
    int n;
    int m;
   
    int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};
    public long solve(int i,int j){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]<=0){
            return 0;
        }
            int value=grid[i][j];
            grid[i][j]=-1;
            long sum=value;
        
        for(int[] dir:directions){
            int newrow=i+dir[0];
            int newcol=j+dir[1];
            sum+=solve(newrow,newcol);
        }
        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        this.grid=grid;
        n=grid.length;
        m=grid[0].length;
         int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]>0){
                  long sumgrid=solve(i,j);
                  if(sumgrid%k==0){
                    count++;
                  }
                }
                
            }
        }
        return count;
    }
}