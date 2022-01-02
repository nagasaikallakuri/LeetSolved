class Solution {
    int count=0;
    int[][] directions= {{1,0},{0,1},{-1,0},{0,-1}};
    public int islandPerimeter(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
                if(grid[i][j]==1 && visited[i][j]==false)
                    DFS(grid,i,j,visited);
        return count;
    }
    public void DFS(int[][] grid,int row,int col,boolean[][] visited){
        visited[row][col]=true;
        for(int[] d:directions){
            int newrow=row+d[0];
            int newcol=col+d[1];
            if(newrow<0 || newcol<0 ||newrow> grid.length-1 ||newcol>grid[0].length-1){
                count++;
                continue;
            }
             if(grid[newrow][newcol]==0)
                 count++;
            else if(visited[newrow][newcol]==false)
                DFS(grid,newrow,newcol,visited);
        }
    }
}