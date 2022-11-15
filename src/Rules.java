//This file contains the Rules class which has all the formulas used in the game
public class Rules {

    public static int heroAttackDamage(int heroStrength, int heroWeaponDamage){
        int attackDamage= (int) ((heroStrength + heroWeaponDamage)*0.05);
        return attackDamage;
    }

    public static int monsterAttackDamage(int armorDamageReduction, int monsterDamageCause){
        int attackDamage = (int) (monsterDamageCause-armorDamageReduction);
        return attackDamage;
    }

    public static int heroDodgeChance(int heroAgility){
        int heroDodge = (int) (heroAgility*0.2);
        return heroDodge;
    }

    public static int monsterDodgeChance(int dodgeChance){
        int monsterDodge = (int) (dodgeChance*0.1);
        return monsterDodge;
    }

    public static int heroSpellDamage(int spellBaseDamage, int dexterity){
        int spellDamage = spellBaseDamage+((dexterity/10000)*spellBaseDamage);
        return spellDamage;
    }

}
