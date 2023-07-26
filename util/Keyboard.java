package util;

import java.util.Scanner;

public class Keyboard {
	
	protected static Scanner keyboard = new Scanner(System.in);
	
	public static void pressEnter() {
		keyboard.nextLine();
	}
	
	public static String readString() {
		String string = keyboard.nextLine();
		return string;
	}
	
	public static void printCleanConsole(){
		int i;
		for(i=0; i<100; i++) {
		System.out.println("    ");
		}		
	}

}
