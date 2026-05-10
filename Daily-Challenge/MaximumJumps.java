import java.util.Arrays;

public class MaximumJumps {

    static class Solution {

        public int maximumJumps(int[] nums, int target) {

            int n = nums.length;

            int dp[] = new int[n];

            Arrays.fill(dp, -1);

            dp[0] = 0;

            for (int i = 0; i < n; i++) {

                if (dp[i] == -1) {
                    continue;
                }

                for (int j = i + 1; j < n; j++) {

                    if (Math.abs(nums[j] - nums[i]) <= target) {

                        dp[j] = Math.max(dp[j], dp[i] + 1);
                    }
                }
            }

            return dp[n - 1];
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int nums[] = {1, 3, 6, 4, 1, 2};

        int target = 2;

        int ans = obj.maximumJumps(nums, target);

        System.out.println(ans);
    }
}