//This file contains the HeroFactory class which "creates" the heroes

import java.util.ArrayList;

public class HeroFactory {
    public static Hero createHero(int heroId) {
        ArrayList<Item> itmobj = new ArrayList<Item>();
        Weapon fistPunchingWeapon = new Weapon(100, "Fist_Punching",0,1 ,100, 2);
        Armory noArmory = new Armory(0,"No_Armory", 0,1,0);
        switch (heroId) {
            case 101:
                 return new Warrior(101, "Gaerdal_Ironhand", 1, 100, 700, 500, 600, 1354, 7, itmobj, fistPunchingWeapon, noArmory, 100);
            case 102:
                return new Warrior(102, "Sehanine_Monnbow", 1, 600, 700, 800, 500, 2500, 8, itmobj, fistPunchingWeapon, noArmory, 100);
            case 103:
                return new Warrior(103, "Muamman_Duathall", 1, 300, 900, 500, 750, 2546, 6, itmobj, fistPunchingWeapon, noArmory, 100);
            case 104:
                return new Warrior(104, "Flandal_Steelskin", 1, 200, 750, 650, 700, 2500, 7, itmobj, fistPunchingWeapon, noArmory, 100);
            case 105:
                return new Warrior(105, "Undefeated_Yoj", 1, 400, 800, 400, 700, 2500, 7, itmobj, fistPunchingWeapon, noArmory, 100);
            case 106:
                return new Warrior(106, "Eunoia_Cyn", 1, 400, 700, 800, 600, 2500, 6, itmobj, fistPunchingWeapon, noArmory, 100);
            case 107:
                return new Sorcerer(107, "Rillifane_Rallathil", 1, 1300, 750, 450, 500, 2500, 9, itmobj, fistPunchingWeapon, noArmory, 100);
            case 108:
                return new Sorcerer(108, "Segojan_Earthcaller", 1, 900, 800, 500, 650, 2500, 5, itmobj, fistPunchingWeapon, noArmory, 100);
            case 109:
                return new Sorcerer(109, "Reign_Havoc", 1, 800, 800, 800, 800, 2500, 8, itmobj, fistPunchingWeapon, noArmory, 100);
            case 110:
                return new Sorcerer(110, "Reverie_Ashels", 1, 900, 800, 700, 400, 2500, 7, itmobj, fistPunchingWeapon, noArmory, 100);
            case 111:
                return new Sorcerer(111, "Kalabar", 1, 800, 850, 400, 600, 2500, 6, itmobj, fistPunchingWeapon, noArmory, 100);
            case 112:
                return new Sorcerer(112, "Skye_Soar", 1, 1000, 700, 400, 500, 2500, 5, itmobj, fistPunchingWeapon, noArmory, 100);
            case 113:
                return new Paladin(113, "Parzival", 1, 300, 750, 650, 700, 2500, 7, itmobj, fistPunchingWeapon, noArmory, 100);
            case 114:
                return new Paladin(114, "Sehanine_Moonbow", 1, 300, 750, 700, 700, 2500, 7, itmobj, fistPunchingWeapon, noArmory, 100);
            case 115:
                return new Paladin(115, "Skoraeus_Stonebones", 1, 250, 650, 600, 350, 2500, 4, itmobj, fistPunchingWeapon, noArmory, 100);
            case 116:
                return new Paladin(116, "Garl_Glittergold", 1, 100, 600, 500, 400, 2500, 5, itmobj, fistPunchingWeapon, noArmory, 100);
            case 117:
                return new Paladin(117, "Amaryllis_Astra", 1, 500, 500, 500, 500, 2500, 5, itmobj, fistPunchingWeapon, noArmory, 100);
            case 118:
                return new Paladin(118, "Caliber_Heist", 1, 400, 400, 400, 400, 2500, 8, itmobj, fistPunchingWeapon, noArmory, 100);
        }

        return null;
    }


}
