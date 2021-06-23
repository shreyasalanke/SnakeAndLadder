package com.bridgelabz;

import java.util.Random;


public class SnakeLadder
{
	
	
	public static void main(String[] args)
	
	{
		int player1 = 0;
		
		
		int dice1 = (int)(Math.floor(Math.random()* 10)%7);
		System.out.println("die1 value is:"+dice1);
		int dice2 = (int)(Math.floor(Math.random()* 10)%3);
		
		switch ((int)dice2)
		{
		case 0:
			System.out.println("no play");
			player1 += 0;
			break;
		case 1:
			System.out.println("Ladder");
			player1 += dice1;
			break;
        
		default:
			System.out.println("Snake");
			player1 -= dice1;
			break;
		}
		if (player1 < 0)
			player1=0;
	
	
		System.out.println("palyer position is :"+player1);
	}
 
}