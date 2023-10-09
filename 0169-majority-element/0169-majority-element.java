class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority = n / 2;
        if(n == 1) return nums[0];
        
        // Moore's Voting Algorithm
        
        int cnt = 1, ans = nums[0];
        for(int i = 1; i < n; i++) {
            if(nums[i] == ans)
                cnt++;
            else
                cnt--;
            if(cnt == 0) {
                cnt = 1;
                ans = nums[i];
            }
        }
        
//      If there is no guarantee that majority element always occurs then check manually
        cnt = 0;
        for(int val : nums) {
            if(val == ans) cnt++;
            if(cnt > majority) return ans;
        }
        return -1;
    }
}