class Solution {
    char[][] board;
    String word;
    int row;
    int col;
    int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
    public boolean rec(int i,int j,int idx){
        if(idx==word.length()){
            return true;
        }
        if(i<0 || i>=row || j<0 || j>=col|| board[i][j]!=word.charAt(idx)){
            return false;
        }
        
        char temp=board[i][j];
        board[i][j]='*';
        for(int[] d:dir){
            int newrow=i+d[0];
            int newcol=j+d[1];
            if(rec(newrow,newcol,idx+1)){
                board[i][j]=temp;
                return true;
            }
        }
        board[i][j]=temp;
        return false;
    }
   public boolean exist(char[][] board, String word) {
        this.board=board;
        this.word=word;
        row=board.length;
        col=board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(rec(i,j,0)){
                    return true;
                }

            }
        }
        return false;
    }
}