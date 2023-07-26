package domain;

import java.util.ArrayList;
import java.util.List;

public class Conversation {
	private String name;
    private List<User> users  = new ArrayList<>();
    private List<Message> messages  = new ArrayList<>();    
  
    Conversation(String conversationId, User user1) { 
    	this.name = conversationId;
    	this.users.add(user1);    
    }
    
    Conversation(String name, User user1, User user2) { 
    	this.name = name;
    	this.users.add(user1);
    	this.users.add(user2);    
    }
         
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if (name==null) {
        	try {
    		throw new RuntimeException("Erro Message: id não pode ser null");
        	}
        	catch (RuntimeException ex) {
    			System.out.println("Erro String: text não pode ser null");    		
    		}
    	}
	   this.name = name;  	
    }
    
    public List<User> getUsers() {
        return users;
    }
      
    public List<Message> getMessages() {
        return messages;
    }      

    public void addMessage(Message message) {
    	if (message==null) {
    		try {
    		throw new RuntimeException("Erro Message: message não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Erro Message: message não pode ser null");    		
    		}
    	} else {    		
	        this.messages.add(message);
		        for(User users : this.getUsers() ) {
		    		users.addNotificationConversation(this);
		    	}		        
	    }
    }

    public void deleteMessage(Message message) {
        this.messages.remove(message);        
        for(User users : this.getUsers() ) {
    		users.addNotificationConversation(this);
    	}        
    }
    
    public void addUser(User user) {
    	if (user==null) {
    		try {
    		throw new RuntimeException("Erro User: user não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Erro User: user não pode ser null");    		
    		}    		
    	} else {
    		/*The exception "java.lang.OutOfMemoryError: Java heap space" occurs when your 
    		 * Java program exhausts the available heap memory allocated for it.*/
	    		Boolean inConversation = false;
	        	for(User users : this.getUsers()  ) {
	            	if(users.getUserName().equals(user.getUserName())) {
	            		inConversation = true;
	            	}
	        	}
	        	if(inConversation == false) {
			    	this.users.add(user);        
				    for(User users : this.getUsers() ) {
				    	users.addNotificationConversation(this);
				    }
	        	}
    		}
    }
    
    public void removeUser(User user) {
    	if (user==null) {
    		try {
    		throw new RuntimeException("Erro User: user não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Erro User: user não pode ser null");    		
    		}   
    	} else {    		
        this.users.remove(user);
        user.removeMyConversation(this);
	        for(User users : this.getUsers() ) {
	    		users.addNotificationConversation(this);
	    	}
    	}
    }
    
    @Override
    public String toString() {
      return getName() + ": " + users;
    }
    
    @Override
    public boolean equals(Object obj) {
  	  if (this == obj) {
  		  return true;
  	  }
  	  if (obj == null) {
  		  return false;
  	  }
      if (getClass() != obj.getClass()) {
  		  return false;
      }
  	  Conversation other = (Conversation) obj;
  	  if (users != other.users) {
  		  return false;  	  	
  	  } else {
  	  return true;
  	  }
    }//equals()
    
}  // Fim de Conversation
