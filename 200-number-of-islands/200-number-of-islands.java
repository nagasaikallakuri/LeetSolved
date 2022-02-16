class Solution {
    int[][] directions={{1,0},{0,1},{-1,0},{0,-1}};
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
                if(grid[i][j]=='1'){
                    DFS(grid,i,j);
                    count++;
                }
        return count;
    }
    public void DFS(char[][]matrix,int row,int col){
        matrix[row][col]='0';
        for(int[]d : directions){
            int newrow=row+d[0];
            int newcol=col+d[1];
            if(newrow<0||newcol<0||newrow>matrix.length-1||newcol>matrix[0].length-1)
                continue;
            if(matrix[newrow][newcol]=='1')
                DFS(matrix,newrow,newcol);
            
            }
    }
}