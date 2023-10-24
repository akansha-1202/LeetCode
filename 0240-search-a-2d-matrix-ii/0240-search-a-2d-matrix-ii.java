class Solution {
    public boolean searchMatrix(int[][] arr, int k) {
        int r = 0;
        int c = arr[0].length - 1;
        while(r < arr.length && c >= 0){
            if(arr[r][c] == k){ 
                return true; 
            }
            else if(arr[r][c] > k) c--;
            else if(arr[r][c] < k) r++;
        }
        
        return false;
    }
}