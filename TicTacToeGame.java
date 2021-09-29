package com.CoreJavaWorkshop;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
	static char[] board;
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static ArrayList<Integer> computerPositions = new ArrayList<Integer>();

	public static void main  (String[] args){
		char[] board = createBoard();//creating empty board
		while(true) {
			displayBoard(board);
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter your placement (1-9): ");
			int playerPos = userInput.nextInt();
			placeSymbol(board,playerPos,"Player");
			Random rand = new Random();
			int computerPos = rand.nextInt(9)+1;
			placeSymbol(board,computerPos,"Computer");
			displayBoard(board);
		}
	}

	//UC1: Assign empty space to board
	public static char[] createBoard() {
		char[] board = new char[10];	
		for(int i=1 ; i<board.length ; i++) {
			board[i] = ' ' ;
		}
		return board;
	}

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

	//UC3: Display board
	public static void displayBoard(char[] board){
		System.out.println("  0  " + board[1] + "|" + board[2] + "|" + board[3]);
		System.out.println("    --+--+--");
		System.out.println("  1  " + board[4] + "|" + board[5] + "|" + board[6]);
		System.out.println("    --+--+--");
		System.out.println("  2  " + board[7] + "|" + board[8] + "|" + board[9]);
		System.out.println("     0 1 2 ");
	}
}