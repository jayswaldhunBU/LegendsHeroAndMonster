//This class contains the representable data of potion menu
public class PotionsData extends Data {
    @Override
    public void displayData() {
        System.out.println(ConsoleColorsCodes.PURPLE);
        System.out.println("|  Potion Id  |        Name       |  Cost | Required Level |  Attribute Increase  | Attribute Affected |");
        System.out.println(ConsoleColorsCodes.RESET);
        System.out.println("|     112     | Healing_Potion    |  250  |        1       |         100          |   Health   |");
        System.out.println("|     113     | Strength_Potion   |  200  |        1       |         75           |   Strength |");
        System.out.println("|     114     | Magic_Potion      |  350  |        2       |         100          |   Mana     |");
        System.out.println("|     115     | Luck_Elixir       |  500  |        4       |         65           |   Agility  |");
        System.out.println("|     116     | Mermaid_Tears     |  850  |        5       |         100          |   All Four |");
        System.out.println("|     117     | Ambrosia          |  1000 |        8       |         150          |   All      |");


    }
}
