import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int lastMove = -1;
        Scanner input = new Scanner(System.in);

        PlayerInputManager playerManage = new PlayerInputManager();
        BoardManager boardManage = new BoardManager();
        ComputerPlayer computer = new ComputerPlayer();

        int userInput = playerManage.gameSetupMode(input);
        computer.setLevel(userInput);

        if (userInput != 4) {
            if (playerManage.gameSetupPlayer(input).equals("o")) {
                computer.setPlayer("x");
            } else {
                computer.setPlayer("o");
            }
        }

        System.out.println(boardManage);

        while (boardManage.checkWin().equals("")) {
            if (computer.level != 4 && computer.player.equals(boardManage.getTurn())) {
                lastMove = computer.makeMove(boardManage.getRawBoard());
                if (boardManage.checkValidMove(lastMove)) {
                    boardManage.makeMove(boardManage.getTurn(), lastMove);
                    System.out.println(boardManage);
                }
            } else {
                lastMove = playerManage.askForMove(boardManage.getTurn(), input);
                if (boardManage.checkValidMove(lastMove)) {
                    boardManage.makeMove(boardManage.getTurn(), lastMove);
                    System.out.println(boardManage);
                }
            }
        }
        System.out.println("Player " + boardManage.checkWin() + " wins! ");
    }
}
