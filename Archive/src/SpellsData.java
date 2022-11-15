//This class contains the representable data of Spell menu
public abstract class SpellsData extends Data {
    public static class LightningSpellsData extends SpellsData {
        @Override
        public void displayData() {
            System.out.println(ConsoleColorsCodes.CYAN);
            System.out.println("| Spells Id |       Name      | Cost | Required Level | Damage | Mana Cost |");
            System.out.println(ConsoleColorsCodes.RESET);
            System.out.println("|    118   | Lightning_Dagger | 400  |        1       |   500  |    150    |");
            System.out.println("|    119   | Thunder_Blast    | 750  |        4       |   950  |    400    |");
            System.out.println("|    120   | Electric_Arrows  | 550  |        5       |   650  |    200    |");
            System.out.println("|    121   | Spark_Needles    | 500  |        2       |   600  |    200    |");

        }
    }

    public static class FireSpellsData extends SpellsData {
        @Override
        public void displayData() {
            System.out.println(ConsoleColorsCodes.YELLOW_BOLD_BRIGHT);
            System.out.println("| Spells Id |       Name      | Cost | Required Level |  Damage  | Mana Cost |");
            System.out.println(ConsoleColorsCodes.RESET);
            System.out.println("|    122   | Flame_Tornado    | 700  |        4       |    850   |    300    |");
            System.out.println("|    123   | Breath_of_Fire   | 350  |        1       |    450   |    100    |");
            System.out.println("|    124   | Heat_Wave        | 450  |        2       |    600   |    150    |");
            System.out.println("|    125   | Lava_Comet       | 800  |        7       |    1000  |    550    |");
            System.out.println("|    126   | Hell_Storm       | 600  |        3       |    950   |    600    |");

        }
    }

    public static class IceSpellsData extends SpellsData {
        @Override
        public void displayData() {
            System.out.println(ConsoleColorsCodes.BLUE_BOLD_BRIGHT);
            System.out.println("| Spells Id |       Name      | Cost | Required Level |  Damage  | Mana Cost |");
            System.out.println(ConsoleColorsCodes.RESET);
            System.out.println("|    127   | Snow_Cannon      | 500  |        2       |    650   |    250    |");
            System.out.println("|    128   | Ice_Blade        | 250  |        1       |    450   |    100    |");
            System.out.println("|    129   | Frost_Blizzard   | 750  |        5       |    850   |    350    |");
            System.out.println("|    130   | Arctic_Storm     | 700  |        6       |    800   |    300    |");

        }
    }
}
