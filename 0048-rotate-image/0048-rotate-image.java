class Solution {
    public void rotate(int[][] arr) {
        int n = arr[0].length;
        transpose(arr, n);
        reverse(arr, n);
        
        return;
    }
    public void transpose(int[][] arr, int n){
        for(int r = 0; r < n; r++){
            for(int c = r; c < n; c++){
               swap(arr, r, c);
            }
        }
    }
    
    public void reverse(int[][] arr, int n){
        for(int r = 0; r < n; r++){
            int i = 0, j = n-1;
            while(i < j){
                int temp = arr[r][i];
                arr[r][i] = arr[r][j];
                arr[r][j] = temp;
                i++;
                j--;
            }
        }
    }
    
    public void swap(int[][] arr, int r, int c){
        int temp = arr[r][c];
        arr[r][c] = arr[c][r];
        arr[c][r] = temp;
    }
    
}