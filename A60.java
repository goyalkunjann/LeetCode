class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        if(target < n || target > k * n) return 0;
        long[] dp = new long[target + 1];
        long mod = (long)1e9 + 7;
        for(int i = 1; i <= Math.min(k, target); i++) dp[i] = 1;
        for(int i = 2; i <= n; i++) {
            long[] next = new long[target + 1];
            for(int sum = 1; sum <= target; sum++) {
                if(dp[sum] == 0) continue;
                for(int v = 1; v <= k; v++) {
                    if(sum + v > target) break;
                    next[sum + v] = (next[sum + v] + dp[sum]) % mod;
                }
            }
            dp = next;
        }
        return (int)dp[target];
    }
}
