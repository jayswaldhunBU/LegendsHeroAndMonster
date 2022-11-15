//This file contains the LightningSpell class which is the sub-class of Spell class
public class LightningSpell extends Spell {

    public LightningSpell(int itemId, String itemName, int itemCost, int requiredLevel, int damage, int manaCost) {
        super(itemId, itemName, itemCost, requiredLevel, damage, manaCost);
    }

    public LightningSpell() {

    }

    @Override
    public int applyEffect(Hero hero, Monster targetMonster, Spell spell) {
        int dexterity = hero.getDexterity();
        int spellBaseDamage = spell.getDamage();
        int spellDamage = Rules.heroSpellDamage(spellBaseDamage,dexterity);
        int damageOfMonster = targetMonster.getDamage();
        int newDamageOfMonster = damageOfMonster-spellDamage;
        targetMonster.setDamage(newDamageOfMonster);
        return newDamageOfMonster;
    }

}
