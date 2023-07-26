package domain;

import database.Database;

public class Service_Group extends Service_AfterLogin {

	// GRUPOS
	
	public static String getGroupName( String groupSelectedNumber) {
		int number = -22 ;		
		try {
			number =  Integer.parseInt( groupSelectedNumber); 
		}catch (NumberFormatException nfe) {}
		number = number -1;
		if(   Database.groups.size() <= number || number < 0 ) {
			return null;
		} else {
		return Database.groups.get(number).getName();
		}
	}
	
	public static Group getTheGroup(String selectedGroupName) {
		Group theGroup = null;		
		for (Group group : Database.groups ) {
			if( group.getName().equals(selectedGroupName) ) {
				theGroup = group; 
			}
		}
		return theGroup;		
	}
	
	public static String getGroupDescription(String selectedGroupName) {
		Group theGroup = getTheGroup(selectedGroupName);
		return theGroup.getDescription();
	}	
	
	public static String getThePosts ( String selectedGroupName) {
		Group theGroup = getTheGroup(selectedGroupName);
		StringBuilder result = new StringBuilder();
		for (int i=0; i < theGroup.getPosts().size() ; i++ ) {
			result.append( theGroup.getPosts().get(i) + "\n\n" );
		}
		return result.toString();
	}
	
	public static String getThePostsOrdered ( String selectedGroupName) {
		Group theGroup = getTheGroup(selectedGroupName);
		StringBuilder result = new StringBuilder();
		for (int i=0; i < theGroup.getPosts().size() ; i++ ) {
			result.append( (i+1) + ") " + theGroup.getPosts().get(i) + "\n" );
		}
		return result.toString();
	}
	
	public static String getTheCommentsOrdered ( String selectedGroupName, String postChosenNumber) {		
		Post thePost = getThePost(selectedGroupName, postChosenNumber);
		StringBuilder result = new StringBuilder();
		for (int i=0; i < thePost.getComments().size() ; i++ ) {
			result.append( (i+1) + ") " + thePost.getComments().get(i) + "\n" );
		}
		return result.toString();
	}
	
	public static String getTheComments ( String selectedGroupName, String postChosenNumber ) {
		Post thePost = getThePost(selectedGroupName, postChosenNumber);
		
		StringBuilder result = new StringBuilder();
    		try {
    			for (int i=0; i < thePost.getComments().size() ; i++ ) {
    				result.append( thePost.getComments().get(i).getAuthor() + ": " + thePost.getComments().get(i).getText() + "\n\n" );
    			}
    			 result.toString();
    			throw new RuntimeException("Não pode ser null");
    		}
    		catch (RuntimeException ex) {}	
    		if(thePost == null) {
    			return "NULL";
    		}	
    		
    		return result.toString();
	}
	
	public static String checkCommentsChosen (String selectedGroupName, String postChosenNumber, String chosenCommentNumber ) {
		Post thePost = getThePost(selectedGroupName, postChosenNumber);		
		int number = -22 ;   
		try {
			number =	Integer.parseInt(chosenCommentNumber);
		}catch (NumberFormatException nfe) {}
		number = number -1;	
		if(  thePost.getComments().size() <= number || number < 0 ) {
			
			return "NULL";
		} else {
			return thePost.getComments().get(number).getText();
		}
	}
	
	public static Post getThePost(String selectedGroupName, String postNumber) {
		Group theGroup = getTheGroup(selectedGroupName);
		int number = -22 ;   
		try {
			number =	Integer.parseInt(postNumber);
		}catch (NumberFormatException nfe) {}
		number = number -1;	
		if(  theGroup.getPosts().size() <= number || number < 0 ) {
			return null;
		} else {
			return theGroup.getPosts().get(number);
		}
	}
	
	public static Comment getTheComment(String selectedGroupName, String postChosenNumber, String chosenCommentNumber) {
		Post post = getThePost(selectedGroupName, postChosenNumber);
		int number = -22 ;   
		try {
			number =	Integer.parseInt(chosenCommentNumber);
		}catch (NumberFormatException nfe) {}
		number = number -1;	
		if(  post.getComments().size() <= number || number < 0 ) {
			return null;
		} else {
			return post.getComments().get(number);
		}
	}
	
	public static String getTheCommentString(String selectedGroupName, String postChosenNumber, String chosenCommentNumber) {
		Comment comment= getTheComment(selectedGroupName, postChosenNumber, chosenCommentNumber);
		if(comment==null) {
			return  "null";
		}		
		return  comment.getAuthor() + ": " + comment.getText();
	}
	
	public static String getThePostString(String selectedGroupName, String postChosenNumber) {
		Post post = getThePost(selectedGroupName, postChosenNumber);
		if(post==null) {
			return  "null";
		}		
		return  post.getAuthor() + ": " + post.getText();
	}
	
	
	
	public static String getThePostAuthorText(String selectedGroupName, String postNumber) {
		Group theGroup = getTheGroup(selectedGroupName);
		StringBuilder result = new StringBuilder();
		int number = -22 ;   
		try {
			number =	Integer.parseInt(postNumber);
		}catch (NumberFormatException nfe) {	
			
		}
		number = number -1;	
		if(  theGroup.getPosts().size() <= number || number < 0 ) {
			return null;
		} else {
			return result.append( theGroup.getPosts().get(number).getAuthor().getUserName() + ": \n" + theGroup.getPosts().get(number).getText() ).toString() ;
		}
	}
	
	public static String AmIpostAuthor(String selectedGroupName, String MyEmail, String postChosenNumber) {
		Post thePost = getThePost(selectedGroupName, postChosenNumber);
		User me = getMySelf(MyEmail);		
		if( thePost.getAuthor().getUserName().equals(me.getUserName())) {
			return "true";
		} else {
			return "false";
		}
	}
	
	public static String AmIcommentAuthor(String selectedGroupName, String MyEmail, String postChosenNumber, String chosenCommentNumber) {		
		Comment theComment = getTheComment(selectedGroupName, postChosenNumber, chosenCommentNumber);
		User me = getMySelf(MyEmail);
		if( theComment.getAuthor().getUserName().equals(me.getUserName())) {
			return "true";
		} else {
			
			return "false";
		}
	}
	
	public static void deletingPost(String selectedGroupName, String postChosenNumber, String MyEmail) {
		Group theGroup = getTheGroup(selectedGroupName);
		Post thePost = getThePost(selectedGroupName, postChosenNumber);
		theGroup.removePost(thePost);
	}
	
	public static void deletingMyPost(String selectedGroupName, String postChosenNumber, String MyEmail) {
		Group theGroup = getTheGroup(selectedGroupName);
		Post thePost = getThePost(selectedGroupName, postChosenNumber);
		User me = getMySelf(MyEmail);
		theGroup.removePost(thePost);
		me.removeMyPosts(thePost);
	}
	
	public static void deletingComment(String selectedGroupName, String postChosenNumber,  String chosenCommentNumber) {
		Post thePost = getThePost(selectedGroupName, postChosenNumber);
		Comment theComment = getTheComment(selectedGroupName, postChosenNumber, chosenCommentNumber);
		thePost.removeComment(theComment);
	}
	
	public static void deletingMyComment(String selectedGroupName, String postChosenNumber, String MyEmail, String chosenCommentNumber) {
		Post thePost = getThePost(selectedGroupName, postChosenNumber);
		Comment theComment = getTheComment(selectedGroupName, postChosenNumber, chosenCommentNumber);
		User me = getMySelf(MyEmail);
		thePost.removeComment(theComment);
		me.removeMyComments(theComment);
	}
	
	public static String checkAccessLevel ( String MyEmail, String selectedGroupName) {
		Group theGroup = getTheGroup(selectedGroupName);
		User me = getMySelf(MyEmail);
		String accessLevel = "notMember";
		 for (int i=0; i < theGroup.getMembers().size(); i++) {
			if( theGroup.getMembers().get(i).getUserName().equals(me.getUserName()) ) {
				accessLevel = "Member";
			}
		 }   
		return accessLevel;
	}
	
	public static String checkModeratorAccess ( String MyEmail, String selectedGroupName) {
		Group theGroup = getTheGroup(selectedGroupName);
		User me = getMySelf(MyEmail);
		String moderatorAccess = "notMember";
		 for (int i=0; i < theGroup.getModerators().size(); i++) {
			if( theGroup.getModerators().get(i).getUserName().equals(me.getUserName()) ) {
				moderatorAccess = "Moderator";
			}
		 }   
		return moderatorAccess;
	}
	
	
	public static String getTheMembers ( String selectedGroupName) {
		Group theGroup = getTheGroup(selectedGroupName);
		StringBuilder result = new StringBuilder();
		for (int i=0; i < theGroup.getMembers().size() ; i++ ) {
			result.append( theGroup.getMembers().get(i).getUserName() + "\n" );
		}
		return result.toString();
	}
	
	public static String getTheModerators ( String selectedGroupName) {
		Group theGroup = getTheGroup(selectedGroupName);
		StringBuilder result = new StringBuilder();
		for (int i=0; i < theGroup.getModerators().size() ; i++ ) {
			result.append( theGroup.getModerators().get(i).getUserName() + "\n" );
		}
		return result.toString();
	}
	
	
	public static String getMyGroupName(String MyEmail, String groupSelectedNumber) {
		User me = getMySelf(MyEmail);
		int number = -22 ;		
		try {
			number =  Integer.parseInt( groupSelectedNumber); 
		}catch (NumberFormatException nfe) {	
				
		}
		number = number -1;
		if(   me.getMyGroups().size() <= number || number < 0 ) {
			return null;
		} else {
			return me.getMyGroups().get(number).getName();
		}
	}
	
	public static String checkGroupName(String groupName) {		
		//confere dados			
		for(int i=0; i<Database.groups.size(); i++) {
			if (Database.groups.get(i).getName().equals(groupName)) {
	    		try {
	    		throw new RuntimeException("Nome de grupo existe!"); 
	    		}
	    		catch (RuntimeException ex) {	    			
	    			 return "Nome de grupo existe!";
	    		}
			}
		}		
    	if (groupName==null) {
    		try {
    		throw new RuntimeException("Não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			return"Nome não pode ser null";     			
    		}
    	} else if(groupName.equals("")) {
    		try {
    		throw new RuntimeException("Nome de grupo não pode ser vazio");
    		}
    		catch (RuntimeException ex) {
    			return "Nome de grupo não pode ser vazio";
    		}	
    	} else {
    		return "true";
    	}
	}
	
	public static void createGroup( String MyEmail, String groupName, String groupDescription) {
		User me = getMySelf(MyEmail);
		Group group = Service_Instantiator.instantiateGroup(groupName, groupDescription, me);
		Service_Notification.notificationCreateGroup(me , group);				// notification
	}
	
	public static void createPost( String MyEmail, String groupName, String textPost) {
		Group theGroup = getTheGroup(groupName);
		User me = getMySelf(MyEmail);
		Service_Instantiator.instantiatePost(theGroup,  me, textPost);
	}
	
	public static void createComment( String MyEmail, String selectedGroupName, String postChosenNumber, String commentText) {
		Post post = getThePost(selectedGroupName ,postChosenNumber);
		try {
		User me = getMySelf(MyEmail);
			Comment newComment = Service_Instantiator.instantiateComment(post,  me, commentText);
			Service_Notification.notificationCreateComment(newComment);	             //NOTIFICATION			
			throw new RuntimeException("Não pode ser null");
		}
		catch (RuntimeException ex) {}	
		
	}
	
	public static String deletingMember(String name, String selectedGroupName) {
		User deletingUser = getOthers(name);
		Group group = getTheGroup(selectedGroupName);
		Boolean condition = false;		
		try {		
			for(int i=0; i < group.getMembers().size(); i++){			
				if(group.getMembers().get(i).getUserName().equals(name) ) {
					condition = true;
				}
				
			}
			if(condition == true) {				
				group.removeMember(deletingUser);
				Service_Notification.notificationRemoveMember(group, deletingUser);             //NOTIFICATION				
			}
		throw new RuntimeException("Não pode ser null");		
		}		
		catch (RuntimeException ex) {}	
		if(deletingUser == null) {
		return "null";
		} else {
		return deletingUser.getUserName();	
		}
	}
	
	public static String GetOutOfGroup(String selectedGroupName, String MyEmail ) {
		User deletingUser = getMySelf(MyEmail);
		Group group = getTheGroup(selectedGroupName);		
		try {		
			group.removeMember(deletingUser); group.removeModerator(deletingUser);		
			deletingUser.removeMyGroup(group);
		throw new RuntimeException("Não pode ser null");		
		}		
		catch (RuntimeException ex) {}	
		if(deletingUser == null) {
		return "null";
		} else {
		return deletingUser.getUserName();	
		}
	}
	
	public static String addingModerator(String name, String selectedGroupName) {
		User newModerator = getOthers(name);
		Group group = getTheGroup(selectedGroupName);		
		try {	
			for(int i=0; i < group.getMembers().size(); i++){			
				if(group.getMembers().get(i).getUserName().equals(name) ) {
					group.addModerator(newModerator);
					Service_Notification.notificationAddingModerator(group , newModerator);            //NOTIFICATION
				}
			}
		throw new RuntimeException("Não pode ser null");		
		}		
		catch (RuntimeException ex) {}	
		if(newModerator == null) {
		return "null";
		} else {
		return newModerator.getUserName();	
		}
	}
		
		public static String invitationGroup(String selectedGroupName, String chosenUser) {			
			String invitation = "error";
			try {
				Group group = getTheGroup(selectedGroupName);
				User user = getOthers(chosenUser);			
				 if(user != null) {					  
					 group.addInviteRequest(user);
					 Service_Notification.notificationinvitationGroup(group, user);            //NOTIFICATION
					 invitation = "ok";
				 }
			 throw new RuntimeException("Não pode ser null");
			}
			catch (RuntimeException ex) {}	
			 return invitation;
		}
		
		public static String joingRequestToGroup(String selectedGroupName, String MyEmail) {			
			String condition = "error";
			try {
				Group theGroup = getTheGroup(selectedGroupName);
				User me = getMySelf(MyEmail);
				 if(theGroup != null) {				
					 me.joinRequest(theGroup);
					 Service_Notification.notificationRequestToGroup(theGroup, me);            //NOTIFICATION										 
					 condition = "ok";
				 }
			 throw new RuntimeException("Não pode ser null");
			}
			catch (RuntimeException ex) {}	
			 return condition;
		}
	
	
	
	
	
	
	
	
	
	
	
}
