public class ChessBoard
{
    public static void main(String[] args)
    {
        //Create an 8x8 2D String array called chess.
        String[][] chess = new String[8][8];
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                chess[i][j] = "-";
            }
        }
        for (int i = 1; i < 7; i+= 5) {
            for (int j = 0; j < chess[0].length; j++) {
                chess[i][j] = "Pawn";
            }
        }
        
        for (int i = 0; i < chess[0].length; i+=7) {
            chess[i][0] = "Rook";
            chess[i][1] = "Knight";
            chess[i][2] = "Bishop";
            chess[i][3] = "Queen";
            chess[i][4] = "King";
            chess[i][5] = "Bishop";
            chess[i][6] = "Knight";
            chess[i][7] = "Rook";
        }
        
        //Use this method to print the chess board onto the console
        print(chess);
        

    }
    
    //Do not make alterations to this method!
    public static void print(String[][] array)
    {
        for(String[] row: array)
        {
            for(String thing: row)
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }
}