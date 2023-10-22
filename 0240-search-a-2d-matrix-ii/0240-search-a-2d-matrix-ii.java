class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[0].length; c++)
                if(arr[r][c] == target)
                     return true;
        }
        return false;
    }
}