public class TicTacToe
{
    private String[][] board;
    
    public TicTacToe() {
        board = new String[3][3];
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = "-";
            }
        }
    }
    
    public String[][] getBoard() {
        return board;
    }
}