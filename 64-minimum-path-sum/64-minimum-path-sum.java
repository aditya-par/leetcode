class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        
        for(int i = n - 1; i >= 0; i--) {
            for(int j = m - 1; j >= 0; j--) {
                // destination index
                if(i == n - 1 && j == m - 1) {
                    dp[i][j] = grid[i][j];
                }
                
                // last row
                else if(i == n - 1) {
                    dp[i][j] = dp[i][j+1] + grid[i][j];
                }
                
                // last column
                else if(j == m - 1) {
                    dp[i][j] = dp[i+1][j] + grid[i][j];
                }
                else
                    dp[i][j] = Math.min(dp[i][j+1], dp[i+1][j]) + grid[i][j];
            }
        }
        
        return dp[0][0];
    }
}