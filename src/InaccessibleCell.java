//This file contains the InaccessibleCell class which extends the Cell class
public class InaccessibleCell extends Cell {
    protected InaccessibleCell(String cellSting) {
        super("⊗");
//        System.out.println("I");

    }

    public InaccessibleCell() {
//        NullPiece np = new NullPiece();
//        this.setPiece(np);

    }

    public String toString(){
        String ret = ConsoleColorsCodes.RED_BACKGROUND+"I"+ConsoleColorsCodes.RESET;
        return ret;
    }

    public boolean addHeroTeam(HeroPiece heroPiece){
        return false;
    }
}
