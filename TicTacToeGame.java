
package com.CoreJavaWorkshop;

import java.util.Scanner;

public class TicTacToeGame {

	public static void main  (String[] args){
		create();		
		System.out.println("empty board created");

		play();
	}	

	public static void create() {
		char[] array = new char[10];	
		for(int i=1 ; i<10 ; i++) 
		{
			array[i] = ' ' ;

		}

		private static void play() {
			//char ;
			Scanner scanner = new Scanner(System.in);
			int Computer =1;
			int player =2;
			int exit =3;
			do 
			{
				System.out.println("enter player name:");
				int select = scanner.nextInt();
				if( select > 0 && select <= 3)
				{
					switch(select)
					{
					case 1:

						System.out.println("Player is Computer");
						System.out.println("Enter input X or O: ");
						char input = scanner.next().charAt(0);
						System.out.println("Computer = "+input);
						break;

					case 2:
						System.out.println("Player is User");
						System.out.println("Enter input X or O: ");
						char input1 = scanner.next().charAt(0);
						System.out.println("User = "+input1);
						break;
					case 3:
						System.out.println("EXIT");
						break;


					}//switch
				}//if
				else
				{
					System.out.println("Invalid option");
				}
				}while(!=exit);
		}
		}

	}
