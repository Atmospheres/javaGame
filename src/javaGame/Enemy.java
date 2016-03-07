package javaGame;

public class Enemy
{
	String enemyName;
	float enemyHealth = 30;
	int enemyMaxHealth = 30;
	int enemyArmor = 0;
	int enemyLevel = 0;

	public Enemy(String EnemyName, int EnemyLevel)
	{
	 enemyName = EnemyName;
	 enemyLevel = EnemyLevel;
	}
	
	public int SetEnemyMaxHealth(int EnemyMaxHealth, int EnemyMaxHealthChange)
	{
	 enemyMaxHealth = EnemyMaxHealth + EnemyMaxHealthChange;
	 return enemyMaxHealth;
	}
	
	public float SetEnemyHealth(float EnemyHealth, float EnemyHealthChange)
	{
		enemyHealth = EnemyHealth + EnemyHealthChange;
		if(enemyHealth > enemyMaxHealth)
		{
			enemyHealth = enemyMaxHealth;
		}
		return enemyHealth;
	}
	
	public int SetEnemyArmor(int EnemyArmor)
	{
		enemyArmor = EnemyArmor;
		return enemyArmor;
	}
	
	public String EnemyName()
	{
		return enemyName;
	}
	void PrintEnemyStatus()
	{
		System.out.println("Name: " + enemyName);
		System.out.println("Hp: " + enemyHealth);
		System.out.println("Armor: " + enemyArmor);
		System.out.println("Level: " + enemyLevel);
	}
}
