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
            System.out.println("Checking for wins: i = " + i);

            // win any available 2-in-a-rows
            if (i == 0 || i == 3 || i == 6) {
                System.out.println("Checking horizontals... i = " + i);
                if (inputRawBoard.get(i).equals(player) && inputRawBoard.get(i).equals(inputRawBoard.get(i + 1))) {
                    if (inputAvailableSpaces.contains(String.valueOf(i + 2 + 1))) {
                        return Integer.parseInt(inputRawBoard.get(i + 2));
                    }
                }
                if (inputRawBoard.get(i).equals(player) && inputRawBoard.get(i).equals(inputRawBoard.get(i + 2))) {
                    if (inputAvailableSpaces.contains(String.valueOf(i + 1 + 1))) {
                        return Integer.parseInt(inputRawBoard.get(i + 1));
                    }
                }
                if (inputRawBoard.get(i + 1).equals(player)
                        && inputRawBoard.get(i + 1).equals(inputRawBoard.get(i + 2))) {
                    if (inputAvailableSpaces.contains(String.valueOf(i + 1))) {
                        return Integer.parseInt(inputRawBoard.get(i));
                    }
                }
            }
            if (i == 0 || i == 1 || i == 2) {
                System.out.println("Checking verticals... i = " + i);
                if (inputRawBoard.get(i).equals(player) && inputRawBoard.get(i).equals(inputRawBoard.get(i + 3))) {
                    if (inputAvailableSpaces.contains(String.valueOf(i + 6 + 1))) {
                        return Integer.parseInt(inputRawBoard.get(i + 6));
                    }
                }
                if (inputRawBoard.get(i).equals(player) && inputRawBoard.get(i).equals(inputRawBoard.get(i + 6))) {
                    if (inputAvailableSpaces.contains(String.valueOf(i + 3 + 1))) {
                        return Integer.parseInt(inputRawBoard.get(i + 3));
                    }
                }
                if (inputRawBoard.get(i + 3).equals(player)
                        && inputRawBoard.get(i + 3).equals(inputRawBoard.get(i + 6))) {
                    if (inputAvailableSpaces.contains(String.valueOf(i + 1))) {
                        return Integer.parseInt(inputRawBoard.get(i));
                    }
                }
            }
            if (i == 0) {
                System.out.println("Checking diagonals... i = " + i);
                if (inputRawBoard.get(0).equals(player) && inputRawBoard.get(0).equals(inputRawBoard.get(4))) {
                    if (inputAvailableSpaces.contains(String.valueOf(9))) {
                        return Integer.parseInt(inputRawBoard.get(8));
                    }
                }
                if (inputRawBoard.get(4).equals(player) && inputRawBoard.get(4).equals(inputRawBoard.get(8))) {
                    if (inputAvailableSpaces.contains(String.valueOf(1))) {
                        return Integer.parseInt(inputRawBoard.get(0));
                    }
                }
                if (inputRawBoard.get(0).equals(player) && inputRawBoard.get(0).equals(inputRawBoard.get(8))) {
                    if (inputAvailableSpaces.contains(String.valueOf(5))) {
                        return Integer.parseInt(inputRawBoard.get(4));
                    }
                }
            }
            if (i == 2) {
                System.out.println("Checking diagonals... i = " + i);
                if (inputRawBoard.get(2).equals(player) && inputRawBoard.get(2).equals(inputRawBoard.get(4))) {
                    if (inputAvailableSpaces.contains(String.valueOf(7))) {
                        return Integer.parseInt(inputRawBoard.get(6));
                    }
                }
                if (inputRawBoard.get(4).equals(player) && inputRawBoard.get(4).equals(inputRawBoard.get(6))) {
                    if (inputAvailableSpaces.contains(String.valueOf(3))) {
                        return Integer.parseInt(inputRawBoard.get(2));
                    }
                }
                if (inputRawBoard.get(2).equals(player) && inputRawBoard.get(2).equals(inputRawBoard.get(6))) {
                    if (inputAvailableSpaces.contains(String.valueOf(4))) {
                        return Integer.parseInt(inputRawBoard.get(4));
                    }
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            System.out.println("Checking for blocks: i = " + i);

            // win any available 2-in-a-rows
            if (i == 0 || i == 3 || i == 6) {
                System.out.println("Checking horizontals... i = " + i);
                if (!inputRawBoard.get(i).equals(player) && inputRawBoard.get(i).equals(inputRawBoard.get(i + 1))) {
                    if (inputAvailableSpaces.contains(String.valueOf(i + 2 + 1))) {
                        return Integer.parseInt(inputRawBoard.get(i + 2));
                    }
                }
                if (!inputRawBoard.get(i).equals(player) && inputRawBoard.get(i).equals(inputRawBoard.get(i + 2))) {
                    if (inputAvailableSpaces.contains(String.valueOf(i + 1 + 1))) {
                        return Integer.parseInt(inputRawBoard.get(i + 1));
                    }
                }
                if (!inputRawBoard.get(i + 1).equals(player)
                        && inputRawBoard.get(i + 1).equals(inputRawBoard.get(i + 2))) {
                    if (inputAvailableSpaces.contains(String.valueOf(i + 1))) {
                        return Integer.parseInt(inputRawBoard.get(i));
                    }
                }
            }
            if (i == 0 || i == 1 || i == 2) {
                System.out.println("Checking verticals... i = " + i);
                if (!inputRawBoard.get(i).equals(player) && inputRawBoard.get(i).equals(inputRawBoard.get(i + 3))) {
                    if (inputAvailableSpaces.contains(String.valueOf(i + 6 + 1))) {
                        return Integer.parseInt(inputRawBoard.get(i + 6));
                    }
                }
                if (!inputRawBoard.get(i).equals(player) && inputRawBoard.get(i).equals(inputRawBoard.get(i + 6))) {
                    if (inputAvailableSpaces.contains(String.valueOf(i + 3 + 1))) {
                        return Integer.parseInt(inputRawBoard.get(i + 3));
                    }
                }
                if (!inputRawBoard.get(i + 3).equals(player)
                        && inputRawBoard.get(i + 3).equals(inputRawBoard.get(i + 6))) {
                    if (inputAvailableSpaces.contains(String.valueOf(i + 1))) {
                        return Integer.parseInt(inputRawBoard.get(i));
                    }
                }
            }
            if (i == 0) {
                System.out.println("Checking diagonals... i = " + i);
                if (!inputRawBoard.get(0).equals(player) && inputRawBoard.get(0).equals(inputRawBoard.get(4))) {
                    if (inputAvailableSpaces.contains(String.valueOf(9))) {
                        return Integer.parseInt(inputRawBoard.get(8));
                    }
                }
                if (!inputRawBoard.get(4).equals(player) && inputRawBoard.get(4).equals(inputRawBoard.get(8))) {
                    if (inputAvailableSpaces.contains(String.valueOf(1))) {
                        return Integer.parseInt(inputRawBoard.get(0));
                    }
                }
                if (!inputRawBoard.get(0).equals(player) && inputRawBoard.get(0).equals(inputRawBoard.get(8))) {
                    if (inputAvailableSpaces.contains(String.valueOf(5))) {
                        return Integer.parseInt(inputRawBoard.get(4));
                    }
                }
            }
            if (i == 2) {
                System.out.println("Checking diagonals... i = " + i);
                if (!inputRawBoard.get(2).equals(player) && inputRawBoard.get(2).equals(inputRawBoard.get(4))) {
                    if (inputAvailableSpaces.contains(String.valueOf(7))) {
                        return Integer.parseInt(inputRawBoard.get(6));
                    }
                }
                if (!inputRawBoard.get(4).equals(player) && inputRawBoard.get(4).equals(inputRawBoard.get(6))) {
                    if (inputAvailableSpaces.contains(String.valueOf(3))) {
                        return Integer.parseInt(inputRawBoard.get(2));
                    }
                }
                if (!inputRawBoard.get(2).equals(player) && inputRawBoard.get(2).equals(inputRawBoard.get(6))) {
                    if (inputAvailableSpaces.contains(String.valueOf(4))) {
                        return Integer.parseInt(inputRawBoard.get(4));
                    }
                }
            }
        }

        ///////////////////////////////////
        // make move based on not having to block
        ///////////////////////////////////

        // take 9 if first move
        if (inputAvailableSpaces.size() == 9 && player.equals("x")) {
            return 9;
        }
        // take center if available and player is "o"
        if (inputRawBoard.get(4).equals("5") && player.equals("o")) {
            return 5;
        }
        // if second move and center is taken
        if (!inputAvailableSpaces.contains("5") && inputAvailableSpaces.size() == 8) {
            return 9;
        }
        // pose threat if third move and has corner
        if ((inputRawBoard.get(0).equals(player) || inputRawBoard.get(2).equals(player)
                || inputRawBoard.get(6).equals(player) || inputRawBoard.get(8).equals(player))
                && inputAvailableSpaces.size() == 7 && !inputRawBoard.get(4).equals("5")) {
            if (inputAvailableSpaces.contains("3")
                    && (inputRawBoard.get(0).equals(player) || inputRawBoard.get(8).equals(player))) {
                return 3;
            }
            if (inputAvailableSpaces.contains("1")
                    && (inputRawBoard.get(2).equals(player) || inputRawBoard.get(6).equals(player))) {
                return 1;
            }
        }
        // if center is taken and don't have a corner, claim one and pose threat
        if (!inputAvailableSpaces.contains("5") && inputAvailableSpaces.contains("1")
                && inputAvailableSpaces.contains("3") && inputAvailableSpaces.contains("7")
                && inputAvailableSpaces.contains("9")) {
            if (inputRawBoard.get(1).equals(player) || inputRawBoard.get(3).equals(player)) {
                return 1;
            }
            if (inputRawBoard.get(5).equals(player) || inputRawBoard.get(7).equals(player)) {
                return 9;
            }
        }
        // i think at this point all cases are covered, but if not pick random
        System.out.println("Computer is making a random selection");
        return Integer.parseInt(
                inputAvailableSpaces.get((int) (Math.floor(Math.random() * inputAvailableSpaces.size()))));

    }

    public int makeMove(List<String> rawBoard) {
        List<String> availableSpaces = new ArrayList<>();
        System.out.println("rawBoard: ");
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
                System.out.println("computer picking random cuz it's lazy");
                return Integer
                        .parseInt(availableSpaces.get((int) (Math.floor(Math.random() * availableSpaces.size()))));
            } else {
                System.out.println("computer being smart cuz it wants to win");
                return findSmartMove(rawBoard, availableSpaces);
            }
        } else if (level == 3) {
            return findSmartMove(rawBoard, availableSpaces);
        }

        return 0;
    }
}
