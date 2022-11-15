//This file contains the Armory Factory class which returns armors objects in the game
public class ArmoryFactory extends UseableItemsFactory {
//Creates the Armory Objects
    @Override
    Item createItem(int itemId) {
        switch (itemId) {
            case 107:
                return new Armory(107, "Platinum_Shield", 150, 1, 200);
            case 108:
                return new Armory(108, "Breastplate", 350, 3, 600);
            case 109:
                return new Armory(109, "Full_Body_Armor", 1000, 8, 110);
            case 110:
                return new Armory(110, "Wizard_Shield", 1200, 10, 1500);
            case 111:
                return new Armory(111, "Guardian_Angel", 1000, 10, 1000);
        }
        return null;
    }
}
