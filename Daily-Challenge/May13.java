// *************BruteForce solution****************** O(n*limit)



class Solution {
    public int minMoves(int[] nums, int limit) {
        int n=nums.length;
        
        // target sum minimum 2 ho sakta and maximum 2*limit ho sakta
        int ans = Integer.MAX_VALUE;
        for(int target=2;target<=2*limit;target++){
           int moves = 0;

            for (int i = 0; i < n / 2; i++) {

                int a = nums[i];
                int b = nums[n - 1 - i];

                int sum = a + b;

                // already equal
                if (sum == target) {
                    continue;
                }

                // range where 1 move is possible
                int min = Math.min(a, b) + 1;
                int max = Math.max(a, b) + limit;

                if (target >= min && target <= max) {
                    moves++;
                } else {
                    moves += 2;
                }
            }

            ans = Math.min(ans, moves);
        }
            return ans;
        }
        
    }






    // ************* optimise************* O(n+limit);


    class Solution {
    public int minMoves(int[] nums, int limit) {
        int[] diff = new int[2 * limit + 2];
        int n = nums.length;
        for (int i = 0; i < n / 2; i++) {
            int a = nums[i];
            int b = nums[n - 1 - i];
            int x = Math.min(a, b);
            int y = Math.max(a, b);
            // initially 2 moves
            diff[2] += 2;
            // 1 move starts
            diff[x + 1] -= 1;
            // 0 move at x+y
            diff[x + y] -= 1;
            // back to 1 move
            diff[x + y + 1] += 1;
            // back to 2 moves
            diff[y + limit + 1] += 1;
        }
        int ans = Integer.MAX_VALUE;
        int curr = 0;
        for (int s = 2; s <= 2 * limit; s++) {
            curr += diff[s];
            ans = Math.min(ans, curr);
        }
        return ans;
    }
}
