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

    public int gameSetupMode(Scanner input) {
        System.out.println();
        int userInput = 0;
        while (userInput != 1 && userInput != 2 && userInput != 3 && userInput != 4) {
            System.out.println("Please select gamemode... ");
            System.out.println(
                    "1 - Player vs. Level 1 Computer\n2 - Player vs. Level 2 Computer\n3 - Player vs. Level 3 Computer\n4 - Player vs. Player");
            userInput = input.nextInt();
        }
        
        return userInput;
    }

    public String gameSetupPlayer(Scanner input) {
        System.out.println();
        int userInput = 0;
        while (userInput != 1 && userInput != 2 && userInput != 3) {
            System.out.println("Please choose who to play as... ");
            System.out.println("1 - x\n2 - o\n3 - random");
            userInput = input.nextInt();
        }
        
        if (userInput == 1) {
            return "x";
        } else if (userInput == 2) {
            return "o";
        } else if (userInput == 3) {
            if (Math.random() >= .5) {
                return "x";
            } else {
                return "o";
            }
        }
        return "error on gameSetupPlayer";
    }
}
