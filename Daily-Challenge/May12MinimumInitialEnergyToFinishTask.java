// *****************Leetcode 1665*******************

class Solution {
    public int minimumEffort(int[][] tasks) {

        int n = tasks.length;

        // {diff , actual , minimum}
        int arr[][] = new int[n][3];

        for (int i = 0; i < n; i++) {

            arr[i][0] = tasks[i][1] - tasks[i][0];
            arr[i][1] = tasks[i][0];
            arr[i][2] = tasks[i][1];
        }

        // descending order on diff
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        int minimum = arr[0][2];
        int remain = arr[0][2] - arr[0][1];

        for (int i = 1; i < n; i++) {

            int actual = arr[i][1];
            int minReq = arr[i][2];

            if (remain >= minReq) {

                remain -= actual;
            }
            else {

                int extra = minReq - remain;

                minimum += extra;

                remain = minReq - actual;
            }
        }

        return minimum;
    }
}
