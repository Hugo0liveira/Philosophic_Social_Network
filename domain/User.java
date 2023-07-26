package domain;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private String password;
    private String email;
        
    private List<User> solictFriendship = new ArrayList<User>();
    private List<User> friends = new ArrayList<User>();
    private List<Group> MyGroups = new ArrayList<Group>();
    private List<Group> MyJoinRequests  = new ArrayList<Group>();    
    private List<Post> MyPosts = new ArrayList<Post>();
    private List<Comment> MyComments  = new ArrayList<Comment>();
    private List<Conversation> MyConversations  = new ArrayList<Conversation>();
    private List<Message> MyMessages = new ArrayList<>(); 
    private List<Report> MyReports = new ArrayList<Report>();
    private List<Group> notificationInvite = new ArrayList<Group>();    
    private List<Conversation> notificationConversation = new ArrayList<Conversation>();
    private List<User> notificationFriendship = new ArrayList<User>();
    private List<Post> notificationPost = new ArrayList<Post>();
    private List<Group> notificationGroup = new ArrayList<Group>();
    private List<String> allNotifications = new ArrayList<String>();

    User(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;   
    }
   
    // Getters and Setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
    	if (userName==null) {
    		try {
    		throw new RuntimeException("Erro User: userName não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Errado! Nome de usuário não pode ser nulo!");
    		}
    	} else if(userName.equals("")) {
    		try{
    		throw new RuntimeException("Erro User: userName não pode ser vazio");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Errado! Nome de usuário não pode ser vazio!");
    		}
    	}else if(  userName.length() < 11 ) {
    		try{
        		throw new RuntimeException("Erro User: userName não pode ser menor que 11 digitos!");
        		}
        		catch (RuntimeException ex) {
        			System.out.println("UserName não pode ser menor que 11 digitos!");
        		}  		
    	}else {
        this.userName = userName;	        
    	}
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
    	if (email==null) {
    		try {
    		throw new RuntimeException("Erro User: email não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Errado! Email de usuário não pode ser nulo!");
    		}
    	} else if(email.equals("")) {
    		try {
    		throw new RuntimeException("Erro User: email não pode ser vazio");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Errado! Email de usuário não pode ser vazio!");
    		}
    	}else if(  email.length() < 15 ) {
    		try{
        		throw new RuntimeException("Erro User: email não pode ser menor que 15 digitos!");
        		}
        		catch (RuntimeException ex) {
        			System.out.println("Email não pode ser menor que 15 digitos!");
        		}  		
    	}else {    	
        this.email = email;
    	}
    }    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
    	if (password==null) {
    		try {
    		throw new RuntimeException("Erro User: password não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Errado! Senha não pode ser nula!");
    		}
    	} else if(password.equals("")) {
    		try {
    		throw new RuntimeException("Erro User: password não pode ser vazio");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Errado! Senha não pode ser vazia!");
    		}    		
    	}else if(  email.length() < 15 ) {
    		try{
        		throw new RuntimeException("Erro User: password não pode ser menor que 15 digitos!");
        		}
        		catch (RuntimeException ex) {
        			System.out.println("Senha não pode ser menor que 15 digitos!");        			
        		}  		
    	}else {    	
        this.password = password;
    	}
    }
    
    // CONVERSATIONS

    public List<Conversation> getMyConversations() {
        return MyConversations;
    }
    
    public void addMyConversation(Conversation conversation) {
        this.MyConversations.add(conversation);
    }
    
    public void removeMyConversation(Conversation conversation) {
        this.MyConversations.remove(conversation);
    }

    public List<User> getFriends() {
        return friends;
    }
    
    public List<Conversation> getNotificationsConversation() {
        return notificationConversation;
    }
    
    public void addNotificationConversation(Conversation news) {
        this.notificationConversation.add(news);
    }
    
    public void removeNotificationConversation(Conversation news) {
        this.notificationConversation.remove(news);
    }
    
    // MESSAGES

    public List<Message> getMyMessages() {
        return MyMessages;
    }

    public void addMyMessage(Message message) {
        this.MyMessages.add(message);
    }
    
    public void removeMyMessage(Message message) {
        this.MyMessages.remove(message);
    }
    
    // FRIENDS
    
    public void addFriend(User friend) {  
    	 Boolean isFriend = false;
     	for(User users : this.getFriends()  ) {
         	if(users.getUserName().equals(friend.getUserName())) {
         		isFriend = true;
         	}
     	}
     	if(isFriend == false) {
     		this.friends.add(friend);
     	}
    }

    public void removeFriend(User friend) {
        this.friends.remove(friend);
    }    
    
    public void solicitFriendship(User possibleFriend) {
    	Boolean isFriend = false;
     	for(User users : this.getFriends()  ) {
         	if(users.getUserName().equals(possibleFriend.getUserName())) {
         		isFriend = true;
         	}
     	}
     	if(isFriend == false) {
	    	solictFriendship.add(possibleFriend);
	    	possibleFriend.addNotificationFriendship(this);
     	}
	}
    
    public void addNotificationFriendship(User wantingFriendship) {
		notificationFriendship.add(wantingFriendship);			
	}
    
	public void removeNotificationFriendship(User wantingFriendship) {
		notificationFriendship.remove(wantingFriendship);
	}
	
	public List<User> getNotificationsFriendship(){
        return notificationFriendship;
    }
	
    
 // GROUPS
    public void joinRequest(Group group) {
        this.MyJoinRequests.add(group);
        group.addNotificationJoinRequest(this);        
    }

    public List<Group> getMyJoinRequests(){
        return MyJoinRequests;
    }
    
    public List<Group> getNotificationsInvites(){
        return notificationInvite;
    }
    
    public void addNotificationInvite(Group invite) {
    	notificationInvite.add(invite);    	
	}
	public void removeNotificationInvite(Group invite) {
		notificationInvite.remove(invite);
	}
 
    public List<Group> getMyGroups() {
        return MyGroups;
    }
    
    public void addMyGroup(Group group) {
        this.MyGroups.add(group);
    }
    
    public void removeMyGroup(Group group) {
        this.MyGroups.remove(group);
    } 
    
	public List<Group> getNotificationsGroup() {
		return notificationGroup;
	}

	public void addNotificationGroup(Group notificationGroup) {
		this.notificationGroup.add(notificationGroup);		
	}
	
	public void removeNotificationGroup(Group notificationGroup) {
		this.notificationGroup.remove(notificationGroup);
	}
 
    // POSTS

    public List<Post> getMyPosts() {
        return MyPosts;
    }
    
    public void addMyPosts(Post post) {
        this.MyPosts.add(post);
    }
    
    public void removeMyPosts(Post post) {
        this.MyPosts.remove(post);
    }
    
	public List<Post> getNotificationsPost() {
		return notificationPost;
	}

	public void addNotificationPost(Post notificationPost) {
		this.notificationPost.add(notificationPost);		
	}
	
	public void removeNotificationPost(Post notificationPost) {
		this.notificationPost.remove(notificationPost);
	}
   
    // COMMENTS   
    
    public List<Comment> getMyComments() {
        return MyComments;
    }
    
    public void addMyComments(Comment comment) {
        this.MyComments.add(comment);
    }
    
    public void removeMyComments(Comment comment) {
        this.MyComments.remove(comment);
    }
            
    // REPORT

    public List<Report> getMyReports() {
        return MyReports;
    }

    public void addMyReport(Report report) {
        this.MyReports.add(report);
    }
    
    public void removeMyReport(Report report) {
        this.MyReports.remove(report);
    }
    
    public List<User> getMyNotificationFriendship() {
		return notificationFriendship;
	}
	
    // ALL NOTIFICATIONS
    
	public List<String> getNotifications() {
		return allNotifications;
	}

	public void addNotification(String notification) {
		allNotifications.add(notification);
	}
	
	public void removeNotification(String notification) {
		allNotifications.remove(notification);
	}
    
    @Override
    public String toString() {
      return userName;
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
  	  User other = (User) obj;
  	  if (userName != other.userName) {
  		  return false;  	
  	  }
  	  if (email != other.email) {
  		  return false;  	
  	  } else  {
  	  return true;
  	  }
    }//equals()


} // Fim de Class User
    
