import java.util.Scanner;

public class PlayerInputManager {
    public int askForMove(String player, Scanner input) {
        System.out.println();
        System.out.println("Player " + player + ", please choose a space: ");
        int userInput = input.nextInt();
        while (userInput != 1 && userInput != 2 && userInput != 3 && userInput != 4 && userInput != 5 && userInput != 6
                && userInput != 7 && userInput != 8 && userInput != 9) {
                    System.out.println("Player " + player + ", please choose a space: ");
                    userInput = input.nextInt();
        }
        return userInput;
    }
}
