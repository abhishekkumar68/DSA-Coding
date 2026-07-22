class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return pathCount(m-1, n-1, dp, obstacleGrid);
    }

    public int pathCount(int i, int j, int[][] dp, int[][] obstacleGrid){
        if(i<0 || j<0) return 0;
        if(obstacleGrid[i][j]==1) return 0;

        if(i==0 && j==0) return 1;

        if(dp[i][j]!=-1) return dp[i][j];

        int x = pathCount(i-1, j, dp,obstacleGrid);
        int y = pathCount(i, j-1, dp,obstacleGrid);

        dp[i][j] = x+y;
        return x+y;
    }
}