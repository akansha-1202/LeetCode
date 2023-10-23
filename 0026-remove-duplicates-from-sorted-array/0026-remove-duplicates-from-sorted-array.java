class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int i = 0, cnt = 1;
        while(i < n-1){
            if(arr[i] != arr[i+1])
                arr[cnt++] = arr[i+1]; 
            i++;
        }
        return cnt;
    }
}