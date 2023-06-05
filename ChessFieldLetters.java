public class ChessFieldLetters {
    private String[][] board = new String[8][8];

    public ChessFieldLetters() {
        setupBoard();
    }

    public void setupBoard() {
        String[] chessPieces = { "r", "n", "b", "q", "k", "b", "n", "r" };
        String[] chessPiecesCaps = { "R", "N", "B", "Q", "K", "B", "N", "R" };

        for (int i = 0; i < 8; i++) {
            board[0][i] = chessPieces[i];
            board[1][i] = "p";
            board[2][i] = ".";
            board[3][i] = ".";
            board[4][i] = ".";
            board[5][i] = ".";
            board[6][i] = "P";
            board[7][i] = chessPiecesCaps[i];
        }
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
