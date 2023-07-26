package controller;

import domain.Service_BeforeLogin;
import view.View_SignUp;
import view.View_SignUpConfirmMyData;

public class SignUp_Controller {
	private View_SignUp view_SignUp;	
	
	public SignUp_Controller() {
		signUp_Controller();		
	}
	
	private void signUp_Controller() {
		String opSignUp;
		String loopSignUp= "0";
		do {
				view_SignUp = new View_SignUp();
			
				String userNameString = view_SignUp.printSignUpUsername(); 		
				String checkingSignUp;
				checkingSignUp = Service_BeforeLogin.signUpCheckDataUserName(userNameString);
				
				String emailString = null;
				String passwordString = null;  
				
				if(checkingSignUp == "true") {			
					
						emailString =  view_SignUp.printSignUpEmail();
						checkingSignUp = Service_BeforeLogin.signUpCheckDataEmail(emailString);
						
					if (checkingSignUp == "true") {			
						
						 passwordString = view_SignUp.printSignUpPassword(); 
						 checkingSignUp = Service_BeforeLogin.signUpCheckDataPassword(passwordString);
						 
						 if (checkingSignUp == "true") {		
							 
							 	View_SignUpConfirmMyData view_SignUpConfirmMyData = new View_SignUpConfirmMyData();									
								opSignUp = view_SignUpConfirmMyData.printSignUpConfirmMyData(checkingSignUp, userNameString, emailString);
											
								boolean	trueDefault = true;
								
								switch (opSignUp) {
									case "0": //sair
										loopSignUp = "1";
									break;
									case "1":  // refazer sign in
										 loopSignUp = "0";
					    			
					    			break;
					    			//if(checkingSignUp == true) {
										//switch(opSignUp) {
											case "2":  //Confirmar dados e criar usuário			
												Service_BeforeLogin.signUpCreateAccount(userNameString,emailString,passwordString);    	
												loopSignUp = "1";
											break;
										//}
									//}
									default:
										view_SignUpConfirmMyData.printSignUpConfirmMyDataDefault(trueDefault);
										loopSignUp = "0";										// repete sign in
									break;
									}						 
							 
						 } else {
								view_SignUp.printErrorUserPassword(checkingSignUp);
						 }					 
						 
					} else {
						view_SignUp.printErrorUserEmail(checkingSignUp);
					}			 
				} else {
					view_SignUp.printErrorUserName(checkingSignUp);
				}				
										
			} while(loopSignUp== "0");
	BackToMainMenu();		
	}
	
	private void BackToMainMenu() {
		new MainMenu_Controller();
	}
	
	
}
