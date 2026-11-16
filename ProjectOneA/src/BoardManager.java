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
                if (boardMap.get(spaceNum - 1).equals(String.valueOf(spaceNum)))
                        return true;
                return false;
        }

        public String getTurn() {
                int x = 0;
                int o = 0;
                for (int i = 0; i < 9; i++) {
                        if (boardMap.get(i).equals("x"))
                                x++;
                        if (boardMap.get(i).equals("o"))
                                o++;
                }
                if (x > o)
                        return "o";
                return "x";
        }

        public void makeMove(String player, int space) {
                boardMap.set(space - 1, player);
                System.out.println("Player " + player + " played spot " + space);
        }

        public String checkWin() {
                if (boardMap.get(0).equals(boardMap.get(1)) && boardMap.get(1).equals(boardMap.get(2))
                                && boardMap.get(0).equals("x")
                                || boardMap.get(3).equals(boardMap.get(4)) && boardMap.get(4).equals(boardMap.get(5))
                                                && boardMap.get(3).equals("x")
                                || boardMap.get(6).equals(boardMap.get(7)) && boardMap.get(7).equals(boardMap.get(8))
                                                && boardMap.get(6).equals("x")
                                || boardMap.get(0).equals(boardMap.get(3)) && boardMap.get(3).equals(boardMap.get(6))
                                                && boardMap.get(0).equals("x")
                                || boardMap.get(1).equals(boardMap.get(4)) && boardMap.get(4).equals(boardMap.get(7))
                                                && boardMap.get(1).equals("x")
                                || boardMap.get(2).equals(boardMap.get(5)) && boardMap.get(5).equals(boardMap.get(8))
                                                && boardMap.get(2).equals("x")
                                || boardMap.get(0).equals(boardMap.get(4)) && boardMap.get(4).equals(boardMap.get(8))
                                                && boardMap.get(0).equals("x")
                                || boardMap.get(2).equals(boardMap.get(4)) && boardMap.get(4).equals(boardMap.get(6))
                                                && boardMap.get(2).equals("x")) {
                        return "x";
                } else if (boardMap.get(0).equals(boardMap.get(1)) && boardMap.get(1).equals(boardMap.get(2))
                                && boardMap.get(0).equals("o")
                                || boardMap.get(3).equals(boardMap.get(4)) && boardMap.get(4).equals(boardMap.get(5))
                                                && boardMap.get(3).equals("o")
                                || boardMap.get(6).equals(boardMap.get(7)) && boardMap.get(7).equals(boardMap.get(8))
                                                && boardMap.get(6).equals("o")
                                || boardMap.get(0).equals(boardMap.get(3)) && boardMap.get(3).equals(boardMap.get(6))
                                                && boardMap.get(0).equals("o")
                                || boardMap.get(1).equals(boardMap.get(4)) && boardMap.get(4).equals(boardMap.get(7))
                                                && boardMap.get(1).equals("o")
                                || boardMap.get(2).equals(boardMap.get(5)) && boardMap.get(5).equals(boardMap.get(8))
                                                && boardMap.get(2).equals("o")
                                || boardMap.get(0).equals(boardMap.get(4)) && boardMap.get(4).equals(boardMap.get(8))
                                                && boardMap.get(0).equals("o")
                                || boardMap.get(2).equals(boardMap.get(4)) && boardMap.get(4).equals(boardMap.get(6))
                                                && boardMap.get(2).equals("o")) {
                        return "o";
                }

                if (!(boardMap.contains("1") || boardMap.contains("2") || boardMap.contains("3")
                                || boardMap.contains("4") || boardMap.contains("5") || boardMap.contains("6")
                                || boardMap.contains("7") || boardMap.contains("8") || boardMap.contains("9"))) {
                                        return "cat";
                }

                return "";
        }

        public List<String> getRawBoard() {
                return boardMap;
        }

        public String toString() {
                System.out.println();
                System.out.println();
                return boardMap.get(0) + " | " + boardMap.get(1) + " | " + boardMap.get(2) + "\n---------\n"
                                + boardMap.get(3)
                                + " | " + boardMap.get(4) + " | " + boardMap.get(5) + "\n---------\n" + boardMap.get(6)
                                + " | "
                                + boardMap.get(7) + " | " + boardMap.get(8);
        }
}
