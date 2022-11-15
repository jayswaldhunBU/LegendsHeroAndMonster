//This file contains the RPGBoard class which extends Board class
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RPGBoard extends Board {

    private Cell[][] board;

    HeroPiece heroPiece;

    public RPGBoard(int dimension) {
        super(dimension);
        createBoard(dimension);
    }


    public void createBoard(int dimension){
        int d = dimension;
        board = new Cell[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                board[i][j] = CellFactory.createCell();
            }
        }

        List<Hero> heroPlayers;
        heroPlayers = HeroTeam.getHeroPlayers();

        this.heroPiece = new HeroPiece(heroPlayers, dimension-1, dimension-1);
//        System.out.println("HeroPiece"+ heroPiece.heroPlayers.toString());
//        System.out.println("HeroPiece Symbol"+ heroPiece.getSymbol());

        board[dimension-1][dimension-1] = new Cell(heroPiece);
    }


    public Cell[][] getBoard() {
        return board;
    }


    public void viewBoard(){

        System.out.println("\n"+"Board:");
        System.out.println("'M' - Market");
        System.out.println("'I' - Inaccessible region");
        System.out.println("Rest is common/battle region");
        for(int i = 0; i<getBoardRows(); i++){
            for(int j=0; j<getBoardCols();j++)
            {
                System.out.print("| " + this.board[i][j].toString() + " |" + " ");
            }
            System.out.println(" ");
        }
    }

    public void makeMove(int i, int j){
        int currentRowIndex = this.heroPiece.getI();
        int currentColIndex = this.heroPiece.getJ();

        this.heroPiece.setI(i);
        this.heroPiece.setJ(j);


       if( board[i][j].addHeroTeam(this.heroPiece)){
           board[currentRowIndex][currentColIndex].removeHeroTeam();
           this.viewBoard();
           //System.out.println("Board[i][j] instance"+ board[i][j].getClass());

           if(board[i][j].getClass() == CommonCell.class){
               CheckBattleProbability cbp = new CheckBattleProbability();
               cbp.ChanceOfBattle();
           }
           if(board[i][j].getClass() == MarketCell.class){
                Market market= new Market();
           }
       }
       else{
           System.out.println(ConsoleColorsCodes.RED+"You are trying to access Inaccessible area!!"+ConsoleColorsCodes.RESET);
           this.heroPiece.setI(currentRowIndex);
           this.heroPiece.setJ(currentColIndex);
       }

    }

    public boolean isValidateMove(int i, int j){

        if(i>=0 && i<(this.getBoardRows()) && j>=0 && j<(this.getBoardCols())){
            return true;
        }
        else {
            //System.out.println("Incorrect move");
            return false;
        }
    }

    public int selectDirection() {

        System.out.println("1. To Move Up");
        System.out.println("2. To Move Down");
        System.out.println("3. To Move Left");
        System.out.println("4. To Move Right");
        System.out.println("5. To Quit the game");
        System.out.println("(I/i) Hero Team Information");
        //System.out.println("Please enter your moves as below:");

        int direction;
        do{
            System.out.println("Please enter your move as below:");
            Scanner s = new Scanner(System.in);
            try{
                direction = s.nextInt();
            }
            catch(InputMismatchException e){
                String input = s.next();
                if(input.equalsIgnoreCase("i"))
                {
                    System.out.println("Hero Team Information"+"\n");
                    System.out.println("|" + "\t" + "HeroId" + "\t" + "|" + "\t" + "Hero Name" + "\t" + "|" + "\t" + "Level" + "\t" + "|" + "\t" + "Mana Points" + "\t" + "|" + "\t" + "Strength" + "\t" + "|" + "\t" + "Agility" + "\t" + "|" + "\t" + "Dexterity" + "\t" + "|" + "\t" + "Gold" + "\t" + "|" + "\t" + "Experience Points" + "\t" + "|" + "\t" + "Health Points" + "\t" + "|" + "\t");
                    for(Hero h: this.heroPiece.heroPlayers){
                        System.out.println(h.toString());
                    }

                }
                else {
                    System.out.println("Invalid input!!!");
                }

                direction = 0;
            }
        }while(direction<1 || direction>5);
        return direction;
    }

    public int[] getDirectionCoordinates(int direction){
        int newRow=0;
        int newCol=0;
        int[] newTile = new int[2];
        //Move Up
        if (direction==1){
            newRow=this.heroPiece.getI()-1;
            newCol=this.heroPiece.getJ();
        }
        //Move Down
        if(direction==2){
            newRow=this.heroPiece.getI()+1;
            newCol=this.heroPiece.getJ();
        }
        //Move Left
        if(direction==3){
            newRow=this.heroPiece.getI();
            newCol=this.heroPiece.getJ()-1;
        }
        //Move Right
        if(direction==4){
            newRow=this.heroPiece.getI();
            newCol=this.heroPiece.getJ()+1;
        }

        if(direction==5){
            System.out.println(ConsoleColorsCodes.PURPLE+"Thanks for Playing"+ConsoleColorsCodes.RESET);
            System.exit(0);
        }

        newTile[0]= newRow;
        newTile[1]= newCol;

        return newTile;
    }

    public void getCoordinates(){
        int currentRow = this.heroPiece.getI();
        int currentCol = this.heroPiece.getJ();
        int newTile[];
        boolean checkValidity;
        boolean checkValidity2;
        do {
            int direction = selectDirection();
            newTile=getDirectionCoordinates(direction);
            checkValidity = isValidateMove(currentRow, currentCol);
            checkValidity2 = isValidateMove(newTile[0], newTile[1]);
        }
        while(!checkValidity || !checkValidity2);
        makeMove(newTile[0], newTile[1]);

    }
}
