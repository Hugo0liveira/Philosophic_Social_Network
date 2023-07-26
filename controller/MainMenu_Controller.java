package controller;

import view.View_MainMenu;
import view.View_Exiting;

public class MainMenu_Controller {
	private View_MainMenu view_MainMenu;
	private View_Exiting view_Exiting;
	
	public MainMenu_Controller(){
		controlMainMenu();
	}
	
	private void controlMainMenu() {
		view_MainMenu = new View_MainMenu();
		view_Exiting = new View_Exiting();
				boolean FalseDefault = false;
				boolean TrueDefault = true;
		String loopMainMenuToLog = "0";
		String opMainMenuToLog;	
		do {                         // INICIO DE PROGRAMA. OPÇÕES PARA LOGAR E FAZER CADASTRO			
			
			opMainMenuToLog = view_MainMenu.printMainMenu(FalseDefault);						
				
				switch(opMainMenuToLog){
				case "1":				
						login_Controller();
						loopMainMenuToLog= "0";
				 break;			
				case "2":
					signUp_Controller();
					loopMainMenuToLog= "0";
				 break;
				case "0":	//  SAIR DE PROGRAMA					
					view_Exiting.printExiting();					
					loopMainMenuToLog= "1";					
				 break;
				default:					
					view_MainMenu.printMainMenu(TrueDefault);		
					loopMainMenuToLog = "0";		
				break;			
				}
		} while (loopMainMenuToLog == "0");
		System.exit(1);
		
	}
	
	private void signUp_Controller() {
		new SignUp_Controller();		
	}
	private void login_Controller() {
		new Login_Controller();		
	}
	
	  
	
	
} //MainMenu_Controller
