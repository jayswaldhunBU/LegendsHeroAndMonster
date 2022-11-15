//This file contains the LightningSpellFactory class which "creates" the Lightning Spell
public class LightningSpellFactory extends SpellFactory {

    @Override
    Item createItem(int itemId) {
        switch (itemId) {
            case 118:
                return new LightningSpell(118, "Lightning_Dagger", 400, 1, 500, 50);
            case 119:
                return new LightningSpell(119, "Thunder_Blast", 750, 4, 950, 400);
            case 120:
                return new LightningSpell(120, "Electric_Arrows", 550, 5, 650, 200);
            case 121:
                return new LightningSpell(121, "Spark_Needles", 500, 2, 600, 200);
        }
        return null;
    }
}
