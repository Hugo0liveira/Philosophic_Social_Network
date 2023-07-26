package domain;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private String description;
    private List<User> moderators = new ArrayList<User>();
    private List<User> members = new ArrayList<User>();
    private List<Post> posts = new ArrayList<Post>();
    private List<User> inviteRequests = new ArrayList<User>();
    private List<User> notificationJoinRequests = new ArrayList<User>();
        
    Group(String groupName, String description, User moderator) {
        this.name = groupName;
        this.description = description;
        this.moderators.add(moderator);
        this.members.addAll(moderators); 
    }
    
    // Getters e Setters
    public String getName() {
        return name;
    }
    
    public void setName(String groupName) {
    	if (groupName==null) {
    		try{
    		throw new RuntimeException("Erro String: groupName não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Erro String: groupName não pode ser null");
    		}
    	} else if(groupName.equals("")) {
    		try{
    		throw new RuntimeException("Erro String: groupName não pode ser vazio");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Erro String: groupName não pode ser vazio");
    		}
    	} else {
        this.name = groupName;
    	}
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
    	if (description==null) {
    		try{
    		throw new RuntimeException("Erro String: description não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Erro String: description não pode ser null");
    		}
    	} else if(description.equals("")) {
    		try{
    		throw new RuntimeException("Erro String: description não pode ser vazio");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Erro String: description não pode ser vazio");
    		}
    	} else {
        this.description = description;
    	}
    }    

 // Métodos do moderador
    
    public List<User> getModerators() {
        return moderators;
    }
    
    public void addModerator(User member) {    	
        Boolean isMember = false;
        Boolean alreadyModerator = false;
        	for(User users : this.getMembers()  ) {
            	if(users.getUserName().equals(member.getUserName())) {
            		isMember = true;
            	}
        	}
            	for(User moderators : this.getModerators()  ) {
                	if(moderators.getUserName().equals(member.getUserName())) {
                		alreadyModerator = true;
                	}                	
            	}
        	if(isMember == true && alreadyModerator == false) {
    		this.moderators.add(member);    		
		        for(User users : this.getModerators()  ) {
		        	users.addNotificationGroup(this);
		        }
        	}
    }

    public void removeModerator(User member) {
        this.moderators.remove(member);
        for(User users : this.getModerators()  ) {
        	users.addNotificationGroup(this);
        }
    }

    public List<User> getMembers() {
        return members;
    }
 
    public void addMember(User user) {
    	Boolean isMember = false;
    	for(User users : this.getMembers()  ) {
        	if(users.getUserName().equals(user.getUserName())) {
        		isMember = true;
        	}
    	}
    	if(isMember == false) {
    		this.members.add(user);
        }
    }

    public void removeMember(User user) {
        this.members.remove(user);
        for(User users : this.getModerators()  ) {
        	users.addNotificationGroup(this);
        }
    }
    
    public void addInviteRequest(User user) {
    	Boolean isMember = false;
    	for(User users : this.getMembers()  ) {
        	if(users.getUserName().equals(user.getUserName())) {
        		isMember = true;
        	}
    	}
    	if(isMember == false) {
    		inviteRequests.add(user);
            user.addNotificationInvite(this);
        }
    }

    public void removeInviteRequest(User user) {
        this.inviteRequests.remove(user);
        user.removeNotificationInvite(this);
    }
    
    public void addNotificationJoinRequest(User  user) {        
        this.notificationJoinRequests.add(user);
    }
    
    public void removeNotificationJoinRequest(User  user) {        
        this.notificationJoinRequests.add(user);
    }
    
    public List<User> getnotificationJoinRequests() {
        return notificationJoinRequests;
    }

    // POST and COMMENTS

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(Post post) {
        this.posts.add(post);
    }

    public void removePost(Post post) {
        this.posts.remove(post);
        for(User users : this.getModerators()  ) {
        	users.addNotificationGroup(this);
        }
    }
    
    @Override
    public String toString() {
      return "Grupo: " + name;
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
  	  Group other = (Group) obj;
  	  if (name != other.name) {
  		  return false;
  	  }
  	  if (description != other.description) {
  		  return false;
  	  }
  	  if (moderators != other.moderators) {
  		  return false;  	  
  	  } else  {
  	  return true;
  	  }
    }//equals()

}  // Fim de Class Group


