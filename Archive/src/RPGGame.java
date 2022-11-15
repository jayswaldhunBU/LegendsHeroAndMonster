//This file contains the RPGGame class which extends Game class
public class RPGGame extends Game {

    private Legends legends;

    public void run() {
        System.out.println(ConsoleColorsCodes.RED + "___________________________________________");
        System.out.println(ConsoleColorsCodes.RED + "| Welcome to Legends: Monsters and Heroes |");
        System.out.println(ConsoleColorsCodes.RED + "___________________________________________");
        System.out.println();
        System.out.println(ConsoleColorsCodes.GREEN + "The monsters and heroes live in a fictional world. They do not get along and therefore fight each other.\n" +
                "Every time the heroes win, they gain experience and money. Heroes use the money to buy a variety of\n" +
                "items to aid them in their battles with the monsters. When they accumulate enough experience they\n" +
                "level up, which improves their skills. The goal of the game is for the heroes to defeat monsters and level\n" +
                "up indefinitely." + ConsoleColorsCodes.RESET);

        legends = new Legends();
        legends.playerDetails();

    }
}
