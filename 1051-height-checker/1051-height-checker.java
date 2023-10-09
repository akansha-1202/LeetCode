class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] ans = new int[n];
        int cnt = 0;
        for(int i = 0; i < n; i++)
            ans[i] = heights[i];
        Arrays.sort(ans);
         for(int i = 0; i < n; i++)
            if(ans[i] != heights[i]) cnt++;
        
        return cnt;
    }
}