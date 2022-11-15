//This file contains the IceSpell class which is the sub-class of Spell class
public class IceSpell extends Spell {
    public IceSpell(){
        super();
    }
    public IceSpell(int itemId, String itemName, int itemCost, int requiredLevel, int damage, int manaCost) {
        super(itemId, itemName, itemCost, requiredLevel, damage, manaCost);
    }

    @Override
    public int applyEffect(Hero hero, Monster targetMonster, Spell spell) {
        int dexterity = hero.getDexterity();
        int spellBaseDamage = spell.getDamage();
        int spellDamage = Rules.heroSpellDamage(spellBaseDamage,dexterity);
        int dodgeChanceOfMonster = targetMonster.getDodgeChance();
        int newDodgeChanceOfMonster = dodgeChanceOfMonster - spellDamage;
        targetMonster.setDodgeChance(newDodgeChanceOfMonster);
        return newDodgeChanceOfMonster;
    }

}
