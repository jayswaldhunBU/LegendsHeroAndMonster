//This file contains the Piece class which represents the movable entity on the cells of board
public class Piece {
    private String symbol;

    protected Piece(String symbol){
        this.symbol=symbol;
    }


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}

