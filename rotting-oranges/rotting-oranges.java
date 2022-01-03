class Solution {
    public int orangesRotting(int[][] grid) {
    int[][] directions={{1,0},{0,1},{-1,0},{0,-1}};
    int count=0,counto=0;     
        Queue<int[]> queue=new LinkedList<>();
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2)
                    queue.offer(new int[]{i,j});
                if(grid[i][j]==1)
                    counto++;
            }
        if(counto==0)
            return 0;
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-->0){
                int[] curr=queue.remove();
                for(int[] d:directions){
                int newrow=curr[0]+d[0];
                int newcol=curr[1]+d[1];
                if(newrow<0 || newcol<0 ||newrow>grid.length-1 || newcol>grid[0].length-1)
                    continue;
              if(grid[newrow][newcol]==1){
                     counto--;
                   queue.offer(new int[]{newrow,newcol});
                  grid[newrow][newcol]=2;
              }
                
              }
            }
            count++;
        }
        return counto==0?count-1:-1;
    }
}