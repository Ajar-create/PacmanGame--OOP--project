public class Food {
    private int row;
    private int column;
    private boolean eaten;
    public Food(int row,int column){
        this.row=row;
        this.column=column;
        this.eaten=false; 
    }
    
    public int getrow(){
        return row;

    }
    public int getcolumn(){
        return column;

    }
    public boolean iseaten(){ 
        return eaten;}
        
        public void seteaten(boolean eaten){
            this.eaten=eaten;
        }



    }


