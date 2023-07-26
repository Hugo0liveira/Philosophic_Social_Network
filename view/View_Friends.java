package view;

import util.Keyboard;

public class View_Friends {
	public String printFriendsMenu(String myFriends){
		Keyboard.printCleanConsole();
		System.out.println(""
				+ "                        -''--.\r\n"
				+ "                        _`>   `\\.-'<\r\n"
				+ "                     _.'     _     '._\r\n"
				+ "                   .'   _.='   '=._   '.\r\n"
				+ "                   >_   / /_\\ /_\\ \\   _<\r\n"
				+ "                     / (  \\o/\\\\o/  ) \\\r\n"
				+ "                     >._\\ .-,_)-. /_.<\r\n"
				+ "                         /__/ \\__\\ \r\n"
				+ "                           '---'       \n"
				+ "                                              ___\n"
				+ "                                            .'   `.\r\n"
				+ "                                            |     |\r\n"
				+ "                                           \"=======\"\r\n"
				+ "                                            $ ^ ^ $ \r\n"
				+ "                                            `  #  '\r\n"
				+ "                                             `._.'\r\n"
				+ "                                          _.'< ' >'-._\r\n"
				+ "                                        .'    \\ /     '\r\n"
				+ "                                       /       v       \\\r\n"
				+ "                                      / .     .:    .   |\n"
				+ "\n"
				+ "			Meus amigos: \n"
				+ "" + myFriends
				+ "   \n ");		
		System.out.println("_____                                              _____________________");
		System.out.println("|              ");
		System.out.println("| 		   1)  Selecionar amigo para conversar ");
		System.out.println("|              ");
		System.out.println("| 		       2) Buscar usuário e solicitar amizade");
		System.out.println("|              ");
		System.out.println("|  			        3) Finalizar amizade ");
		System.out.println("|              ");		
		System.out.println("|              ");
		System.out.println("|         Digite opção desejada:                       ");
		System.out.println("|________________________________________________");		
		System.out.println("_____ ");
		System.out.println("_____ ");
		System.out.println("                                			           	   0) Voltar           ");
		System.out.println("__________________________________________________________________");		
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("________________________________________ ");
		 String readString = Keyboard.readString();
		 return readString;		
	}
	
	public String showAllUserOrdered(String users){
		Keyboard.printCleanConsole();
		System.out.println(""
				+ "                        -''--.\r\n"
				+ "                        _`>   `\\.-'<\r\n"
				+ "                     _.'     _     '._\r\n"
				+ "                   .'   _.='   '=._   '.\r\n"
				+ "                   >_   / /_\\ /_\\ \\   _<\r\n"
				+ "                     / (  \\o/\\\\o/  ) \\\r\n"
				+ "                     >._\\ .-,_)-. /_.<\r\n"
				+ "                         /__/ \\__\\ \r\n"
				+ "                           '---'       \n"
				+ "                                              ___\n"
				+ "                                            .'   `.\r\n"
				+ "                                            |     |\r\n"
				+ "                                           \"=======\"\r\n"
				+ "                                            $ ^ ^ $ \r\n"
				+ "                                            `  #  '\r\n"
				+ "                                             `._.'\r\n"
				+ "                                          _.'< ' >'-._\r\n"
				+ "                                        .'    \\ /     '\r\n"
				+ "                                       /       v       \\\r\n"
				+ "                                      / .     .:    .   |\n"
				+ "\n"
				+ "			Todos os usuários: \n"
				+ "" + users
				+ "   \n ");		
		System.out.println("_____                                              _____________________");		
		System.out.println("|              ");
		System.out.println("|         Digite nome de usuário para solicitar amizade:                       ");
		System.out.println("|________________________________________________");			
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("________________________________________ ");
		 String readString = Keyboard.readString();
		 return readString;		
	}
	
	public void printSolicitationSuccess(String chosenUser){
		System.out.println("\n\n			Sucesso! solicitação enviada para " + chosenUser + "!\n\n"); Keyboard.pressEnter();
	}
	
	public void printError(){
		System.out.println("\n\n			Opção ERRADA! Tente novamente!\n\n"); Keyboard.pressEnter();
	}
	
	public void printDeletingSucces(String resultDeleting){
		System.out.println("\n\n			Sucesso! Amizade com "+ resultDeleting + " foi terminada!\n\n"); Keyboard.pressEnter();
	}
	
	public String printSelectFriend(String myFriends){
		Keyboard.printCleanConsole();
		System.out.println(""
		+ "			Meus amigos: \n"
				+ "" + myFriends
				+ "   \n ");		
		System.out.println("_____                                              ");
		System.out.println("                                             ");
		System.out.println("		 Digite número do amigo desejado: ");
		String readString = Keyboard.readString();
		 return readString;						
	}
	
	public String selectMembertoDelete(String friends) {
		Keyboard.printCleanConsole();
		System.out.println("____________________________________________________________________________________________________");		
		System.out.println(""
				+ "                                            .___.\r\n"
				+ "                        /)               ,-^     ^-.\r\n"
				+ "                       //               /           \\\r\n"
				+ "              .-------| |--------------/  __     __  \\-------------------.__\r\n"
				+ "              |WMWMWMW| |>>>>>>>>>>>>> | />>\\   />>\\ |>>>>>>>>>>>>>>>>>>>>>>:>\r\n"
				+ "              `-------| |--------------| \\__/   \\__/ |-------------------'^^\r\n"
				+ "                       \\\\               \\    /|\\    /\r\n"
				+ "                        \\)               \\   \\_/   /\r\n"
				+ "                                          |       |\r\n"
				+ "                                          |+H+H+H+|\r\n"
				+ "                                          \\       /\r\n"
				+ "                                           ^-----^"			
				+ "");
		System.out.println("____________________________________________________________________________________________________");		
		System.out.println("_____ ");		
		System.out.println("_____                ");
		System.out.println("");
		System.out.println("" + friends);
		System.out.println("\n");		
		System.out.println("_____ 			Digite o nome do amigo que deseja excluir:");
		System.out.println("____________________________________________________________________");
		System.out.println("_____ ");		
		System.out.println("_____");
		return  Keyboard.readString();
	}	

}
