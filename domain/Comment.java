package domain;

public class Comment {	
    private String text;    
    private User author;
    private Post post;

    Comment(Post post, User commentAuthor, String commentText) {
        this.text = commentText;
        this.author = commentAuthor;
        this.post = post;
    }
        
    public String getText() {
        return text;
    }

    public void setText(String commentText) {
    	if (commentText==null) {
    		try{
    		throw new RuntimeException("Erro String: commentText não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Erro String: commentText não pode ser null");
    		}
    	} else if(commentText.equals("")) {
    		try{
    		throw new RuntimeException("Erro String: commentText não pode ser vazio");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Erro String: commentText não pode ser vazio");
    		}
    	} else {       
        this.text = commentText;
    	}
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User commentAuthor) {    	
        this.author = commentAuthor;    	
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {    	
        this.post = post;    	
    }
    
    @Override
    public String toString() {
      return author + ", comentou: " + text;
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
      Comment other = (Comment) obj;
  	  if (post != other.post) {
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

}  // Fim de Class Comment

