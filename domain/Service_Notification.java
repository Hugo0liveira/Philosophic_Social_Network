package domain;



public class Service_Notification {
	
	public static String allNotifications( User me) {		
		StringBuilder result = new StringBuilder();		
		for (int i = me.getNotifications() .size() - 1; i >= 0; i-- ) {
			result.append( me.getNotifications().get(i) + "\n\n" );
		}
	return result.toString();		
	}
	
	public static void notificationCreateAccount( User  newUser) {			
		newUser.addNotification("Bem-vindo a sua rede social dialética!"); 	
	}
					// 	EDITS
	public static void notificationEditName( User user) {			
		user.addNotification("Seu UserNAME foi alterado!"); 	
	}
	
	public static void notificationEditEmail( User user) {			
		user.addNotification("Seu EMAIL foi alterado!"); 		
	}
	
	public static void notificationEditPassword( User user ) {		
		user.addNotification("Sua SENHA foi alterada!"); 	 		
	}
					// GROUPS
	public static void notificationRemoveMember( Group selectedGroup, User deletingUser) {		
		for(User users : selectedGroup.getModerators()  ) {
	    	users.addNotification(deletingUser.getUserName() + " foi deletado de " + selectedGroup.getName() );
	    	users.addNotificationGroup(selectedGroup);
	    }
	}
		
	public static void notificationRequestToGroup( Group theGroup, User user) {		
		theGroup.addNotificationJoinRequest(user);
		for(int i=0; i < theGroup.getModerators().size(); i++){									
			 theGroup.getModerators().get(i).addNotification( user.getUserName() + " quer participar do grupo.");           	// notification
		}
	}
			 
	 public static void notificationinvitationGroup( Group group, User user) {
		 user.addNotificationGroup(group);
		 user.addNotification(group.getName() + " lhe convidou para ser membro.");   // notification
	}
	
	 public static void notificationAddingModerator( Group group, User newModerator) {
		 for(User u : group.getModerators()  ) {
			 u.addNotification(newModerator.toString() + " se tornou moderador em: " + group.getName());
			 u.addNotificationGroup(group);
		 }
		 
		 newModerator.addNotification(group.getName() + " lhe tornou moderador.");   // notification
	}
	 
	 public static void notificationCreateComment( Comment newComment) {
		 newComment.getPost().getAuthor().addNotification("Novo comentário em seu post: " + newComment.getText() );   // notification
		 newComment.getPost().getAuthor().addNotificationPost(newComment.getPost());
	}
	 
	 public static void notificationCreateGroup( User user, Group group) {
			user.addNotification(group.getName() + ": Seu novo grupo foi criado!");
			user.addNotificationGroup(group);
	}
	                 // CONVERSATION
	 public static void notificationNewConversation( User user1, User user2,  Conversation c ) {		
		 user2.addNotificationConversation(c);
		 user2.addNotification(user1.getUserName() + " iniciou coversa contigo!" );             
	}
	 
	 public static void notificationRemoveMeFromConversation( Conversation c, User user) {
		 for(User u : c.getUsers() ) {
			 u.addNotificationConversation(c);
			 u.addNotification( user.getUserName() + " saiu de conversa." +  c.toString()   );
		 }
	 }
		 
	 public static void notificationAddUserInConversation( Conversation c, User userToAdd) {
		 for (User u : c.getUsers() ) {		
			u.addNotificationConversation(c);
			u.addNotification(userToAdd + " foi adicionado em conversa: " +  c.toString() );  //NOTIFICAÇÃO
		}
	 }
		 
	public static void notificationDeleteMessage( Conversation c, User user) {
		for (User u : c.getUsers() ) {		
			u.addNotificationConversation(c);
			u.addNotification(user + " deletou mensagem em: " +  c.toString() );  //NOTIFICAÇÃO
		}
	}
	
	public static void notificationAdMessage( Conversation c, User user) {
		for (User u : c.getUsers() ) {		
			u.addNotificationConversation(c);
			u.addNotification(user + " enviou mensagem em: " +  c.toString() );  //NOTIFICAÇÃO
		}
	}
								// FRIENDSHIP	 
	public static void notificationFriendship( User user, User possibleFriend) {
		possibleFriend.addNotificationFriendship(user);
		possibleFriend.addNotification(user.toString() + " enviou convite de amizade.");  //NOTIFICAÇÃO
	}		 
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
	
	

}
