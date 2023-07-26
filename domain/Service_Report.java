package domain;

import database.Database;

public class Service_Report extends Service_AfterLogin {
	
	// REPORTS
	public static String myReports(String MyEmail) {
		StringBuilder result = new StringBuilder();
		User me = null;			
		
		for (User user : Database.users ) {
			if( user.getEmail().equals(MyEmail) ) {
				me = user; 
			}			  
	      }		
		for (int i=0; i< me.getMyReports().size() ; i++ ) {			 
			  result.append("Denúnciado: " +me.getMyReports().get(i).getReportedUser().getUserName() + ".\n Motivo: " + me.getMyReports().get(i).getReason() + "\n\n");
	      }			
		return result.toString();	
	}
	
	public static String checkUserName(String newReportedName) {
		String checkConditions = "false";		
		
		for (User user : Database.users ) {
			if( user.getUserName().equals(newReportedName) ) {
				 checkConditions = "true";
			}
		}
		return checkConditions;	
	}
	
	public static String checkReportReason(String newReportedReason) {
		String checkConditions = "false";		
		
		if (newReportedReason==null) {
			checkConditions = "false";
			} else if(newReportedReason.equals("")) {
    		checkConditions = "false";
    		} else if(newReportedReason.length() < 10) {
    		checkConditions = "false";    	
    		} else {    
    		checkConditions = "true";
    	}	
		return checkConditions;	
	}
	
	public static void newReport(String MyEmail, String newReportedName, String newReportReason) {
		User me = getMySelf(MyEmail);
		User himHer = getOthers(newReportedName);
		Service_Instantiator.instantiateReport(me, himHer, newReportReason);
	}
}
