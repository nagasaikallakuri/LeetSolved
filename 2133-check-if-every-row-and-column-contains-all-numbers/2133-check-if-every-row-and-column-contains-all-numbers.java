class Solution {
    public boolean checkValid(int[][] matrix) {
        Set seen= new HashSet<>();
        
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++){
                int t=matrix[i][j];
                if(!seen.add(t +"in a row"+ i)||
                  !seen.add(t +"in a column"+j))
                    return false;
                }
        return true;
    }
}