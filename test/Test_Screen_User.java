package test;

import java.util.Scanner;

import database.Database;
import domain.User;
import view.View_User;

public class Test_Screen_User {		
	protected static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		User u3;
		u3 = Database.getUserData("Eu");				
		
		View_User screen_user1 = new View_User(u3);				
		
		Scanner t = new Scanner(System.in);
		int op1 = 0;
				
		do {
			screen_user1.printCleanConsole();
		screen_user1.printMainMenu();
		op1 = t.nextInt();
	    t.nextLine();
	    					screen_user1.printCleanConsole();
			switch(op1){
			case 1:				
					screen_user1.printLogin();
					
						//confere dados
					if(screen_user1.printLoginCheckingData() == true) {   
									screen_user1.printCleanConsole();								
									
														screen_user1.printLoading();
														t.nextLine();   // apenas para pausar e esparar usuário ler
														screen_user1.printCleanConsole();
																screen_user1.printLoggedMainMenu(); System.exit(0);// entra em rede social
								
							} else {
								
								System.out.println("Email e/ou Senha errado(s)! ");
								t.nextLine();   // apenas para pausar e esperar usuário ler   // substituir por  Thread.sleep
								op1 = 0;
							}
				break;			
			case 2:
				int op2 = 0;
				do {
				screen_user1.printSignInLoading();
				screen_user1.printSignInReading();
							screen_user1.printCleanConsole();
				screen_user1.printSignInConfirmMyData();								
					op2 = t.nextInt();
					t.nextLine();  
			    	if (op2==0) {      								 // repete sign in
			    		op1=0;    
			    			screen_user1.printCleanConsole();
			    	} else if (op2==1) {
			    		op1=0;
			    		op2=1;
					/*		screen_user.printCleanConsole();
			    		screen_user.printLoadingNext();			    					    		
			    		System. exit(0); 	*/			//termina sign in e confirma os dados de conta			    					    		
			    	} else {
			    		System.out.println("Comando inválido"); 
			    		t.nextLine();   // apenas para pausar e esparar usuário ler
			    		op2=0;										// repete sign in		    		
			    	}
				} while(op2==0);
						
				break;
			
			default:
				System.out.println("Comando inválido");
				t.nextLine();   // apenas para pausar e esparar usuário ler
				op1=0;
				
				break;			
			}
		} while (op1 == 0);		
		
		t.close();
		
	}// Main
}// Test_Screen_User
