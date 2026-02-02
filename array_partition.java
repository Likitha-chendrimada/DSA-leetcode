package arrays;
import java.util.*;

public class array_partition {
    public long minimumCost(int[] nums, int k, int dist) {
        int n = nums.length;
        long INF = Long.MAX_VALUE / 2;
        long[][] dp = new long[n + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], INF);
        }

        dp[0][0] = 0;

        for (int j = 1; j <= k; j++) {
            // Sliding window minimum for previous dp values
            Deque<Integer> deque = new ArrayDeque<>();
            for (int i = 1; i <= n; i++) {
                // Remove indices outside the window
                while (!deque.isEmpty() && deque.peekFirst() < i - dist) {
                    deque.pollFirst();
                }
                // Add previous dp values to deque
                if (dp[i - 1][j - 1] != INF) {
                    while (!deque.isEmpty() && dp[deque.peekLast()][j - 1] >= dp[i - 1][j - 1]) {
                        deque.pollLast();
                    }
                    deque.offerLast(i - 1);
                }
                if (!deque.isEmpty()) {
                    dp[i][j] = dp[deque.peekFirst()][j - 1] + nums[i - 1];
                }
            }
        }

        return dp[n][k];
    }
}
