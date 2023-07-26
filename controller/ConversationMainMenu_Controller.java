package controller;

import view.View_MenuConversation;
import domain.Service_Conversation;

public class ConversationMainMenu_Controller {
	private View_MenuConversation view_MenuConversation;
	
	public ConversationMainMenu_Controller(String MyEmail){
		conversationMainMenu_Controller(MyEmail);
	}
	
	public void conversationMainMenu_Controller(String MyEmail){
		view_MenuConversation = new View_MenuConversation();
		
		String loopMenuConversation = "0";
		String opMenuConversation = "0";
		do {
			String showConversations = Service_Conversation.showMyConversations(MyEmail);
			opMenuConversation = view_MenuConversation.printConversationMenu(showConversations);
			switch (opMenuConversation) {
			case "1": 	// Selecionar conversa
				String selectingConversations = Service_Conversation.SelectConversation(MyEmail);
				String numberConversation = view_MenuConversation.printSelectConversation(selectingConversations);
				new ConversationOne_Controller(numberConversation, MyEmail);
				loopMenuConversation = "0";	
			 break;
			case "2": 	// Iniciar nova conversa
				String newConversationName = view_MenuConversation.namingNewConversation();
				Service_Conversation.newConversation(MyEmail, newConversationName);
				loopMenuConversation = "0";
			 break;
			case "0": 	// voltar
				new LoggedMainMenu_Controller(MyEmail);
				loopMenuConversation = "1";
			 break;
			default:				
				view_MenuConversation.printError();
				loopMenuConversation = "0";
			 break;
			}
		} while(loopMenuConversation == "0");
		
	}

}
