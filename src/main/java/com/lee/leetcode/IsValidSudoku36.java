package com.lee.leetcode;

public class IsValidSudoku36 {

    public static void main(String[] args) {
        char[][] matrix = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(new IsValidSudoku36().isValidSudoku(matrix));
    }

    public boolean isValidSudoku(char[][] board) {
        return isValidCol(board) && isValidRow(board) && isValidSquared(board);
    }

    public boolean isValidRow(char[][] board) {
        for(int i = 0; i < board.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] != '.') {
                    if(row.toString().indexOf(board[i][j]) == -1) {
                        row.append(board[i][j]);
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isValidCol(char[][] board) {
        for(int i = 0; i < board[0].length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                if(board[j][i] != '.') {
                    if(row.toString().indexOf(board[j][i]) == -1) {
                        row.append(board[j][i]);
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isValidSquared(char[][] board) {
        for(int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board[i].length; j += 3) {
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < 3; k++) {
                    for(int m = 0; m < 3; m++) {
                        char c = board[i + k][m + j];
                        if(c != '.') {
                            if(sb.toString().indexOf(c) == -1) {
                                sb.append(c);
                            }
                            else {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

}
