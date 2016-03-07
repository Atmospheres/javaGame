package javaGame;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class javaGame 
{

	public static void main(String[] args) 
	{

		boolean gameActive = true;
		char playerChoice = 0;
		float playerHealth = 30;
		float playerMaxHealth = 30;
		float playerOldHealth;
		String playerLocation;
		String assignClass;
		String name = "Brad";
		int fight;
		boolean playersTurn = true;
		int playerArmor;
		String skillOne;
		String skillTwo;
		String skillThree;
		String enemySkillOne;
		String enemySkillTwo;
		String enemySkillThree;
		String setEnemyClass;
		int enemyArmor;
		float enemyHealth = 10;
		float enemyOldHealth;
		int enemyMaxHealth;
		float healthChange;
		int enemyChoice;
		
		Enemy enemy = new Enemy("Goblin", 1);
		EnemyClass enemyClass = new EnemyClass("Bandit");
		Action attack = new Action();
		EnemyAction enemyAttack = new EnemyAction();
		Scanner scanner = new Scanner(System.in);
		while (gameActive == true) 
		{
			System.out.println("Welcome To The Arena:");
			System.out.println("what would you like to name your character?");
			name = scanner.next();
			Player player = new Player(name);
			fight = 1;
			playerLocation = "Atrium";
			System.out.println("What Class would you like to be?");
			System.out.println("1: Fighter");
			System.out.println("2: Cleric");
			System.out.println("3: Mage");
			playerChoice = scanner.next().charAt(0);
			
			switch (playerChoice) 
			{			
				case '1':
					assignClass = "Fighter";
					break;
				case '2':
					assignClass = "Cleric";
					break;
				case '3':
					assignClass = "Mage";
					break;
				default:
					assignClass = "Fighter";
					break;
			} 
			PlayerClass playerClass = new PlayerClass(assignClass);
			skillOne = playerClass.SetSkillOne();
			skillTwo = playerClass.SetSkillTwo();
			skillThree = playerClass.SetSkillThree();
			playerArmor = playerClass.SetPlayerArmor();
			playerMaxHealth = player.SetMaxHealth(30,0);
			playerHealth = playerMaxHealth;
			System.out.println("Type '0' at any time to check your status");
			while (playerHealth > 0) 
			{
				if (playerLocation == "Atrium") 
				{				
					while (playerLocation == "Atrium") 
					{
						System.out.println("You are standing in the Atrium of the complex.");	
						System.out.println("You see a sign leading you to the Arena and the Armory.");
						System.out.println("What would you like to do?");
						System.out.println("1: Go to the Armory");
						System.out.println("2: Go to the Arena");
						playerChoice = scanner.next().charAt(0);
						switch (playerChoice) 
						{
							case '0':
								player.PrintStatus();
								playerClass.PrintClass();
								break;
							case '1':
								playerLocation = "Armory";
								break;
							case '2':
								playerLocation = "Arena";
								break;
							default:
								break;
						}
					}
				} 
				else if (playerLocation == "Armory")
				{
					while (playerLocation == "Armory")
					{
						System.out.println("Stepping into the Armory you see a Quartermaster behind a desk.");
						System.out.println("Getting ready for a fight?");
						System.out.println("What can we do for you?");
						System.out.println("1: Change Class");
						System.out.println("2: Info on next fight");
						System.out.println("3: Go back to the Atrium");
						playerChoice = scanner.next().charAt(0);
						switch (playerChoice) 
						{
							case '0':
								player.PrintStatus();
								playerClass.PrintClass();
								break;
							case '1':
								System.out.println("What Class would you like to be?");
								System.out.println("1: Fighter");
								System.out.println("2: Cleric");
								System.out.println("3: Mage");
								playerChoice = scanner.next().charAt(0);
								switch (playerChoice) 
								{			
									case '1':
										playerClass.ChangeClass("Fighter");
										break;
									case '2':
										playerClass.ChangeClass("Cleric");
										break;
									case '3':
										playerClass.ChangeClass("Mage");
										break;
									default:
										break;
								} 	
								skillOne = playerClass.SetSkillOne();
								skillTwo = playerClass.SetSkillTwo();
								skillThree = playerClass.SetSkillThree();
								playerArmor = playerClass.SetPlayerArmor();
								break;
							case '2':
								if(fight == 1)
								{
									System.out.println("Your first fight is against a goblin.");
									System.out.println("It should be an easy one.");
									

								}
								else if(fight == 2)
								{
									System.out.println("Your second fight is against ");
								}
								else if(fight >= 3)
								{System.out.println("Your fight will be tough");
								}
								break;
							case '3':
								playerLocation = "Atrium";
								break;
							default:
								break;
						}
					}
				}
				else if (playerLocation == "Arena")
				{
					while (playerLocation == "Arena")
					{
						while(playerHealth > 0 && enemyHealth >0)
						{
						System.out.println("You are standing at the enterance to the Arena");
						System.out.println("Prepare your self and enter.");
						System.out.println("What would you like to do?:");
						System.out.println("1: Go to the Atrium");
						System.out.println("2: Enter the Arena and Fight");
						playerChoice = scanner.next().charAt(0);
						switch (playerChoice) 
						{
							case '0':
								player.PrintStatus();
								playerClass.PrintClass();
								break;
							case '1':
								playerLocation = "Atrium";
								break;
							case '2':
								
								if(fight == 1)
								{
									System.out.println("You enter the Arena and see a small goblin standing opposite you.");
									enemySkillOne = enemyClass.SetEnemySkillOne();
									enemySkillTwo = enemyClass.SetEnemySkillTwo();
									enemySkillThree = enemyClass.SetEnemySkillThree();
									enemyArmor = enemy.SetEnemyArmor(2);
									enemyMaxHealth= enemy.SetEnemyMaxHealth(30,0);
									enemyHealth = enemy.SetEnemyHealth(25,0);
									// playerLocation = "Atrium";
									while(playerHealth > 0 && enemyHealth >0)
									{
										if(playersTurn == true)
										{
											System.out.println("It is your turn.");
											System.out.println("Whatwould you like to do?");
											System.out.println("1: " + skillOne);
											System.out.println("2: " + skillTwo);
											System.out.println("3: " + skillThree);
											playerChoice = scanner.next().charAt(0);
											switch (playerChoice) 
											{
												case '0':
													player.PrintStatus();
													playerClass.PrintClass();
													enemy.PrintEnemyStatus();
													enemyClass.PrintEnemyClass();
													break;
												case '1':
													enemyOldHealth = enemyHealth;
													healthChange = attack.Attack(skillOne);
													enemyHealth = enemy.SetEnemyHealth(enemyOldHealth,healthChange);
													System.out.println("You have hit the enemy for " + healthChange);
													System.out.println("Enemy HP:" + enemyHealth);
													playersTurn = false;
													break;
												case '2':
													enemyOldHealth = enemyHealth;
													healthChange = attack.Attack(skillTwo);
													enemyHealth = enemy.SetEnemyHealth(enemyOldHealth,healthChange);
													System.out.println("You have hit the enemy for " + healthChange);
													System.out.println("Enemy HP:" + enemyHealth);
													playersTurn = false;
													break;
												case '3':
													enemyOldHealth = enemyHealth;
													healthChange = attack.Attack(skillThree);
													enemyHealth = enemy.SetEnemyHealth(enemyOldHealth,healthChange);
													System.out.println("You have hit the enemy for " + healthChange);
													System.out.println("Enemy HP:" + enemyHealth);
													playersTurn = false;
													break;
												default:
													break;
											}
										}	
										else if(playersTurn == false)
										{
											System.out.println("It is the enemies turn.");
											enemyChoice = ThreadLocalRandom.current().nextInt(1,4);
											switch (enemyChoice) 
											{
												case 1:
													playerOldHealth = playerHealth;
													healthChange = enemyAttack.Attack(enemySkillOne);
													playerHealth = player.SetHealth(playerOldHealth,healthChange);
													System.out.println("You have been hit for " + healthChange);
													System.out.println("HP: " + playerHealth);
													playersTurn = true;
													break;
												case 2:
													playerOldHealth = playerHealth;
													healthChange = enemyAttack.Attack(enemySkillTwo);
													playerHealth = player.SetHealth(playerOldHealth,healthChange);
													System.out.println("You have been hit for " + healthChange);
													System.out.println("HP: " + playerHealth);
													playersTurn = true;
													break;
												case 3:
													playerOldHealth = playerHealth;
													healthChange = enemyAttack.Attack(enemySkillThree);
													playerHealth = player.SetHealth(playerOldHealth,healthChange);
													System.out.println("You have been hit for " + healthChange);
													System.out.println("HP: " + playerHealth);
													playersTurn = true;
													break;
												default:
													playersTurn = true;
													break;
											}
										}
									}
								}
								else if(fight == 2)
								{
									System.out.println("As you enter the arena a Fighter begins to charge you.");
									setEnemyClass = enemyClass.NewEnemyClass("Fighter");
									enemySkillOne = enemyClass.SetEnemySkillOne();
									enemySkillTwo = enemyClass.SetEnemySkillTwo();
									enemySkillThree = enemyClass.SetEnemySkillThree();
									enemyArmor = enemy.SetEnemyArmor(4);
									enemyMaxHealth= enemy.SetEnemyMaxHealth(30,0);
									enemyHealth = enemy.SetEnemyHealth(30,0);
									while(playerHealth > 0 && enemyHealth >0)
									{
										if(playersTurn == true)
										{
											System.out.println("It is your turn.");
											System.out.println("Whatwould you like to do?");
											System.out.println("1: " + skillOne);
											System.out.println("2: " + skillTwo);
											System.out.println("3: " + skillThree);
											playerChoice = scanner.next().charAt(0);
											switch (playerChoice) 
											{
												case '0':
													player.PrintStatus();
													playerClass.PrintClass();
													enemy.PrintEnemyStatus();
													enemyClass.PrintEnemyClass();
													break;
												case '1':
													enemyOldHealth = enemyHealth;
													healthChange = attack.Attack(skillOne);
													enemyHealth = enemy.SetEnemyHealth(enemyOldHealth,healthChange);
													System.out.println("You have hit the enemy for " + healthChange);
													System.out.println("Enemy HP:" + enemyHealth);
													playersTurn = false;
													break;
												case '2':
													enemyOldHealth = enemyHealth;
													healthChange = attack.Attack(skillTwo);
													enemyHealth = enemy.SetEnemyHealth(enemyOldHealth,healthChange);
													System.out.println("You have hit the enemy for " + healthChange);
													System.out.println("Enemy HP:" + enemyHealth);
													playersTurn = false;
													break;
												case '3':
													enemyOldHealth = enemyHealth;
													healthChange = attack.Attack(skillThree);
													enemyHealth = enemy.SetEnemyHealth(enemyOldHealth,healthChange);
													System.out.println("You have hit the enemy for " + healthChange);
													System.out.println("Enemy HP:" + enemyHealth);
													playersTurn = false;
													break;
												default:
													break;
											}
										}	
										else if(playersTurn == false)
										{
											System.out.println("It is the enemies turn.");
											enemyChoice = ThreadLocalRandom.current().nextInt(1,4);
											switch (enemyChoice) 
											{
												case 1:
													playerOldHealth = playerHealth;
													healthChange = enemyAttack.Attack(enemySkillOne);
													playerHealth = player.SetHealth(playerOldHealth,healthChange);
													System.out.println("You have been hit for " + healthChange);
													System.out.println("HP: " + playerHealth);
													playersTurn = true;
													break;
												case 2:
													playerOldHealth = playerHealth;
													healthChange = enemyAttack.Attack(enemySkillTwo);
													playerHealth = player.SetHealth(playerOldHealth,healthChange);
													System.out.println("You have been hit for " + healthChange);
													System.out.println("HP: " + playerHealth);
													playersTurn = true;
													break;
												case 3:
													playerOldHealth = playerHealth;
													healthChange = enemyAttack.Attack(enemySkillThree);
													playerHealth = player.SetHealth(playerOldHealth,healthChange);
													System.out.println("You have been hit for " + healthChange);
													System.out.println("HP: " + playerHealth);
													playersTurn = true;
													break;
												default:
													playersTurn = true;
													break;
											}
										}
									}
								}
								
								else if(fight >= 3)
								{
									System.out.println("As you enter the arena a Fighter begins to charge you.");
												
									setEnemyClass = enemyClass.NewEnemyClass("Cleric");
									enemySkillOne = enemyClass.SetEnemySkillOne();
									enemySkillTwo = enemyClass.SetEnemySkillTwo();
									enemySkillThree = enemyClass.SetEnemySkillThree();
									enemyArmor = enemy.SetEnemyArmor(2);
									enemyMaxHealth= enemy.SetEnemyMaxHealth(30,0);
									enemyMaxHealth= enemy.SetEnemyMaxHealth(30,0);
									enemyHealth = enemy.SetEnemyHealth(30,0);
												
									playerLocation = "Atrium";
									while(playerHealth > 0 && enemyHealth >0)
									{
										if(playersTurn == true)
										{
											System.out.println("It is your turn.");
											System.out.println("Whatwould you like to do?");
											System.out.println("1: " + skillOne);
											System.out.println("2: " + skillTwo);
											System.out.println("3: " + skillThree);
											playerChoice = scanner.next().charAt(0);
											switch (playerChoice) 
											{
												case '0':
													player.PrintStatus();
													playerClass.PrintClass();
													enemy.PrintEnemyStatus();
													enemyClass.PrintEnemyClass();
													break;
												case '1':
													enemyOldHealth = enemyHealth;
													healthChange = attack.Attack(skillOne);
													enemyHealth = enemy.SetEnemyHealth(enemyOldHealth,healthChange);
													System.out.println("You have hit the enemy for " + healthChange);
													System.out.println("Enemy HP:" + enemyHealth);
													playersTurn = false;
													break;
												case '2':
													enemyOldHealth = enemyHealth;
													healthChange = attack.Attack(skillTwo);
													enemyHealth = enemy.SetEnemyHealth(enemyOldHealth,healthChange);
													System.out.println("You have hit the enemy for " + healthChange);
													System.out.println("Enemy HP:" + enemyHealth);
													playersTurn = false;
													break;
												case '3':
													enemyOldHealth = enemyHealth;
													healthChange = attack.Attack(skillThree);
													enemyHealth = enemy.SetEnemyHealth(enemyOldHealth,healthChange);
													System.out.println("You have hit the enemy for " + healthChange);
													System.out.println("Enemy HP:" + enemyHealth);
													playersTurn = false;
													break;
												default:
													break;
											}
										}	
										else if(playersTurn == false)
										{
											System.out.println("It is the enemies turn.");
											enemyChoice = ThreadLocalRandom.current().nextInt(1,4);
														
											switch (enemyChoice) 
											{
												case 1:
													playerOldHealth = playerHealth;
													healthChange = enemyAttack.Attack(enemySkillOne);
													playerHealth = player.SetHealth(playerOldHealth,healthChange);
													System.out.println("You have been hit for " + healthChange);
													System.out.println("HP: " + playerHealth);
													playersTurn = true;
													break;
												case 2:
													playerOldHealth = playerHealth;
													healthChange = enemyAttack.Attack(enemySkillTwo);
													playerHealth = player.SetHealth(playerOldHealth,healthChange);
													System.out.println("You have been hit for " + healthChange);
													System.out.println("HP: " + playerHealth);
													playersTurn = true;
													break;
												case 3:
													playerOldHealth = playerHealth;
													healthChange = enemyAttack.Attack(enemySkillThree);
													playerHealth = player.SetHealth(playerOldHealth,healthChange);
													System.out.println("You have been hit for " + healthChange);
													System.out.println("HP: " + playerHealth);
													playersTurn = true;
													break;
												default:
													playersTurn = true;
													break;
													}
												}
											}
										}
										break;
									default:
										break;
								}
								if(playerHealth >=0)
								{
									fight += 1;
									playerHealth = playerMaxHealth;
									playerLocation = "Atrium";
									enemyHealth = 30;
								}
							}
						}
					} 
				}
				System.out.println("You have died, would you like to play again?");
				System.out.println("1: Yes");
				System.out.println("2: No");
				playerChoice = scanner.next().charAt(0);
				switch (playerChoice) 
				{
					case '1':
						System.out.println("Good Luck!");
						playerHealth = playerMaxHealth;
						break;
					case '2':
						System.out.println("Thank you for playing.");
						System.exit(1);
					break;
			
				}	
			}
		}	
	}


