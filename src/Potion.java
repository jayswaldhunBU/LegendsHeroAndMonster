//This file contains the Potion class which represents the items consumed by the hero
public class Potion extends ConsumeableItems {
    private String attributeAffected;
    private int attributeIncrease;
    public Potion(int itemId, String itemName, int itemCost, int requiredLevel, int attributeIncrease, String attributeAffected) {
        super(itemId, itemName, itemCost, requiredLevel);
        this.attributeAffected = attributeAffected;
        this.attributeIncrease = attributeIncrease;
    }

    public void applyEffect(Hero drinkingHero){
        int health = drinkingHero.getHealthPoints();
        int strength = drinkingHero.getStrength();
        int manaP = drinkingHero.getManaPoints();
        int agility = drinkingHero.getAgility();
        int dexterity = drinkingHero.getDexterity();
        int newHealth = health + 100;
        int newStrength = strength + 75;
        int newManaP = manaP+100;
        int newAgility = agility+65;
        int newDexterity = dexterity+150;
        switch(attributeAffected){
            case "Health":
                drinkingHero.setHealthPoints(newHealth);
                //drinkingHero.getInventory().remove(item);
                System.out.println(drinkingHero.getName()+" used a health potion and recovered "+newHealth+" HP!");
                break;
            case "Strength":
                drinkingHero.setStrength(newStrength);
                //drinkingHero.getInventory().remove(item);
                System.out.println(drinkingHero.getName()+" used a strength potion and recovered "+newStrength+" Strength!");
                break;
            case "Mana":
                drinkingHero.setManaPoints(newManaP);
                //drinkingHero.getInventory().remove(item);
                System.out.println(drinkingHero.getName()+" used a mana potion and recovered "+newManaP+" MP!");
                //
                break;

            case "Agility":
                drinkingHero.setAgility(newAgility);
                //drinkingHero.getInventory().remove(item);
                System.out.println(drinkingHero.getName()+" used a agility potion and recovered "+newAgility+" agility!");
                break;
            case "allFour":
                drinkingHero.setHealthPoints(newHealth);
                drinkingHero.setStrength(newStrength);
                drinkingHero.setManaPoints(newManaP);
                drinkingHero.setAgility(newAgility);
                //drinkingHero.getInventory().remove(item);
                System.out.println(drinkingHero.getName()+" used a health potion and recovered "+newHealth+" HP!");
                System.out.println(drinkingHero.getName()+" used a strength potion and recovered "+newStrength+" Strength!");
                System.out.println(drinkingHero.getName()+" used a mana potion and recovered "+newManaP+" MP!");
                System.out.println(drinkingHero.getName()+" used a agility potion and recovered "+newAgility+" agility!");
                break;
            case "All":
                drinkingHero.setHealthPoints(newHealth);
                drinkingHero.setStrength(newStrength);
                drinkingHero.setManaPoints(newManaP);
                drinkingHero.setAgility(newAgility);
                drinkingHero.setDexterity(newDexterity);
                //drinkingHero.getInventory().remove(item);
                System.out.println(drinkingHero.getName()+" used a health potion and recovered "+newHealth+" HP!");
                System.out.println(drinkingHero.getName()+" used a strength potion and recovered "+newStrength+" Strength!");
                System.out.println(drinkingHero.getName()+" used a mana potion and recovered "+newManaP+" MP!");
                System.out.println(drinkingHero.getName()+" used a agility potion and recovered "+newAgility+" agility!");
                System.out.println(drinkingHero.getName()+" used a dexterity potion and recovered "+newDexterity+" dexterity!");
                break;
        }
    }
}
