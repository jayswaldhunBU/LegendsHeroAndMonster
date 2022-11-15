//This file contains the CellFactory class which is used to generate different types of cells in the game
import java.util.Random;
public class CellFactory {
     private static int bound =100;

    public static Cell createCell() {

        int randomInt = new Random().nextInt(bound);
        //50% cells could be Common area
        if(randomInt<50){
            return new CommonCell();
        }
        //30% cells could be Market area
        else if(randomInt<80){
            return new MarketCell();
        }
        //20% cells could be Inaccessible area
        else {
            return new InaccessibleCell();
        }

    }
}
