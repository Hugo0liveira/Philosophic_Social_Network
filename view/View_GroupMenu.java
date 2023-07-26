package view;

import util.Keyboard;

public class View_GroupMenu {	
	public String mainMenu(String groups) {
		Keyboard.printCleanConsole();
		System.out.println("___________________________________________________________________________________________________________");		
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("              \n"
				+ "                        .--.           .---.        .-.\n"
				+ "                    .---|--|   .-.     |   |  .---. |~|-=-=-.--.\r\n"
				+ "                 .--|===|Ex|---|_|--.__|   |--|:::| |~|     |==|---.\r\n"
				+ "                |%%%|   |is|===| |~~|%%|Ma |--|   |_|~| De  |  |___|-.\r\n"
				+ "                |   |Epi|te|===| |==|  |ter|  |:::|=| | Ter |Ni|---|=|\r\n"
				+ "                |On |ste|nc|   |_|__|  |ia |__|   | | | mi  |i |___| |\r\n"
				+ "                | To|mo |ia|   |_|__|  |lis|__|   | | | nis |li|___| |\r\n"
				+ "                |lo | lo|li|   |_|__|  |mo |__| ? | | | mo  | s|___| |\r\n"
				+ "                |gia|gia|sm|   |_|__|  |   |__|   | | |     |mo|___| |\r\n"
				+ "                |   |   |o |   |_|__|  |   |__|   | | |     |  |___| |\r\n"
				+ "                |~~~|===|--|===|~|~~|%%|~~~|--|:::|=|~|-----|==|---|=|\r\n"
				+ "                ^---^---'--^---^-^--^--^---'--^---^-^-^-=-=-^--^---^-'          ");
		System.out.println("  ");
		System.out.println(" ____                         Grupos   _______________________________________________________");
		System.out.println(" ___________________________________________________________________________________________________________");
		System.out.println("  \n"
				+ "" + groups );
		System.out.println(" ___________________________________________________________________________________________________________");
		System.out.println("|  ");
		System.out.println("|                         1) Selecionar grupo. ");
		System.out.println("|  ");		
		System.out.println("|                                      2) Criar grupo");
		System.out.println("|         ");
		System.out.println("|                                              3) Meus grupos");
		System.out.println("|  ");
		System.out.println("|                                                    0) Sair\n"
				+ "                                       /|~|\\\r\n"
				+ "                                      / |=| \\\r\n"
				+ "                                     /  | |  \\\r\n"
				+ "                                    |   | |   |\r\n"
				+ "                                    |   | |   |\r\n"
				+ "                                    |   | |   |\r\n"
				+ "                                    |   |=|   |\r\n"
				+ "                                    |  //A\\\\  |\r\n"
				+ "                                    | /// \\\\\\ | \r\n"
				+ "                                    |///   \\\\\\|");
		System.out.println("___________________________________________________________________________________________________________");
		return  Keyboard.readString();
	}
	
	public String showMyGroups(String myGroups) {
		Keyboard.printCleanConsole();
		System.out.println("___________________________________________________________________________________________________________");		
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("              \n"
				+ "                        .--.           .---.        .-.\n"
				+ "                    .---|--|   .-.     |   |  .---. |~|-=-=-.--.\r\n"
				+ "                 .--|===|Ex|---|_|--.__|   |--|:::| |~|     |==|---.\r\n"
				+ "                |%%%|   |is|===| |~~|%%|Ma |--|   |_|~| De  |  |___|-.\r\n"
				+ "                |   |Epi|te|===| |==|  |ter|  |:::|=| | Ter |Ni|---|=|\r\n"
				+ "                |On |ste|nc|   |_|__|  |ia |__|   | | | mi  |i |___| |\r\n"
				+ "                | To|mo |ia|   |_|__|  |lis|__|   | | | nis |li|___| |\r\n"
				+ "                |lo | lo|li|   |_|__|  |mo |__| ? | | | mo  | s|___| |\r\n"
				+ "                |gia|gia|sm|   |_|__|  |   |__|   | | |     |mo|___| |\r\n"
				+ "                |   |   |o |   |_|__|  |   |__|   | | |     |  |___| |\r\n"
				+ "                |~~~|===|--|===|~|~~|%%|~~~|--|:::|=|~|-----|==|---|=|\r\n"
				+ "                ^---^---'--^---^-^--^--^---'--^---^-^-^-=-=-^--^---^-'          ");
		System.out.println("  ");
		System.out.println(" ____                         Meus Grupos   _______________________________________________________");
		System.out.println(" ___________________________________________________________________________________________________________");
		System.out.println("  \n"
				+ "" + myGroups );
		System.out.println(" ___________________________________________________________________________________________________________");
		System.out.println("|  ");
		System.out.println("|                          Digite número de grupo  desejado:                                   ");
		System.out.println("|  ");
		System.out.println("___________________________________________________________________________________________________________");
		return  Keyboard.readString();
	}
	
	public void printError(){
		System.out.println("\n\n			Opção ERRADA! Tente novamente!\n\n"); Keyboard.pressEnter();
	}
	
	public void errorCreatingGroup(String creatingGroupCondition) {
		System.out.println("\n\n		" + creatingGroupCondition + "\n\n"); Keyboard.pressEnter();
	}
	
	public String selectingGroup(String groups) {
		Keyboard.printCleanConsole();
		System.out.println("___________________________________________________________________________________________________________");		
		System.out.println(""
				+ ""
				+ "\n"
				+ "                       ||-------------------------------------------------------||\r\n"
				+ "                       ||.--.    .-._                        .----.             ||\r\n"
				+ "                       |||==|____| |H|___            .---.___|\"\"\"\"|_____.--.___ ||\r\n"
				+ "                       |||  |====| | |xxx|_          |+++|=-=|_  _|-=+=-|==|---|||\r\n"
				+ "                       |||==|    | | |   | \\         |   |   |_\\/_|Black|  | ^ |||\r\n"
				+ "                       |||  |    | | |   |\\ \\   .--. |   |=-=|_/\\_|-=+=-|  | ^ |||\r\n"
				+ "                       |||  |    | | |   |_\\ \\_( oo )|   |   |    |     |  | ^ |||\r\n"
				+ "                       |||==|====| |H|xxx|  \\ \\ |''| |+++|=-=|\"\"\"\"|-=+=-|==|---|||\r\n"
				+ "                       ||`--^----'-^-^---'   `-' \"\"  '---^---^----^-----^--^---^||\r\n"
				+ "                       ||-------------------------------------------------------||\r\n"
				+ "                       ||-------------------------------------------------------||\r\n"
				+ "                       ||               ___                   .-.__.-----. .---.||\r\n"
				+ "                       ||              |===| .---.   __   .---| |XX|<(*)>|_|^^^|||\r\n"
				+ "                       ||         ,  /(|   |_|III|__|''|__|:x:|=|  |     |=|   |||\r\n"
				+ "                       ||      _a'{ / (|===|+|   |++|  |==|   | |  |Illum| |   |||\r\n"
				+ "                       ||      '/\\\\/ _(|===|-|   |  |''|  |:x:|=|  |inati| |   |||\r\n"
				+ "                       ||_____  -\\{___(|   |-|   |  |  |  |   | |  |     | |   |||\r\n"
				+ "                       ||       _(____)|===|+|[I]|  |''|==|:x:|=|XX|<(*)>|=|^^^|||\r\n"
				+ "                       ||              `---^-^---^--^--'--^---^-^--^-----^-^---^||\r\n"
				+ "                       ||-------------------------------------------------------||\r\n"
				+ "                       ||_______________________________________________________||"
				+ ""
				+ "");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("______________________________________________________________________");
		System.out.println("_____                        Selecionar Grupo _______________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("                                                                     ");
		System.out.println(""+ groups );			
		System.out.println("   					                                              ");		
		System.out.println("                          Digite número de grupo  desejado:                                   ");
		System.out.println("   					                                              ");
		System.out.println("___________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		return  Keyboard.readString();
	}
	
	public String CreateGroupName() {
		Keyboard.printCleanConsole();
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println(" _________________________________________________________________________________________________________"
				+ "\n"
				+ "                           __________________   __________________\r\n"
				+ "                       .-/|                  \\ /                  |\\-.\r\n"
				+ "                       ||||                   |                   ||||\r\n"
				+ "                       ||||   Criando Grupo   |       ~~*~~       ||||\r\n"
				+ "                       ||||                   |                   ||||\r\n"
				+ "                       ||||                   |                   ||||\r\n"
				+ "                       ||||                   |                   ||||\r\n"

				+ ""
				+ "\n\n");		
		System.out.println(" _________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println(" ______________________________________________________________________");
		System.out.println(" ______________________________________________________________________");		
		System.out.println(" ______________________________________________________________________");
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     ");
		System.out.println("|                         Digite nome para Grupo: ");		
		return  Keyboard.readString();
	}
	public String CreateGroupDescription() {
		System.out.println("\n|                         Digite descrição para Grupo:                    ");		
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     ");

		System.out.println("__________________________________________________________________________________________________________");
		System.out.println(" _________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");
		return  Keyboard.readString();
	}
	
	
	
	
}
