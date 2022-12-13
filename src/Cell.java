//This file contains the Cell class which is used to represent a cell of the board in the game
public class Cell{

    private String cellString;
    Piece piece;
    //Initialize the null piece in the cells
    protected Cell(){
        this.piece= new NullPiece();
        cellString=" ";
    }
    protected Cell(String cellString){

        this.cellString=cellString;
    }
    //Return the piece on the cell
    public Piece getPiece() {
        return piece;
    }
    //Set the piece on the cell
    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    //Set the hero piece on the cell
    protected Cell(HeroPiece heroPiece){
        this.piece = heroPiece;
    }


    public String getCellString() {
        return cellString;
    }

    public String toString(){
        String ret = this.piece.getSymbol();
        return ret;
    }
    //Assign the heroTeam to the piece
    public boolean addHeroTeam(HeroPiece heroPiece){
        this.piece = heroPiece;
        return true;
    }
    //Removes the hero team from the piece
    public void removeHeroTeam(){
        this.piece= new NullPiece();

    }



}

