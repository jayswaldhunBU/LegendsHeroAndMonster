//This file contains the Hero class which has Character as a parent class
import java.util.ArrayList;

public abstract class Hero extends Character {

    private final int heroId;
    private int manaPoints;
    private int strength;
    private int agility;
    private int dexterity;
    private int gold;
    private int experiencePoints;
    private ArrayList<Item> inventory;
    private Weapon weapon;
    private Armory armory;

    public Hero(int heroId, String name, int level, int manaPoints, int strength, int agility, int dexterity, int gold, int experiencePoints, ArrayList<Item> inventory, Weapon weapon, Armory armory, int healthPoints) {
        super(name, level, healthPoints);
        this.heroId = heroId;
        this.manaPoints = manaPoints;
        this.strength = strength;
        this.agility = agility;
        this.dexterity = dexterity;
        this.gold = gold;
        this.experiencePoints = experiencePoints;
        this.inventory=inventory;
        this.weapon=weapon;
        this.armory=armory;
    }

    public int getGold() {
        return gold;
    }

    public int getHeroId() {
        return heroId;
    }

    public String toString() {
        String ret = "|"+"\t"+  heroId +"\t"+"\t"+"|"+"\t"+ getName() + "\t"+"|"+"\t" + getLevel() + "\t"+"|"+"\t"+ manaPoints + "\t"+"|"+"\t" + strength + "\t"+"|"+"\t" + agility + "\t"+"|"+"\t" + dexterity + "\t"+"|"+"\t" + gold + "\t"+"|"+"\t" + experiencePoints + "\t"+"|"+"\t"+ getHealthPoints()+"\t"+"|";
        return ret;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armory getArmory() {
        return armory;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmory(Armory armory) {
        this.armory = armory;
    }

    public abstract void levelUp(); //Different subclass for Hero types as they have different level up methods
}
