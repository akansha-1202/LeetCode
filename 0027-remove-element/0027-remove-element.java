class Solution {
    public int removeElement(int[] arr, int val) {
        int n = arr.length;
        int i = 0, cnt = 0;
        while(i < n){
            if(arr[i] != val)
                arr[cnt++] = arr[i];
            i++;
        }
        return cnt;
    }
}