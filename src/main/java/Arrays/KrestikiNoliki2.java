package Arrays;

import java.util.Scanner;

public class KrestikiNoliki2 {
    public static class TicTacToe {
        private char[][] board;
        private char currentPlayer;

        public TicTacToe() {
            board = new char[3][3];
            currentPlayer = 'X';
            initializeBoard();
        }

        public void initializeBoard() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = '-';
                }
            }
        }

        public void printBoard() {
            System.out.println("-------------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }
        }

        public boolean isBoardFull() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '-') {
                        return false;
                    }
                }
            }
            return true;
        }

        public boolean isWinner() {
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                    return true;
                }
            }

            for (int j = 0; j < 3; j++) {
                if (board[0][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer) {
                    return true;
                }
            }

            if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
                return true;
            }

            if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
                return true;
            }

            return false;
        }

        public void changePlayer() {
            if (currentPlayer == 'X') {
                currentPlayer = 'O';
            } else {
                currentPlayer = 'X';
            }
        }

        public boolean makeMove(int row, int col) {
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                board[row][col] = currentPlayer;
                return true;
            } else {
                return false;
            }
        }

        public static void main(String[] args) {
            TicTacToe game = new TicTacToe();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                game.printBoard();
                System.out.println("Player " + game.currentPlayer + ", enter your move (row and column): ");
                int row = scanner.nextInt();
                int col = scanner.nextInt();

                if (game.makeMove(row, col)) {
                    if (game.isWinner()) {
                        System.out.println("Player " + game.currentPlayer + " wins!");
                        break;
                    } else if (game.isBoardFull()) {
                        System.out.println("It's a tie!");
                        break;
                    } else {
                        game.changePlayer();
                    }
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }

            scanner.close();
        }
    }
}
