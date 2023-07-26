package view;

import util.Keyboard;

public class View_GroupSelected {
	public String onGroup( String MyEmail, String selectedGroupName, String description, String accessLevel, String moderatorAccess, String posts) {
	Keyboard.printCleanConsole();
	System.out.println("___________________________________________________________________________________________________________");
	System.out.println("\n"
			+ "                              .--.                   .---.\r\n"
			+ "                          .---|__|           .-.     |~~~|\r\n"
			+ "                       .--|===|--|_          |_|     |~~~|--.\r\n"
			+ "                       |  |===|  |'\\     .---!~|  .--|   |--|\r\n"
			+ "                       |%%|   |  |.'\\    |===| |--|%%|   |  |\r\n"
			+ "                       |%%|   |  |\\.'\\   |   | |__|  |   |  |\r\n"
			+ "                       |  |   |  | \\  \\  |===| |==|  |   |  |\r\n"
			+ "                       |  |   |__|  \\.'\\ |   |_|__|  |~~~|__|\r\n"
			+ "                       |  |===|--|   \\.'\\|===|~|--|%%|~~~|--|\r\n"
			+ "                       ^--^---'--^    `-'`---^-^--^--^---'--'"
			+ "");
	System.out.println("______________________________________________________________________");		
	System.out.println("____");
	System.out.println("____  " + selectedGroupName     + "   ______");
	System.out.println("___________________________________________________________________________________________________________");
	System.out.println("                                                                     ");
	System.out.println("  Descrição: "   + description  + "\n"  );
	System.out.println("                                                                     " 
	+ "\n Posts: \n\n" + posts + "\n\n");
	System.out.println("_____________________________________________________________________");
	System.out.println("  _________________________________________________________________________________________________________");
	System.out.println("___________________________________________________________________________________________________________");
	System.out.println(" _____________________________________________________________________\n");	
	if(accessLevel == "notMember") {
		System.out.println("|       +) Solicitar participação                                     \n");
	} else if (accessLevel == "Member") {
		System.out.println("|       -) Nâo ser membro de grupo                                     \n");
	}
	
	System.out.println("|                                                                     ");
	System.out.println("|                 1) Selecionar post                                     \n");
	System.out.println("|                                                                     ");
	if(accessLevel == "Member") {
			System.out.println("|                          2) Escrever Post              \n");
			System.out.println("|                                                                     ");
	}
		if( moderatorAccess == "Moderator") {	
			System.out.println("|         3) Visualizar membros                     4) Convidar usuário            \n");           		
			System.out.println("|                                                                     ");				               
			System.out.println("|                5) Remover usuário                         6) Adicionar moderador         \n");	
		}
	System.out.println("|                                                                   0) Voltar                          \n");
	System.out.println(" ____________________________________________________________________________");		
	System.out.println(" ");
	System.out.println("___________________________________________________________________________________________________________");
	
	
	return  Keyboard.readString();
	}
	
	public void printError(){
		System.out.println("\n\n			Opção ERRADA! Tente novamente!\n\n"); Keyboard.pressEnter();
	}
	
	public void printRequestSuccess( ){
		System.out.println("\n\n			Sucesso! Requisição para participar foi enviada! \n\n"); Keyboard.pressEnter();
	}
	
	public void printDeletingSuccess(String resultDeleting){
		System.out.println("\n\n			Sucesso! Caso "+ resultDeleting + " não seja moderador, será removido do grupo!\n\n"); Keyboard.pressEnter();
	}

	public void printAddingModeratorSuccess(String resultDeleting){
		System.out.println("\n\n			Sucesso! Caso "+ resultDeleting + " seja membro, será adicionado como moderador do grupo!\n\n"); Keyboard.pressEnter();
	}
	
	public void printSolicitationSuccess(String user){
		System.out.println("\n\n			Sucesso! Convite enviado para "+ user + "!\n\n"); Keyboard.pressEnter();
	}
	
	public String selectingPost(String postsOrdered, String selectedGroupName){
		Keyboard.printCleanConsole();
	System.out.println("___________________________________________________________________________________________________________"
			+ "\n"
			+ "                                            _________   _________\r\n"
			+ "                                       ____/POSTs 452\\ /     453 \\____\r\n"
			+ "                                     /| ------------- |  ------------ |\\\r\n"
			+ "                                    ||| ------------- | ------------- |||\r\n"
			+ "                                    ||| ------------- | ------------- |||\r\n"
			+ ""
			+ "");		
	System.out.println("______________________________________________________________________");
	System.out.println("_____                        Posts de " + selectedGroupName );
	System.out.println("______________________________________________________________________");
	System.out.println("___________________________________________________________________________________________________________");		
	System.out.println("\n"+postsOrdered +"\n");
	System.out.println("                       							                  ");
	System.out.println("|                          Digite post desejado:                     ");
	System.out.println("___________________________________________________________________________________________________________");
	System.out.println("___________________________________________________________________________________________________________");
	System.out.println("___________________________________________________________________________________________________________");
	return  Keyboard.readString();
	}
	
	public String writingPost(String selectedGroup) {		
		Keyboard.printCleanConsole();
		System.out.println(" ______________________________________________________________________");		
		System.out.println("_______ " + selectedGroup);
		System.out.println(" ______________________________________________________________________");
		System.out.println("\n\n\n"
				+ "                         __\r\n"
				+ "                        (`/\\\r\n"
				+ "                        `=\\/\\ __...--~~~~~-._   _.-~~~~~--...__\r\n"
				+ "                         `=\\/\\               \\ /               \\\\\r\n"
				+ "                          `=\\/    posting...  V                 \\\\\r\n"
				+ "                          //_\\___--~~~~~~-._  |  _.-~~~~~~--...__\\\\\r\n"
				+ "                         //  ) (..----~~~~._\\ | /_.~~~~----.....__\\\\\r\n"
				+ "                        ===( INK )==========\\\\|//====================\r\n"
				+ "                       __   \\___/________   `---`_________________________________________________________"
				+ "\n\n"
				+ "___________________________________________________________________________________________________________");;
		System.out.println(" ______________________________________________________________________");		
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println(" ______________________________________________________________________");		
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     ");
		System.out.println("|                  Digite post: ");		
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     \n\n\n");
		return  Keyboard.readString();
	}
	
	public String loading(String selectedGroup) {		
		Keyboard.printCleanConsole();
		System.out.println(" ______________________________________________________________________");		
		System.out.println("_______ " + selectedGroup);
		System.out.println(" ______________________________________________________________________");
		System.out.println("\n\n\n"
				+ "                         __\r\n"
				+ "                        (`/\\\r\n"
				+ "                        `=\\/\\ __...--~~~~~-._   _.-~~~~~--...__\r\n"
				+ "                         `=\\/\\               \\ /               \\\\\r\n"
				+ "                          `=\\/                V   LOADING...    \\\\\r\n"
				+ "                          //_\\___--~~~~~~-._  |  _.-~~~~~~--...__\\\\\r\n"
				+ "                         //  ) (..----~~~~._\\ | /_.~~~~----.....__\\\\\r\n"
				+ "                        ===( INK )==========\\\\|//====================\r\n"
				+ "                       __   \\___/________   `---`_________________________________________________________"
				+ "\n\n"
				+ "___________________________________________________________________________________________________________");;
		System.out.println(" ______________________________________________________________________");		
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println(" ______________________________________________________________________");		
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     \n\n\n");
		return  Keyboard.readString();
	}
	
	public void showMembers(String membersNames) {
		Keyboard.printCleanConsole();
		System.out.println("____________________________________________________________________________________________________");		
		System.out.println(""
				+ ""
				+ "                                               ..sSs$$$$$$b.                                       \r\n"
				+ "                                              .$$$$$$$$$$$$$$$.                                     \r\n"
				+ "                                           .$$$$$$$$$$$$$$$$$$$$$b.                                 \r\n"
				+ "                                         .$$$$$$$$$$$$$$$$$$$$$$$$$                                 \r\n"
				+ "                                        $$$$$$$$$$$$$$$$$S'   `$$$$                                 \r\n"
				+ "                                        $$$$$$$$$$$$$$S'        $$$                                 \r\n"
				+ "                                        $$$$$$$$$$$$$'          `$$.                                \r\n"
				+ "                                        `$$$$$$$$$$$$$           `$$$.                              \r\n"
				+ "                                          `$$$$$$$$$'       .s$$$ $$ $                              \r\n"
				+ "                                            $$$$$$$$$.sSs .s$$s\"   s s                               \r\n"
				+ "                                             $$$$$$$$$$$$           $P                              \r\n"
				+ "                                             `$$$$$$$$$$$s          $                               \r\n"
				+ "                                               $$$$$$$$$$$.    \",                                   \r\n"
				+ "                                               `$$$$$$$$$$sS$                                       \r\n"
				+ "                               s$$$.            `$$$$$$$$$$$$.s\"'   .$.                              \r\n"
				+ "                               $$$$$.              `$$$$$$$$$$.    .$$$Ss.s$s.                      \r\n"
				+ "                                $$$$$.              `$$$$$$$$$P   .$$$$$$$$$$$$.                    \r\n"
				+ "                                $$$$$$.               `$$$$$$$' .$$$$$$$$$$$$$$$$.                  \r\n"
				+ "                                `$$$$$$.                 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$s.         \r\n"
				+ "                                  $$$$$$.                `$$$$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$$s.      \r\n"
				+ "                                .s$$$$$$$.                 `$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.    \r\n"
				+ "                                s  $$$$$$$.                .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.   \r\n"
				+ "                                `$$$$$$$$$$.             .$$$' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$. \r\n"
				+ "                                 `$$$$$$$$$$.           s$'   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$. \r\n"
				+ "                                 $$$$$$$$$$$$e         $$$     `$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ \r\n"
				+ "                               .' $$$$$$$$$$7         $$$$       `$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\r\n"

				+ "");
		System.out.println("____________________________________________________________________________________________________");		
		System.out.println("_____ ");		
		System.out.println("_____                    Sobreviventes: ");
		System.out.println("");
		System.out.println("" + membersNames);
		System.out.println("");		
		System.out.println("_____ ");
		System.out.println("____________________________________________________________________");
		System.out.println("_____ ");		
		System.out.println("_____");
		Keyboard.pressEnter();
	}	
	
	public String selectMemberToRemove(String membersNames) {
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
		System.out.println("" + membersNames);
		System.out.println("\n");		
		System.out.println("_____ 			Digite o nome do membro que deseja remover:");
		System.out.println("____________________________________________________________________");
		System.out.println("_____ ");		
		System.out.println("_____");
		return  Keyboard.readString();
	}	
	public String selectMemberToAddModerator(String membersNames) {
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
		System.out.println("" + membersNames);
		System.out.println("\n");		
		System.out.println("_____ 			Digite o nome do membro que deseja adicionar como moderador:");
		System.out.println("____________________________________________________________________");
		System.out.println("_____ ");		
		System.out.println("_____");
		return  Keyboard.readString();
	}	
	
	public String showAllUsers(String users) {
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
		System.out.println("" + users);
		System.out.println("\n");		
		System.out.println("_____ 			Digite o nome do membro que desejado:");
		System.out.println("____________________________________________________________________");
		System.out.println("_____ ");		
		System.out.println("_____");
		return  Keyboard.readString();
	}
}
