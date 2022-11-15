//This file contains the Hero Data class which has all the displayable Hero data
public abstract class HeroData extends Data {
    static class WarriorsData extends HeroData {
        @Override
        public void displayData() {
            System.out.println(ConsoleColorsCodes.RED);
            System.out.println("|  Hero Id  |     Warrior Name    |  Initial Level  |  Mana  |  Strength  |  Agility  |  Dexterity  |  Initial Gold  | Initial Experience Points |");
            System.out.println(ConsoleColorsCodes.RESET);
            System.out.println("|   101     |  Gaerdal_Ironhand   |       1         |   100   |    700    |    500    |     600     |      1354      |             7             |");
            System.out.println("|   102     |  Sehanine_Monnbow   |       1         |   600   |    700    |    800    |     500     |      2500      |             8             |");
            System.out.println("|   103     |  Muamman_Duathall   |       1         |   300   |    900    |    500    |     750     |      2546      |             6             |");
            System.out.println("|   104     |  Flandal_Steelskin  |       1         |   200   |    750    |    650    |     700     |      2500      |             7             |");
            System.out.println("|   105     |  Undefeated_Yoj     |       1         |   400   |    800    |    400    |     700     |      2500      |             7             |");
            System.out.println("|   106     |  Eunoia_Cyn         |       1         |   400   |    700    |    800    |     600     |      2500      |             6             |");
        }
    }

    static class SorcerersData extends HeroData{

        @Override
        public void displayData() {
            System.out.println(ConsoleColorsCodes.RED);
            System.out.println("|  Hero Id  |     Sorcerers Name     |  Initial Level  |   Mana   |  Strength  |  Agility  |  Dexterity  |  Initial Gold  | Initial Experience Points |");
            System.out.println(ConsoleColorsCodes.RESET);
            System.out.println("|   107     |  Rillifane_Rallathil   |       1         |   1300   |    750    |    450    |     500     |      2500      |             9             |");
            System.out.println("|   108     |  Segojan_Earthcaller   |       1         |   900    |    800    |    500    |     650     |      2500      |             5             |");
            System.out.println("|   109     |  Reign_Havoc           |       1         |   800    |    800    |    800    |     800     |      2500      |             8             |");
            System.out.println("|   110     |  Reverie_Ashels        |       1         |   900    |    800    |    700    |     400     |      2500      |             7             |");
            System.out.println("|   111     |  Kalabar               |       1         |   800    |    850    |    400    |     600     |      2500      |             6             |");
            System.out.println("|   112     |  Skye_Soar             |       1         |   1000   |    700    |    400    |     500     |      2500      |             5             |");


        }
    }

    static class PaladinsData extends HeroData{

        @Override
        public void displayData() {
            System.out.println(ConsoleColorsCodes.RED);
            System.out.println("|  Hero Id  |     Paladins Name      |  Initial Level  |   Mana  |  Strength  |  Agility  |  Dexterity  |  Initial Gold  | Initial Experience Points |");
            System.out.println(ConsoleColorsCodes.RESET);
            System.out.println("|   113     |  Parzival              |       1         |   300   |    750    |    650    |     700     |      2500      |             7             |");
            System.out.println("|   114     |  Sehanine_Moonbow      |       1         |   300   |    750    |    700    |     700     |      2500      |             7             |");
            System.out.println("|   115     |  Skoraeus_Stonebones   |       1         |   250   |    650    |    600    |     350     |      2500      |             4             |");
            System.out.println("|   116     |  Garl_Glittergold      |       1         |   100   |    600    |    500    |     400     |      2500      |             5             |");
            System.out.println("|   117     |  Amaryllis_Astra       |       1         |   500   |    500    |    500    |     500     |      2500      |             5             |");
            System.out.println("|   118     |  Caliber_Heist         |       1         |   400   |    400    |    400    |     400     |      2500      |             8             |");


        }
    }
}
