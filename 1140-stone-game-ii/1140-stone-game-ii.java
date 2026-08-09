class Solution {
    int[][] dp;
    int[] suffix;

    public int stoneGameII(int[] piles) {
        int n = piles.length;

        dp = new int[n][n + 1];
        suffix = new int[n + 1];

        
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        return solve(0, 1);
    }

    private int solve(int i, int M) {
        if (i >= pilesLength()) {
            return 0;
        }

        if (dp[i][M] != 0) {
            return dp[i][M];
        }

        int best = 0;

        
        for (int x = 1; x <= 2 * M && i + x <= pilesLength(); x++) {

            int opponent = solve(i + x, Math.max(M, x));

            int current = suffix[i] - opponent;

            best = Math.max(best, current);
        }

        dp[i][M] = best;
        return best;
    }

    private int pilesLength() {
        return suffix.length - 1;
    }
}