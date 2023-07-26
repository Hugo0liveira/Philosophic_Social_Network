package test;

import java.util.Scanner;

import database.Database;
import domain.User;
import view.View_Report;

public class Test_Screen_Report {
	
	public static void main(String[] args) {
		
		User u3;
		u3 = Database.getUserData("Eu");
		
		View_Report screen_report1 = new View_Report(u3);
		
		Scanner t = new Scanner(System.in);
		String opsMainMenuScreenReport = "0";				
		do {				// menu principal de denúncias
			screen_report1.printCleanConsole();				
			screen_report1.printReportScreen(u3);
			opsMainMenuScreenReport = t.nextLine();
		    	switch(opsMainMenuScreenReport) {
		    		case "1":          // Fazer denúncia
		    			screen_report1.printCleanConsole();		
		    			String reportedUserSelected = screen_report1.printReadSelectingReportedUser();
		    			if(reportedUserSelected != "User inexistente!") {
		    			screen_report1.readAddReportReason(u3, reportedUserSelected);	//retorna Report
		    			}
		    			opsMainMenuScreenReport= "0";
		    		break;																    		
		    		case "0":																    		
		    			opsMainMenuScreenReport= "1";
		    		break;																    		
		    		default:		    			
		    			opsMainMenuScreenReport= "0";
		    		break;		    
		    	}																    
			} while(opsMainMenuScreenReport== "0");
		screen_report1.printCleanConsole();		
		
		System.exit(0);                
		t.close();
		
	} //main()
} //Test_Screen_Report
