package domain;

import java.util.ArrayList;
import java.util.List;

public class Post {    
    private User author;
    private String text;    
    private Group group;
    private List<Comment> comments = new ArrayList<>();
    
    Post(Group group, User postAuthor, String postText) {
        this.group = group;
        this.author = postAuthor;
        this.text = postText;     
    }

    public String getText() {
        return text;
    }

    public void setText(String postText) {
    	if (postText==null) {
    		try{
    		throw new RuntimeException("Erro String: postText não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Erro String: postText não pode ser null");
    		}
    	} else if(postText.equals("")) {
    		try{
    		throw new RuntimeException("Erro String: postText não pode ser vazio");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Erro String: postText não pode ser vazio");
    		}
    	} else {
        this.text = postText;
    	}
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User postAuthor) {
    	if (postAuthor==null) {
    		try{
    		throw new RuntimeException("Erro User: postAuthor não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Erro User: postAuthor não pode ser null");
    		}
    	} else if(postAuthor.getUserName().equals("")) {
    		try{
    		throw new RuntimeException("Erro User: postAuthor não pode ser vazio");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Erro User: postAuthor não pode ser vazio");
    		}
    	} else {     
        this.author = postAuthor;
    	}
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {    	     
        this.group = group;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
        this.getAuthor().addNotificationPost(this);
    }

    public void removeComment(Comment comment) {
        this.comments.remove(comment);
    }
    
    @Override
    public String toString() {
      return author + ", postou: " + text;
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
  	  Post other = (Post) obj;
  	  if (group != other.group) {
  		  return false;
  	  }
  	  if (author != other.author) {
  		  return false;
  	  }
  	  if (text != other.text) {
  		  return false;
  	  } else {
  	  return true;
  	  }
    }//equals()


}  // Fim de Class Post





