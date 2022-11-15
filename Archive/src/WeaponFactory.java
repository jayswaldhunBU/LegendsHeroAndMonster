//This file contains the Weapon Factory class which returns weapon objects in the game
public class WeaponFactory extends UseableItemsFactory {

    @Override
    Item createItem(int itemId) {
        switch(itemId){
            case 101:
                return new Weapon(101, "Sword",500,1 ,800, 1);
            case 102:
                return new Weapon(102,"Bow", 300,2,500,2);
            case 103:
                return new Weapon(103,"Scythe", 1000,6, 1100,2);
            case 104:
                return new Weapon(104, "Axe",550,5,850,1);
            case 105:
                return new Weapon(105,"TSwords",1400,8,1600,2);
            case 106:
                return new Weapon(106,"Dagger",200,1 ,250,1);
        }
        return null;
    }
}
