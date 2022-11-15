//This file contains the Character class which acts as a superclass for all the characters used in the game like Hero and Monster
public class Character {
    private String name;
    private int level;

    private int healthPoints;
    protected Character() {
        this.name = "";
        this.level = 1;
        this.healthPoints = 0;
    }

    protected Character(String name, int level, int healthPoints) {
        this.name = name;
        this.level = level;
        this.healthPoints = healthPoints;
    }
    //Return the Character name
    public String getName() {
        return name;
    }
    //Return the Character level
    public int getLevel() {
        return level;
    }
    //Return Character Health Points
    public int getHealthPoints() {
        return healthPoints;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Set the level of the Character
    public void setLevel(int level) {
        this.level = level;
    }
    //Set the HP of the Characters
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
