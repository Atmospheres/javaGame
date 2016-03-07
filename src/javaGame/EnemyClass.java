package javaGame;

public class EnemyClass {

	String enemyClass;
	String enemySkillOne;
	String enemySkillTwo;
	String enemySkillThree;

	
	
	EnemyClass(String EnemyClass)
	{
		enemyClass = EnemyClass;
	}
	public String NewEnemyClass(String EnemyClass)
	{
		enemyClass = EnemyClass;
		return enemyClass;
	}
	
	public String SetEnemySkillOne()
	{
		if(enemyClass == "Fighter")
		{
			enemySkillOne = "Swing Sword";
		}
		else if(enemyClass == "Cleric")
		{
			enemySkillOne = "Swing Mace";
		}
		else if(enemyClass == "Mage")
		{
			enemySkillOne = "Magic Missle";
		}
		else if(enemyClass == "Bandit")
		{
			enemySkillOne = "Shiv";
		}
		return enemySkillOne;
	}
	
	public String SetEnemySkillTwo()
	{
		if(enemyClass == "Fighter")
		{
			enemySkillTwo = "Shield Bash";
		}
		else if(enemyClass == "Cleric")
		{
			enemySkillTwo = "Smite";
		}
		else if(enemyClass == "Mage")
		{
			enemySkillTwo = "Mend Skin";
		}
		else if(enemyClass == "Bandit")
		{
			enemySkillTwo = "Leap Strike";
		}
		return enemySkillTwo;
	}
	public String SetEnemySkillThree()
	{
		if(enemyClass == "Fighter")
		{
			enemySkillThree = "Whirlwind";
		}
		else if(enemyClass == "Cleric")
		{
			enemySkillThree = "Heal";
		}
		else if(enemyClass == "Mage")
		{
			enemySkillThree = "Fireball";
		}
		else if(enemyClass == "Bandit")
		{
			enemySkillThree = "Backstab";
		}
		return enemySkillThree;
	}
	public void PrintEnemyClass()
	{
		System.out.println("Enemy Class: " + enemyClass);
		System.out.println("Enemy Skill 1:" + enemySkillOne);
		System.out.println("Enemy Skill 2:" + enemySkillTwo);
		System.out.println("Enemy Skill 3:" + enemySkillThree);
	}
	
}