package controller;

import view.View_LoggedMainMenu;
import view.View_Loading2;
import view.View_Exiting;

public class LoggedMainMenu_Controller {	
	private View_LoggedMainMenu view_LoggedMainMenu;
	private View_Loading2 view_Loading2;
	private View_Exiting view_Exiting;
	
	public LoggedMainMenu_Controller(String MyEmail){
		loggedMainMenu_Controller(MyEmail);
	}
	
	public void loggedMainMenu_Controller(String MyEmail){		
		view_Loading2 = new View_Loading2();
		view_Loading2.printLoading2();
		view_LoggedMainMenu = new View_LoggedMainMenu();	
		
	String loopMainMenuLoggedIn = "0";
	String opMainMenuLoggedIn = "0";
	do {	// APÓS ESTAR LOGADO								
		opMainMenuLoggedIn = view_LoggedMainMenu.printLoggedMainMenu();
			switch(opMainMenuLoggedIn) {
			case "1": 	// Pesquisar
				new Search_Controller(MyEmail);				
				loopMainMenuLoggedIn="0";	
			 break;
			case "2": 	// Amigos
				new Friends_Controller(MyEmail);				
				loopMainMenuLoggedIn="0";
			 break;
			case "3": 	// Grupos						
				new GroupMenu_Controller(MyEmail);
				loopMainMenuLoggedIn="0";
			 break;
			case "4":       //conversas
				new ConversationMainMenu_Controller(MyEmail);
				loopMainMenuLoggedIn="0";
			 break;
			case "5":       // DENÚNCIAS (REPORT)
				new ReportMenu_Controller(MyEmail);
				loopMainMenuLoggedIn="0";
			break;
			case "6":       // EDITAR DADOS CADASTRO 				
				new EditMyData_Controller(MyEmail);
				loopMainMenuLoggedIn="0";
			break;
			case "+":       // NOTIFICAÇÕES			
				new Notifications_Controller(MyEmail);
				loopMainMenuLoggedIn="0";
			break;
			case "0":  // LOG OFF
				view_Exiting = new View_Exiting();
				view_Exiting.printExiting();				
				new MainMenu_Controller();
				loopMainMenuLoggedIn= "1";				
			break;
			default:
				view_LoggedMainMenu.printError();
				loopMainMenuLoggedIn="0";
			break;
			}
		}while(loopMainMenuLoggedIn=="0");
				
	
	}
}
