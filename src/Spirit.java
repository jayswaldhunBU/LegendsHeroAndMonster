//This file contains the Spirit class which is the parent class of Monster class
public class Spirit extends Monster {

    protected Spirit(int monsterId, String name, int level, int healthPoints, int damage, int defense, int dodgeChance) {
        super(monsterId, name, level, healthPoints, damage, defense,dodgeChance);
    }

    @Override
    public void levelUp() {

    }
}
