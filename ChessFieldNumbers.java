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
        return chessField;
        //
    }
}
