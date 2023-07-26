package domain;

import database.Database;

public class Service_Conversation extends Service_AfterLogin {
	// CONVERSAS
	
	public static String showMyConversations(String MyEmail) {
		StringBuilder result = new StringBuilder();
		User me = getMySelf(MyEmail);	
		
		for (int i=0; i< me.getMyConversations().size() ; i++ ) {			 
			  result.append(me.getMyConversations().get(i).getName() + ": " + me.getMyConversations().get(i).getUsers().toString() + "\n\n");
	      }			
		return result.toString();
	}
	
	public static String SelectConversation(String MyEmail) {
		StringBuilder result = new StringBuilder();
		User me = getMySelf(MyEmail);	
		
		for (int i=0; i< me.getMyConversations().size() ; i++ ) {			 
			result.append( (i+1) + ") "  + me.getMyConversations().get(i).getName() + ": " + me.getMyConversations().get(i).getUsers().toString() + "\n\n");
	      }			
		return result.toString();
	}
	
	public static String showOneConversation(String number, String MyEmail) {
		StringBuilder result = new StringBuilder();
		User me = getMySelf(MyEmail);
		try {		
		try {
			int n = Integer.parseInt( number);
			n = n -1;
			for (int i=0; i< me.getMyConversations().size() ; i++ ) {
				if( (i) ==   n  ) {
					result.append( me.getMyConversations().get(i).getName() + ": " + me.getMyConversations().get(i).getUsers().toString() + "\n\n  "  );
					for (int m = 0; m < me.getMyConversations().get(i).getMessages().size() ; m++ ) {
						result.append(	me.getMyConversations().get(i).getMessages().get(m).getSender() + ": " + me.getMyConversations().get(i).getMessages().get(m).getText() + "\n\n");
					}					
				}
				if( 0 > n || n > me.getMyConversations().size() - 1 ) {
					result.append( "\nCONVERSA INEXISTENTE!");
				}
		      }
		}catch (NumberFormatException nfe) {
			// ERRO! Digite número correspondente!
			result.append( "\nCONVERSA INEXISTENTE!");
		}	
		throw new RuntimeException("Não pode ser null");		
		}		
		catch (RuntimeException ex) {}	
		return result.toString();
	}
	
	public static void addMessage( String MyEmail,String number, String text) {		
		User me = getMySelf(MyEmail);	
		try {
			for (int i=0; i< me.getMyConversations().size() ; i++ ) {
				if( (i+1) ==  Integer.parseInt( number) ) {		
					Service_Instantiator.instantiateMessage(me.getMyConversations().get(i), me, text);
					Service_Notification.notificationAdMessage( me.getMyConversations().get(i), me);			  //NOTIFICAÇÃO					
				}				
		      }
		}catch (NumberFormatException nfe) {}		
	}
		
	public static String deleteMyMessage(String MyEmail, String number , String text) {		
		User me = getMySelf(MyEmail);	
		Conversation c = getMyconversation(MyEmail, number);
		String condition = "error";
		try {
			for (int i=0; i< c.getMessages().size() ; i++ ) {
				if( c.getMessages().get(i).getText().equals(text) ) {
					Message m = c.getMessages().get(i);
					if ( m.getSender().getUserName().equals( me.getUserName() ) ) {						
						c.deleteMessage(m );
						condition = m.getText();
						Service_Notification.notificationDeleteMessage(c, me);									//NOTIFICAÇÃO
					}
				}				
		     }
		throw new RuntimeException("Não pode ser null");		
		}		
		catch (RuntimeException ex) {}
		
	return  condition;
	}
	
	public static Conversation getMyconversation(String MyEmail, String number) {		
		User me = getMySelf(MyEmail);	
		Conversation c = null;
				
		try {
			for (int i=0; i< me.getMyConversations().size() ; i++ ) {
				if( (i+1) ==  Integer.parseInt( number) ) {
					c = me.getMyConversations().get(i) ;
				}				
		      }
		}catch (NumberFormatException nfe) {}		
		return  c;
	}
	
	/*The exception "java.lang.OutOfMemoryError: Java heap space" occurs when your 
	 * Java program exhausts the available heap memory allocated for it.*/ 
	public static String addUserInConversation(String number, String MyEmail , String userNameToAdd) {
		User me = getMySelf(MyEmail);
		User userToAdd = null;
		String condition = "ERRO! OU usuário INEXISTENTE OU se ENCONTRA em conversa!";
		Boolean userAlreadyInConversation = false;
					// mesmo resultado foi feito em domain.Conversation
			try {				
				Conversation c=null;
					for (User user : Database.users ) {
						if( user.getUserName().equals(userNameToAdd) ) {
							userToAdd = user; 
						}			  
				      }
					try {
							for (int i=0; i< me.getMyConversations().size() ; i++ ) {
								if( (i+1) ==  Integer.parseInt( number) ) {
									
									for (int u=0; u< me.getMyConversations().get(i).getUsers().size() ; u++ ) {
									 if(me.getMyConversations().get(i).getUsers().get(u).getUserName().equals(userToAdd.getUserName())) {
										 userAlreadyInConversation = true;
									}
								}				
						      }
							}
							if(userAlreadyInConversation == false) {
								for (int i = 0; i < me.getMyConversations().size() ; i++ ) {
									if( (i+1) ==  Integer.parseInt( number) ) {		
										c = me.getMyConversations().get(i);
										for (int u = 0; u < me.getMyConversations().get(i).getUsers().size() ; u++ ) {
										me.getMyConversations().get(i).addUser(userToAdd);
										condition = "ok";		
										}
									}
								}
								Service_Notification.notificationAddUserInConversation( c , userToAdd);         //NOTIFICAÇÃO
							}
					}catch (NumberFormatException nfe) {}
				throw new RuntimeException("Erro em User ou Conversation!");
				}
				catch(RuntimeException ex) {		}

			return condition;
	}
	
	public static void removeMeFromConversation(String MyEmail, String number) {
		User me = getMySelf(MyEmail);	
		try {
			for (int i=0; i< me.getMyConversations().size() ; i++ ) {
				if( (i+1) ==  Integer.parseInt( number) ) {		
					Conversation c = me.getMyConversations().get(i);
					Service_Notification.notificationRemoveMeFromConversation( c, me );     	 // notificação					
					me.getMyConversations().get(i).removeUser(me);		
					
				}				
		      }
		}catch (NumberFormatException nfe) {}		 		
	}
	
	public static void newConversation(String MyEmail, String ConversationName) {
		User me = getMySelf(MyEmail);
		Service_Instantiator.instantiateConversation( ConversationName, me);		
	}
	
	public static void newConversation( String ConversationName, String MyEmail, String userName) {
		User me = getMySelf(MyEmail);	
		User user2 = getOthers(userName);
		 Conversation c = Service_Instantiator.instantiateConversation( ConversationName, me, user2);		
		 Service_Notification.notificationNewConversation(me, user2, c);		  //NOTIFICAÇÃO
	}
	
	public static String getMyConversationNumber( String MyEmail) {
		User me = getMySelf(MyEmail);
		String conversationNumber = "";
		int number = me.getMyConversations().size();		
		conversationNumber = String.valueOf(number);		
		return conversationNumber;
	}
	
}
