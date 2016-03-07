package javaGame;

public class Player
{
	String playerName;
	float playerHealth = 30;
	int maxHealth = 30;
	int playerLevel = 1;

	
	public Player(String PlayerName)
	{
	 playerName = PlayerName;
	}
	
	public int SetMaxHealth(int MaxHealth, int MaxHealthChange)
	{
	 maxHealth = MaxHealth + MaxHealthChange;
	 return maxHealth;
	}
	
	public float SetHealth(float PlayerHealth, float HealthChange)
	{
		playerHealth = PlayerHealth + HealthChange;
		if(playerHealth > maxHealth)
		{
			playerHealth = maxHealth;
		}
		return playerHealth;
	}
	public int LevelUp(int PlayerLevel)
	{
		playerLevel = PlayerLevel + 1;
		return playerLevel;
	}
	
	void PrintStatus()
	{
		System.out.println("Name: " + playerName);
		System.out.println("Hp: " + playerHealth);
		System.out.println("Level: " + playerLevel);
	}
}
