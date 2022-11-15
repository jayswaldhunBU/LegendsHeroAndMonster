//This files contains ConsumeableItems super class which represents all the consumable items
public class ConsumeableItems extends Item {
    public ConsumeableItems(int itemId, String itemName, int itemCost, int requiredLevel) {
        super(itemId, itemName, itemCost, requiredLevel);
    }

    public ConsumeableItems() {
        super();
    }
}
