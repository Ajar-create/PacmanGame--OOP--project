public class Pacman{
    private int row;
    private int column;
    private int score;
   
    public Pacman(int row, int column) {
        this.row = row;
        this.column = column;
        this.score=0;
    }
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getColumn() {
        return column;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    public int getscore(){
        return score;
    }
    public void scoreincrement(){
        score =score+20;
    }









}