package controller;

import view.View_PostSelected;
import domain.Service_Group;


public class Post_Controller {
	private View_PostSelected view_PostSelected;
	
	public Post_Controller (String MyEmail, String selectedGroupName, String accessLevel, String moderatorAccess, String postChosenNumber, String comments){
		post_Controller(MyEmail, selectedGroupName, accessLevel, moderatorAccess, postChosenNumber, comments);
	}
	
	public void post_Controller (String MyEmail, String selectedGroupName, String accessLevel, String moderatorAccess, String postChosenNumber, String comments){
		String postAuthorText = Service_Group.getThePostAuthorText(selectedGroupName, postChosenNumber);
		view_PostSelected = new View_PostSelected();
		String isMyPost = Service_Group.AmIpostAuthor(selectedGroupName, MyEmail, postChosenNumber);
		
		String loopComment_Controller = "0";
		String opComment_Controller = "0";
		do {
			comments = Service_Group.getTheComments(selectedGroupName, postChosenNumber);  // reload comments 
			opComment_Controller = view_PostSelected.showComments(selectedGroupName, accessLevel, moderatorAccess, postAuthorText, comments, isMyPost);
			
			 if(accessLevel == "Member") {
				 switch(opComment_Controller) {
				 case "2": //Escrever Comentário    
					 String postSelectedString = Service_Group.getThePostString(selectedGroupName, postChosenNumber);
					 String commentText = view_PostSelected.writingCommment(postSelectedString);
					 Service_Group.createComment(MyEmail, selectedGroupName, postChosenNumber,commentText);
					 loopComment_Controller="0";
				  break;	
				 case "1": //Selecionar Comentário  	
						String commentsOrdered = Service_Group.getTheCommentsOrdered(selectedGroupName, postChosenNumber);
						String chosenCommentNumber = view_PostSelected.selectingComment(selectedGroupName, accessLevel, moderatorAccess, postAuthorText, commentsOrdered);
						
						String checkingChoice = Service_Group.checkCommentsChosen(selectedGroupName, postChosenNumber, chosenCommentNumber);
						
						
								if (checkingChoice == "NULL") {
									view_PostSelected.printError();
								} else {	
									String commentString = Service_Group.getTheCommentString(selectedGroupName, postChosenNumber, chosenCommentNumber);
									String isMyComment =  Service_Group.AmIcommentAuthor(selectedGroupName, MyEmail, postChosenNumber, chosenCommentNumber);
									String optionsInComment = view_PostSelected.commentSelected(selectedGroupName, moderatorAccess, isMyComment, postAuthorText, commentString);									
									if (isMyComment == "true") {
										 switch(optionsInComment) {
											case "1": // Deletar Comment
												Service_Group.deletingMyComment(selectedGroupName, postChosenNumber, MyEmail, chosenCommentNumber);
												
											 break;
										 }
									 } else if( moderatorAccess == "Moderator" && isMyComment != "true") {	
											switch(optionsInComment) {
											case "1": // Deletar Comment
												Service_Group.deletingComment(selectedGroupName, postChosenNumber, chosenCommentNumber);		
												
											 break;
											}
									 } else {
											switch(optionsInComment) {
											case "0": // Voltar				
												
											 break;
											}							 
									 }							
								}
						 loopComment_Controller="0";
					  break;
				 }
			 }
			 
			 if (isMyPost == "true") {
				 switch(opComment_Controller) {
					case "3": //Deletar meu Post
						Service_Group.deletingMyPost(selectedGroupName, postChosenNumber, MyEmail);
						loopComment_Controller="1";
					 break;
				 }
			 } else if( moderatorAccess == "Moderator" && isMyPost != "true") {	
					switch(opComment_Controller) {
					case "3": // Deletar Post
						Service_Group.deletingPost(selectedGroupName, postChosenNumber, MyEmail);
						loopComment_Controller="1";
					 break;
					}
				}								
			 
				switch(opComment_Controller) {
				case "0": 	// Voltar
					new GroupSelected_Controller(MyEmail, selectedGroupName);				
					loopComment_Controller="1";
				 break;
				default:
					view_PostSelected.printError();
					loopComment_Controller="0";
				break;
				 case "1": //Selecionar Comentário  	
					 view_PostSelected.loading(selectedGroupName);
				  break;
				 case "2": //Escrever Comentário   
					 view_PostSelected.loading(selectedGroupName);
				  break;		
				 case "3": //Deletar Post
					 view_PostSelected.loading(selectedGroupName);
				  break;		
				}
	
	
		}while(loopComment_Controller == "0");
	}
	
	
	
	

}
