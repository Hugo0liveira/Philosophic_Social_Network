package domain;

public class Service_Friends extends Service_AfterLogin {
	
	// AMIGOS
	
		public static String showMyFriends(String MyEmail) {
			StringBuilder searchResult = new StringBuilder();
			User me = getMySelf(MyEmail);
			for (User friend : me.getFriends() ) {			 
				  searchResult.append(friend.getUserName() + "\n");
		      }			
			return searchResult.toString();
		}
		
		public static String showsFriendsOrdered(String MyEmail) {
			StringBuilder searchResult = new StringBuilder();
			User me = getMySelf(MyEmail);
			for (int i=0; i< me.getFriends().size() ; i++ ) {			 
				  searchResult.append( (i+1) + ") "  + me.getFriends().get(i).getUserName() + "\n");
		      }			
			return searchResult.toString();
		}
						
		public static String getMyFriendName(String MyEmail, String selectedFriendNumber) {
			User me = getMySelf(MyEmail);
			int number = -22;					
			try {
				number =  Integer.parseInt( selectedFriendNumber);
			}catch (NumberFormatException nfe) {}
				number = number -1;		
		    			if(  me.getFriends().size() <= number || number < 0 ) {
		    				return null;
		    			} else {
		    				return me.getFriends().get(number).getUserName();	
		    			}
		}
		
		public static String solicitFriendship(String MyEmail, String nome) {			
			String sent = "error";
			try {
				User me = getMySelf(MyEmail);
				User possibleFriend = getOthers(nome);			
				 if(possibleFriend != null) {					
					 Service_Notification.notificationFriendship(me, possibleFriend);   				//NOTIFICAÇÃO
					sent = possibleFriend.getUserName();
				 }
			 throw new RuntimeException("Não pode ser null");
			}
			catch (RuntimeException ex) {}	
			 return sent;
		}
		
		public static String removeFriendship(String MyEmail, String nome) {			
			String operation = "error";
			try {
				User me = getMySelf(MyEmail);
				User user = getOthers(nome);			
				 if(user != null) {
					 me.removeFriend(user);
					 user.removeFriend(me);
					 operation = user.getUserName();
				 }
			 throw new RuntimeException("Não pode ser null");
			}
			catch (RuntimeException ex) {}	
			 return operation;
		}
		
		public static String addFriendship(String MyEmail, String name) {			
			String operation = "error";
			try {
				User me = getMySelf(MyEmail);
				User user = getOthers(name);			
				 if(user != null) {
					 me.addFriend(user);
					 user.addFriend(me);
					 operation = user.getUserName();
				 }
			 throw new RuntimeException("Não pode ser null");
			}
			catch (RuntimeException ex) {}	
			 return operation;
		}
		
		public static String addInvite(String MyEmail, String selectedGroupName) {			
			String operation = "error";
			try {
				User me = getMySelf(MyEmail);
				Group theGroup = getTheGroup(selectedGroupName);		
				 if( theGroup != null) {
					 me.addMyGroup( theGroup);
					 theGroup.addMember(me);
					 operation = theGroup.toString();
				 }
			 throw new RuntimeException("Não pode ser null");
			}
			catch (RuntimeException ex) {}	
			 return operation;
		}

}
