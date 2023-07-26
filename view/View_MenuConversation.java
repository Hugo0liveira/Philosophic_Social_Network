package view;

import util.Keyboard;

public class View_MenuConversation {
	public String printConversationMenu(String MyConversations) {
		Keyboard.printCleanConsole();
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("    ");
		System.out.println("\n"
				+ "                         ,-.\r\n"
				+ "                        / \\  `.  __..-,O\r\n"
				+ "                       :   \\ --''_..-'.'\r\n"
				+ "                       |    . .-' `. '.\r\n"
				+ "                       :     .     .`.'\r\n"
				+ "                        \\     `.  /  ..\r\n"
				+ "                         \\      `.   ' .\r\n"
				+ "                          `,       `.   \\\r\n"
				+ "                         ,|,`.        `-.\\\r\n"
				+ "                        '.||  ``-...__..-`\r\n"
				+ "                         |  |\r\n"
				+ "                         |__|\r\n"
				+ "                         /||\\\r\n"
				+ "                        //||\\\\\r\n"
				+ "                       // || \\\\\r\n"
				+ "                    __//__||__\\\\__\r\n"
				+ "                   '--------------'   ");
		System.out.println("  ");
		System.out.println("_____                    Conversas ________________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("|  ");
		System.out.println("|                  Conversas ativas:  ");
		System.out.println("|  \n"
				+ "" +  MyConversations + "");		 
		System.out.println("|__________________________________________________________________________________________________________");
		System.out.println("|  ");
		System.out.println("|                     1) Selecionar conversa. ");
		System.out.println("|  ");		
		System.out.println("|                     2) Iniciar nova conversa");
		System.out.println("|  ");		
		System.out.println("|  ");
		System.out.println("|                     0) Sair");
		System.out.println("|  ");
		System.out.println("|  ");
		System.out.println("|__________________________________________________________________________________________________________");
		return Keyboard.readString();
	}
	
	public void printError(){
		System.out.println("\n\n			Opção ERRADA! Tente novamente!\n\n"); Keyboard.pressEnter();
	}
	
	public String printSelectConversation(String MyConversations) {
		Keyboard.printCleanConsole();
		System.out.println(""
				+ "\n\n"
				+ "                               ___\r\n"
				+ "                              /(_))\r\n"
				+ "                            _/   /\r\n"
				+ "                           //   /\r\n"
				+ "                          //   /\r\n"
				+ "                          /\\__/\r\n"
				+ "                          \\O_/=-.\r\n"
				+ "                      _  / || \\  ^o\r\n"
				+ "                      \\\\/ ()_) \\.\r\n"
				+ "                       ^^ <__> \\()\r\n"
				+ "                         //||\\\\\r\n"
				+ "                        //_||_\\\\  ds\r\n"
				+ "                       // \\||/ \\\\\r\n"
				+ "                      //   ||   \\\\\r\n"
				+ "                     \\/    |/    \\/\r\n"
				+ "                     /     |      \\\r\n"
				+ "                    /      |       \\\r\n"
				+ "                           |"
				+ "\n");		
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("_____                    Conversas __________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");		
		System.out.println("|                                                                     ");
		System.out.println("|                  Conversas ativas:  ");
		System.out.println("|  ");
		System.out.println("" + MyConversations);
		System.out.println("|   					                                              ");
		System.out.println("|                       							                  ");
		System.out.println("|                      Digite número de conversa  desejada:                           ");
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________"
				+ "\n\n\n\n\n\n");		
		return Keyboard.readString();
	}
	
	public String namingNewConversation() {
		Keyboard.printCleanConsole();
		System.out.println(""
				+ "\n"
				+ "        		0===0\r\n"
				+ "        		 O=o\r\n"
				+ "        		  O\r\n"
				+ "        		 o=O\r\n"
				+ "        		0===0\r\n"
				+ "	        	 O=o\r\n"
				+ "		          O\r\n"
				+ "	        	 o=O\r\n"
				+ "        		0===0\r\n"
				+ "		         O=o\r\n"
				+ "  		      O\r\n"
				+ "	        	 o=O\r\n"
				+ "        		0===0\r\n"
				+ "									            ______              \r\n"
				+ "				  					         .-'      `-.           \r\n"
				+ "									       .'            `.         \r\n"
				+ "									      /                \\        \r\n"
				+ "									     ;                 ;`       \r\n"
				+ "									     |                 |;       \r\n"
				+ "									     ;                 ;|\r\n"
				+ "									     '\\               / ;       \r\n"
				+ "									      \\`.           .' /        \r\n"
				+ "									       `.`-._____.-' .'         \r\n"
				+ "									         / /`_____.-'           \r\n"
				+ "									        / / /                   \r\n"
				+ "									       / / /\r\n"
				+ "									      / / /\r\n"
				+ "									     / / /\r\n"
				+ "									    / / /\r\n"
				+ "									   / / /\r\n"
				+ "									  / / /\r\n"
				+ "									 / / /\r\n"
				+ "									/ / /\r\n"
				+ "									\\/_/"
				+ "\n");
		System.out.println("______________________________________________________________________");
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     ");
		System.out.println("|                     Digite nome para nova conversa (opcional): ");		
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     "
				+ "\n"
				+ "                   -. .-.   .-. .-.   .-. .-.   .  \r\n"
				+ "                   ||\\|||\\ /|||\\|||\\ /|||\\|||\\ /|\r\n"
				+ "                   |/ \\|||\\|||/ \\|||\\|||/ \\|||\\||\r\n"
				+ "                   ~   `-~ `-`   `-~ `-`   `-~ `-"
				+ "");
		return Keyboard.readString();
	}

}
