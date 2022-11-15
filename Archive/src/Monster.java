//This file contains the Monster class which has Character as a parent class
public abstract class Monster extends Character {

    private final int monsterId;
    private int level;
    private int damage;
    private int defense;
    private int dodgeChance;

    protected Monster(int monsterId, String name, int level, int healthPoints, int damage, int defense, int dodgeChance) {
        super(name, level, healthPoints);
        this.monsterId = monsterId;
        this.damage=damage;
        this.defense=defense;
        this.dodgeChance=dodgeChance;
    }

    public int getMonsterId() {
        return monsterId;
    }


    public void setLevel(int level) {
        this.level = level;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDodgeChance() {
        return dodgeChance;
    }

    public void setDodgeChance(int dodgeChance) {
        this.dodgeChance = dodgeChance;
    }

    public String toString() {
        String ret = "|"+"\t"+  monsterId +"\t"+"\t"+"|"+"\t"+ getName() + "\t"+"|"+"\t" + getLevel() + "\t"+"|"+"\t"+ getHealthPoints() + "\t"+"|"+"\t" + damage + "\t"+"|"+"\t" + defense + "\t"+"|"+"\t" + dodgeChance + "\t"+"|";
        return ret;
    }

    public abstract void levelUp();
}

