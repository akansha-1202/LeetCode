class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverseArray(nums, 0 , n - k - 1);
        reverseArray(nums, n - k , n - 1);
        reverseArray(nums, 0 , n - 1);
    
        return ;
    }
    
     public void reverseArray(int[] arr, int a, int b){      
         while(a < b){
            int temp = arr[a];
            arr[a++] = arr[b];
            arr[b--] = temp;
         }
    }
}