import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int lastMove;
        Scanner input = new Scanner(System.in);

        PlayerInputManager PlayerManage = new PlayerInputManager();
        BoardManager BoardManage = new BoardManager();

        System.out.println(BoardManage);

        while (BoardManage.checkWin().equals("")) {
            lastMove = PlayerManage.askForMove(BoardManage.getTurn(), input);
            if (BoardManage.checkValidMove(lastMove)) {
                BoardManage.makeMove(BoardManage.getTurn(), lastMove);
                System.out.println(BoardManage);
            }
        }
    }
}
