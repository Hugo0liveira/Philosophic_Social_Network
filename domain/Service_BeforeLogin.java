package domain;

import database.Database;

public class Service_BeforeLogin {
	
	public static Boolean loginCheckData( String emailString, String passwordString) {
		boolean loginCheck = false;
		//confere dados			
    	if (emailString==null) {
    		try {
    		throw new RuntimeException("Erro User: email não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Errado! Email de usuário não pode ser nulo!"); return loginCheck;    			
    		}
    	} else if(emailString.equals("")) {
    		try {
    		throw new RuntimeException("Erro User: email não pode ser vazio");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Errado! Email de usuário não pode ser vazio!"); return loginCheck;
    		}
    	}else if(emailString.length() < 20 ) {
    		try{
        		throw new RuntimeException("Erro User: email não pode ser menor que 20 digitos!");
        		}
        		catch (RuntimeException ex) {
        			System.out.println("Email não pode ser menor que 20 digitos!"); return loginCheck;
        		} 		
    	}    	
    	 if (passwordString==null) {
        		try {
        		throw new RuntimeException("Erro User: password não pode ser null");
        		}
        		catch (RuntimeException ex) {
        			System.out.println("Errado! Senha não pode ser nula!"); return loginCheck;
        		}
        	} else if(passwordString.equals("")) {
        		try {
        		throw new RuntimeException("Erro User: password não pode ser vazio");
        		}
        		catch (RuntimeException ex) {
        			System.out.println("Errado! Senha não pode ser vazia!"); return loginCheck;
        		}    		
        	}else if(passwordString.length() < 15 ) {
        		try{
            		throw new RuntimeException("Erro User: password não pode ser menor que 15 digitos!");
            		}
            		catch (RuntimeException ex) {
            			System.out.println("Senha não pode ser menor que 15 digitos!"); return loginCheck;   			
            		}  		
        	}    	 
    	 
    	 for (int i =0; i < Database.users.size() ; i++) {
    			if(passwordString.equals(Database.users.get(i).getPassword()) && emailString.equals(Database.users.get(i).getEmail())  ) {
    				//System.out.print("Senha e email corretos! ");
    				loginCheck = true;
    			}    			
    	 }
    	 
    	 return loginCheck;
	} //loginCheckData
	
	public static String signUpCheckDataUserName( String userNameString) {
		
		for(int i=0; i<Database.users.size(); i++) {
			if (Database.users.get(i).getUserName().equals(userNameString)) {
	    		try {
	    		throw new RuntimeException("UserName sendo usado por algum user!"); 
	    		}
	    		catch (RuntimeException ex) {	    			
	    			 return "UserName sendo usado por algum user!";
	    		}
			}
		}
		if (userNameString==null) {
    		try {
    		throw new RuntimeException("Erro User: userNameString não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			return "Errado! userNameString de usuário não pode ser nulo!";    			
    		}
    	} else if(userNameString.equals("")) {
    		try {
    		throw new RuntimeException("Erro User: userNameString não pode ser vazio");
    		}
    		catch (RuntimeException ex) {
    			return "Errado! userNameString de usuário não pode ser vazio!"; 
    		}
    	}else if(userNameString.length() < 12 ) {
    		try{
        		throw new RuntimeException("Erro User: userNameString não pode ser menor que 12 digitos!");
        		}
        		catch (RuntimeException ex) {
        			return "userNameString não pode ser menor que 12 digitos!"; 
        		} 		
    	} else {
    		return "true";
    	}    	
				
	}//signUpCheckDataUserName
	
	public static String signUpCheckDataEmail(String emailString) {		
		//confere dados			
		for(int i=0; i<Database.users.size(); i++) {
			if (Database.users.get(i).getEmail().equals(emailString)) {
	    		try {
	    		throw new RuntimeException("Email sendo usado por algum user!"); 
	    		}
	    		catch (RuntimeException ex) {	    			
	    			 return "Email sendo usado por algum user!";
	    		}
			}
		}		
    	if (emailString==null) {
    		try {
    		throw new RuntimeException("Erro User: email não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			return"Errado! Email de usuário não pode ser nulo!";     			
    		}
    	} else if(emailString.equals("")) {
    		try {
    		throw new RuntimeException("Erro User: email não pode ser vazio");
    		}
    		catch (RuntimeException ex) {
    			return"Errado! Email de usuário não pode ser vazio!";
    		}
    	}else if(emailString.length() < 17 ) {
    		try{
        		throw new RuntimeException("Erro User: email não pode ser menor que 20 digitos!");
        		}
        		catch (RuntimeException ex) {
        			return"Email não pode ser menor que 17 digitos!";
        		} 		
    	} else {
    		return "true";
    	}
	}//signUpCheckDataEmail
	
	public static String signUpCheckDataPassword(String passwordString) {
    	 if (passwordString==null) {
        		try {
        		throw new RuntimeException("Erro User: password não pode ser null");
        		}
        		catch (RuntimeException ex) {
        			return"Errado! Senha não pode ser nula!";
        		}
        	} else if(passwordString.equals("")) {
        		try {
        		throw new RuntimeException("Erro User: password não pode ser vazio");
        		}
        		catch (RuntimeException ex) {
        			return"Errado! Senha não pode ser vazia!";
        		}    		
        	}else if(passwordString.length() < 15 ) {
        		try{
            		throw new RuntimeException("Erro User: password não pode ser menor que 13 digitos!");
            		}
            		catch (RuntimeException ex) {
            			return"Senha não pode ser menor que 13 digitos!";   			
            		}  		
        	} else {
        		return "true";
        	}
	}//signUpCheckDataPassword
	
	public static void signUpCreateAccount( String userNameString, String emailString, String passwordString) {
		String checkCreateAccount = "false";
		checkCreateAccount = signUpCheckDataUserName(userNameString);
		checkCreateAccount = signUpCheckDataEmail(emailString);
		checkCreateAccount = signUpCheckDataPassword(passwordString);
		if(checkCreateAccount == "true" ) {
			User newUser = Service_Instantiator.instantiateUser(userNameString, emailString, passwordString);
			Service_Notification.notificationCreateAccount(newUser);													//NOTIFICATION	    	
		}
	}//signUpCreateAccount	
	
}//Service_BeforeLogin
