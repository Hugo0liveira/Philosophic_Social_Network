package test;

import java.util.Scanner;
import domain.User;
import view.View_Conversation;
import domain.Conversation;
import domain.Service_Instantiator;
import database.Database;

public class Test_Screen_Conversation {	
	protected static Scanner scan = new Scanner(System.in);
	Database database;
	
	public static void main(String[] args) {
		System.setProperty("file.encoding", "UTF-8");
		
		User u3;
		u3 = Database.getUserData("Eu");		
		
		View_Conversation screen_conversation1 = new View_Conversation(u3);
		
		Scanner t = new Scanner(System.in);
		String opMainMenuConversation = "0";
				
		do {				// menu principal de conversas
			screen_conversation1.printCleanConsole();				
			screen_conversation1.printConversationScreen(u3);
			opMainMenuConversation = t.nextLine();
		   	screen_conversation1.printCleanConsole();
				switch(opMainMenuConversation){
				case "1":      					// selecionar conversa
					String selectedConversationString = screen_conversation1.printSelectConversation(u3);
					opMainMenuConversation= "0";
					if(selectedConversationString != "Nenhuma conversa correspondente!") {
					opMainMenuConversation = "0";												
					String opSelectedConversation = "0";				
								do{							//uma conversa
											screen_conversation1.printCleanConsole();
											// pega a string de um id de conversation e retorna a respectiva Conversation
										screen_conversation1.printConversation(Database.getConversationData(selectedConversationString));			
										opSelectedConversation = t.nextLine();
										switch(opSelectedConversation) {
										case "1":
											screen_conversation1.readAddMessage(Database.getConversationData(selectedConversationString), u3);
											opSelectedConversation= "0";
										break;
										case "2":
											screen_conversation1.readAddUser(Database.getConversationData(selectedConversationString));
											opSelectedConversation= "0";
										break;
										case "0":
											opSelectedConversation= "1";
										break;	
										default:
											System.out.println("Comando inválido"); t.nextLine();   // apenas para pausar e esperar usuário ler
											opSelectedConversation= "0";					
										break;
										}
								}while(opSelectedConversation== "0");																						
					}
				break;
				case "2": 	//iniciar nova conversa
					screen_conversation1.printCleanConsole();
					screen_conversation1.namingNewConversation();
					String conversationID = scan.nextLine();
					Conversation newConversation = Service_Instantiator.instantiateConversation(conversationID, u3);  																					
					Database.conversations.add( newConversation );
					u3.addMyConversation( newConversation );			
					opMainMenuConversation= "0";
				break;
				case "0":
					opMainMenuConversation= "1";  // Sair de conversas
				break;
				default:
					System.out.println("Comando inválido");t.nextLine();   // apenas para pausar e esperar usuário ler
					opMainMenuConversation= "0";					
				break;			
			}			
		} while(opMainMenuConversation== "0");
		
		screen_conversation1.printLoadingNext();
		System.exit(0);               
		t.close();
		
	} // main()
} // Test_Screen_Conversation
