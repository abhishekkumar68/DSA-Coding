class Solution {
    public int cherryPickup(int[][] grid) {
        int row1 = grid.length;
        int col1 = grid[0].length;
        int row2 = grid.length;
        int col2 = grid[0].length;

        int[][][][] dp = new int[row1][col1][row2][col2];
        for (int[][][] a : dp) {
            for (int[][] b : a) {
                for (int[] c : b) {
                    Arrays.fill(c, -1);
                }
            }
        }

        return Math.max(0,solve(0, 0, 0, 0, dp, grid));
    }

    public int solve(int row1, int col1, int row2, int col2, int[][][][] dp, int[][] grid){

        if(row1<0 || row2<0 || col1<0 || col2<0 || row1>=grid.length || row2>=grid.length || col1>=grid[0].length || col2>=grid[0].length){
            return Integer.MIN_VALUE;
        }
        if(row1 + col1 != row2 + col2){
            return Integer.MIN_VALUE;
        }

        if(grid[row1][col1]==-1 || grid[row2][col2]==-1){
            return Integer.MIN_VALUE;
        }

        if(row1==grid.length-1 && col1==grid[0].length-1 && row2==grid.length-1 && col2==grid[0].length-1){
            return grid[row1][col1];
        }

        if(dp[row1][col1][row2][col2]!=-1) return dp[row1][col1][row2][col2];

        int temp1 = solve(row1, col1+1, row2, col2+1, dp, grid);
        int temp2 = solve(row1, col1+1, row2+1, col2, dp, grid);
        int temp3 = solve(row1+1, col1, row2, col2+1, dp, grid);
        int temp4 = solve(row1+1, col1, row2+1, col2, dp, grid);

        int ans = Math.max(Math.max(temp1, temp2), Math.max(temp3, temp4));
        if(ans == Integer.MIN_VALUE){
            dp[row1][col1][row2][col2] = Integer.MIN_VALUE;
            return Integer.MIN_VALUE;
        }

        int contri = 0;
        if(row1==row2 && col1==col2){
            contri = grid[row1][col1];
        }
        else{
            contri = grid[row1][col1] + grid[row2][col2];
        }

        dp[row1][col1][row2][col2] = ans+contri;
        return ans+contri;
        
    }
}