//This file contains the Battle class which is used to represent battle in the game
import jdk.nashorn.internal.objects.annotations.Where;

import java.util.*;

public class Battle {

    List<Monster> monsterPlayers = MonsterTeam.getMonsterPlayers();
    List<Hero> heroPlayers = HeroTeam.getHeroPlayers();

    List<Hero> faintedHero;
    List<Monster> faintedMonster;

    Battle(){

        this.faintedMonster = new ArrayList<Monster>();
        this.faintedHero = new ArrayList<Hero>();
    }

    Scanner s   = new Scanner(System.in);
    public void BattleCommenced(){
        MonsterTeam monsterTeam = new MonsterTeam();
        System.out.println(ConsoleColorsCodes.YELLOW_BOLD_BRIGHT+"Battle Begins"+ConsoleColorsCodes.RESET+"\n");
        System.out.println("Hero in Battle"+"\n");
        System.out.println("|" + "\t" + "HeroId" + "\t" + "|" + "\t" + "Hero Name" + "\t" + "|" + "\t" + "Level" + "\t" + "|" + "\t" + "Mana Points" + "\t" + "|" + "\t" + "Strength" + "\t" + "|" + "\t" + "Agility" + "\t" + "|" + "\t" + "Dexterity" + "\t" + "|" + "\t" + "Gold" + "\t" + "|" + "\t" + "Experience Points" + "\t" + "|" + "\t" + "Health Points");
        for(Hero h: heroPlayers){
            System.out.println(heroPlayers.indexOf(h)+1 + h.toString());
        }
        System.out.println(" ");
        System.out.println("Monster in Battle"+"\n");
        System.out.println("|" + "\t" + "MonsterId" + "\t" + "|" + "\t" + "Monster Name" + "\t" + "|" + "\t" + "Level" + "\t" + "|" + "\t" + "Health Points" + "\t" + "|" + "\t" + "Damage" + "\t" + "|" + "\t" + "Defence" + "\t" + "|" + "\t" + "Dodge Chance" + "\t" + "|" );
        for(Monster m: monsterPlayers){
            System.out.println(monsterPlayers.indexOf(m)+1 + m.toString());
        }
        System.out.println(" ");


        int turnCount=2;
        do{

        if (turnCount%2==0){
            boolean heroTeamDied = isAllHeroHPZero();
            if(!heroTeamDied){
                System.out.println(ConsoleColorsCodes.CYAN+"Hero turn begins"+ConsoleColorsCodes.RESET);
                HeroTurn();
                System.out.println(ConsoleColorsCodes.CYAN+"Hero turn ends"+ConsoleColorsCodes.RESET);
            }
            turnCount++;
        }
        else{
            boolean monsterTeamDied = isAllMonsterHPZero();
            if(!monsterTeamDied){
                System.out.println(ConsoleColorsCodes.PURPLE+"Monster turn begins"+ConsoleColorsCodes.RESET);
                MonsterTurn();
                System.out.println(ConsoleColorsCodes.PURPLE+"Monster turn ends"+ConsoleColorsCodes.RESET);
            }
            turnCount++;
        }
    }while (!isAllHeroHPZero() && !isAllMonsterHPZero());

        if(!isAllHeroHPZero()){
            System.out.println("All Monster died, Hero Team won the Battle!!!");

            for(Hero h: heroPlayers){
                h.levelUp();
            }

            for(Hero f: faintedHero){
                f.setHealthPoints((int)(f.getLevel()/2)*100);
                int manaP= f.getManaPoints()/2;
                f.setManaPoints(manaP/2);
                heroPlayers.add(f);
            }

        }
        if(!isAllMonsterHPZero()){
            System.out.println(ConsoleColorsCodes.RED+"All Hero died, Monster Team won the Battle!!!"+ConsoleColorsCodes.RESET);
            System.exit(0);
        }
    }

    private void MonsterTurn() {
        for(Monster m: monsterPlayers){
            if(m.getHealthPoints()<=0){
                m.setHealthPoints(0);
                faintedMonster.add(m);
            }
        }

        for(Monster f: faintedMonster){
            monsterPlayers.remove(f);
        }

        for(int i=0;i<heroPlayers.size();i++){
            Monster monster = monsterPlayers.get(i);
            Hero hero = heroPlayers.get(i);
            int hid = hero.getHeroId();
            int mid = monster.getMonsterId();

            int armorDR = hero.getArmory().getDamageReduction();
            int monsterDC = monster.getDamage();
            int heroAgility = hero.getAgility();
            int heroDodgeChance = Rules.heroDodgeChance(heroAgility);
            int attackDamage = Rules.monsterAttackDamage(armorDR, monsterDC);

            int randomInt = new Random().nextInt(400);

            if(randomInt<heroDodgeChance){
                System.out.println(ConsoleColorsCodes.PURPLE+ hero.getName() + " was attacked by "+monster.getName()+" but the attack was dodged."+ConsoleColorsCodes.RESET );
                System.out.println(" ");

            }
            else{
                int heroHP = hero.getHealthPoints();
                int newHeroHP = heroHP-attackDamage;
                if(newHeroHP<0){
                    hero.setHealthPoints(0);
                }
                else{
                    hero.setHealthPoints(newHeroHP);
                }
                System.out.println(ConsoleColorsCodes.PURPLE+ hero.getName() + " was attacked by the "+monster.getName()+" and "+attackDamage+" of damage was caused."+ConsoleColorsCodes.RESET);
                System.out.println(" ");
            }

        }
    }

    public boolean isAllHeroHPZero(){ //Return true if all the hero's have died.
        int heroHPCount=0;
        for(Hero h:heroPlayers){
            if(h.getHealthPoints()==0){
                heroHPCount++;
            }
        }
        return heroHPCount == heroPlayers.size();
    }

    public boolean isAllMonsterHPZero(){ //Return true if all the monster have died.
        int monsterHPCount=0;
        for(Monster m:monsterPlayers){
            if(m.getHealthPoints()==0){
                monsterHPCount++;
            }
        }
        return monsterHPCount == monsterPlayers.size();
    }


    public void HeroTurn() {
        for(Hero h: heroPlayers)
        {
            if(h.getHealthPoints()<=0){
                h.setHealthPoints(0);
                faintedHero.add(h);
                //heroPlayers.remove(h);
            }
        }

        for(Hero f:faintedHero)
        {
            heroPlayers.remove(f);
        }

        for(Hero h: heroPlayers)
        {
            System.out.println("1. Attack, using the hero’s equipped weapon");
            System.out.println("2. Cast a spell from the hero’s inventory");
            System.out.println("3. Use a potion from the hero’s inventory");
            System.out.println("4. Equip a weapon");
            System.out.println("5. Equip a piece of armor");
            System.out.println("(H/h) Hero Team Information");
            System.out.println("(M/m) Monster Team Information");
            int selectMove;
            do {
                System.out.println("Enter the number to perform the move:");
                try {
                    selectMove = s.nextInt();
                }
                catch(InputMismatchException e){
                    String input = s.next();

                    if(input.equalsIgnoreCase("h"))
                    {
                        System.out.println("Hero in Battle"+"\n");
                        System.out.println("|" + "\t" + "HeroId" + "\t" + "|" + "\t" + "Hero Name" + "\t" + "|" + "\t" + "Level" + "\t" + "|" + "\t" + "Mana Points" + "\t" + "|" + "\t" + "Strength" + "\t" + "|" + "\t" + "Agility" + "\t" + "|" + "\t" + "Dexterity" + "\t" + "|" + "\t" + "Gold" + "\t" + "|" + "\t" + "Experience Points" + "\t" + "|" + "\t" + "Health Points" + "\t" + "|" + "\t"+ "Equipped Weapon" + "\t" + "|" + "\t" + "Equipped Armor" + "\t" + "|" + "\t");
                        for(Hero h1: heroPlayers){
                            System.out.println(h1.toString()+ "\t" + "|" + "\t" + h1.getWeapon().getItemName() +"\t" + "|" + "\t"+ h1.getArmory().getItemName());
                        }
                        System.out.println(" ");

                    }

                    else if(input.equalsIgnoreCase("m"))
                    {
                        System.out.println("Monster in Battle"+"\n");
                        System.out.println("|" + "\t" + "MonsterId" + "\t" + "|" + "\t" + "Monster Name" + "\t" + "|" + "\t" + "Level" + "\t" + "|" + "\t" + "Health Points" + "\t" + "|" + "\t" + "Damage" + "\t" + "|" + "\t" + "Defence" + "\t" + "|" + "\t" + "Dodge Chance" + "\t" + "|" );
                        for(Monster m1: monsterPlayers){
                            System.out.println(m1.toString());
                        }
                        System.out.println(" ");
                    }

                    else
                    {
                        System.out.println("Invalid input");
                        System.out.println(" ");
                    }

                    selectMove=0;
            }
        } while (selectMove < 1 || selectMove > 5);
            heroMadeMove(h, selectMove);
        }
    }


    public void heroMadeMove(Hero turnHero, int selectMove){
        if(selectMove==1){
            heroAttackedMonster(turnHero);
        }
        if(selectMove==2){
            heroCastedSpell(turnHero);
        }
        if(selectMove==3){
            heroUseAPotion(turnHero);
        }
        if(selectMove==4){
            equipAWeapon(turnHero);
        }
        if(selectMove==5){
            equipAnArmor(turnHero);
        }
    }

    private void equipAnArmor(Hero hero) {
        for(Item item: hero.getInventory())
        {
            if(item instanceof Armory)
            {
                Armory armory = (Armory) item;
                    {
                        hero.setArmory(armory);
                        System.out.println(ConsoleColorsCodes.CYAN+hero.getName() + " equipped " + armory.getItemName()+ConsoleColorsCodes.RESET);
                        System.out.println(" ");
                    }
            }
            if(!(item instanceof Armory))
                {
                    System.out.println("No armor found in Inventory");
                    System.out.println(" ");
                }
        }
        if(hero.getInventory().size()==0)
        {
            System.out.println("No armor found in Inventory");
            System.out.println(" ");
        }
    }

    private void equipAWeapon(Hero hero) {
        for(Item item: hero.getInventory())
        {
            if(item instanceof Weapon)
            {
                Weapon weapon = (Weapon) item;
                {
                    hero.setWeapon(weapon);
                    System.out.println(ConsoleColorsCodes.CYAN+hero.getName() + " equipped " + weapon.getItemName()+ConsoleColorsCodes.RESET);
                    System.out.println(" ");
                }
            }

            if(!(item instanceof Weapon))
            {
                System.out.println("No weapon found in Inventory");
                System.out.println(" ");
            }
        }
        if(hero.getInventory().size()==0)
        {
            System.out.println("No weapon found in Inventory");
            System.out.println(" ");
        }

    }

    private void heroUseAPotion(Hero hero) {
        List<Item> consumedPotions = new ArrayList<Item>();
        for(Item item: hero.getInventory())
        {
            if(item instanceof Potion) {
                Potion potion = (Potion) item;
                {
                    potion.applyEffect(hero);
                    consumedPotions.add(potion);
                }
            }
            if(!(item instanceof Potion))
            {
                System.out.println("No potion found in Inventory");
                System.out.println(" ");
            }

        }
        if(hero.getInventory().size()==0)
        {
            System.out.println("No potion found in Inventory");
            System.out.println(" ");
        }
        for(Item usedPotion: consumedPotions){
            hero.getInventory().remove(usedPotion);
        }
    }


    public void heroCastedSpell(Hero hero) {
        List<Item> consumedSpells = new ArrayList<Item>();
        int targetIndex = heroPlayers.indexOf(hero);
        if(targetIndex >= monsterPlayers.size())
        {
            targetIndex = 0;
        }
        Monster monster = monsterPlayers.get(targetIndex);
        for(Item item: hero.getInventory())
        {
            if(item instanceof Spell)
            {
                Spell spell = (Spell) item;
                if (spell instanceof IceSpell){
                    IceSpell iceSpell = new IceSpell();
                    int newDodgeChanceOfMonster = iceSpell.applyEffect(hero, monster, spell);
                    consumedSpells.add(item);
                    System.out.println(ConsoleColorsCodes.CYAN+hero.getName()+" casted " +item.getItemName()+" on "+monster.getName()+" and reduced dodge chance of Monster to"+ newDodgeChanceOfMonster+ConsoleColorsCodes.RESET);
                    System.out.println(" ");
                }
                if(spell instanceof FireSpell){
                    FireSpell fireSpell = new FireSpell();
                    int newDefenceOfMonster = fireSpell.applyEffect(hero, monster, spell);
                    consumedSpells.add(item);
                    System.out.println(ConsoleColorsCodes.CYAN+hero.getName()+" casted " +item.getItemName()+" on "+monster.getName()+" and reduced defence of Monster to"+ newDefenceOfMonster+ConsoleColorsCodes.RESET);
                    System.out.println(" ");
                }
                if(spell instanceof LightningSpell){
                    LightningSpell lightningSpell = new LightningSpell();
                    int newDamageOfMonster = lightningSpell.applyEffect(hero, monster, spell);
                    consumedSpells.add(item);
                    System.out.println(ConsoleColorsCodes.CYAN+hero.getName()+" casted " +item.getItemName()+" on "+monster.getName()+" and reduced damage of Monster to"+ newDamageOfMonster+ConsoleColorsCodes.RESET);
                    System.out.println(" ");

                }
                if(hero.getManaPoints()<=spell.getManaCost()){
                    System.out.println(hero.getName()+" do not have enough manaPoints!!");
                    System.out.println(" ");
                }
            }
            if(!(item instanceof Spell) || hero.getInventory().size()==0)
            {
                System.out.println("No spell found in Inventory");
                System.out.println(" ");
            }
        }
        if(hero.getInventory().size()==0)
        {
            System.out.println("No spell found in Inventory");
            System.out.println(" ");
        }
        for(Item usedSpell: consumedSpells){
            hero.getInventory().remove(usedSpell);
        }
    }


    public void heroAttackedMonster(Hero hero){

        int weaponDamage=0;
        int heroStrength=0;
        int dodgeChance=0;
        int targetIndex = heroPlayers.indexOf(hero);
        if(targetIndex >= monsterPlayers.size())
        {
            targetIndex = 0;
        }
        Monster monster = monsterPlayers.get(targetIndex);
        Weapon w = hero.getWeapon();
        weaponDamage = w.getCauseDamage();
        heroStrength = hero.getStrength();
        dodgeChance = monster.getDodgeChance();


        int randomInt = new Random().nextInt(100);
        int monsterDodgeChance = Rules.monsterDodgeChance(dodgeChance);
        if(randomInt<monsterDodgeChance){
            System.out.println(ConsoleColorsCodes.CYAN+hero.getName() + " attacked the "+monster.getName()+" but the attack was dodged."+ConsoleColorsCodes.RESET);
        }
        else{
            int attackDamage;
            attackDamage= Rules.heroAttackDamage(heroStrength, weaponDamage);
            int monsterHP = monster.getHealthPoints();
            int newMonsterHP = monsterHP-attackDamage;
            monster.setHealthPoints(newMonsterHP);
            System.out.println(ConsoleColorsCodes.CYAN+hero.getName() + " attacked the "+monster.getName()+" and "+attackDamage+" of damage was caused."+ConsoleColorsCodes.RESET);

        }
    }

    public void BattleDidNotCommence(){
        System.out.println("Type 'C' to use Common area features, else press any key for no action");
        Scanner s = new Scanner(System.in);
        String str1=s.nextLine();
        if(str1.equalsIgnoreCase("C")){
            String str2;
            do{
                System.out.println("1. Change the weapon");
                System.out.println("2. Change the armor");
                System.out.println("3. Consume the potion");
                System.out.println("4. Quit the game");
                int selectMove;

                do {
                    System.out.println("Enter the number to perform the move:");
                    try {
                        selectMove = s.nextInt();
                    }
                    catch(InputMismatchException e)
                    {
                            System.out.println("Invalid input");
                            System.out.println(" ");
                        selectMove=0;
                    }
                } while (selectMove < 1 || selectMove > 4);
                heroMadeMoveInNonBattleGround(selectMove);
                System.out.println("Wanna look for other heros? (Y,N)");
                Scanner s1 = new Scanner(System.in);
                str2 = s1.nextLine();
            } while(str2.equals("Y") || str2.equals("y"));

        }

    }

    private void heroMadeMoveInNonBattleGround(int selectMove) {

        System.out.println("Enter the heroID");
        Scanner s = new Scanner(System.in);
        int hID=s.nextInt();
        for (Hero h : heroPlayers)
        {
            if(h.getHeroId()==hID)
            {
                if(selectMove==1)
                {
                    equipAWeapon(h);
                }
                if(selectMove==2){
                    equipAnArmor(h);
                }
                if(selectMove==3){
                    heroUseAPotion(h);
                }
                if(selectMove==4){
                    System.exit(0);
                }
            }
        }
    }

}
