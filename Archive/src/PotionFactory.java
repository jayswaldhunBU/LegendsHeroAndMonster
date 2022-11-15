//This file contains the PotionFactory class which creates potion
public class PotionFactory extends ConsumeableItemsFactory {

    @Override
    Item createItem(int itemId) {
        switch (itemId) {
            case 112:
                return new Potion(112, "Healing_Potion", 250, 1, 100, "Health");
            case 113:
                return new Potion(113, "Strength_Potion", 200, 1, 75, "Strength");
            case 114:
                return new Potion(114, "Magic_Potion", 350, 2, 100, "Mana");
            case 115:
                return new Potion(115, "Luck_Elixir", 500, 4, 65, "Agility");
            case 116:
                return new Potion(116, "Mermaid_Tears", 850, 5, 100, "allFour");
            case 117:
                return new Potion(117, "Ambrosia", 1000, 8, 150, "All");
        }
        return null;
    }
}
