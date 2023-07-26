package controller;

import domain.Service_AfterLogin;
import domain.Service_Conversation;
import domain.Service_Friends;
import view.View_Friends;   
import view.View_MenuConversation;

public class Friends_Controller {
	private View_Friends view_Friends;
	private View_MenuConversation view_MenuConversation;
	
	public Friends_Controller(String MyEmail){
		friends_Controller(MyEmail);
	}
	
	public void friends_Controller(String MyEmail) {
		view_Friends = new View_Friends();
		
		String loopFriendsMenu = "0";
		String opFriendsMenu = "0";
		
		do {
			String MyFriends = "Nenhum";
			MyFriends = Service_Friends.showMyFriends( MyEmail );
			opFriendsMenu = view_Friends.printFriendsMenu(MyFriends);
			
			switch (opFriendsMenu) {
			case "1": 	// Selecionar amigo para conversar		
				String friendsOrdered = Service_Friends.showsFriendsOrdered( MyEmail );				
				String selectedFriendNumber = view_Friends.printSelectFriend( friendsOrdered );
				view_MenuConversation = new View_MenuConversation();   // View de ConversationMainMenu_Controller
				String SelectedFriendName = Service_Friends.getMyFriendName(MyEmail, selectedFriendNumber);
				if(SelectedFriendName != null) {
					String newConversationName = view_MenuConversation.namingNewConversation();		
					Service_Conversation.newConversation( newConversationName, MyEmail, SelectedFriendName);
					String conversationNumber = Service_Conversation.getMyConversationNumber(MyEmail);
					new ConversationOne_Controller(conversationNumber, MyEmail);
				} else {
					view_Friends.printError();
				}
				loopFriendsMenu ="0";	
			 break;
			case "2": 	// Buscar usuário e solicitar amizade
				String users = Service_AfterLogin.allUsers();
				String chosenUser = view_Friends.showAllUserOrdered(users);
				chosenUser = Service_AfterLogin.checkUserName(chosenUser);
				if(chosenUser == "error") {
					view_Friends.printError();
				} else {
					Service_Friends.solicitFriendship(MyEmail, chosenUser);
					view_Friends.printSolicitationSuccess(chosenUser);
				}
				loopFriendsMenu ="0";
			 break;
			case "3": 	// Finalizar amizade
				String friends = Service_Friends.showsFriendsOrdered( MyEmail );
				String number = view_Friends.printSelectFriend( friends );				
				String SelectedFriend = Service_Friends.getMyFriendName(MyEmail, number);
				if(SelectedFriend != null) {
					Service_Friends.removeFriendship(MyEmail, SelectedFriend);
					view_Friends.printDeletingSucces( SelectedFriend );
				} else {
					view_Friends.printError();
				}				
				loopFriendsMenu ="0";
			 break;			
			case "0":   // Voltar
				new LoggedMainMenu_Controller(MyEmail);				
				loopFriendsMenu ="1";
			 break; 
			 
			default:
				view_Friends.printError();				
				loopFriendsMenu ="0";
			break;
			
			}
			
		}while(loopFriendsMenu=="0");
		
		
		
		
	}

}
