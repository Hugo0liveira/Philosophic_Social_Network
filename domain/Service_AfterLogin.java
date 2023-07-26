package domain;

import database.Database;

public class Service_AfterLogin {
		
	public static String allUsers() {
		StringBuilder result = new StringBuilder();
		for (int i=0; i < Database.users.size() ; i++ ) {
			result.append( Database.users.get(i).getUserName() + "\n" );
		}
		
		return result.toString();
	}
	
	public static String allGroups() {
		StringBuilder result = new StringBuilder();
		for (int i=0; i < Database.groups.size() ; i++ ) {
			result.append( Database.groups.get(i).getName() + "\n" );
		}
		return result.toString();	
	}
	
	public static String allGroupsByNumber() {
		StringBuilder result = new StringBuilder();
		for (int i=0; i < Database.groups.size() ; i++ ) {
			result.append( (i+1) + ") " + Database.groups.get(i).getName() + "\n" );
		}
		return result.toString();	
	}
	
	public static String allMyGroupsByNumber(String MyEmail) {
		User me = getMySelf(MyEmail);	
		StringBuilder result = new StringBuilder();
		for (int i=0; i < me.getMyGroups().size() ; i++ ) {
			result.append( (i+1) + ") " + me.getMyGroups().get(i).getName() + "\n" );
		}
		return result.toString();	
	}
	
	// EDIT MY DATA	
	public static String editMyDataName(String MyEmail, String NewName) {
	User me = getMySelf(MyEmail);
			String checkConditions = "true";
			if( checkConditions ==	Service_BeforeLogin.signUpCheckDataUserName(NewName)) {
			 me.setUserName(NewName); 
			 Service_Notification.notificationEditName(me);					//NOTIFICATION
			 return  "true";			 
			} else { 
				return  "false";
			}
	}	
	
	public static String editMyDataEmail(String MyEmail, String NewEmail) {
		User me = getMySelf(MyEmail);	
			String checkConditions = "true";
			if( checkConditions ==	Service_BeforeLogin.signUpCheckDataEmail(NewEmail) ) {
			 me.setEmail(NewEmail); 
			 Service_Notification.notificationEditEmail(me);									//NOTIFICATION
			 return  "true";
			} else { 
				return  "false";
			}
		}
	
	public static String editMyDataPassword(String MyEmail, String newPassword) {
		User me = getMySelf(MyEmail);
		String checkConditions = "true";
		if( checkConditions ==	Service_BeforeLogin.signUpCheckDataPassword(newPassword) ) {
		 me.setPassword(newPassword); 
		 Service_Notification.notificationEditPassword(me);							//NOTIFICATION
		 return  "true";
		} else {
			return  "false";
		}
	}
	
	public static User getMySelf(String MyEmail) {
		User me = null;		
			for (User user : Database.users ) {
				if( user.getEmail().equals(MyEmail) ) {
					me = user; 
				}
			}
			return me;
	}
	
	public static String getMyUserName(String MyEmail) {
		User me = null;		
			for (User user : Database.users ) {
				if( user.getEmail().equals(MyEmail) ) {
					me = user; 
				}
			}
			return me.getUserName();
	}
	
	public static User getOthers(String name) {
		User someone = null;		
			for (User user : Database.users ) {
				if( user.getUserName().equals(name) ) {
					someone = user; 
				}
			}
			return someone;
	}
	
	public static String checkUserName(String name) {
		String checkName = "error";			
			for (User user : Database.users ) {
				if( user.getUserName().equals(name) ) {					
					checkName = user.getUserName();
				}
			}
			return checkName;
	}
	
	
	
	public static Group getTheGroup(String name) {
		Group theGroup = null;		
			for (Group group : Database.groups ) {
				if( group.getName().equals(name) ) {
					theGroup = group; 
				}
			}
			return theGroup;
	}
	
	
}




