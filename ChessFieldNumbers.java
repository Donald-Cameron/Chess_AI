import java.util.Arrays;

public class ChessFieldNumbers {
    public static void main(String[] args) {

        int[][] chessField = createStartingField();
        for (int row = 0; row < chessField.length; row++) {
            System.out.println();
            for (int column = 0; column < chessField.length; column++) {
                System.out.print(chessField[row][column] + "  ");
            }
        }
    }

    static int[][] createStartingField() {
        int[][] chessField = new int[8][8];
        chessField[1] = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        chessField[6] = chessField[1];
        chessField[0] = new int[]{5, 3, 4, 9, 2, 4, 3, 5};
        chessField[7] = chessField[0];
        return chessField;
        //
    }
}
