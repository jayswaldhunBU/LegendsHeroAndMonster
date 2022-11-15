//This file contains the WeaponryData class which is represents weapon data
public class WeaponryData extends Data {
    @Override
    public void displayData() {
        System.out.println(ConsoleColorsCodes.GREEN_BOLD_BRIGHT);
        System.out.println("| Weaponry Id |   Name   |  Cost | Required Level |  Damage  | Required Hands |");
        System.out.println(ConsoleColorsCodes.RESET);
        System.out.println("|     101     | Sword    |  500  |        1       |    800   |        1       |");
        System.out.println("|     102     | Bow      |  300  |        2       |    500   |        2       |");
        System.out.println("|     103     | Scythe   |  1000 |        6       |    1100  |        2       |");
        System.out.println("|     104     | Axe      |  550  |        5       |    850   |        1       |");
        System.out.println("|     105     | TSwords  |  1400 |        8       |    1600  |        2       |");
        System.out.println("|     106     | Dagger   |  200  |        1       |    250   |        1       |");

    }
}
