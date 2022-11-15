//This files contains ConsumeableItemsFactory super class which represents all the consumable items
public abstract class ConsumeableItemsFactory extends ItemFactory {
    //Creates the items which are used by Hero players
    abstract Item createItem(int itemId);
}

