class Solution {
    int[][] directions={{1,0},{0,1},{-1,0},{0,-1}};
    public int numEnclaves(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
                if(i==0||i==grid.length-1||j==0||j==grid[0].length-1)
                    if(grid[i][j]==1)
                        DFS(i,j,grid);
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
                if(grid[i][j]==1)
                    count++;
        return count;
    }
    public void DFS(int row,int col, int[][] grid){
        grid[row][col]=0;
        for(int[] d:directions){
            int newrow=row+d[0];
            int newcol=col+d[1];
            if(newrow<0||newcol<0||newrow>grid.length-1||newcol>grid[0].length-1)
                continue;
            if(grid[newrow][newcol]==1)
                DFS(newrow,newcol,grid);
        }
    }
}