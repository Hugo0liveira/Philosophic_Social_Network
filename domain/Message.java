package domain;

public class Message {
    private String text;
    private User sender;    
    private Conversation conversation;

   Message(Conversation conversation, User messageSender, String messageText) {
        this.text = messageText;  
        this.sender = messageSender;              
        this.conversation = conversation;
    }   

    public String getText() {
        return text;
    }

    public void setText(String messageText) {
    	if (messageText==null) {
    		try {
    		throw new RuntimeException("Erro String: text não pode ser null");
    		} 
    		catch (RuntimeException ex) {
    			System.out.println("Erro String: text não pode ser null");    		
    		}
    	} else if(messageText.equals("")) {
    		try{
    		throw new RuntimeException("Message não pode ser vazia");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Mensagem não pode ser vazia");
    		}  		
		} else {
        this.text = messageText;
    	}
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User messageSender) {
    	if (messageSender==null) {
    		try {
    		throw new RuntimeException("Erro User: sender não pode ser null");
    		} 
    		catch (RuntimeException ex) {
    			System.out.println("Erro User: sender não pode ser null");
    		}    		
    	} else {
        this.sender = messageSender;
    	}
    }
    
    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
    	if (conversation==null) {
    		try {
    		throw new RuntimeException("Erro Conversation: conversation não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Erro: Conversation não pode ser null");
    		}        		
    	} else {
        this.conversation = conversation;
    	}
    }
    
    @Override
    public String toString() {
      return this.sender + ": " + text + " ";
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
  	  Message other = (Message) obj;
  	  if (conversation != other.conversation) {
  		  return false;
  	  }
  	  if (sender != other.sender) {
		  return false;
	  }
  	  if (text != other.text) {
		  return false;	  
  	  } else {
  	  return true;
  	  }
    }//equals()

}  // Fim de Message

