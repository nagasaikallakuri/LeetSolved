class Solution {
    int[][] directions={{1,0},{0,1},{-1,0},{0,-1}};
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor)
            return image;
        DFS(image,sr,sc,newColor,image[sr][sc]);
        return image;
    }
    public void DFS(int[][] matrix,int row,int col,int nc,int sc){
        matrix[row][col]=nc;
        for(int[] dir:directions){
            int newrow=row+dir[0];
            int newcol=col+dir[1];
            if(newrow<0 || newrow>matrix.length-1 ||newcol<0 || newcol>matrix[0].length-1)
                continue;
            if(matrix[newrow][newcol]==sc)
                DFS(matrix,newrow,newcol,nc,sc);                
        }
    }
}