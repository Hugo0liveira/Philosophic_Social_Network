package domain;

import database.Database;

public class Service_Instantiator {
	
	public static User instantiateUser(String name, String email, String password){
		User newUser = new User(name, email, password);
		Database.users.add(newUser);
		return newUser;
	}
	
	public static Conversation instantiateConversation(String name, User user){
		Conversation newConversation = new Conversation(name, user);
		Database.conversations.add(newConversation);
		user.addMyConversation(newConversation);
		return newConversation;
	}
	
	public static Conversation instantiateConversation(String name, User user, User user2){
		Conversation newConversation = new Conversation(name, user, user2);
		Database.conversations.add(newConversation);
		user.addMyConversation(newConversation);
		return newConversation;
	}
	
	public static Message instantiateMessage(Conversation conversation, User sender, String text){
		Message newMessage = new Message(conversation, sender, text);
		Database.messages.add(newMessage);
		conversation.addMessage(newMessage);
		return newMessage;
	}
	
	public static Group instantiateGroup(String name, String description, User moderator){
		Group newGroup = new Group(name, description, moderator);
		Database.groups.add(newGroup);
		moderator.addMyGroup(newGroup);
		return newGroup;
	}
	
	public static Post instantiatePost(Group group, User author, String text){
		Post newPost = new Post(group, author, text);
		Database.posts.add(newPost);
		author.addMyPosts(newPost);
		group.addPost(newPost);
		return newPost;
	}
	
	public static Comment instantiateComment(Post post, User author, String text){
		Comment newComment = new Comment(post, author, text);
		Database.comments.add(newComment);		
		post.addComment(newComment);
		author.addMyComments(newComment);
		return newComment;
	}
	
	public static Report instantiateReport(User reporting, User reported, String reason){
		Report newReport = new Report(reporting, reported, reason);
		reporting.addMyReport(newReport);
		Database.reports.add(newReport);
		return newReport;
	}

}
