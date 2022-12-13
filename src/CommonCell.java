//This file contains the CommonCell class which extends the Cell class
public class CommonCell extends Cell {
    protected CommonCell(String cellString) {
        super(" ");
//        System.out.println("C");
    }

    public CommonCell() {
        NullPiece np = new NullPiece();
        this.setPiece(np);
    }

    @Override
    public void setPiece(Piece piece) {
        //super.setPiece(piece);
        this.piece = piece;
    }

    @Override
    public Piece getPiece() {
        //return super.getPiece();
        return piece;
    }

    public String toString(){
        String ret;
        if(!this.piece.getSymbol().equals("X")){
            ret = ConsoleColorsCodes.BLUE_BACKGROUND+" "+ConsoleColorsCodes.RESET;
        }
        else{
            ret = ConsoleColorsCodes.GREEN_BOLD_BRIGHT+"X"+ ConsoleColorsCodes.RESET;
        }
        return ret;
    }

//    public boolean addHeroTeam(HeroPiece heroPiece){
//        this.piece = heroPiece;
//        return true;
//    }
}
