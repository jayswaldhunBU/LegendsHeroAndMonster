//This file contains the Armory class which is used to represent a armors in the game
public class Armory extends UseableItems {
    private int damageReduction;
    public Armory(int itemId, String itemName, int itemCost, int requiredLevel, int damageReduction) {
        super(itemId, itemName, itemCost, requiredLevel);
        this.damageReduction=damageReduction;
    }

    //Return the damage reduction value
    public int getDamageReduction() {
        return damageReduction;
    }

    //Set the damage reduction value
    public void setDamageReduction(int damageReduction) {
        this.damageReduction = damageReduction;
    }
}
