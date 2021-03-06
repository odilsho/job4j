package array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        int countCell = 0;
        int countRow = 0;
        for (int row = 0; row < board.length; row++) {

            for (int cell = 0; cell < board.length; cell++) {
                if (board[row][row] == 'X') {

                    countRow++;
                }
            }
            for (int cell = 0; cell < board.length; cell++) {
                if (board[cell][cell] == 'X') {
                    countCell++;
                }
            }
        }
        if ((countCell == board.length) || (countRow == board.length)) {
            result = true;

        }
        return result;
    }

    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner : " + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);
    }

}
