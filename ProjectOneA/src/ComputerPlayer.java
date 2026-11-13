import java.util.List;
import java.util.ArrayList;

public class ComputerPlayer {
    int level = 0;
    String player;

    public void setLevel(int userLevel) {
        level = userLevel;
    }

    public void setPlayer(String inputPlayer) {
        player = inputPlayer;
    }

    public int findSmartMove(List<String> inputRawBoard, List<String> inputAvailableSpaces) {
        for (int i = 0; i < 9; i++) {

            // fill any/all 2-in-a-rows (if needing to win, will win, if needing to block, will block)
            if (i == 0 || i == 3 || i == 6) {
                if (inputRawBoard.get(i).equals(inputRawBoard.get(i + 1))) {
                    return Integer.parseInt(inputRawBoard.get(i + 2));
                }
                if (inputRawBoard.get(i).equals(inputRawBoard.get(i + 2))) {
                    return Integer.parseInt(inputRawBoard.get(i + 1));
                }
                if (inputRawBoard.get(i + 1).equals(inputRawBoard.get(i + 2))) {
                    return Integer.parseInt(inputRawBoard.get(i));
                }
            }
            if (i == 0 || i == 1 || i == 2) {
                if (inputRawBoard.get(i).equals(inputRawBoard.get(i + 3))) {
                    return Integer.parseInt(inputRawBoard.get(i + 6));
                }
                if (inputRawBoard.get(i).equals(inputRawBoard.get(i + 6))) {
                    return Integer.parseInt(inputRawBoard.get(i + 3));
                }
                if (inputRawBoard.get(i + 3).equals(inputRawBoard.get(i + 6))) {
                    return Integer.parseInt(inputRawBoard.get(i));
                }
            }
            if (i == 0) {
                if (inputRawBoard.get(0).equals(inputRawBoard.get(4))) {
                    return Integer.parseInt(inputRawBoard.get(8));
                }
                if (inputRawBoard.get(4).equals(inputRawBoard.get(8))) {
                    return Integer.parseInt(inputRawBoard.get(0));
                }
                if (inputRawBoard.get(0).equals(inputRawBoard.get(8))) {
                    return Integer.parseInt(inputRawBoard.get(4));
                }
            }
            if (i == 2) {
                if (inputRawBoard.get(2).equals(inputRawBoard.get(4))) {
                    return Integer.parseInt(inputRawBoard.get(6));
                }
                if (inputRawBoard.get(4).equals(inputRawBoard.get(6))) {
                    return Integer.parseInt(inputRawBoard.get(2));
                }
                if (inputRawBoard.get(2).equals(inputRawBoard.get(6))) {
                    return Integer.parseInt(inputRawBoard.get(4));
                }
            }

            // make move based on not having to block

            // take 9 if first move
            if (inputAvailableSpaces.size() == 9 && player.equals("x")) {
                return 9;
            }
            // take center if available and player is "o"
            if (inputRawBoard.get(4).equals("5") && player.equals("o")) {
                return 5;
            }
            // pose threat if third move
            if ((inputRawBoard.get(0).equals(player) || inputRawBoard.get(2).equals(player)
                    || inputRawBoard.get(6).equals(player) || inputRawBoard.get(8).equals(player))
                    && inputAvailableSpaces.size() == 6 && !inputRawBoard.get(4).equals("5")) {

            }

        }

        return 0;
    }

    public int makeMove(List<String> rawBoard) {
        List<String> availableSpaces = new ArrayList<>();
        System.out.println(rawBoard);
        for (int i = 0; i < 9; i++) {
            if (!(rawBoard.get(i).equals("x") || rawBoard.get(i).equals("o"))) {
                availableSpaces.add(rawBoard.get(i));
                System.out.println(availableSpaces);
            }
        }

        if (level == 1) {
            return Integer.parseInt(availableSpaces.get((int) (Math.floor(Math.random() * availableSpaces.size()))));
        } else if (level == 2) {
            if (Math.random() <= .5) {
                return Integer
                        .parseInt(availableSpaces.get((int) (Math.floor(Math.random() * availableSpaces.size()))));
            } else {
                return findSmartMove(rawBoard, availableSpaces);
            }
        }

        return 0;
    }
}
