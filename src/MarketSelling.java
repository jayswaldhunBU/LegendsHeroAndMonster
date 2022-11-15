//This file contains the MarketSelling class where Hero sells the items
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MarketSelling {

    MarketSelling() {
        //sellItem();
    }

    List<Hero> heroPlayers = HeroTeam.getHeroPlayers();
    Scanner s = new Scanner(System.in);

    public void sellItem() {
        boolean cbv;
        int hID;
        do {
            System.out.println("Enter the heroId of hero who wants to sell item in market");
            try
            {
                hID = s.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid input!!");
                hID=0;
            }

        }while(hID<101 || hID>118);
        printInventory(hID);
        System.out.println("Enter the ID of the item that is up for selling:");
        int itemId = s.nextInt();
        cbv = checkItemSellingValidity(hID, itemId);
        if (cbv) {
            for (Hero h : heroPlayers) {
                if (h.getHeroId() == hID) {
                    ArrayList<Item> item = h.getInventory();
                    ArrayList<Item> soldItem = new ArrayList<>();
                    for (Item i : item) {
                        if (i.getItemId() == itemId) {
                            int price = i.getItemCost() / 2;
                            int newGold = h.getGold() + price;
                            soldItem.add(i);
                            //h.setInventory(item);
                            h.setGold(newGold);
                            System.out.println(h.getName()+" sold "+i.getItemName()+ " for "+price+" Gold.");
                        }

                    }
                    for(Item i: soldItem){
                        item.remove(i);
                        h.setInventory(item);

                    }

                }
            }

        }

    }

    public boolean checkItemSellingValidity(int hID, int itemId) {
        for (Hero h : heroPlayers) {
            if (h.getHeroId() == hID) {
                List<Item> item = h.getInventory();
                for (Item i : item) {
                    if (i.getItemId() == itemId)
                    {
                        return true;
                    }
                    else
                    {
                        System.out.println(ConsoleColorsCodes.RED + "Could not find item in Inventory" + ConsoleColorsCodes.RESET);
                        return false;
                    }

                }
            }
        }
        return false;
    }

    public void printInventory(int hID) {
        for (Hero h : heroPlayers) {
            if (h.getHeroId() == hID) {
                List<Item> item = h.getInventory();
                for (Item i : item) {
                    System.out.println("Inventory items " + i.toString());
                }
            }
        }
    }
}