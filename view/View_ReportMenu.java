package view;

import util.Keyboard;

public class View_ReportMenu {
	public String printReportMenu(String myReports) {
		Keyboard.printCleanConsole();
		System.out.println("___________________________________________________________________________________________________________");		
		System.out.println(" "
				+ "\n "
				+ "                          ,---__,------__---.\r\n"
				+ "                         ,'////<: =     ]\\\\\\\\\\`.\r\n"
				+ "                        ///__---^~~\"\"\"~~^---__\\\\\\\r\n"
				+ "                       //,' D E T E C T I V E `.\\\\\r\n"
				+ "                      /  \\   __---^~~~^---__   /  \\\r\n"
				+ "                     /,.  \\,'   /.-----.\\   `./  ,.\\\r\n"
				+ "                    //  `.     MMM ,^. MMM     ,'  \\\\\r\n"
				+ "                   //.--. ~~^^---^~   ~^---^^~~ .--.\\\\\r\n"
				+ "                  //  '> \\  __--'^^~~~^^`--__  / <'   \\\r\n"
				+ "                   \\   / _-^  o   L   I   c  ^-_ \\   /\r\n"
				+ "                    \\  ,'  P  __--^^^^^--__  E  `.  /\r\n"
				+ "                     \\ \\   ,-^             ^-.   / /\r\n"
				+ "                     i  \\,' ,^-__-^~/\\^-__-^. `./  i\r\n"
				+ "                     |     /|#`|`.| ||**\\ */-\\     |\r\n"
				+ "                     !     '>#| `|`.||--/* \\*<'    !\r\n"
				+ "                     /     /|#|_|#_|||________\\    \\    \r\n"
				+ "                    /      \\   *   *||.| |#| |/     \\\r\n"
				+ "                   i        \\**\\ */-[]|`.|#| /       i\r\n"
				+ "                   |         \\-/* \\/~~\\`|`.|/        |\r\n"
				+ "                   |   /`.    `. ./_[]_\\.`,'   ,'\\   |\r\n"
				+ "                   !  /   `-.   ^|______|^  ,-'   \\  !\r\n"
				+ "                    \\ `.     ~~^--_____--^~~     ,' /\r\n"
				+ "                     \\  `-_       REPORT      _-'  /\r\n"
				+ "                      `.   ^~--._________.--~^   ,'\r\n"
				+ "                        ^-_                   _-^\r\n"
				+ "                           ^~--__ 1 6 4 __--~^\r\n"
				+ "                                 `.   ,'\r\n"
				+ "                                   `-'  ");
		System.out.println("  ");
		System.out.println(" ____                         Minhas denúncias   _______________________________________________________");
		System.out.println(" __________________________________________________________________________________________________________");
		System.out.println("  \n" + myReports + "\n\n");
		System.out.println(" __________________________________________________________________________________________________________");
		System.out.println("|  ");		
		System.out.println("|                              1) Fazer nova denúncia");
		System.out.println("|  ");
		System.out.println("|                                             0) Sair");
		System.out.println("|  ");	
		System.out.println("");
		System.out.println("_____ ");		
		System.out.println("_____ ");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println(" __________________________________________________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println(" __________________________________________________________________________________________________________");
		return Keyboard.readString();
	}
	public void printError(){
		System.out.println("\n\n			Opção ERRADA! Tente novamente!\n\n"); Keyboard.pressEnter();
	}
	
	public void printErrorReportedName(){
		System.out.println("\n\n			Nome ERRADO! Tente novamente!\n\n"); Keyboard.pressEnter();
	}
	
	public void printErrorReason(){
		System.out.println("\n\n			ERRO! Caracteres insuficientes! Tente novamente!\n\n"); Keyboard.pressEnter();
	}

	public String newReportNameReported(String users){
		Keyboard.printCleanConsole();
		System.out.println("_____ ");		
		System.out.println("_____                        Sobreviventes: ");		
		System.out.println("_____ ");
		System.out.println("");
		System.out.println("" + users + "\n");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("_____ ");		
		System.out.println("_____                        Digite quem deve ser denunciado: ");		
		System.out.println("_____ ");		
		System.out.println("| ");	
		return Keyboard.readString();
	}
	
	public String newReportReason(){
		Keyboard.printCleanConsole();
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("\n"
				+ ""
				+ "                        .::::::::::.                          .::::::::::.\r\n"
				+ "                      .::::''''''::::.                      .::::''''''::::.\r\n"
				+ "                    .:::'          `::::....          ....::::'          `:::.\r\n"
				+ "                   .::'             `:::::::|        |:::::::'             `::.\r\n"
				+ "                  .::|               |::::::|_ ___ __|::::::|               |::.\r\n"
				+ "                  `--'               |::::::|_()__()_|::::::|               `--'\r\n"
				+ "                   :::               |::-o::|        |::o-::|               :::\r\n"
				+ "                   `::.             .|::::::|        |::::::|.             .::'\r\n"
				+ "                    `:::.          .::\\-----'        `-----/::.          .:::'\r\n"
				+ "                      `::::......::::'                      `::::......::::'\r\n"
				+ "                        `::::::::::'                          `::::::::::'"
				+ "\n\n");
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     ");
		System.out.println("|                                Digite razão: ");		                                                                    
		System.out.println("|                                                                     ");
		System.out.println("__________________________________________________________________________________________________________");
		return Keyboard.readString();
	}

}








