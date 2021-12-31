class Solution {
    int[][] directions={{1,0},{0,1},{0,-1},{-1,0}};
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
                if(grid[i][j]=='1'){
                    DFS(i,j,grid);
                        count++;
                }
        return count;
    }
    public void DFS(int row,int col,char[][] grid){
        grid[row][col]='0';
        for(int[] dir:directions){
            int newrow=row+dir[0];
            int newcol=col+dir[1];
            if(newrow>grid.length-1 || newrow<0 || newcol>grid[0].length-1 ||newcol<0)
                continue;
            if(grid[newrow][newcol]=='1')
              DFS(newrow,newcol,grid);
        }
    }
}