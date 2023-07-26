package view;

import util.Keyboard;

public class View_Login {
	public String printLogInEmail(){
		Keyboard.printCleanConsole();
		System.out.println("\n"
				+ "                                   .-\"\"\"\"-.       .-\"\"\"\"-.\r\n"
				+ "                                  /        \\     /        \\\r\n"
				+ "                                 /_        _\\   /_        _\\\r\n"
				+ "                                // \\      / \\\\ // \\      / \\\\\r\n"
				+ "                                |\\__\\    /__/| |\\__\\    /__/|\r\n"
				+ "                                 \\    ||    /   \\    ||    /\r\n"
				+ "                                  \\        /     \\        /\r\n"
				+ "                                   \\  __  /       \\  __  /\r\n"
				+ "                           .-\"\"\"\"-. '.__.'.-\"\"\"\"-. '.__.'.-\"\"\"\"-.\r\n"
				+ "                          /        \\ |  |/        \\ |  |/        \\\r\n"
				+ "                         /_        _\\|  /_        _\\|  /_        _\\\r\n"
				+ "                        // \\      / \\\\ // \\      / \\\\ // \\      / \\\\\r\n"
				+ "                        |\\__\\    /__/| |\\__\\    /__/| |\\__\\    /__/|\r\n"
				+ "                         \\    ||    /   \\    ||    /   \\    ||    /\r\n"
				+ "                          \\        /     \\        /     \\        /\r\n"
				+ "                           \\  __  /       \\  __  /       \\  __  /\r\n"
				+ "                            '.__.'         '.__.'         '.__.'\r\n"
				+ "                             |  |           |  |           |  |\r\n"
				+ "                             |  |           |  |           |  | ");
		System.out.println("_____ ");
		System.out.println("__________________________________________________________________");
		System.out.println("_____ ");
		System.out.println("_____                          Login _____________________________");		
		System.out.println("__________________________________________________________________");
		System.out.println("__________________________________________________________________");
		System.out.println("__________________________________________________________________");
		System.out.println("_____ ");
		System.out.println("                               ");	
		System.out.println("_____ ");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________");
		System.out.println("__________________________________________________________________");		
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________");
		System.out.println("                                                        ");
		System.out.println("                   Digite seu email:_____________ ");
		System.out.println("                   Pressione 'Enter'              \n");		
		return Keyboard.readString();
	}
	public String printLogInPassword(){		
		System.out.println("                   Digite sua senha:_____________");
		System.out.println("                   Pressione 'Enter'                \n");
		System.out.println("_____ ");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________");
		return Keyboard.readString();
	}
	
	public void printLogInError(){
		System.out.println("\n			Email e/ou Senha ERRADO(s)!\n\n"); Keyboard.pressEnter();
	}
}
