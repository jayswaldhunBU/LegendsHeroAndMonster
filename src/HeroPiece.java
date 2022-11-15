//This file contains the HeroPiece class which represents the location of hero party on the board
import java.util.List;

public class HeroPiece extends Piece {
    List<Hero> heroPlayers;
    private int i, j;

    public List<Hero> getHeroPlayers() {
        return heroPlayers;
    }

    public void setHeroPlayers(List<Hero> heroPlayers) {
        this.heroPlayers = heroPlayers;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public HeroPiece(List<Hero> heroPlayers) {
        super("X");
        this.heroPlayers= heroPlayers;
    }

    public HeroPiece(List<Hero> heroPlayers, int i, int j) {
       this(heroPlayers);
       this.i=i;
       this.j=j;

    }
}
