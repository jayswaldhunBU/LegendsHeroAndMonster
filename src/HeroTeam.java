//This file contains the HeroTeam class which creates the hero team
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeroTeam {

    private static List<Hero> heroPlayers = new ArrayList<Hero>();

    public HeroTeam() {
        createTeam();
    }

    public void createTeam() {
        HeroData.WarriorsData warriorsData = new HeroData.WarriorsData();
        warriorsData.displayData();

        HeroData.SorcerersData sorcerersData = new HeroData.SorcerersData();
        sorcerersData.displayData();

        HeroData.PaladinsData paladinsData = new HeroData.PaladinsData();
        paladinsData.displayData();

        int teamMemberCount = 0;

        do {
            System.out.println("Enter the Hero Id of the hero to create team:");
            Scanner s = new Scanner(System.in);
            int heroId = s.nextInt();
            if (heroId >= 101 && heroId <= 118 && !duplicateCheck(heroId)) {
                Hero hero = HeroFactory.createHero(heroId);
                heroPlayers.add(hero);
                teamMemberCount++;
            } else {
                System.out.println(ConsoleColorsCodes.RED);
                System.out.println("Invalid Hero selected!!");
                System.out.println(ConsoleColorsCodes.RESET);
            }
        } while (teamMemberCount < Legends.numberOfHeros);

        viewHeroTeam();

//        System.out.println(heroPlayers.get(0));

    }

    private boolean duplicateCheck(int heroId) {
        for (Hero h : heroPlayers) {
            if (h.getHeroId() == heroId)
                return true;
        }
        return false;
    }

    public static List<Hero> getHeroPlayers() {
        return heroPlayers;
    }

    private void viewHeroTeam() {
         {
            System.out.println("\n" + "Hero Team:" + "\n");
            System.out.println("|" + "\t" + "HeroId" + "\t" + "|" + "\t" + "Hero Name" + "\t" + "|" + "\t" + "Level" + "\t" + "|" + "\t" + "Mana Points" + "\t" + "|" + "\t" + "Strength" + "\t" + "|" + "\t" + "Agility" + "\t" + "|" + "\t" + "Dexterity" + "\t" + "|" + "\t" + "Gold" + "\t" + "|" + "\t" + "Experience Points" + "\t" + "|" + "\t" + "Health Points" + "\t" + "|" + "\t");
            for (Hero h : heroPlayers) {
                System.out.println(h.toString());
//                System.out.println("HeroLevelList"+ getHeroLevelList());
            }
        }
    }

    public static List<Integer> getHeroLevelList(){
        List<Integer> heroLevelList = new ArrayList<>();
        int heroLevel;
        for (Hero h: heroPlayers){
            heroLevel=h.getLevel();
            heroLevelList.add(heroLevel);

        }
        return heroLevelList;
    }

    public static boolean isHeroAlive(){
//        boolean isAlive = false;
        for(Hero h: heroPlayers){
            if(h.getHealthPoints()!=0){
//                isAlive = true;
//                break;
                return true;
            }
//            else
//            {
//                isAlive =false;
//            }
        }
        return false;
    }
}




