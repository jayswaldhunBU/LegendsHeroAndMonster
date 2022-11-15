//This file contains the MonsterTeam class which creates the MonsterTeam
import java.util.ArrayList;
import java.util.List;

//Creates team of monsters
public class MonsterTeam {

//    private final List<Hero> heroPlayers;


    protected MonsterTeam() {
//        heroLevelList=this.heroLevelList();
        heroLevelList = HeroTeam.getHeroLevelList();
        createMonsterTeam();
    }

    int numberOfMonsters = Legends.numberOfHeros;
    List<Integer> heroLevelList;
    private static List<Monster> monsterPlayers = new ArrayList<Monster>();

    public void createMonsterTeam() {
        int memberCountOfMonsterTeam = 0;

            do {
                //System.out.println("HeroLevelList"+ heroLevelList);
                Monster monster = MonsterFactory.createMonster(heroLevelList.get(0));
                int mid = monster.getMonsterId();
                boolean checkMonster = duplicateCheck(mid);
//                System.out.println("Monster"+monster.getMonsterId());
//                System.out.println("CheckMonster"+checkMonster);
//                System.out.println("MP "+monsterPlayers.toString());
                if(!checkMonster){
                    monsterPlayers.add(monster);
                    heroLevelList.remove(0);
                    memberCountOfMonsterTeam++;
                }

            } while (memberCountOfMonsterTeam < numberOfMonsters);

            //viewMonsterTeam();
        }


    public static List<Monster> getMonsterPlayers() {
        return monsterPlayers;
    }

    private boolean duplicateCheck(int monsterId) {
        for (Monster m : monsterPlayers) {
            if (m.getMonsterId() == monsterId)
                return true;
        }
        return false;
    }

    private void viewMonsterTeam() {
        {
            System.out.println("\n" + "Monster Team Selected by :" + "\n");
            System.out.println("|" + "\t" + "MonsterId" + "\t" + "|" + "\t" + "Monster Name" + "\t" + "|" + "\t" + "Level" + "\t" + "|" + "\t" + "Health Points" + "\t" + "|" + "\t" + "Damage" + "\t" + "|" + "\t" + "Defence" + "\t" + "|" + "\t" + "Dodge Chance" + "\t" + "|" );
            for (Monster m : monsterPlayers) {
                System.out.println(m.toString());
                //System.out.println("HeroLevelList"+ getHeroLevelList());
            }
        }
    }
}
