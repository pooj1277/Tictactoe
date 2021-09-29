package com.CoreJavaWorkshop;

import java.util.ArrayList;

public class TicTacToeGame {
	static char[] board;
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static ArrayList<Integer> computerPositions = new ArrayList<Integer>();
	
	public static void main  (String[] args){
		char[] board = createBoard();//creating empty board

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
}