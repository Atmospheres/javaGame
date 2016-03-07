package javaGame;

import java.util.concurrent.ThreadLocalRandom;

public class Dice{
	

	public int DFour()
	{
		int dFour = ThreadLocalRandom.current().nextInt(1,7);
		return dFour;
	}
	public int DSix()
	{
		int dSix = ThreadLocalRandom.current().nextInt(1,7);
		return dSix;
	}
	public int DEight()
	{
		int dEight = ThreadLocalRandom.current().nextInt(1,7);
		return dEight;
	}
	public int DTen()
	{
		int dTen = ThreadLocalRandom.current().nextInt(1,7);
		return dTen;
	}
}