class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        boolean flag = false;
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[0].length; c++)
                if(arr[r][c] == target){
                     flag = true;
                     return true;
                }
            if(flag) break;
        }
       return false;
    }
}