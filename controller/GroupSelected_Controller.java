package controller;


import view.View_GroupSelected;
import domain.Service_AfterLogin;
import domain.Service_Group;

public class GroupSelected_Controller {
		private View_GroupSelected view_GroupSelected;
		
		public GroupSelected_Controller(String MyEmail, String selectedGroupName){
			groupSelected_Controller(MyEmail, selectedGroupName);
		}
		
		public void groupSelected_Controller(String MyEmail, String selectedGroupName) {
			view_GroupSelected = new View_GroupSelected();
			
			String loopGroupSelected = "0";
			String opGroupSelected = "0";
			do {
				String description = Service_Group.getGroupDescription(selectedGroupName);
				String accessLevel = Service_Group.checkAccessLevel(MyEmail, selectedGroupName);
				String moderatorAccess = Service_Group.checkModeratorAccess(MyEmail, selectedGroupName);
				String posts = Service_Group.getThePosts(selectedGroupName);
				opGroupSelected = view_GroupSelected.onGroup(MyEmail, selectedGroupName, description, accessLevel, moderatorAccess, posts);	
				
				if(accessLevel == "notMember") {
					switch(opGroupSelected) {
					case "+": //Solicitar participação
						String condition = Service_Group.joingRequestToGroup(selectedGroupName, MyEmail);						
						if(condition == "error") {
							view_GroupSelected.printError();
						} else {							
							view_GroupSelected.printRequestSuccess();
						}
						
						loopGroupSelected="0";
					 break;
					}
				}
				if (accessLevel == "Member") {
					switch(opGroupSelected) {
					case "-":  // Nâo ser membro de grupo
						Service_Group.GetOutOfGroup(selectedGroupName, MyEmail);
						loopGroupSelected="0";
					 break;
					}
				 }
				 if(accessLevel == "Member") {
					 switch(opGroupSelected) {
					case "2": // Escrever post 
						String textPost = view_GroupSelected.writingPost(selectedGroupName);						
						Service_Group.createPost(MyEmail, selectedGroupName, textPost);
						loopGroupSelected="0";
					 break;
					 }
				 }
				 if( moderatorAccess == "Moderator") {	
						switch(opGroupSelected) {
						case "3": //Visualizar membros				
							String membersNames = Service_Group.getTheMembers(selectedGroupName);
							view_GroupSelected.showMembers(membersNames);							
							loopGroupSelected="0";
						 break;
						case "4": //Convidar usuário							
							String users = Service_AfterLogin.allUsers();
							String chosenUser = view_GroupSelected.showAllUsers(users);
							chosenUser = Service_AfterLogin.checkUserName(chosenUser);
							if(chosenUser == "error") {
								view_GroupSelected.printError();
							} else {
								Service_Group.invitationGroup(selectedGroupName, chosenUser );
								view_GroupSelected.printSolicitationSuccess(chosenUser);
							}
							loopGroupSelected="0";
						 break;
						case "5": // Remover usuário (apenas se ele NÂO for moderador)
							membersNames = Service_Group.getTheMembers(selectedGroupName);
							String userName = view_GroupSelected.selectMemberToRemove(membersNames);
							String resultDeleting = Service_Group.deletingMember(userName, selectedGroupName);
							if(resultDeleting == "null") {
								view_GroupSelected.printError();
							} else {
								view_GroupSelected.printDeletingSuccess(resultDeleting);
							}
							loopGroupSelected="0";
						 break;
						case "6": // Adicionar moderador (apenas se ele for membro)
							membersNames = Service_Group.getTheMembers(selectedGroupName);
							userName = view_GroupSelected.selectMemberToAddModerator(membersNames);
							String addingModerator = Service_Group.addingModerator(userName, selectedGroupName);
							if(addingModerator == "null") {
								view_GroupSelected.printError();
							} else {
								view_GroupSelected.printAddingModeratorSuccess(addingModerator);
							}
							loopGroupSelected="0";
						break;
						}
					}								
					switch(opGroupSelected) {  // telas de loading para evitar erro de opção
					case "6": // Adicionar moderador 
						view_GroupSelected.loading(selectedGroupName);
						break;
					case "5": // Remover usuário 
						view_GroupSelected.loading(selectedGroupName);
						break;
					case "4": //Convidar usuário 
						view_GroupSelected.loading(selectedGroupName);
						break;
					case "3": //Visualizar membros 
						view_GroupSelected.loading(selectedGroupName);
						break;
					case "2": // Escrever post 
						view_GroupSelected.loading(selectedGroupName);
						break;
					case "+": // Solicitar participação
						view_GroupSelected.loading(selectedGroupName);
						break;
					case "-": // Deixar de ser membro
						view_GroupSelected.loading(selectedGroupName);
						break;
					case "0": 	// Voltar
						new GroupMenu_Controller(MyEmail);				
						loopGroupSelected="1";
					 break;
					default:
						view_GroupSelected.printError();
						loopGroupSelected="0";
					break;
					case "1": // selecionar post 	
						String postsOrdered = Service_Group.getThePostsOrdered(selectedGroupName);
						String postChosenNumber = view_GroupSelected.selectingPost(postsOrdered, selectedGroupName);
						String comments = Service_Group.getTheComments(selectedGroupName, postChosenNumber);
						if (comments == "NULL") {
							view_GroupSelected.printError();
						} else {	
								new Post_Controller(MyEmail, selectedGroupName, accessLevel, moderatorAccess, postChosenNumber, comments);							
						}
						loopGroupSelected="0";
					 break;						 
					}
				} while(loopGroupSelected=="0");
					
			
		}

}
