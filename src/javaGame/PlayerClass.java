package javaGame;

public class PlayerClass 
{

	String playerClass;
	public String skillOne;
	String skillTwo;
	String skillThree;
	int playerArmor;

	
	
	PlayerClass(String PlayerClass)
	{
		playerClass = PlayerClass;
	}
	public String ChangeClass(String PlayerClass)
	{
		playerClass = PlayerClass;
		return playerClass;
	}	
	public String SetSkillOne()
	{
		if(playerClass == "Fighter")
		{
			skillOne = "Swing Sword";
		}
		else if(playerClass == "Cleric")
		{
			skillOne = "Swing Mace";
		}
		else if(playerClass == "Mage")
		{
			skillOne = "Magic Missle";
		}
		return skillOne;
	}
	
	public String SetSkillTwo()
	{
		if(playerClass == "Fighter")
		{
			skillTwo = "Shield Bash";
		}
		else if(playerClass == "Cleric")
		{
			skillTwo = "Smite";
		}
		else if(playerClass == "Mage")
		{
			skillTwo = "Mend Skin";
		}
		return skillTwo;
	}
	public String SetSkillThree()
	{
		if(playerClass == "Fighter")
		{
			skillThree = "Whirlwind";
		}
		else if(playerClass == "Cleric")
		{
			skillThree = "Heal";
		}
		else if(playerClass == "Mage")
		{
			skillThree = "Fireball";
		}
		return skillThree;
	}
	public int SetPlayerArmor()
	{
		if(playerClass == "Fighter")
		{
			playerArmor = 4;
		}
		else if(playerClass == "Cleric")
		{
			playerArmor = 3;
		}
		else if(playerClass == "Mage")
		{
			playerArmor = 1;
		}	
		return playerArmor;
	}
	public void PrintClass()
	{
		System.out.println("Armor: " + playerArmor);
		System.out.println("Class: " + playerClass);
		System.out.println("Skill 1:" + skillOne);
		System.out.println("Skill 2:" + skillTwo);
		System.out.println("Skill 3:" + skillThree);
	}
	
}
