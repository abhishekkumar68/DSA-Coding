class Solution { 
    public boolean isPossible(int row, int col, char x, char[][] board){
        for(int i=0;i<9;i++){
            if(board[row][i]==x){
                return false;
            }
            if(board[i][col]==x){
                return false;
            }

            int r= (row/3)*3+(i/3);
            int c= (col/3)*3+(i%3);

            if(board[r][c]==x){
                return false;
            }
        }
        return true;
    }

    public boolean solve(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char x = '1';x<='9';x++){
                        if(isPossible(i,j,x, board)){
                            board[i][j]=x;
                            if(solve(board)==true){
                                return true;
                            }
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        solve(board);
    }
}



