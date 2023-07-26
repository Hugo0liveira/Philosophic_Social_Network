package view;

import util.Keyboard;

public class View_LoggedMainMenu {
	public String printLoggedMainMenu(){
	Keyboard.printCleanConsole();
	System.out.println(""
			+ "                                                                        /_\\\r\n"
			+ "                                                          _            // \\\\\r\n"
			+ "                                                         /_\\          //   \\\\\r\n"
			+ "                                           _            // \\\\        //   .-.\\\r\n"
			+ "                                          /_\\          //   \\\\      ///--//-')\\\r\n"
			+ "                            _            // \\\\        //   .-.\\    // \\-//--' \\\\\r\n"
			+ "                           /_\\          //   \\\\      ///--//-')\\  ((   ((      ))\r\n"
			+ "             _            // \\\\        //   .-.\\    // \\-//--' \\\\  \\\\  No U   //\r\n"
			+ "            /_\\          //   \\\\      ///--//-')\\  ((   ((      ))  \\\\ Turn  //\r\n"
			+ "           // \\\\        //   .-.\\    // \\-//--' \\\\  \\\\ No Left //    \\\\     //\r\n"
			+ "          //   \\\\      ///--//-')\\  ((   ((      ))  \\\\ Turn  //      \\\\   //\r\n"
			+ "         //   .-.\\    // \\-//--' \\\\  \\\\ No Right//    \\\\     //        \\\\_//| -'\r\n"
			+ "        ///--//-')\\  ((   ((      ))  \\\\ Turn  //      \\\\   //    ..--  \\_/ |\r\n"
			+ "       // \\-//--' \\\\  \\\\  Dead   //    \\\\     //        \\\\_//| -'        || |\r\n"
			+ "      ((   ((      ))  \\\\ End   //      \\\\   //    ..--  \\_/ |           || |\r\n"
			+ "       \\\\ Bridge  //    \\\\     //        \\\\_//| -'        || |           || |\r\n"
			+ "        \\\\ Out   //      \\\\   //    ..--  \\_/ |           || |           || |\r\n"
			+ "         \\\\     //        \\\\_//| -'        || |           || |          )|| | _.-\r\n"
			+ "          \\\\   //    ..--  \\_/ |           || |           || |     ..--(   .-'\r\n"
			+ "           \\\\_//| -'        || |           || |          )|| | _.-\r\n"
			+ "      ..--  \\_/ |           || |           || |     ..--(   .-'\r\n"
			+ "             || |           || |          )|| | _.-\r\n"
			+ "             || |           || |     ..--(   .-'\r\n"
			+ "             || |          )|| | _.-\r\n"
			+ "             || |     ..--(   .-'\r\n"
			+ "            )|| | _.-\r\n"
			+ "           \n ");		
	System.out.println("_____                                              _____________________");
	System.out.println("_____       Sua rede social, suas escolhas       _____________________");
	System.out.println("|              ");
	System.out.println("|              ");
	System.out.println("| 		      					1) Pesquisar   +) Notificações ");
	System.out.println("|              ");
	System.out.println("| 		      		      	2) Amigos ");
	System.out.println("|              ");
	System.out.println("|        3) Grupos   ");
	System.out.println("|              ");
	System.out.println("|  				      4) Conversas ");
	System.out.println("|              ");
	System.out.println("| 		      						 5) Denúncias ");
	System.out.println("|              ");		
	System.out.println("| 		      						 6) Editar dados de cadastro ");
	System.out.println("|              ");
	System.out.println("|         Digite opção desejada:                       ");
	System.out.println("|________________________________________________");		
	System.out.println("_____ ");
	System.out.println("_____ ");
	System.out.println("                                			           	   0) Sair           ");
	System.out.println("__________________________________________________________________");		
	System.out.println("__________________________________________________________________________________________________________");
	System.out.println("________________________________________ ");
	 String readString = Keyboard.readString();
	 return readString;
	}
	
	
	public void printError(){
		System.out.println("\n\n			Opção ERRADA! Tente novamente!\n\n"); Keyboard.pressEnter();
	}
}
