//This file contains the Market class which checks for the trading with the player

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Market {

    List<Hero> heroPlayers = HeroTeam.getHeroPlayers();

    Scanner s = new Scanner(System.in);
    String str1;
    Market(){
    checkTrading();
    }

    public void checkTrading(){
        System.out.println("As you are in Market, would you like to trade? ");
        System.out.println("1. Sell the item");
        System.out.println("2. Buy the item");
        System.out.println("3. To do nothing");
        int choice = s.nextInt();

        switch (choice){
            case 1:
                do {
                    MarketSelling selling = new MarketSelling();
                    selling.sellItem();
                    System.out.println("Do you wanna sell more things?(Y/N)");
                    Scanner s = new Scanner(System.in);
                    str1=s.nextLine();
                }while ((str1.equals("Y") || str1.equals("y")));
                break;
            case 2:
                do {
                    MarketBuying buying = new MarketBuying();
                    buying.buyItem();
                    System.out.println("Do you wanna buy more things?(Y/N)");
                    Scanner s = new Scanner(System.in);
                    str1=s.nextLine();
                }while ((str1.equals("Y") || str1.equals("y")));

                break;
            default:
                //back to board
        }

    }

}
