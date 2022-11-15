//This file contains the Armory Data class which is used to represent armors related data in the game
public class ArmoryData extends Data {
    //Display the Armory Chart
    @Override
    public void displayData() {
        System.out.println(ConsoleColorsCodes.WHITE_BRIGHT);
        System.out.println("| Armory Id |         Name        |  Cost | Required Level |  Damage Reduction |");
        System.out.println(ConsoleColorsCodes.RESET);
        System.out.println("|    107    | Platinum_Shield     |  150  |        1       |    200   |");
        System.out.println("|    108    | Breastplate         |  350  |        3       |    600   |");
        System.out.println("|    109    | Full_Body_Armor     |  1000 |        8       |    110   |");
        System.out.println("|    110    | Wizard_Shield       |  1200 |        10      |    1500  |");
        System.out.println("|    111    | Guardian_Angel      |  1000 |        10      |    1000  |");

    }
}
