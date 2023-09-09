class Solution {
    public int climbStairs(int n) {
        int ways = 2;
        int arr[] = new int[n];
        

        for(int i = 2; i < n; i++) {
            arr[0] = 0;
            arr[1] = 1;
            arr[i] = arr[i - 1] + arr[i - 2];
            ways += arr[i];
        }
        if(n == 1) {
            ways = 1;
        }
        else if(n == 2) {
            ways = 2;
        }
        return ways;
    }
}
