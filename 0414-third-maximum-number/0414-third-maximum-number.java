class Solution {
    public int thirdMax(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int dist = 1;
        for(int i = n - 2; i>= 0; i--) {
            if(arr[i] != arr[i + 1]) dist++;
            if(dist == 3) return arr[i];
        }
        return arr[n - 1];
    }
}