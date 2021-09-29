
package com.CoreJavaWorkshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
	static char[] board;
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static ArrayList<Integer> computerPositions = new ArrayList<Integer>();
	private int turns;
	public static void main  (String[] args){
		char[] board = createBoard();//creating empty board		

		//Scanner userInput = new Scanner(System.in);
		//char userLetter = chooseUserLetter(userInput); 
		//char computerLetter = (userLetter == 'X')?'O':'X';

		displayBoard(board);
		while(true) {
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter your placement (1-9): ");
			int playerPos = userInput.nextInt();
			while(playerPositions.contains(playerPos)|| computerPositions.contains(playerPos)) {
				System.out.println("Position taken! Enter a correct position");
				playerPos = userInput.nextInt();
			}
			placeSymbol(board,playerPos,"Player");
			String result = checkWinner();
			if(result.length()>0) {
				System.out.println(result);
				break;
			}
			Random rand = new Random();
			int computerPos = rand.nextInt(9)+1;
			while(playerPositions.contains(computerPos)|| computerPositions.contains(computerPos)) {
				System.out.println("Position taken! Enter a correct position");
				computerPos = rand.nextInt(9)+1;
			}

			placeSymbol(board,computerPos,"Computer");
			displayBoard(board);
			result = checkWinner();
			if(result.length()>0) {
				System.out.println(result);
				break;
			}
		}
	}	

	/*	private static char chooseUserLetter(Scanner userInput) {
		System.out.println("Choose your letter: ");
		return userInput.next().toUpperCase().charAt(0);
	}
	 */

	//UC1: Assign empty space to board
	public static char[] createBoard() {
		char[] board = new char[10];	
		for(int i=1 ; i<board.length ; i++) {
			board[i] = ' ' ;
		}
		return board;
	}

	//UC3: Display board
	public static void displayBoard(char[] board){
		System.out.println("  0  " + board[1] + "|" + board[2] + "|" + board[3]);
		System.out.println("    --+--+--");
		System.out.println("  1  " + board[4] + "|" + board[5] + "|" + board[6]);
		System.out.println("    --+--+--");
		System.out.println("  2  " + board[7] + "|" + board[8] + "|" + board[9]);
		System.out.println("     0 1 2 ");
	}
	/*
	public char playerAt( int r)
	{
		if ( isValid(r) )
			return board[r];
		else
			return '@';
	}

	private boolean isValid(int r) {
		if ( 0 <= r && r <= 2 )
			return true;
		else
			return false;
	}
	public int numTurns()
	{
		return turns;
	}
	public void playMove( char p, int r )
	{
		if(turns<=9){
			board[r]=p;
			turns++;
		}else {
			System.out.println("It's a tie!");
		}
	}
	 */

	//UC2: Determine player and its move
	public static void placeSymbol(char[] board, int pos, String user) {
		char symbol ='X';
		if(user.equals("Player")) {
			symbol='X';	
			playerPositions.add(pos);
		}else if(user.equals("Computer")) {
			symbol='O';
			computerPositions.add(pos);
		}
		switch(pos)
		{
		case 1:
			board[1]=symbol;
			break;

		case 2:
			board[2]=symbol;
			break;

		case 3:
			board[3]=symbol;
			break;

		case 4:
			board[4]=symbol;
			break;

		case 5:
			board[5]=symbol;
			break;

		case 6:
			board[6]=symbol;
			break;

		case 7:
			board[7]=symbol;
			break;

		case 8:
			board[8]=symbol;
			break;

		case 9:
			board[9]=symbol;
			break;

		default:
			break;

		}

	}

	public static String checkWinner() {
		List topRow = Arrays.asList(1,2,3);
		List midRow = Arrays.asList(4,5,6);
		List bottomRow = Arrays.asList(7,8,9);
		List leftCol = Arrays.asList(1,4,7);
		List midCol = Arrays.asList(2,5,8);
		List rightCol = Arrays.asList(3,6,9);
		List cross1 = Arrays.asList(1,5,9);
		List cross2 = Arrays.asList(7,5,3);
		//List of winning conditions
		List<List> winning = new ArrayList<List>();
		winning.add(topRow);
		winning.add(midRow);
		winning.add(bottomRow);
		winning.add(leftCol);
		winning.add(midCol);
		winning.add(rightCol);
		winning.add(cross1);
		winning.add(cross2);
		for(List l : winning) {
			if(playerPositions.containsAll(l)) {
				return "Congratulations Player Wins";
			}else if(computerPositions.containsAll(l)) {
				return "Congratulations Computer Wins";
			}else if(playerPositions.size()+ computerPositions.size()==9) {
				return "DRAW";
			}

		}
		return"";

	}

}	
