package study;

public class BacktrackingApp {
    final int n = 4;

    public static void main(String[] args) {

        /**
         * NQueen
         *
         * 4 bidak queen
         * luas papan catur 4 x 4
         *
         * queen tidak boleh sebaris
         * queen tidak boleh sekolom
         * queen tidak boleh sediagonal
         * queen tidak boleh berada di kotak yang sama
         *
         */




        BacktrackingApp queen = new BacktrackingApp();
        queen.solveNQ();

    }

    void printSolution(int[][] board) {

       for(var i = 0; i < n; i++) {
           for(var j = 0; j < n; j++) {
               System.out.print(" " + board[i][j] + " ");
           }
           System.out.println();
       }

    }

    boolean isSafe(int[][] board, int row, int col) {

        int i, j;

        //check sisi kiri
        for(i = 0; i < col; i++) {
            if(board[row][i] == 1) {
                return false;
            }
        }

        //cek diagonal atas
        for(i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 1) {
                return false;
            }
        }

        // check diagonal bawa
        for(i = row, j = col; j >= 0 && i < n; i++, j--) {
            if(board[i][j] == 1) {
                return false;
            }
        }

        return true;

    }

    boolean solveNQUtil(int[][] board, int col) {
        if(col >= n) {
            return true;
        }

        for(int i = 0; i < n; i++) {
            if(isSafe(board, i, col)) {
                board[i][col] = 1;

                if(solveNQUtil(board, col + 1) == true) {
                    return true;
                }
                board[i][col] = 0; //backtrack
            }
        }

        return false;
    }

    boolean solveNQ() {

        int[][] board = {
                {0, 0, 0 , 0},
                {0, 0, 0 , 0},
                {0, 0, 0 , 0},
                {0, 0, 0 , 0}
        };

        if(solveNQUtil(board,0) == false) {
            System.out.println("Tidak ada solusi");
            return false;
        } else {
            printSolution(board);
            return true;
        }

    }
}
