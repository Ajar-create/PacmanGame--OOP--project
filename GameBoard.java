public class GameBoard {
    private char[][] board;
     private int rows;
    private int columns;
    public GameBoard() {
        // this.rows = 6;
       // this.columns = 5;
    board = new char[][]{
    {'#','#','#','#','#','#'},
    {'#',' ',' ',' ',' ','#'},
    {'#',' ','#',' ',' ','#'},
    {'#',' ',' ',' ',' ','#'},
    {'#',' ','#',' ',' ','#'},
    {'#','#','#','#','#','#'}
};
    rows=board.length;
    columns=board[0].length;    
        };    
    
    public char[][] getBoard() {
        return board;
    }
    public int getRow() {
        return rows;
    }
    public int getColumn() {
        return columns;
    }
    public boolean isvalidposition(int row,int column){
     return (row >=0 && row<rows && column>=0 && column<columns);
    }
    public boolean iswall(int row,int column){
        return board[row][column]== '#';  
    }
}


