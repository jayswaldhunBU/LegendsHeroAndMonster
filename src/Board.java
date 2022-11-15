//This file contains the Board class which is used to represent a board platform in the game
public class Board {
    private int boardRows;
    private int boardCols;
    //Constructor for different dimension of board
    public Board(int boardRows, int boardCols){
        this.boardRows=boardRows;
        this.boardCols=boardCols;
    }
    //Constructor for the same dimension of the board
    public Board(int dimension){
        this(dimension, dimension);
    }

    //Return the Row size of the board
    public int getBoardRows() {
        return boardRows;
    }
    //Returns the Col size of the board
    public int getBoardCols() {
        return boardCols;
    }


}
