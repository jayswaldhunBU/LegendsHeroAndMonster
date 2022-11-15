//This file contains the FireSpellFactory class which "creates" the fire spell
public class FireSpellFactory extends SpellFactory {

    @Override
    Item createItem(int itemId) {
        switch (itemId) {
            case 122:
                return new FireSpell(122, "Flame_Tornado", 700, 4, 850, 300);
            case 123:
                return new FireSpell(123, "Breath_of_Fire", 350, 1, 450, 100);
            case 124:
                return new FireSpell(124, "Heat_Wave", 450, 2, 600, 150);
            case 125:
                return new FireSpell(125, "Lava_Comet", 800, 7, 1000, 550);
            case 126:
                return new FireSpell(126, "Hell_Storm", 600, 3, 950, 600);
        }
        return null;
    }

}
