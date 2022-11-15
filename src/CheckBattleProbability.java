//This file contains the CheckBattleProbability class which is used to check
// the chances of commencing battle if the Hero party is in Common Cell the board in the game
import java.util.Random;
public class CheckBattleProbability {
    private int roleADice;
    //Initiates the battle upon checking g the probability of battle commencing
    public void ChanceOfBattle(){
        Random randNum = new Random();
        Battle battle = new Battle();
        roleADice = randNum.nextInt(2);
//        battle.BattleCommenced();
        if(roleADice == 1){
            battle.BattleCommenced();
        }
        else{
            battle.BattleDidNotCommence();
        }

    }
}
