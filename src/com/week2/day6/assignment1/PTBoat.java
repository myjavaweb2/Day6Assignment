package com.week2.day6.assignment1;

public class PTBoat 
{
	String row;
	int column;

	// Provide a constructor

	public boolean isHit(String row, int column)
	{
		return (this.row.equals(row) & this.column==column);
	}

}
