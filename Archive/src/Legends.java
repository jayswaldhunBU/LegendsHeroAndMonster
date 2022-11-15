//This file contains the Legends class which has player, hero team and board.
import java.util.Scanner;

public class Legends {
    public static int numberOfHeros;

    public void playerDetails(){
        System.out.println("Please enter the name of player:");
        Scanner s = new Scanner(System.in);
        String playerName = s.nextLine();
        do{
            System.out.println(playerName + " please choose the number of Heroes in your world (1-3):");
            numberOfHeros = s.nextInt();

        }
        while (numberOfHeros < 1 || numberOfHeros > 3);
        HeroTeam heroTeam = new HeroTeam();
        RPGBoard board = new RPGBoard(8);

        board.viewBoard();
        while (HeroTeam.isHeroAlive())
        {
            board.getCoordinates();
            board.viewBoard();
        }

    }
}
