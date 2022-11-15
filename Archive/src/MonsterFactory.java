//This file contains the Monster Factory class which generates the monsters when the battle commenced
import java.util.Random;
public class MonsterFactory {

    public static Monster createMonster(int herolevel) {
        // get monster list
        // filter monster list according to maxLevelOfHero
        // randomly return monster from filtered list

        int randomMonster;
        Random randNum = new Random();

        if(herolevel==1){
            randomMonster = randNum.nextInt(4);
            switch (randomMonster){
                case 0:
                    return new Spirit(101,"Blinky",1,100,450,350,35);
                case 1:
                    return new Spirit(102, "Casper",1,100,100,100,50);
                case 2:
                    return new Dragon(103,"Natsunomeryu",1, 100,100,200,10);
                case 3:
                    return new Exoskeleton(104,"BigBad-Wolf",1, 100,150,250,15);
            }

        }
        if(herolevel==2){
            randomMonster = randNum.nextInt(3);
            switch (randomMonster){
                case 0:
                    return new Spirit(105,"Andrealphus",2,100,600,500,40);
                case 1:
                    return new Dragon(106,"Chrysophylax",2,100, 200,500,20);
                case 2:
                    return new Exoskeleton(107, "WickedWitch",2, 100,250,350,25);
            }
        }
        if(herolevel==3){
            randomMonster = randNum.nextInt(3);
            switch (randomMonster){
                case 0:
                    return new Spirit(108, "Andromalius", 3,100,550,450,25);
                case 1:
                    return new Dragon(109,"Desghidorrah",3,100,300,400,35);
                case 2:
                    return new Exoskeleton(110,"Brandobaris",3, 100,350,450,30);

            }
        }

        return null;
    }
}
