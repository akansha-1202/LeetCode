class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        boolean flag = false;
        for(int val : digits) {
            if(val != 9)
                flag = true;
        }
        
        if(!flag) {
            int[] res = new int[n + 1];
            res[0] = 1;
            return res;
        }
        int num = digits[n - 1];
        digits[n-1] += 1;
        
        if(num == 9)
            for(int i = n-1; i >= 0; i--) {
                if(digits[i] >= 10) {
                    digits[i] %= 10;
                    digits[i-1] += 1;
                }
            }
        return digits;
    }
}