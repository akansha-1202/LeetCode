class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority = n / 2;
        if(n == 1) return nums[0];
        
        // Moore's Voting Algorithm
        
        int cnt = 1, num = nums[0];
        for(int i = 1; i < n; i++) {
            if(nums[i] == num)
                cnt++;
            else
                cnt--;
            if(cnt == 0) {
                cnt = 1;
                num = nums[i];
            }
        }
        return num;
    }
}