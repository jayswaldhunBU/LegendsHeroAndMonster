//This file contains the Warrior class which is the subclass of Hero class
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Warrior extends Hero {


    public Warrior(int heroId, String name, int level, int manaPoints, int strength, int agility, int dexterity, int gold, int experiencePoints, ArrayList<Item> inventory, Weapon weapon, Armory armory, int healthPoints) {
        super(heroId, name, level, manaPoints, strength, agility, dexterity, gold, experiencePoints, inventory, weapon, armory, healthPoints);
    }

    @Override
    public void levelUp() {
        int HP=getHealthPoints();
        int MP=getManaPoints();
        setHealthPoints(HP*2);
        setManaPoints(MP*2);
        int newExpPoints = getExperiencePoints() + (MonsterTeam.getMonsterPlayers().size()) * 2;
        setExperiencePoints(newExpPoints);
        List<Integer> heroLevelList = HeroTeam.getHeroLevelList();
        int maxHeroLevel = Collections.max(heroLevelList);
        int goldGain = getGold()+(maxHeroLevel * 100);
        setGold(goldGain);

        if(newExpPoints>=(getLevel()*10)){
            int newStrength = (int) (getStrength()*1.10);
            int newAgility = (int) (getAgility()*1.10);
            int newDexterity = (int) (getDexterity()*1.05);
            setStrength(newStrength);
            setAgility(newAgility);
            setDexterity(newDexterity);
        }

    }
}
