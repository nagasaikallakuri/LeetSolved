class Solution {
    int[][] dirs={{1,0},{-1,0},{0,-1},{0,1}};
    boolean flag=false;
    public boolean exist(char[][] board, String word) {
        char[] w=word.toCharArray();
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==w[0] && helper(board,w,i,j,0))
                    return true;
            }
        return false;
    }
    private boolean helper(char[][] board,char[] word,int row, int col, int curr){
       if(curr==word.length-1)
           return true;
        boolean found=false;
        
        for(int[] d:dirs){
            int newrow=row+d[0];
            int newcol=col+d[1];
            if(newrow<0||newcol<0||newrow>board.length-1||newcol>=board[0].length)
                continue;
            if(board[newrow][newcol]==word[curr+1]){
                char temp=board[row][col];
                board[row][col]=' ';
                found=found || helper(board,word,newrow,newcol,curr+1);
                board[row][col]=temp;
            }
        }
       return found; 
    }
}