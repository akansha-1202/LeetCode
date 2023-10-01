class Solution {
    public boolean isPalindrome(int x) {
        if(x >= 0 && x <= 9) return true;
        if(x < 0 || x %10 == 0) return false;
        
        int temp = x;
        int sum = 0;
        while(temp > 0){  
            int rem = temp%10;
            sum = sum*10 + rem;
            temp /= 10;
        }
        if(sum == x) return true;
        
        return false;
    }
}