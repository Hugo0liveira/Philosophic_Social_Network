package controller;

import view.View_EditMyData;
import view.View_Exiting;
import domain.Service_AfterLogin;

public class EditMyData_Controller {
	private View_EditMyData view_EditMyData;
	private View_Exiting view_Exiting;
	
	public EditMyData_Controller(String MyEmail){
		editMyData_Controller(MyEmail);
	}
	
	public void editMyData_Controller(String MyEmail){
		view_EditMyData = new View_EditMyData();
		
	String loopEditMyData = "0";
	String opEditMyData = "0";
	do {	// EM mainMenu de GRUPO	
		opEditMyData = view_EditMyData.opToEdit();
			switch (opEditMyData) {
			case "0": 	// Voltar
				new LoggedMainMenu_Controller(MyEmail);				
				loopEditMyData="1";
			 break;
			default:
				view_EditMyData.printError();
				loopEditMyData="0";
			 break;
			case "1": 	
				String editUsername = view_EditMyData.editUsername();				
				String checkOperation1 = "true";
				checkOperation1 =  Service_AfterLogin.editMyDataName(MyEmail, editUsername);
				if(checkOperation1 != "true") {
					view_EditMyData.errorEditUserName(); loopEditMyData="0";
				} else {
					view_Exiting = new View_Exiting();
					view_Exiting.printExiting();
					new Login_Controller();
					loopEditMyData="1"; 
				}
			 break;
			case "2": 	
				String editEmail = view_EditMyData.editEmail();
				String checkOperation2 = "true";
				checkOperation2 =  Service_AfterLogin.editMyDataEmail(MyEmail, editEmail);		
				if(checkOperation2 != "true") {
					view_EditMyData.errorEditUserEmail(); loopEditMyData="0";
				} else {
					view_Exiting = new View_Exiting();
					view_Exiting.printExiting();
					new Login_Controller();
					loopEditMyData="1";
				}
			 break;
			case "3": 	
				String editPassword = view_EditMyData.editPassword();
				String checkOperation3 = "true";
				checkOperation3 = Service_AfterLogin.editMyDataPassword(MyEmail, editPassword);
				if(checkOperation3 != "true") {
					view_EditMyData.errorEditUserPassword(); loopEditMyData="0";
				} else {
					view_Exiting = new View_Exiting();
					view_Exiting.printExiting();
					new Login_Controller();
					loopEditMyData="1";
				}
			 break;
			}		
		} while(loopEditMyData=="0");
			
	}

}
