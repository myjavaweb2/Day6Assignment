package com.week2.day6.assignment1;

public class PTBoatGame 
{
	private PTBoat[] ptBoats = new PTBoat[6];
	private int numberOfBoats = 0;

	public PTBoatGame() 
	{
		{
		}
	
		public void addBoat(String row, int column)
		{
		    // Add a new boat to the ptBoats array
		    // You will need to use the numberOfBoats
		    // value to tell you what element of the
		    // array to initialize
		    // remember to increment the numberOfBoats 
		    // before you leave
			
			ptBoats[numberOfBoats++] = PTBoat(row, column);
			
		}
	
		public boolean guess(String row, int column)
		{
		    // Check to see if the guess hit any of the ships.
		    // Return true only if a ship was hit
			
			boolean isHit == false
			
				for (int i = 0; i < 6; i++)
				{
					isHit = (ptBoats[i].isHit(row, column) || isHit);
				}
			return isHit;
				
		} 
	
		public static void main(String[] args)
		{
		    // Create a PTBoatGame instance
		    // Add 6 PTBoats
			
		    // Take six guesses and output the following string for each
		    // If the guess hit a pt boat...
		    // Guess number # at row <row>, column <column> hit a PTBoat
	
		    // If the guess missed all boats
		    // Guess number # missed
			
			
			PTBoatGame ptboatgame = new PTBoatGame();
			ptboatgame.addBoat();
			ptboatgame.guess("a", 7, "b", 4, "c", 9, "d", 8, "e", 5, "f", 6);
			
			if guess(isHit) == true
			{
				System.out.println("Guess number # at row " + row + ", column " + column + " hit a PTBoat");
			}
			else
			{
				System.out.println("Guess number # missed");
			}
	
		}
	}

}
