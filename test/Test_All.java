package test;

import domain.User;
import view.View_Conversation;
import view.View_Group;
import view.View_Report;
import view.View_User;
import domain.Conversation;
import domain.Post;
import domain.Service_Instantiator;

import java.util.Scanner;

import database.Database;

public class Test_All {
	protected static Scanner scan = new Scanner(System.in);
		public static void main(String[] args) {
			Database.data();  // invocar os dados
			User u3;
			u3 = Database.getUserData("PROGRAMADOR");					
			View_User screen_user1 = new View_User(u3);
			View_Group screen_group1 = new View_Group(u3);
			View_Conversation screen_conversation1 = new View_Conversation(u3);
			View_Report screen_report1 = new View_Report(u3);
			Scanner t = new Scanner(System.in);
			String opMainMenuToLog = "0";					
			do {                         // INICIO DE PROGRAMA. OPÇÕES PARA LOGAR E FAZER CADASTRO
				screen_user1.printCleanConsole();
				screen_user1.printLoading();   t.nextLine();   // apenas para pausar e esparar usuário ler
				screen_user1.printCleanConsole();
				screen_user1.printMainMenu();				
				opMainMenuToLog = t.nextLine();				
				screen_user1.printCleanConsole();
					switch(opMainMenuToLog){
					case "1":				
							screen_user1.printLogin();	t.nextLine();   // apenas para pausar e esparar usuário ler
								//confere dados
							if(screen_user1.printLoginCheckingData() == true) {   
							screen_user1.printCleanConsole();							
							screen_user1.printLoading2();     t.nextLine();   // apenas para pausar e esparar usuário ler
							String opMainMenuLoggedIn = "0";
													do {	// APÓS ESTAR LOGADO														
														screen_user1.printCleanConsole();														
														screen_user1.printLoggedMainMenu(); // entra em rede social no MENU principal do User														
														opMainMenuLoggedIn = t.nextLine();
															switch(opMainMenuLoggedIn) {
					///Ainda não feito 						
															case "1": 	// Pesquisar
																opMainMenuLoggedIn = "0";	
															break;
															case "2": 	// Amigos
																opMainMenuLoggedIn = "0";
															break;
															case "3": 	// Grupos													    	
																String opMainMenuScreenGroup = "0";
																	do {	//MENU PRINCIPAL DE GRUPOS																			
																    		screen_group1.printCleanConsole();			
																    		screen_group1.printGroupScreen();																			
																    		opMainMenuScreenGroup = t.nextLine();																    		
																    		screen_group1.printCleanConsole();
																			switch(opMainMenuScreenGroup){
																				case "1":      					// selecionar Grupo																					
																					String SelectedGroup = screen_group1.printSelectGroup();
																					if (SelectedGroup !="Nenhum grupo correspondente!") {
																					String loopMenuGroup = "0";	
																					String opMenuGroup;				
																						do{		//EM UM GRUPO
																							screen_group1.printCleanConsole();
																							// pega a string de opção de grupo e retorna o respectivo Group
																							screen_group1.printGroup( Database.getGroupData(SelectedGroup), u3 );			
																							opMenuGroup = t.nextLine();																									
																										switch(opMenuGroup) {
																										case "0":
																											loopMenuGroup="1";
																										break;																										
																										default:
																											System.out.println("	Comando inválido");
																											t.nextLine();   // apenas para pausar e esperar usuário ler
																											loopMenuGroup="0";					
																										break;
																										case "2":
																											System.out.println("	Checando acesso de membro...");
																											t.nextLine();   // apenas para pausar e esperar usuário ler
																										break;
																										case "3":
																											System.out.println("	Checando acesso de moderador...");
																											t.nextLine();   // apenas para pausar e esperar usuário ler
																										break;
																										case "4":
																											System.out.println("	Checando acesso de moderador...");
																											t.nextLine();   // apenas para pausar e esperar usuário ler
																										break;
																										case "5":
																											System.out.println("	Checando acesso de moderador...");
																											t.nextLine();   // apenas para pausar e esperar usuário ler
																										break;
																										case "6":
																											System.out.println("	Checando acesso de moderador...");
																											t.nextLine();   // apenas para pausar e esperar usuário ler
																										break;
																										case "+":   // solicitar participação em grupo
																				// ainda não feito
																											opMenuGroup="0";	
																										break;
																										case "-":   // Excluir-me de grupo
																					// ainda não feito
																											opMenuGroup="0";	
																										break;
																										case "1":						// Selecionar Post do grupo
																											screen_group1.printCleanConsole();
																											//Post SelectedPost
																											Post PostSelected = screen_group1.printSelectPost(Database.getGroupData(SelectedGroup));
																											if(PostSelected!= null) {
																											String loopMenuPost="0";
																											String opMenuPost;
																												do {    	// EM UM POST
																														screen_group1.printCleanConsole();
																														screen_group1.printPost( PostSelected, Database.getGroupData(SelectedGroup) , u3 );
																														opMenuPost = t.nextLine();																														
																														switch(opMenuPost) {
																														case "0":    // voltar para um GRUPO							
																															loopMenuPost= "1";
																														break;
																														default:
																															System.out.println("              Comando inválido");
																															t.nextLine();   // apenas para pausar e esperar usuário ler
																															loopMenuPost= "0";					
																														break;	
																														case "1":
																															System.out.println("	Checando acesso de membro...");
																															t.nextLine();   // apenas para pausar e esperar usuário ler
																														break;
																														case "2":
																															System.out.println("	Checando acesso de membro...");
																															t.nextLine();   // apenas para pausar e esperar usuário ler
																														break;
																														case "3":
																															System.out.println("	Checando acesso de moderador...");
																															t.nextLine();   // apenas para pausar e esperar usuário ler
																														break;
																														}
																														for(int i=0; i < Database.getGroupData(SelectedGroup).getMembers().size(); i++ ) {
																															if(Database.getGroupData(SelectedGroup).getMembers().get(i).getUserName().equals(u3.getUserName()) ) {																																
																																switch(opMenuPost) {	
																																case "1":    // Escrever Comment em post selecionado	
																																	screen_group1.printCleanConsole();
																																	screen_group1.readAddCommment( PostSelected , u3);
																																	
																																break;
																																case "2":     // Deletar meu comentário
																								//não feito																																												
																																	
																																break;
																																} // Switch
																															} // if 
																														} //  for
																														for(int i=0; i < Database.getGroupData(SelectedGroup).getModerators().size(); i++ ) {
																															if (Database.getGroupData(SelectedGroup).getModerators().get(i).getUserName().equals(u3.getUserName()) ) {																																
																																switch(opMenuPost) {
																																case "3":    // Deletar comentário inadequado
																					//não feito										
																																	System.out.println("	Checando acesso de moderador...");	
																																break;																																
																																} // Switch
																															} // if																															
																														} //  for																												
																													}while(loopMenuPost== "0");	
																											}
																											loopMenuGroup="0";								
																										break; // Selecionar Post do grupo																								
																										} //  Switch
																											for(int i=0; i < Database.getGroupData(SelectedGroup).getMembers().size(); i++ ) {
																												if(Database.getGroupData(SelectedGroup).getMembers().get(i).getUserName().equals(u3.getUserName()) ) {																													
																													switch(opMenuGroup) {
																															case "2":                    // Escrever Post
																																screen_group1.printCleanConsole();
																																screen_group1.readAddPost( Database.getGroupData(SelectedGroup), u3 );
																																loopMenuGroup="0";																																
																															break;																																																																																												
																													} //  Switch
																												} //if
																											} //for
																												for(int i=0; i < Database.getGroupData(SelectedGroup).getModerators().size(); i++ ) {
																												 if (Database.getGroupData(SelectedGroup).getModerators().get(i).getUserName().equals(u3.getUserName()) ) {	
																													 switch(opMenuGroup) {
							                                 /*AINDA NÃO FEITO*/											case "3":					// Visualizar membros de grupo
																	//															screen_group1.SeeMembers();
																																
																															break;	
							                                 																case "4":					// Add User em grupo
																																screen_group1.printCleanConsole();
																																screen_group1.readAddUserToGroup( Database.getGroupData(SelectedGroup) );
																																loopMenuGroup="0";	
																															break;
																/*AINDA NÃO FEITO*/											case "5":					// Remove User em grupo
																															
																															break;
																/*AINDA NÃO FEITO*/											case "6":					// Adicionar moderador em grupo

																															break;																														
																													} // switch	
																												 } //  if
																											   } //  for			
																							}while(loopMenuGroup=="0");	  //Fim de um grupo
																					}
																				opMainMenuScreenGroup= "0";
																			break;
																			case "2":				//CRIAR GRUPO						
																				screen_group1.readCreateGroup(u3);		
																				opMainMenuScreenGroup= "0";
																			break;																				
																			case "0":				//Sair de painel Geral de GRUPOS																
																				opMainMenuScreenGroup = "1";
																				opMainMenuLoggedIn = "0";
																			break;
																			default:
																				System.out.println("Comando inválido");		t.nextLine();// apenas para pausar e esperar usuário ler
																				opMainMenuScreenGroup= "0";					
																			break;
																			}  // fim switch opMainMenuScreenGroup			
																		} while(opMainMenuScreenGroup== "0"); //MENU PRINCIPAL DE GRUPOS																    	
															break;
															case "4":       //conversas
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
																opMainMenuLoggedIn="0";    	
															break;															
															case "5":       // DENÚNCIAS (REPORT)																	    
																String opsMainMenuScreenReport = "0";
																do {				// menu principal de denúncias
																	screen_report1.printCleanConsole();				
																	screen_report1.printReportScreen(u3);
																	opsMainMenuScreenReport = t.nextLine();
																    	switch(opsMainMenuScreenReport) {
																    		case "1":          // Fazer denúncia
																    			screen_report1.printCleanConsole();		
																    			String reportedUserSelected = screen_report1.printReadSelectingReportedUser();
																    			if(reportedUserSelected != "User inexistente!") {
																    			screen_report1.readAddReportReason(u3, reportedUserSelected);	//retorna Report
																    			}
																    			opsMainMenuScreenReport= "0";
																    		break;																    		
																    		case "0":																    		
																    			opsMainMenuScreenReport= "1";
																    		break;																    		
																    		default:		    			
																    			opsMainMenuScreenReport= "0";
																    		break;		    
																    	}																    
																	} while(opsMainMenuScreenReport== "0");
																screen_report1.printCleanConsole();																    	
															   	opMainMenuLoggedIn= "0";
															break;
															case "0":  // LOG OFF
																screen_report1.printCleanConsole();		
																screen_user1.printExiting(); t.nextLine();// apenas para pausar e esperar usuário ler
																opMainMenuLoggedIn= "1";
																opMainMenuToLog="0";
															break;
															default:
																System.out.println("Comando inválido"); t.nextLine(); // apenas para pausar e esperar usuário ler
																opMainMenuLoggedIn="0";
															break;
															}
														}while(opMainMenuLoggedIn=="0");
								} else {									
									System.out.println("Email e/ou Senha ERRADO(s)!\n\n\n\n\n\n"); t.nextLine();// apenas para pausar e esperar usuário ler
									opMainMenuToLog = "0";
								}
					break;			
					case "2":
						String opSignIn;
						String loopSignIn= "0";
						do {
							screen_user1.printSignInLoading();  	t.nextLine(); // apenas para pausar e esparar usuário ler
							screen_user1.printSignInReading(); 	t.nextLine(); // apenas para pausar e esperar usuário ler
							screen_user1.printCleanConsole();
							screen_user1.printSignInConfirmMyData();								
							opSignIn = t.nextLine();
							switch (opSignIn) {
								case "0": //sair
									opMainMenuToLog= "0"; loopSignIn = "1";
								break;
								case "1":  // refazer sign in
									opMainMenuToLog= "0"; loopSignIn = "0";
				    				screen_user1.printCleanConsole();
				    			break;
								case "2":									
									opMainMenuToLog="0"; loopSignIn = "1";
								break;
								default:
									System.out.println("Comando inválido");   t.nextLine();   // apenas para pausar e esparar usuário ler
									loopSignIn = "0";										// repete sign in
								break;
								}							
							} while(loopSignIn== "0");							
					break;
					case "0":	//  SAIR DE PROGRAMA
						screen_report1.printCleanConsole();			
						screen_user1.printExiting(); t.nextLine(); // apenas para pausar e esperar usuário ler
						opMainMenuToLog = "1"; 
					break;
					default:
						System.out.println("Comando inválido"); t.nextLine();  // apenas para pausar e esparar usuário ler
						opMainMenuToLog="0";					
					break;			
					}
			} while (opMainMenuToLog == "0");	
			t.close();
		} // main()
} //Test_All
