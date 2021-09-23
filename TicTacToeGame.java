
package com.CoreJavaWorkshop;

public class TicTacToeGame {

	public static void main  (String[] args){
		create();
		System.out.println("empty board created");
	}	
	
	public static void create() {
		char[] array = new char[10];	
		for(int i=1 ; i<10 ; i++) {
			array[i]= ' ' ;

		}
	}

}
