package controller;

import domain.Service_BeforeLogin;
import view.View_Login;

public class Login_Controller {
	private View_Login view_Login;
	
	public Login_Controller() {
		login_Controller();
	}
		
		public void login_Controller() {	
		view_Login = new View_Login();		
		boolean loopCheckingLogin = true;
		while(loopCheckingLogin == true) {
			boolean checkingLogin=false;
			String email = view_Login.printLogInEmail();		
			String password = view_Login.printLogInPassword();
			checkingLogin = Service_BeforeLogin.loginCheckData( email, password);
			if( checkingLogin == true) {
				loopCheckingLogin = false;
				loggedMainMenu_Controller(email);	 
			} else {	
				view_Login.printLogInError();				
				loopCheckingLogin = false;
			}		
		}//loop
	}
	
	//enviar string de email do Usuário Atual para o Service_LoggedMainMenu	
	private void loggedMainMenu_Controller(String MyEmail) {
		new LoggedMainMenu_Controller(MyEmail);		
	}
	
	
	

}

