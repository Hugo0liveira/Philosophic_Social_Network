package view;

import util.Keyboard;

public class View_Notifications {
	
	public String myNotifications(String notifications) {		
		Keyboard.printCleanConsole();
		System.out.println("__________________________________________________________________________________________________________");		
		System.out.println("\n\n"
				+ "                                                 ____\r\n"
				+ "                                                |    |\r\n"
				+ "                                                | .--'\r\n"
				+ "                                            ,.--| |-------------.\r\n"
				+ "                                            |:\\ | |   __       _ \\\r\n"
				+ "                                            |#| | |              |\r\n"
				+ "                                            |#| |o| NOTIFICATIONS|\r\n"
				+ "                                            |#| '-'              |\r\n"
				+ "                                            |#|                  |\r\n"
				+ "                                             \\|__________________|\r\n"
				+ "                                               [_______________]\r\n"
				+ "                                                      \\ \\   | |\r\n"
				+ "                                                       \\ \\  | |\r\n"
				+ "                                                       '/~\\ | | .-.-.~\r\n"
				+ "                                                      ~/.-.-. | '. .'\r\n"
				+ "                                               ,___.-.-.'. .'~| ~/!\r\n"
				+ "                                              ~/,  '. .'\\ ! |_|_/,!\r\n"
				+ "                                             .-.-.   !   \\! / .-.-.\r\n"
				+ "                                             '. .'   !   ,|/| '. .'\r\n"
				+ "                                               !      -_  |~| | !  _-\r\n"
				+ "                                               !         ~| lc| !-\r\n"
				+ "                             ~\"\"~ | ~\"\"~\r\n"
				+ "                                                      ~\"~\"~\"~\"~"
				+ "\n\n");
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("|                                                                     ");		
		System.out.println("" + notifications    );
		System.out.println("");
		System.out.println("__");		
		System.out.println("|_________________________________________________________________________________________________________");
		System.out.println("|                                                                     ");
		System.out.println("|                      1) Notificações de solicitação de amizade             \n");		
		System.out.println("|                      2) Notificações de convite de  grupo                   \n");
		/*	System.out.println("|                      3) Notificações de grupos que participo                \n");
		System.out.println("|                      4) Notificações de meus posts                           \n");
		System.out.println("|                      5) Notificações de conversa                           \n");*/
		System.out.println("|                      							       0) Voltar           \n");
		System.out.println("______________________________________________________________________");
		System.out.println("______________________________________________________________________");		
		System.out.println("__________________________________________________________________________________________________________"
				+ "\n\n\n");
		
		return Keyboard.readString();
	}
	
	public String myNotificationsInvite(String notifications) {		
		Keyboard.printCleanConsole();
		System.out.println("__________________________________________________________________________________________________________");		
		System.out.println("\n\n"
				+ "                          ||=|=|=|=|=|=|=|=|=|=|=| __..\\/ |  |_|  ||#||==|  / /|\r\n"
				+ "                          || | | | | | | | | | | |/\\ \\  \\\\|++|=|  || ||==| / / |\r\n"
				+ "                          ||_|_|_|_|_|_|_|_|_|_|_/_/\\_.___\\__|_|__||_||__|/_/__|\r\n"
				+ "                          |____________________ /\\~()/()~//\\ __________________|\r\n"
				+ "                          | __   __    _  _     \\_  (_ .  _/ _    ___     _____|\r\n"
				+ "                          ||~~|_|..|__| || |_ _   \\ //\\\\ /  |=|__|~|~|___| | | |\r\n"
				+ "                          ||--|+|^^|==|1||2| | |__/\\ __ /\\__| |==|x|x|+|+|=|=|=|\r\n"
				+ "                          ||__|_|__|__|_||_|_| /  \\ \\  / /  \\_|__|_|_|_|_|_|_|_|\r\n"
				+ "                          |_________________ _/    \\/\\/\\/    \\_ _______________|\r\n"
				+ "                          | _____   _   __  |/      \\../      \\|  __   __   ___|\r\n"
				+ "                          ||_____|_| |_|##|_||   |   \\/ __|   ||_|==|_|++|_|-|||\r\n"
				+ "                          ||______||=|#|--| |\\   \\   o    /   /| |  |~|  | | |||\r\n"
				+ "                          ||______||_|_|__|_|_\\   \\  o   /   /_|_|__|_|__|_|_|||\r\n"
				+ "                          |_________ __________\\___\\____/___/___________ ______|"		
				+ "\n\n");
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("|                                                                     ");		
		System.out.println("" + notifications    );
		System.out.println("");		
		System.out.println("|_________________________________________________________________________________________________________");
		System.out.println("|                                                                     ");
		System.out.println("|                      Digite de nome grupo para aceitar convite  \n");		
		System.out.println("|                                       \n");		
		System.out.println("|               \n");
		System.out.println("______________________________________________________________________");		
		System.out.println("__________________________________________________________________________________________________________"
				+ "\n\n\n");		
		return Keyboard.readString();
	}
	
	public String myNotificationsFriendship(String notifications) {		
		Keyboard.printCleanConsole();
		System.out.println("__________________________________________________________________________________________________________");		
		System.out.println("\n\n"
				+ "                 _          __________                              _,\r\n"
				+ "                _.-(_)._     .\"          \".      .--\"\"--.          _.-{__}-._\r\n"
				+ "              .'________'.   | .--------. |    .'        '.      .:-'`____`'-:.\r\n"
				+ "             [____________] /` |________| `\\  /   .'``'.   \\    /_.-\"`_  _`\"-._\\\r\n"
				+ "             /  / .\\/. \\  \\|  / / .\\/. \\ \\  ||  .'/.\\/.\\'.  |  /`   / .\\/. \\   `\\\r\n"
				+ "             |  \\__/\\__/  |\\_/  \\__/\\__/  \\_/|  : |_/\\_| ;  |  |    \\__/\\__/    |\r\n"
				+ "             \\            /  \\            /   \\ '.\\    /.' / .-\\                /-.\r\n"
				+ "             /'._  --  _.'\\  /'._  --  _.'\\   /'. `'--'` .'\\/   '._-.__--__.-_.'   \\\r\n"
				+ "            /_   `\"\"\"\"`   _\\/_   `\"\"\"\"`   _\\ /_  `-./\\.-'  _\\'.    `\"\"\"\"\"\"\"\"`    .'`\\\r\n"
				+ "           (__/    '|    \\ _)_|           |_)_/            \\__)|        '       |   |\r\n"
				+ "             |_____'|_____|   \\__________/   |              |;`_________'________`;-'"				
				+ "\n\n");
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("|                                                                     ");		
		System.out.println("" + notifications    );
		System.out.println("");		
		System.out.println("|_________________________________________________________________________________________________________");
		System.out.println("|                                                                     ");
		System.out.println("|                      Digite nome do usuário para aceitar amizade  \n");		
		System.out.println("|                                       \n");		
		System.out.println("|               \n");
		System.out.println("______________________________________________________________________");		
		System.out.println("__________________________________________________________________________________________________________"
				+ "\n\n\n");		
		return Keyboard.readString();
	}
	
	public void printError(){
		System.out.println("\n\n			Opção ERRADA! Tente novamente!\n\n"); Keyboard.pressEnter();
	}
	
	public void printAddSuccess(String result){
		System.out.println("\n\n			Sucesso! Amizade com "+ result + " foi feita!\n\n"); Keyboard.pressEnter();
	}
	public void printInviteSuccess(String result){
		System.out.println("\n\n	" + result + " Sucesso! Você se tornou membro de "+ result + ". \n\n"); Keyboard.pressEnter();
	}

}
