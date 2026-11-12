import java.util.ArrayList;
import java.util.List;

public class BoardManager {
    private List<String> boardMap = new ArrayList<>();

    public BoardManager() {
        for (int i = 1; i < 10; i++) {
            boardMap.add(String.valueOf(i));
        }
    }

    public boolean checkValidMove(int spaceNum) {
        if (boardMap.get(spaceNum - 1).equals(String.valueOf(spaceNum))) return true;
        return false;
    }

    public String getTurn() {
        int x = 0;
        int o = 0;
        for (int i = 0; i < 9; i++) {
            if (boardMap.get(i).equals("x")) x++;
            if (boardMap.get(i).equals("o")) o++;
        }
        if (x > o) return "o";
        return "x";
    }

    public void makeMove(String player, int space) {
        boardMap.set(space - 1, player);
    }

    public String checkWin() {
// NEXT STEP: MAKE LOGIC
        return "";
    }

    public String toString() {
        System.out.println();
        System.out.println();
        return boardMap.get(0) + " | " + boardMap.get(1) + " | " + boardMap.get(2) + "\n---------\n" + boardMap.get(3)
                + " | " + boardMap.get(4) + " | " + boardMap.get(5) + "\n---------\n" + boardMap.get(6) + " | "
                + boardMap.get(7) + " | " + boardMap.get(8);
    }
}
