import java.util.*;

public class NQueen {

    static char[][] board;
    static int n;

 
    public static boolean isSafe(int row, int col) {

      
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }

       
        for (int i = row - 1, j = col - 1; 
             i >= 0 && j >= 0; 
             i--, j--) {

            if (board[i][j] == 'Q')
                return false;
        }

      
        for (int i = row - 1, j = col + 1; 
             i >= 0 && j < n; 
             i--, j++) {

            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    // Backtracking function
    public static void solve(int row) {

      
        if (row == n) {
            printBoard();
            System.out.println();
            return;
        }

        // Try placing queen in every column of this row
        for (int col = 0; col < n; col++) {

            if (isSafe(row, col)) {

                // Place queen
                board[row][col] = 'Q';

                // Recurse to next row
                solve(row + 1);

                // BACKTRACK (remove queen)
                board[row][col] = '.';
            }
        }
    }

    public static void printBoard() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        board = new char[n][n];

      
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solve(0);
    }
}
