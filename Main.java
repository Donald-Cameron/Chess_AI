import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String playerColor = getPlayerColor();
        System.out.println("You're playing as " + playerColor);
    }

    private static String getPlayerColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your color: (1) White, (2) Black, (3) Random");
        String color = "";

        int choice = scanner.nextInt();
        if (choice == 1) {
            color = "White";
        } else if (choice == 2) {
            color = "Black";
        } else if (choice == 3) {
            Random random = new Random();
            color = random.nextBoolean() ? "White" : "Black";
        } else {
            System.out.println("Invalid choice. Assigning color randomly.");
            Random random = new Random();
            color = random.nextBoolean() ? "White" : "Black";
        }

        scanner.close();
        return color;
    }
}
