# CS611 - Assignment 3
## Legends: Monsters and Heroes

Name - Dhun Jitendrakumar Jayswal
Email - jayswald@bu.edu
BUID - U16710122

##Files
--------------------------------------------------------------------
* 'Armory.java' - This file contains the Armory class which is used to represent a armors in the game.
* 'ArmoryData.java' - This file contains the Armory Data class which is used to represent armors related data in the game.
* 'ArmoryFactory.java' - This file contains the Armory Factory class which returns armors objects in the game
* 'Battle.java' - This file contains the Battle class which is used to represent battle in the game.
* 'Board.java' - This file contains the Board class which is used to represent a board platform in the game.
* 'Cell.java' - TThis file contains the Cell class which is used to represent a cell of the board in the game.
* 'CellFactory.java' - This file contains the CellFactory class which is used to generate different types of cells in the game.
* 'Character.java' - his file contains the Character class which acts as a superclass for all the characters used in the game like Hero and Monster.
* 'CheckBattleProbability.java' - his file contains the CheckBattleProbability class which is used to check the chances of commencing battle if the Hero party is in Common Cell the board in the game
* 'CommonCell.java' - This file contains the CommonCell class which extends the Cell class
* 'ConsoleColorsCodes.java' - This class sets the color in the game
* 'ConsumeableItems.java' - This files contains ConsumeableItems super class which represents all the consumable items
* 'ConsumeableItemsFactory.java' - This files contains ConsumeableItemsFactory super class which represents all the consumable items
* 'Data.java' - This is the file that contains the Super class of all the data saved in game
* 'Dragon.java' - This file contains the Dragon class which is the parent class of Monster class
* 'Exoskeleton.java' - This file contains the Exoskeleton class which is the sub class of Monster class.
* 'FireSpell.java'- This file contains the FireSpell class which is the sub-class of Spell class.
* 'FireSpellFactory.java'- This file contains the FireSpellFactory class which "creates" the fire spell.
* 'Game.java'- This file contains the Game class which is the super class of all the board games.
* 'Hero.java'- This file contains the Hero class which has Character as a parent class.
* 'HeroData.java'- This file contains the Hero Data class which has all the displayable Hero data.
* 'HeroFactory.java'- This file contains the HeroFactory class which "creates" the heroes.
* 'HeroPiece.java'- This file contains the HeroPiece class which represents the location of hero party on the board.
* 'HeroTeam.java'- This file contains the HeroTeam class which creates the hero team.
* 'IceSpell.java'- This file contains the IceSpell class which is the sub-class of Spell class.
* 'IceSpellFactory.java'- This file contains the IceSpellFactory class which "creates" the ice spell
* 'InaccessibleCell.java'- This file contains the InaccessibleCell class which extends the Cell class
* 'Item.java'- This file contains the Item class which is a super class for all the types of items used throughout in the game.
* 'ItemFactory.java'- This file contains the ItemFactory class which has abstract method to create items.
* 'Legends.java'= This file contains the Legends class which has player, hero team and board.
* 'LightningSpell.java'- This file contains the LightningSpell class which is the sub-class of Spell class.
* 'LightningSpellFactory.java'- This file contains the LightningSpellFactory class which "creates" the Lightning Spell.
* 'Main.java'- This file contains the Main class and main method.
* 'Market.java'- This file contains the Market class which checks for the trading with the player.
* 'MarketBuying.java'- This file contains the MarketBuying class where Hero buys the items.
* 'MarketCell.java'- This file contains the MarketCell class which extends the Cell class.
* 'MarketSelling.java'- This file contains the MarketSelling class where Hero sells the items.
* 'Monster.java'- This file contains the Monster class which has Character as a parent class.
* 'MonsterFactory.java'- This file contains the Monster Factory class which generates the monsters when the battle commenced.
* 'MonsterTeam.java'- This file contains the MonsterTeam class which creates the MonsterTeam.
* 'NullPiece.java'- This file contains the NullPiece class which represents the null value of th piece.
* 'Paladin.java'- This file contains the Paladin class which is the sub class of Hero class.
* 'Piece.java'- This file contains the Piece class which represents the movable entity on the cells of board.
* 'Potion.java'- This file contains the Potion class which represents the items consumed by the hero.
* 'PotionFactory.java'- This file contains the PotionFactory class which creates potion.
* 'PotionsData.java'- This class contains the representable data of potion menu.
* 'RPGBoard.java'- This file contains the RPGBoard class which extends Board class.
* 'RPGGame.java'- This file contains the RPGGame class which extends Game class.
* 'Rules.java'- This file contains the Rules class which has all the formulas used in the game.
* 'Sorcerer.java'- This file contains the Sorcerer class which is the subclass of Hero class
* 'Spell.java'- This file contains the Spell class which is the subclass of ConsumeableItems class.
* 'SpellFactory.java'- This file contains the SpellFactory class which has abstract method to create items.
* 'SpellsData.java'- This class contains the representable data of Spell menu.
* 'Spirit.java'- This file contains the Spirit class which is the parent class of Monster class.
* 'UseableItems.java'- This files contains UseableItems super class which represents all the useable items.
* 'UseableItemsFactory.java'- This files contains UseableItemsFactory super class which represents all the useable items.
* 'Warrior.java'- This file contains the Warrior class which is the subclass of Hero class.
* 'Weapon.java'- This file contains the Weapon class which is used to represent a Weapons in the game.
* 'WeaponFactory.java'- This file contains the Weapon Factory class which returns weapon objects in the game.
* 'WeaponryData.java'- This file contains the WeaponryData class which is represents weapon data.

##Extendibility from old assignment
--------------------------------------------------------------------
* The Game class is the same one that was extended by TicTacToe and OrderAndChaos and TriantaEna.

  This assignment also has a new class called RPGGames, which is extended from the Game class, which is a parent class
  of various games like TicTacToe game.
  This is because we wanted to make the code more modular and reusable.
  This way, if we wanted to add another role playing game, we could just extend the RPGGames class and add the new game.
  This would also make it easier to add new features to the game, such as a GUI,
  without having to change the code for the other games.

  This game contains two types of Characters: Hero and Monster, these are the two classes which are extended from the Character class.
  The RPGBoard class is also extended from the Board class, which is a parent class of all the board games.
  The Board is made up of cells, which are further bifurcated into 3 different classes namely, Market Cell, Common Cell and Inaccessible Cell.
  These Cells, contains Piece as an object composition, which has our team of players.

  There are 3 types of heroes extended from the Hero class - Warriors, Sorcerers and Paladins. There unique changes are
  incorporated in a levelUp() method.

  There are also 3 types of monsters extended from the Monster class - Spirits, Dragons, Exoskeletons.
  A HeroTeam is class which is a collection of Hero objects, that is our players and likewise, MonsterTeam
  is a class which is a collection of monster players.

  There are 2 types of pieces extended from the Piece class, HeroPiece and the NullPiece.
  Items are bifurcated in useableitems (Weapon and Armory) and consumableitems (Spell and Potion).

  A Market class is called in market cell, which has buying and selling logic incorporated.
  I have used encapsulation to hide the attributes of the classes and only expose the methods that are needed to interact with the class.

  Moreover, I even tried to implement the SOLID principles in my code.


##How to compile and run
--------------------------------------------------------------------
1. After unzipping the file, go to the src directory
2. Compile the files using the following command :
    `javac Main.java`
3. Run the program using the following command :
    `java Main`


##Bonus functionality Implemented
--------------------------------------------------------------------
*Used factory patter and abstract factory pattern for HearTeam, MonsterTeam, BoardCells, Items.
*The game can also be played in team of max 3 heroes.
*Used colors in console


##Running example
--------------------------------------------------------------------

___________________________________________
| Welcome to Legends: Monsters and Heroes |
___________________________________________

The monsters and heroes live in a fictional world. They do not get along and therefore fight each other.
Every time the heroes win, they gain experience and money. Heroes use the money to buy a variety of
items to aid them in their battles with the monsters. When they accumulate enough experience they
level up, which improves their skills. The goal of the game is for the heroes to defeat monsters and level
up indefinitely.
Please enter the name of player:
dhun
dhun please choose the number of Heroes in your world (1-3):
1

|  Hero Id  |     Warrior Name    |  Initial Level  |  Mana  |  Strength  |  Agility  |  Dexterity  |  Initial Gold  | Initial Experience Points |

|   101     |  Gaerdal_Ironhand   |       1         |   100   |    700    |    500    |     600     |      1354      |             7             |
|   102     |  Sehanine_Monnbow   |       1         |   600   |    700    |    800    |     500     |      2500      |             8             |
|   103     |  Muamman_Duathall   |       1         |   300   |    900    |    500    |     750     |      2546      |             6             |
|   104     |  Flandal_Steelskin  |       1         |   200   |    750    |    650    |     700     |      2500      |             7             |
|   105     |  Undefeated_Yoj     |       1         |   400   |    800    |    400    |     700     |      2500      |             7             |
|   106     |  Eunoia_Cyn         |       1         |   400   |    700    |    800    |     600     |      2500      |             6             |

|  Hero Id  |     Sorcerers Name     |  Initial Level  |   Mana   |  Strength  |  Agility  |  Dexterity  |  Initial Gold  | Initial Experience Points |

|   107     |  Rillifane_Rallathil   |       1         |   1300   |    750    |    450    |     500     |      2500      |             9             |
|   108     |  Segojan_Earthcaller   |       1         |   900    |    800    |    500    |     650     |      2500      |             5             |
|   109     |  Reign_Havoc           |       1         |   800    |    800    |    800    |     800     |      2500      |             8             |
|   110     |  Reverie_Ashels        |       1         |   900    |    800    |    700    |     400     |      2500      |             7             |
|   111     |  Kalabar               |       1         |   800    |    850    |    400    |     600     |      2500      |             6             |
|   112     |  Skye_Soar             |       1         |   1000   |    700    |    400    |     500     |      2500      |             5             |

|  Hero Id  |     Paladins Name      |  Initial Level  |   Mana  |  Strength  |  Agility  |  Dexterity  |  Initial Gold  | Initial Experience Points |

|   113     |  Parzival              |       1         |   300   |    750    |    650    |     700     |      2500      |             7             |
|   114     |  Sehanine_Moonbow      |       1         |   300   |    750    |    700    |     700     |      2500      |             7             |
|   115     |  Skoraeus_Stonebones   |       1         |   250   |    650    |    600    |     350     |      2500      |             4             |
|   116     |  Garl_Glittergold      |       1         |   100   |    600    |    500    |     400     |      2500      |             5             |
|   117     |  Amaryllis_Astra       |       1         |   500   |    500    |    500    |     500     |      2500      |             5             |
|   118     |  Caliber_Heist         |       1         |   400   |    400    |    400    |     400     |      2500      |             8             |
Enter the Hero Id of the hero to create team:
111

Hero Team:

|	HeroId	|	Hero Name	|	Level	|	Mana Points	|	Strength	|	Agility	|	Dexterity	|	Gold	|	Experience Points	|	Health Points	|
|	111		|	Kalabar	|	1	|	800	|	850	|	400	|	600	|	2500	|	6	|	100	|

Board:
'M' - Market
'I' - Inaccessible region
Rest is common/battle region
| M | | I | | I | | M | | M | |   | | M | | M |
|   | |   | | I | | I | | I | | M | |   | | M |
|   | | M | | M | |   | | M | | I | |   | |   |
|   | |   | |   | | I | |   | |   | |   | |   |
| I | |   | |   | |   | |   | |   | | I | |   |
|   | | I | | I | | M | | M | | M | | M | | I |
|   | |   | | I | | M | |   | | M | |   | |   |
| I | |   | | I | |   | | M | |   | |   | | X |
1. To Move Up
2. To Move Down
3. To Move Left
4. To Move Right
5. To Quit the game
(I/i) Hero Team Information
Please enter your move as below:
1

Board:
'M' - Market
'I' - Inaccessible region
Rest is common/battle region
| M | | I | | I | | M | | M | |   | | M | | M |
|   | |   | | I | | I | | I | | M | |   | | M |
|   | | M | | M | |   | | M | | I | |   | |   |
|   | |   | |   | | I | |   | |   | |   | |   |
| I | |   | |   | |   | |   | |   | | I | |   |
|   | | I | | I | | M | | M | | M | | M | | I |
|   | |   | | I | | M | |   | | M | |   | | X |
| I | |   | | I | |   | | M | |   | |   | |   |
Battle Begins

Hero in Battle

1|	111		|	Kalabar	|	1	|	800	|	850	|	400	|	600	|	2500	|	6	|	100	|

Monster in Battle

1|	101		|	Blinky	|	1	|	100	|	450	|	350	|	35	|

Hero turn begins
1. Attack, using the hero’s equipped weapon
2. Cast a spell from the hero’s inventory
3. Use a potion from the hero’s inventory
4. Equip a weapon
5. Equip a piece of armor
(H/h) Hero Team Information
(M/m) Monster Team Information
Enter the number to perform the move:
1
Kalabar attacked the Blinky and 47 of damage was caused.
Hero turn ends
Monster turn begins
Kalabar was attacked by the Blinky and 450 of damage was caused.

Monster turn ends
All Hero died, Monster Team won the Battle!!!
