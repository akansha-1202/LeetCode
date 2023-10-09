class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority = n / 2;
        
        for(int i = 0; i < n; i++) {
            int cnt = 0;
            for(int j = 0; j < n; j++) {
                if(nums[j] == nums[i]) {
                    cnt++;
                }
            }
            if(cnt > majority)
                return nums[i];
        }
        return -1;
    }
}