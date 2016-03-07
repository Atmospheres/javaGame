package javaGame;
import java.util.concurrent.ThreadLocalRandom;
public class EnemyAction
{		
		float damage;
		Dice dice = new Dice();
		
		public float Attack(String EnemyAttack)
		{
			String attack = EnemyAttack;
			 
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
			else if(attack == "Shiv")
			{
				damage = dice.DFour()+dice.DFour();
			}
			else if(attack == "Leap Strike")
			{
				damage = dice.DEight();
			}
			else if(attack == "Backstab")
			{
				damage = dice.DTen();
			}
			damage = -damage;	
			return damage;
		}
}
