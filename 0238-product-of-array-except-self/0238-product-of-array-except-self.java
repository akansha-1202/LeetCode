class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int cnt = 0, prd = 1;
        for(int val : nums) {
            if(val == 0) cnt++;
            if(val != 0) prd *= val;
        }
        if(cnt > 1)
            return ans;
        
        if(cnt == 1) {
            for(int i = 0; i < n; i++) {
                if (nums[i] == 0)
                    ans[i] = prd;
            }
            return ans;
        } else {
            for(int i = 0; i < n; i++)
                    ans[i] = prd / nums[i];
            
        }
        return ans;
    }
}