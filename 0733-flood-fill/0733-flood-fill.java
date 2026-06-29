class Solution {
    int[][] image;
    int row,col;
    int originalcolor;
    int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
    public void dfs(int i,int j,int sc,int sr,int color){
        
        if(i<0||j<0||i>=row|| j>=col || image[i][j]!=originalcolor){
            return;
        }
        
       image[i][j]=color;
       for(int[] d:dir){
        int newrow=i+d[0];
        int newcol=j+d[1];
        dfs(newrow,newcol,sc,sr,color);
          
        }
        return;
       }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        this.image=image;
        row=image.length;
        col=image[0].length;
        originalcolor=image[sr][sc];
        
              if(originalcolor==color){
                return image;
              }
         dfs(sr,sc,sr,sc,color);
        return image;
    }
}