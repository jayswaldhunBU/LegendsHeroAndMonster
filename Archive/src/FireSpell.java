//This file contains the FireSpell class which is the sub-class of Spell class
public class FireSpell extends Spell {

    public FireSpell(int itemId, String itemName, int itemCost, int requiredLevel, int damage, int manaCost) {
        super(itemId, itemName, itemCost, requiredLevel, damage, manaCost);
    }

    public FireSpell() {

    }

    @Override
    public int applyEffect(Hero hero, Monster targetMonster, Spell spell) {
        int dexterity = hero.getDexterity();
        int spellBaseDamage = spell.getDamage();
        int spellDamage = Rules.heroSpellDamage(spellBaseDamage,dexterity);
        int defenceOfMonster = targetMonster.getDefense();
        int newDefenceOfMonster = defenceOfMonster-spellDamage;
        targetMonster.setDefense(newDefenceOfMonster);
        return newDefenceOfMonster;
    }

}
