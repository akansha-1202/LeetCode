class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length]; 
        for(int c = 0; c < matrix[0].length; c++)
            for(int r = 0; r < matrix.length; r++)
                transpose[c][r] = matrix[r][c];
        
        return transpose;
    }
}