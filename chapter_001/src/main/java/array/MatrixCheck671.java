package array;

public class MatrixCheck671 {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = false;
        int countRow=0;
        for ( row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 'X') {
                    countRow++;

                } else
                    countRow = 0;

                if (board.length == countRow ) {
                    result = true;
                    break;

                }


            }

        }


        return result;
    }
}