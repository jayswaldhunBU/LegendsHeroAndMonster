//This file contains the IceSpellFactory class which "creates" the ice spell
public class IceSpellFactory extends SpellFactory {

    Item createItem(int itemId) {
        switch (itemId) {
            case 127:
                return new IceSpell(127, "Snow_Cannon", 500, 2, 650, 250);
            case 128:
                return new IceSpell(128, "Ice_Blade", 250, 1, 450, 100);
            case 129:
                return new IceSpell(129, "Frost_Blizzard", 750, 5, 850, 350);
            case 130:
                return new IceSpell(130, "Arctic_Storm", 700, 6, 800, 300);
        }
        return null;
    }
}
