class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        for(int i = 0, j = 0, k = n; i < 2*n; i++){
            if(i%2 == 0) 
                ans[i] = nums[j++];
            else
                ans[i] = nums[k++];
        }
        
        return ans;
    }
}