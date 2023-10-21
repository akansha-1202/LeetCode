class Solution {
    public int[][] construct2DArray(int[] original, int m, int n){ 
        if(m * n != original.length) return new int[0][0];
        int i = 0;
        int[][] ans = new int[m][n];
        for(int r = 0; r < m; r++)
            for(int c = 0; c < n; c++)
                ans[r][c] = original[i++];
    
        return ans;
    }
}