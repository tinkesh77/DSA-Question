class Solution {
    public boolean isValidSudoku(char[][] board) {
        // checking row
        for (int row = 0; row < 9; row++) {
            HashSet<Character> setRow = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                if ('.' != board[row][col] && !setRow.add(board[row][col])) {
                    return false;
                }
            }
        }

        // checking col
        for (int col = 0; col < 9; col++) {
            HashSet<Character> setCol = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                if ('.' != board[row][col] && !setCol.add(board[row][col])) {
                    return false;
                }
            }
        }

        // checking 3x3 grid
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                // checkingf 3x3
                HashSet<Character> set = new HashSet<>();
                for (int row = boxRow; row < boxRow + 3; row++) {
                    for(int col = boxCol; col < boxCol + 3; col++){
                        if(board[row][col] != '.' && !set.add(board[row][col])) return false;
                    }
                }
            }
        }
        return true;
    }
}
