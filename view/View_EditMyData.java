package view;

import util.Keyboard;
public class View_EditMyData {
	public String opToEdit(){
	Keyboard.printCleanConsole();
	System.out.println(""
			+ "      .     .       .  .   . .   .   . .    +  .\r\n"
			+ "        .     .  :     .    .. :. .___---------___.\r\n"
			+ "             .  .   .    .  :.:. _\".^ .^ ^.  '.. :\"-_. .\r\n"
			+ "          .  :       .  .  .:../:            . .^  :.:\\.\r\n"
			+ "              .   . :: +. :.:/: .   .    .        . . .:\\\r\n"
			+ "       .  :    .     . _ :::/:               .  ^ .  . .:\\\r\n"
			+ "        .. . .   . - : :.:./.                        .  .:\\\r\n"
			+ "        .      .     . :..|:                    .  .  ^. .:|\r\n"
			+ "          .       . : : ..||        .                . . !:|\r\n"
			+ "        .     . . . ::. ::\\(                           . :)/\r\n"
			+ "       .   .     : . : .:.|. ######              .#######::|\r\n"
			+ "        :.. .  :-  : .:  ::|.#######           ..########:|\r\n"
			+ "       .  .  .  ..  .  .. :\\ ########          :######## :/\r\n"
			+ "        .        .+ :: : -.:\\ ########       . ########.:/\r\n"
			+ "          .  .+   . . . . :.:\\. #######       #######..:/\r\n"
			+ "            :: . . . . ::.:..:.\\           .   .   ..:/\r\n");
	System.out.println(""
			+ ""
			+ " ");
	System.out.println("__________________________________________________________________");
	System.out.println("_____ ");
	System.out.println("_____                              EDIT MY DATA     ___________________________________");
	System.out.println("__________________________________________________________________");
	System.out.println("_____                                               _______________________________");
	System.out.println("_____      Ao editar qualquer dado se faz logOff   _______________________________");
	System.out.println("_____                                              _____________________");
	System.out.println("|              ");
	System.out.println("| 		   1)  Editar nome ");
	System.out.println("|              ");
	System.out.println("| 		      2) Editar email");
	System.out.println("|              ");
	System.out.println("|                3) Editar senha ");
	System.out.println("|              ");
	System.out.println("                                			           	   0) Voltar           ");
	System.out.println("__________________________________________________________________");		
	return Keyboard.readString();
	}
	
	public void printError(){
		System.out.println( "\n\n		Comando equivocado! Tente Novamente! \n\n"); Keyboard.pressEnter();
	}
	
	
	public String editUsername(){
		Keyboard.printCleanConsole();
		System.out.println("__________________________________________________________________");
		System.out.println("__________________________________________________________________");
		System.out.println("_____ ");
		System.out.println("_____ ");
		System.out.println("__________________________________________________________________");
		System.out.println("__________________________________________________________________");
		System.out.println("_____ ");
		System.out.println("                         Digite UserName (visibilidade geral):_____________\n");
		System.out.println("                   Pressione 'Enter\n'                             \n");
			return Keyboard.readString();
		}
		
		public void errorEditUserName(){
			System.out.println( "\n\n Erro ao tentar modificar nome. Poucos caracteres ou nome existe. \n\n"); Keyboard.pressEnter();
		}
		
		public String editEmail(){
			Keyboard.printCleanConsole();
			System.out.println("__________________________________________________________________");
			System.out.println("__________________________________________________________________");
			System.out.println("_____ ");
			System.out.println("_____ ");
			System.out.println("__________________________________________________________________");
			System.out.println("__________________________________________________________________");
			System.out.println("_____ ");
			System.out.println("\n\n                         Digite email:_____________ \n");
			System.out.println("                   Pressione 'Enter\n'                                     \n");
			return Keyboard.readString();
		}
		
		public void errorEditUserEmail(){
			System.out.println( "\n\n Erro ao tentar modificar email. Poucos caracteres ou email existe. \n\n"); Keyboard.pressEnter();
		}
		
		public String editPassword(){
			Keyboard.printCleanConsole();
			System.out.println("__________________________________________________________________");
			System.out.println("__________________________________________________________________");
			System.out.println("_____ ");
			System.out.println("_____ ");
			System.out.println("__________________________________________________________________");
			System.out.println("__________________________________________________________________");
			System.out.println("_____ ");
			System.out.println("\n\n                         Digite senha:_____________\n");
			System.out.println("                   Pressione 'Enter\n'      \n");
			System.out.println("_____ ");
			System.out.println("_____ ");
			return Keyboard.readString(); 
		}
		
		public void errorEditUserPassword(){
			System.out.println( "\n\n Erro ao tentar modificar senha. Poucos caracteres. \n\n"); Keyboard.pressEnter();
		}
}









