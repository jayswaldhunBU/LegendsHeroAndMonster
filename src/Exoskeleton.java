//This file contains the Exoskeleton class which is the sub class of Monster class
public class Exoskeleton extends Monster {

    protected Exoskeleton(int monsterId, String name, int level, int healthPoints, int damage, int defense, int dodgeChance) {
        super(monsterId, name, level, healthPoints, damage, defense,dodgeChance);
    }

    @Override
    public void levelUp() {

    }
}
