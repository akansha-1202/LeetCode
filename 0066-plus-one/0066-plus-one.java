class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i >= 0; i--){
            digits[i]++;    //last digits increment
            if(digits[i] < 10) return digits;
            digits[i] %= 10; 
        }
        
        int[] ans = new int[n+1]; //array size increses
        ans[0] = 1;
        return ans;
    }
}