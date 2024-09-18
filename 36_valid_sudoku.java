// 36. Valid Sudoku
// Difficulty: Medium
// Category: Matrix

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char c = board[i][j];
                if( c >='0' && c <= '9' && !isValid(board, i, j)) return false; 
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int r, int c){
        for(int i=0; i<9; i++){
            if(r!=i && board[i][c] == board[r][c]) return false;
            if(c!=i && board[r][i] == board[r][c]) return false;
        }
        
        int rStart = 3 * (r/3); 
        int cStart = 3 * (c/3);

        for(int i=rStart; i<rStart + 3; i++){
            for( int j = cStart; j<cStart + 3; j++){
                if(i!=r && j!=c && board[i][j] == board[r][c]) return false; 
            }
        }

        return true;
    }
}