//This file contains the SpellFactory class which has abstract method to create items
public abstract class SpellFactory extends ConsumeableItemsFactory {
    abstract Item createItem(int itemId);
}

