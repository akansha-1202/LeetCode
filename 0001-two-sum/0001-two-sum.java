class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++)
                if(nums[i] + nums[j] == target){
                    int[] ans = new int[2];
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                } 
        }
        return new int[0];
    }
}