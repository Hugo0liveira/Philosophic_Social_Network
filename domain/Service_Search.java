package domain;

import database.Database;

public class Service_Search {
	
	// PESQUISA
	
		public static String search(String text) {
		    StringBuilder searchResultUser = new StringBuilder();
		    StringBuilder searchResultGroup = new StringBuilder();
		    StringBuilder searchResultPost = new StringBuilder();
		    StringBuilder searchResultComment = new StringBuilder();

		    String searchTextLowerCase = text.toLowerCase(); // Convert search input to lowercase

		    for (User user : Database.users) {
		        String userNameLowerCase = user.getUserName().toLowerCase(); // Convert user name to lowercase
		        if (userNameLowerCase.contains(searchTextLowerCase)) {
		            searchResultUser.append("	").append(user.getUserName()).append("\n");
		        }
		    }

		    for (Group group : Database.groups) {
		        String groupNameLowerCase = group.getName().toLowerCase(); // Convert group name to lowercase
		        if (groupNameLowerCase.contains(searchTextLowerCase)) {
		            searchResultGroup.append("	").append(group.getName()).append("\n");
		            searchResultGroup.append("	Descrição: ").append(group.getDescription()).append("\n");
		        }
		    }

		    for (Post post : Database.posts) {
		        String postTextLowerCase = post.getText().toLowerCase(); // Convert post text to lowercase
		        if (postTextLowerCase.contains(searchTextLowerCase)) {
		            searchResultPost.append("	\n").append(post.getText()).append("\n");
		            searchResultPost.append("	Autoria: ").append(post.getAuthor().toString()).append("\n");
		            searchResultPost.append("	Escrito em: ").append(post.getGroup().toString()).append("\n");
		        }
		    }

		    for (Comment comment : Database.comments) {
		        String commentTextLowerCase = comment.getText().toLowerCase(); // Convert comment text to lowercase
		        if (commentTextLowerCase.contains(searchTextLowerCase)) {
		            searchResultComment.append("	\n").append(comment.getText()).append("\n");
		            searchResultComment.append("	Autoria: ").append(comment.getAuthor().toString()).append("\n");
		            searchResultComment.append("	Comentado em: ").append(comment.getPost().toString()).append("\n");
		        }
		    }

		    StringBuilder searchResult = new StringBuilder();
		    searchResult.append("	Usuários:\n\n").append(searchResultUser).append("\n	Grupos:\n\n").append(searchResultGroup)
		            .append("\n	Posts:\n\n").append(searchResultPost).append("\n	Comentários:\n\n").append(searchResultComment);

		    return searchResult.toString();
		}

}
