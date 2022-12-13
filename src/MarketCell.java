//This file contains the MarketCell class which extends the Cell class
public class MarketCell extends Cell {
//    Piece piece;

    protected MarketCell(String cellString) {
        super("M");

//        System.out.println("M");
    }

    public MarketCell() {
        NullPiece np = new NullPiece();
        this.setPiece(np);
    }

    @Override
    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    @Override
    public Piece getPiece() {
        return piece;
    }

    public String toString(){
        String ret;
        if(!this.piece.getSymbol().equals("X")){
            ret = ConsoleColorsCodes.PURPLE_BACKGROUND+"M"+ConsoleColorsCodes.RESET;
        }
        else{
            ret = ConsoleColorsCodes.GREEN_BOLD_BRIGHT+"X"+ ConsoleColorsCodes.RESET;
        }
        return ret;
    }

//    public boolean addHeroTeam(HeroPiece heroPiece){
//        return true;
//    }

}
