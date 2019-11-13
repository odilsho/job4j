package array;

public class MatrixCheck {

    public static boolean found[];

    public static boolean isWin(char[][] board) {
        boolean result = false;
        int c = 0, r = 0;
        for (int row = 0; row < board.length - 1; row++) {
            for (int cell = 0; cell < board.length - 1; cell++) {
                char sign = board[row][cell];
                System.out.print(sign);
                for (int i = 0; i < board.length - 1; i++) {
                    // проверить последовательность.
                    if (board[cell][row] == 'X') {
                        c = cell;
                        r = row;

                    }  if (board[r + 1][c] == 'X')
                        result = true;

                }
                System.out.println();
            }

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