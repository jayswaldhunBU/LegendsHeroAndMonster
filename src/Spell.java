//This file contains the Spell class which is the subclass of ConsumeableItems class
public abstract class Spell extends ConsumeableItems {
    private int manaCost;
    private int damage;
    public Spell(int itemId, String itemName, int itemCost, int requiredLevel, int damage, int manaCost) {
        super(itemId, itemName, itemCost, requiredLevel);
        this.manaCost=manaCost;
        this.damage=damage;
    }

    public Spell() {
        super();
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public abstract int applyEffect(Hero hero, Monster target, Spell spell);
}
