package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import domain.User;
import view.View_Group;
import domain.Group;
import domain.Post;
import database.Database;

public class Test_Screen_Group {
	protected static Scanner scan = new Scanner(System.in);
	Database database;
	public List<Group> groups = new ArrayList<Group>();

	public static void main(String[] args) {
		
		User u3;
		u3 = Database.getUserData("Eu");	
		
		View_Group screen_group1 = new View_Group(u3);
		
		Scanner t = new Scanner(System.in);
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
				//opMainMenuLoggedIn = "0";
			break;
			default:
				System.out.println("Comando inválido");		t.nextLine();// apenas para pausar e esperar usuário ler
				opMainMenuScreenGroup= "0";					
			break;
			}  // fim switch opMainMenuScreenGroup			
		} while(opMainMenuScreenGroup== "0"); //MENU PRINCIPAL DE GRUPOS										    	

		t.close();
	} //main()
} //Test_Screen_Group












