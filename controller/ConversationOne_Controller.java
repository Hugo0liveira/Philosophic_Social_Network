package controller;

import view.View_OneConversation;
import domain.Service_Conversation;
import domain.Service_AfterLogin;

public class ConversationOne_Controller {
	private View_OneConversation view_OneConversation;
	
	public ConversationOne_Controller(String number, String MyEmail){
		conversationOne_Controller(number, MyEmail);
	}
	
	public void conversationOne_Controller(String number, String MyEmail){
		view_OneConversation = new View_OneConversation();
		
		String loopOneConversation = "0";
		String opOneConversation = "0";
		do {
			
			String conversation = Service_Conversation.showOneConversation( number , MyEmail);
			opOneConversation = view_OneConversation.printConversation( conversation );
			switch (opOneConversation) {
			case "1": 	// Escrever mensagem
				String textMessage = view_OneConversation.addMessage( conversation ); 
				Service_Conversation.addMessage( MyEmail,number, textMessage);				
				loopOneConversation = "0";
			 break;
			case "-": 	// Deletar mensagem
				String textSelected = view_OneConversation.deleteMyMessage( conversation ); 
				String condition = Service_Conversation.deleteMyMessage( MyEmail, number, textSelected );
				if(condition == "error") {
					view_OneConversation.printError();
				}
				loopOneConversation = "0";
			 break;
			case "2": 	// Adicionar user em conversa  
				String allUsers = Service_AfterLogin.allUsers();
				String addUser = view_OneConversation.addUser( allUsers );
				/*The exception "java.lang.OutOfMemoryError: Java heap space" occurs when your 
				 * Java program exhausts the available heap memory allocated for it.*/
				String responseOfAdd = Service_Conversation.addUserInConversation( number , MyEmail, addUser);
				if(responseOfAdd == "ERRO! OU usuário INEXISTENTE OU se ENCONTRA em conversa!" ) {
					view_OneConversation.printErrorAddUser();
				}
				loopOneConversation = "0";
			 break;
			case "3": 	// Deixar de participar de conversa   
				Service_Conversation.removeMeFromConversation(MyEmail, number);
				loopOneConversation = "0";
			 break;
			case "0": 	// voltar
				new ConversationMainMenu_Controller(MyEmail);
				loopOneConversation = "1";
			 break;
			default:				
				view_OneConversation.printError();
				loopOneConversation = "0";
			 break;
			}
		} while(loopOneConversation == "0");
		
	}

}
