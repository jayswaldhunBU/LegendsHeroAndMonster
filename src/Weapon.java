//This file contains the Weapon class which is used to represent a Weapons in the game
public class Weapon extends UseableItems {

    private int causeDamage;
    private int requiredHands;
    public Weapon(int itemId, String itemName, int itemCost, int requiredLevel, int causeDamage, int requiredHands) {
        super(itemId, itemName, itemCost, requiredLevel);
        this.causeDamage=causeDamage;
        this.requiredHands=requiredHands;

    }

    public int getCauseDamage() {
        return causeDamage;
    }

    public int getRequiredHands() {
        return requiredHands;
    }

    public void setCauseDamage(int causeDamage) {
        this.causeDamage = causeDamage;
    }

    public void setRequiredHands(int requiredHands) {
        this.requiredHands = requiredHands;
    }
}
