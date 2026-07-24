class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        return solve(m-1, n-1, dp, grid);
    }

    public int solve(int i, int j, int[][] dp, int[][] grid){
        if(i<0 || j<0) return Integer.MAX_VALUE;
        if(i==0 && j==0) return grid[0][0];
        if(dp[i][j]!=-1) return dp[i][j];
        int x = solve(i-1, j, dp, grid);
        int y = solve(i, j-1, dp, grid);

        int result = Math.min(x,y);
        dp[i][j] = result+grid[i][j];
        return result+grid[i][j];
    }
}