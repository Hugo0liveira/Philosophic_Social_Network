package controller;

import view.View_ReportMenu;
import domain.Service_Report;
import domain.Service_AfterLogin;

public class ReportMenu_Controller {
	private View_ReportMenu view_ReportMenu;
	
	public ReportMenu_Controller(String MyEmail){
		reportMenu_Controller(MyEmail);
	}
	
	public void reportMenu_Controller(String MyEmail){		
		view_ReportMenu = new View_ReportMenu();		
	String loopReportMenu = "0";
	String opReportMenu = "1";
	String myReports = "";
	do {	// EM mainMenu de GRUPO
			myReports = Service_Report.myReports(MyEmail);
			opReportMenu = view_ReportMenu.printReportMenu(myReports);			
			switch(opReportMenu) {			
			case "0": 	// Voltar
				new LoggedMainMenu_Controller(MyEmail);				
				loopReportMenu = "1";
			 break;
			default:
				view_ReportMenu.printError();
				opReportMenu="0";
			break;
			case "1": 	// FAzer Nova Denúncia
				String users = Service_AfterLogin.allUsers();
				String newReportedName= view_ReportMenu.newReportNameReported(users);
				String conditioncheckUserName = "false"; 
				conditioncheckUserName = Service_Report.checkUserName(newReportedName);
				if(conditioncheckUserName != "true") {
					view_ReportMenu.printErrorReportedName(); opReportMenu="0";
				} else {
				String newReportReason = view_ReportMenu.newReportReason();
				String conditioncheckReason = "false";
				conditioncheckReason = Service_Report.checkReportReason(newReportReason);
					if(conditioncheckReason != "true") {
						view_ReportMenu.printErrorReason(); opReportMenu="0";
					} else {
						Service_Report.newReport(MyEmail, newReportedName, newReportReason);
					loopReportMenu = "0";
					}
				}
			 break;
			}
		} while(loopReportMenu=="0");
			
	}
}
