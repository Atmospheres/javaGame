package javaGame;
import java.util.concurrent.ThreadLocalRandom;
public class Action
{		
	float damage;
	Dice dice = new Dice();
	
	public float Attack(String Attack)
	{
		String attack = Attack;
		 
		if(attack == "Swing Sword")
		{
			damage = dice.DEight();
		}
		else if(attack == "Swing Mace")
		{
			damage = dice.DEight();
		}
		else if(attack == "Magic Missle")
		{	
			damage = dice.DFour()+dice.DFour();
		}
		else if(attack == "Shield Bash")
		{
			damage = dice.DTen();
		}
		else if(attack == "Smite")
		{
			damage = dice.DTen();
		}
		else if(attack == "Whirlwind")
		{	
			damage = dice.DFour()+dice.DFour();
		}
		else if(attack == "Fireball")
		{
			damage = dice.DEight();
		}
		damage = -damage;	
		return damage;
	}
}
