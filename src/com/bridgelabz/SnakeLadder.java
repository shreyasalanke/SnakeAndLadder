package com.bridgelabz;

import java.util.Random;


public class SnakeLadder
{
	
	
	public static void main(String[] args)
	{
		
		int player1 = 0;
		int player2 = 0;
		int NO_PLAY = 0;
		int LADDER = 1;
		int SNAKE = 2;
		int MOVE = 0;
		double rollDice1 =Math.floor(Math.random()*10)%7;
		double rollDice2 =Math.floor(Math.random()*10)%3;
		
		
		
		if (rollDice2 == LADDER  )
			
		{
		  System.out.println("dice1 value is:"+rollDice1);
		  MOVE = (int)(player1+ rollDice1);
		  System.out.println("position of player1 is:"+ MOVE);
		  
		}
		
		else if (rollDice2 == SNAKE)
		{
				
				System.out.println("dice1 value is :"+rollDice1);
			    MOVE =(int)(player1-rollDice1);
			    System.out.println("postion of player is:"+ MOVE);
			    
		}
		
		else
		{
			
		   System.out.println("player get no play");
			
	  	}
	
    }
	
}
