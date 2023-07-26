package view;

import util.Keyboard;

public class View_MainMenu {
	public String printMainMenu(boolean Default) {		
		Keyboard.printCleanConsole();
		System.out.println(""
				+ "                     ` : | | | |:  ||  :     `  :  |  |+|: | : : :|   .        `              .\r\n"
				+ "                         ` : | :|  ||  |:  :    `  |  | :| : | : |:   |  .                    :\r\n"
				+ "                            .' ':  ||  |:  |  '       ` || | : | |: : |   .  `           .   :.\r\n"
				+ "                                   `'  ||  |  ' |   *    ` : | | :| |*|  :   :               :|\r\n"
				+ "                           *    *       `  |  : :  |  .      ` ' :| | :| . : :         *   :.||\r\n"
				+ "                                .`            | |  |  : .:|       ` | || | : |: |          | ||\r\n"
				+ "                         '          .         + `  |  :  .: .         '| | : :| :    .   |:| ||\r\n"
				+ "                            .                 .    ` *|  || :       `    | | :| | :      |:| |\r\n"
				+ "                    .                .          .        || |.: *          | || : :     :|||\r\n"
				+ "                           .            .   . *    .   .  ` |||.  +        + '| |||  .  ||`\r\n"
				+ "                        .             *              .     +:`|!             . ||||  :.||`\r\n"
				+ "                    +                      .                ..!|*          . | :`||+ |||`\r\n"
				+ "                        .                         +      : |||`        .| :| | | |.| ||`     .\r\n"
				+ "                          *     +   '               +  :|| |`     :.+. || || | |:`|| `\r\n"
				+ "                                               .      .||` .    ..|| | |: '` `| | |`  +\r\n"
				+ "                     .       +++                      ||        !|!: `       :| |\r\n"
				+ "                                 +         .      .    | .      `|||.:      .||    .      .    `\r\n"
				+ "                             '                           `|.   .  `:|||   + ||'     `\r\n"
				+ "                     __    +      *                         `'       `'|.    `:\r\n"
				+ "                   \"'  `---\"\"\"----....____,..^---`^``----.,.___          `.    `.  .    ____,.,-\r\n"
				+ "                       ___,--'\"\"`---\"'   ^  ^ ^        ^       \"\"\"'---,..___ __,..---\"\"'");
		System.out.println("_____ ");
		System.out.println("_____ ");		
		System.out.println("_____                                                             	__________________");
		System.out.println("_____                   Bem-vindo a sua estrutura social dialética  _____________________");
		System.out.println("_____ ");
		System.out.println("__________________________  		 	O caminho entre as ideais  __");
		System.out.println("__________________________________________________________________");
		System.out.println("__________________________________________________________________");		
		System.out.println("__________________________________________________________________________________________________________");		
		System.out.println("|                        ");
		System.out.println("|               1) Login:   ");
		System.out.println("|              ");
		System.out.println("|               2) Sign Up: ");
		System.out.println("|              ");
		System.out.println("|                                                                                 0) Sair           "
				+ "");
		System.out.println("| 	       		  Digite opção desejada:                       ");
		System.out.println("|________________________________________________");
		System.out.println("__________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________");
		System.out.println(" _________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println(" _________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("_____ ");
		if(Default==false) {
			return	Keyboard.readString();
		} else {
			System.out.println("\n\n			Comando inválido. Esolha fazer login ou signup! \n\n\n"); return Keyboard.readString();
		}
	}	

}
