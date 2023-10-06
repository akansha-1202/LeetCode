class Solution {
    public int thirdMax(int[] arr) {
        boolean flag = false;
        int n = arr.length;
            
        for(int i = 0; i < n; i++)
            if(arr[i] == Integer.MIN_VALUE) flag = true;
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
            if(arr[i] > max)
                max = arr[i];
        
        if(n <= 2) return max;
        int sMax = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
            if(arr[i] > sMax && arr[i] < max)
                sMax = arr[i];
        int tMax = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
            if(arr[i] > tMax && arr[i] < sMax)
                tMax = arr[i];
        if(max == Integer.MIN_VALUE || sMax == Integer.MIN_VALUE) return max;
        if(tMax != Integer.MIN_VALUE) return tMax;
        return (tMax == Integer.MIN_VALUE && flag) ? tMax : max;
        
    }
}