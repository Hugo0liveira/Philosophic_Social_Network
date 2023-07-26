package view;

import util.Keyboard;

public class View_SignUpConfirmMyData {
	public String printSignUpConfirmMyData(String checkingSignUp, String userName, String email){
		Keyboard.printCleanConsole();
		System.out.println(""
				+ "                    .              +   .                .   . .     .  .\r\n"
				+ "                                      .                    .       .     *\r\n"
				+ "                     .       *                        . . . .  .   .  + .\r\n"
				+ "                               \"You Are Here\"            .   .  +  . . .\r\n"
				+ "                   .                 |             .  .   .    .    . .\r\n"
				+ "                                     |           .     .     . +.    +  .\r\n"
				+ "                                    \\|/            .       .   . .\r\n"
				+ "                           . .       V          .    * . . .  .  +   .\r\n"
				+ "                              +      .           .   .      +\r\n"
				+ "                                               .       . +  .+. .\r\n"
				+ "                     .                      .     . + .  . .     .      .\r\n"
				+ "                              .      .    .     . .   . . .        ! /\r\n"
				+ "                         *             .    . .  +    .  .       - O -\r\n"
				+ "                             .     .    .  +   . .  *  .       . / |\r\n"
				+ "                                  . + .  .  .  .. +  .\r\n"
				+ "                   .      .  .  .  *   .  *  . +..  .            *\r\n"
				+ "                    .      .   . .   .   .   . .  +   .    .            +");		
		System.out.println("__________________________________________________________________");
		System.out.println("_____ ");
		System.out.println("_____                    Dados de usuário           __________________________");
		System.out.println("_____ ");
		System.out.println("_____ ");			
		System.out.println(" ________________________________________________");
		System.out.println("| ");
		if(checkingSignUp == "true") {
		System.out.println("|                        Nome: " + userName);
		} else {
			System.out.println("| ");
			System.out.println("|                        ERRO! Informe os dados corretamente. \n"
					+ "                         Tente Novamente!");
		}
		System.out.println("| ");
		if(checkingSignUp == "true") {
		System.out.println("|                        Email: " + email);
		}
		System.out.println("| ");
		System.out.println("|____ ");
		System.out.println("| ");
		System.out.println("| ");
		System.out.println("| ");
		if(checkingSignUp == "true") {
		System.out.println("|____           2) Confirmar ");
		}
		System.out.println("_____                                       1) Refazer tentativa de Cadastro ");
		System.out.println(" ");
		System.out.println("_____                                        0) Sair ");
		System.out.println("__________________________________________________________________");
		System.out.println("__________________________________________________________________");		
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println(" _________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println(" _________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("_____ ");
		return Keyboard.readString();
	}
	
	public void printSignUpConfirmMyDataDefault(boolean ConditionDefault){
		if(ConditionDefault== true ) {
			System.out.println("\n			Comando inválido \n\n"); Keyboard.pressEnter();			
		}	
	}

}
