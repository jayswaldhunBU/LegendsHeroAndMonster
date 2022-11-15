//This file contains the Item class which is a super class for all the types of items used throughout in the game
public class Item {
    private int itemId;
    private String itemName;
    private int itemCost;
    private int requiredLevel;

    public Item(int itemId,String itemName, int itemCost, int requiredLevel){
        this.itemId=itemId;
        this.itemName=itemName;
        this.itemCost=itemCost;
        this.requiredLevel=requiredLevel;
    }

    public Item() {

    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemCost() {
        return itemCost;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public String toString(){
        String ret = "|"+"\t"+  itemId +"\t"+"\t"+"|"+"\t"+ itemName+ "\t"+"|"+"\t" + itemCost+ "\t"+"|"+"\t"+ requiredLevel + "\t"+"|";
        return ret;
    }
}


