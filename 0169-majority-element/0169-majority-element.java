class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority = n / 2;
        if(n == 1) return nums[0];
        Arrays.sort(nums);
        int cnt = 1;
        for(int i = 1; i < n; i++) {
            if(nums[i] == nums[i-1]) cnt++;
            else cnt = 1;
                                                                                                         
            if(cnt > majority)
                return nums[i];
        }
        return -1;
    }
}