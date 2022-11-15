//This file contains the MarketBuying class where HEro buys the items
import java.util.List;
import java.util.Scanner;

public class MarketBuying {
    MarketBuying() {
        //buyItem();
    }

    List<Hero> heroPlayers = HeroTeam.getHeroPlayers();
    Scanner s = new Scanner(System.in);

    public void buyItem() {
        boolean cbv;
        System.out.println("Enter the heroId of hero who wants to buy item in market");
        int hID = s.nextInt();
        cbv = checkBuyingValidity(hID);
        if (cbv) {
            System.out.println("1. Weapons");
            System.out.println("2. Armor");
            System.out.println("3. Potions");
            System.out.println("4. Spells");

            int itemType;
            do {
                System.out.println("Enter the number to print the menu of respective item type to buy:");
                itemType = s.nextInt();
            } while (itemType < 1 || itemType > 4);
            displayItemMenuToBuy(itemType, hID);

        }


    }

    public boolean checkBuyingValidity(int hID) {
        for (Hero h : heroPlayers) {
            if (hID == h.getHeroId() && h.getGold() != 0) {
                return true;
            }
        }
        return false;
    }

    public void displayItemMenuToBuy(int itemType, int hID) {
        int heroID = hID;
        //Weapons
        if (itemType == 1) {
            WeaponryData weaponryData = new WeaponryData();
            weaponryData.displayData();

            System.out.println("Enter the Item Id of the Weapon to buy:");
            int itemId = s.nextInt();
            buyWeapon(itemId, heroID);
        }
        //Armor
        if (itemType == 2) {
            ArmoryData armoryData = new ArmoryData();
            armoryData.displayData();

            System.out.println("Enter the Item Id of the Armory to buy:");
            int itemId = s.nextInt();
            buyArmory(itemId, heroID);
        }
        //Potions
        if (itemType == 3) {
            PotionsData potionsData = new PotionsData();
            potionsData.displayData();

            System.out.println("Enter the Item Id of the Potion to buy:");
            int itemId = s.nextInt();
            buyPotion(itemId, heroID);
        }

        if (itemType == 4) {
            SpellsData.LightningSpellsData lsp = new SpellsData.LightningSpellsData();
            lsp.displayData();

            SpellsData.FireSpellsData fsp = new SpellsData.FireSpellsData();
            fsp.displayData();

            SpellsData.IceSpellsData isp = new SpellsData.IceSpellsData();
            isp.displayData();

            System.out.println("Enter the Item Id of the Spell to buy:");
            int itemId = s.nextInt();
            buySpell(itemId, heroID);
        }

    }

    public void buyWeapon(int itemId, int hID) {
        do {
            if (itemId >= 101 && itemId <= 106) {
                WeaponFactory weaponFactory = new WeaponFactory();
                Item w = weaponFactory.createItem(itemId);
                int requiredLevel = w.getRequiredLevel();
                for (Hero h : heroPlayers) {
                    if (h.getHeroId() == hID) {
                        if (h.getLevel() >= requiredLevel) {
                            int moneyLeft = h.getGold() - w.getItemCost();
                            h.setGold(moneyLeft);
                            List<Item> item = h.getInventory();
                            item.add(w);
                            System.out.println("Gold " + h.getGold());
                            for (Item i : item) {
                                System.out.println("Inventory items " + i.toString());
                            }
                        } else {
                            System.out.println("Insufficient level requirement!!! ");
                        }
                    }
                }
            }
        } while (itemId < 101 && itemId > 106);

    }

    public void buyArmory(int itemId, int hID) {
        do {
            if (itemId >= 107 && itemId <= 111) {
                ArmoryFactory armoryFactory = new ArmoryFactory();
                Item a = armoryFactory.createItem(itemId);
                int requiredLevel = a.getRequiredLevel();
                for (Hero h : heroPlayers) {
                    if (h.getHeroId() == hID) {
                        if (h.getLevel() >= requiredLevel) {
                            int moneyLeft = h.getGold() - a.getItemCost();
                            List<Item> item1 = h.getInventory();
                            h.setGold(moneyLeft);
                            item1.add(a);
                            System.out.println("Gold " + h.getGold());
                            for (Item i : item1) {
                                System.out.println("Inventory items " + i.toString());
                            }
                        } else {
                            System.out.println("Insufficient level requirement!!! ");
                        }
                    }
                }
            }
        } while (itemId < 107 && itemId > 111);
    }

    public void buyPotion(int itemId, int hID) {
        do {
            if (itemId >= 112 && itemId <= 117) {
                PotionFactory potionFactory = new PotionFactory();
                Item p = potionFactory.createItem(itemId);
                int requiredLevel = p.getRequiredLevel();
                for (Hero h : heroPlayers) {
                    if (h.getHeroId() == hID) {
                        if (h.getLevel() >= requiredLevel) {
                            int moneyLeft = h.getGold() - p.getItemCost();
                            List<Item> item1 = h.getInventory();
                            h.setGold(moneyLeft);
                            item1.add(p);
                            System.out.println("Gold " + h.getGold());
                            for (Item i : item1) {
                                System.out.println("Inventory items " + i.toString());
                            }

                        } else {
                            System.out.println("Insufficient level requirement!!! ");
                        }
                    }
                }
            }
        } while (itemId < 112 && itemId > 117);
    }

    public void buySpell(int itemId, int hID) {
        SpellFactory spellFactory = null;
        do {
            if (itemId >= 118 && itemId <= 121) {
                spellFactory = new LightningSpellFactory();
            } else if (itemId >= 122 && itemId <= 126) {
                spellFactory = new FireSpellFactory();
            } else {
                spellFactory = new IceSpellFactory();
            }

            Item s = spellFactory.createItem(itemId);
            int requiredLevel = s.getRequiredLevel();
            for (Hero h : heroPlayers) {
                if (h.getHeroId() == hID) {
                    if (h.getLevel() >= requiredLevel) {
                        int moneyLeft = h.getGold() - s.getItemCost();
                        List<Item> item = h.getInventory();
                        h.setGold(moneyLeft);
                        item.add(s);
                        System.out.println("Gold " + h.getGold());
                        for (Item i : item) {
                            System.out.println("Inventory items " + i.toString());
                        }

                    } else
                    {
                        System.out.println("Insufficient level requirement!!! ");
                    }
                }

            }

        }while (itemId < 118 && itemId > 130) ;
    }
}