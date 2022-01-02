class Solution {
    int[][] directions={{1,0},{0,1},{-1,0},{0,-1}};
    public void solve(char[][] board) {
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++)
                if((i==0||i==board.length-1||j==0||j==board[0].length-1) && (board[i][j]=='O'))
                    DFS(board,i,j);    
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Z')
                    board[i][j]='O';
                else
                    board[i][j]='X';
            }
                
    }
    public void DFS(char[][] matrix,int row,int col){
       matrix[row][col]='Z';
        for(int[] d:directions){
            int newrow=row+d[0];
            int newcol=col+d[1];
            if(newrow<0 ||newcol<0 ||newrow>matrix.length-1||newcol>matrix[0].length-1)
                continue;
            if(matrix[newrow][newcol]=='O')
                DFS(matrix,newrow,newcol);
        }
    }
}