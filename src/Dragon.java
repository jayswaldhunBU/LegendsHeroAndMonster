//This file contains the Dragon class which is the parent class of Monster class
public class Dragon extends Monster {

    protected Dragon(int monsterId, String name, int level, int healthPoints, int damage, int defense, int dodgeChance) {
        super(monsterId, name, level, healthPoints, damage, defense,dodgeChance);
    }

    //
    @Override
    public void levelUp() {

    }
}
