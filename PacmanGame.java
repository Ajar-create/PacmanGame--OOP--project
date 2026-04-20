import java.util.Scanner;

public class PacmanGame {
    public static void main(String[] args){
        //these are game objects 
         GameBoard gb=new GameBoard();
        Pacman p1=new Pacman(1,1);
       /// Pacman p1=new Pacman(1,2);
        Ghost g1=new Ghost(4,4);
        Food[] f1={
            new Food(1,2),
            new Food(1,3),
            new Food(2,1),
            new Food(3,3),
            new Food (4,3)
        };
        Scanner sc = new Scanner(System.in);
        boolean GAMEOVER=false;
        while(!GAMEOVER){
        //HERE WE ARE DISPLAYING GAMEBOARD
        for(int i=0;i<gb.getRow();i++){
            for(int j=0;j<gb.getColumn();j++){
                //THEN AFTER DISPLAYING GAMEBOARD THEN I HAVE TO CHECK THE POSITION OF P
            if(i==p1.getRow() && j==p1.getColumn()){
                System.out.print(" P ");
            }
        
        //TO CHECK THE POSITON OF GHOST
            else if(i==g1.getRow() && j==g1.getColumn()){
                System.out.print(" G ");
            }
            else{
                 boolean FoodHere = false;
                 //TO CHECK THE POSITON OF ARRAY OF FOOD 

            for (int k = 0; k < f1.length; k++) {
                if (f1[k].getrow() == i && f1[k].getcolumn() == j && !f1[k].iseaten()) {
                    System.out.print(" . ");
                    FoodHere = true;
                    break;
                }
            }
            if (FoodHere == false) {
                System.out.print(" " + gb.getBoard()[i][j] + " ");
            }
        }
    }
    System.out.println();
}
System.out.println("SCORE IS :"+p1.getscore());
System.out.println("ENTER YOUR MOVE:U=UP,D=DOWN,L=LEFT,R=RIGHT ");
char move = sc.next().charAt(0);

int newRow = p1.getRow();
int newColumn = p1.getColumn();
//movement kyliye

if (move == 'U' || move == 'u') {
    newRow--;
}
else if (move == 'D' || move == 'd') {
    newRow++;
}
else if (move == 'L' || move == 'l') {
    newColumn--;
}
else if (move == 'R' || move == 'r') {
    newColumn++;
}
//to chevk if movement position is valid 

if (gb.isvalidposition(newRow, newColumn) && !gb.iswall(newRow, newColumn)) {
    p1.setRow(newRow);
    p1.setColumn(newColumn);
}
else{
    System.out.println("CANNOT  MOVE THERE IS A WALL");
}
//food and pacman same position pr then pacman will eat food
for(int i=0;i<f1.length;i++){
    if(p1.getRow()==f1[i].getrow() && p1.getColumn()==f1[i].getcolumn() && !f1[i].iseaten()){
        f1[i].seteaten(true);
        p1.scoreincrement();
    
    }
}
    ///WIN CONDITION
    boolean allFoodiseaten=true;
    for( int i=0;i<f1.length;i++){
        if(!f1[i].iseaten()){
            allFoodiseaten=false;
            break;
        }
    }
    if(allFoodiseaten){
        System.out.println("YOU WIN!!YAYY");
        System.out.println("ALL food has been Eaten ");
        System.out.println("---------------------");
        System.out.println("YOUR FINAL SCORE IS="+p1.getscore());
        System.out.println("---------------------");
        GAMEOVER=true;
    }
//checing if ghost and pac are at same positon if they are means game is over 
if(p1.getRow()==g1.getRow() && p1.getColumn()==g1.getColumn()) {
     System.out.println("================");
    System.out.println("GAME OVER");
    System.out.println("================");
      System.out.println("---------------------");
        System.out.println("YOUR FINAL SCORE IS="+p1.getscore());
        System.out.println("---------------------");
    //game wil stop if ghost catches pacman
      GAMEOVER=true ;}
      System.out.println();
}
sc.close();
    }
}  
                
                


            

            
                
        
        
        

    
    

