package view;

import java.util.Scanner;

import database.Database;
import domain.User;

public class View_User {
	private User user;	
	
	protected static Scanner scan = new Scanner(System.in);
	
	public View_User(User user) {
		this.user = user;
	}
	
	public void setScreen_User(User user) {
		if (user==null) {
    		try {
    		throw new RuntimeException("Erro User: userName não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Errado! User não pode ser nulo!");
    		}
		} else {
		this.user = user;
		}
	}
		
	public User getScreen_User() {
		return user;
	}
	
	public void printLoading(){
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("\n\n\n"
				+ ""
				+ ""
				+ "                     \\ /                                          \\   /\r\n"
				+ "                    --o--           `\\\\             //'      .____-/.\\-____.\r\n"
				+ "                                      \\\\           //             ~`-'~\r\n"
				+ "                                       \\\\. __-__ .//\r\n"
				+ "                             ___/-_.-.__`/~     ~\\'__.-._-\\___                    \r\n"
				+ "      .|.       ___________.'__/__ ~-[ \\.\\'-----'/./ ]-~ __\\__`.___________       .|.\r\n"
				+ "      ~o~~~~~~~--------______-~~~~~-_/_/ |   .   | \\_\\_-~~~~~-______--------~~~~~~~o~\r\n"
				+ "      ' `               + + +  (X)(X)  ~--\\__ __/--~  (X)(X)  + + +               ' `\r\n"
				+ "                                   (X) `/.\\' ~ `/.\\' (X)  \r\n"
				+ "                                       \"\\_/\"   \"\\_/\""
				+ ""
				+ "");		
		System.out.println("_____ ");
		System.out.println("_____                    Carregando sua Rede Social ________________");
		System.out.println("__________________________________________________________________");
		System.out.println("_____ ");
		System.out.println("_____                    O lugar perfeito para fingir intimidade ____________________");
		System.out.println("__________________________________________________________________");
		System.out.println("_____ \n"
				+ "\n");
		System.out.println(""
				+ "                                     ________________\r\n"
				+ "                                ____/ (  (    )   )  \\___\r\n"
				+ "                               /( (  (  )   _    ))  )   )\\\r\n"
				+ "                             ((     (   )(    )  )   (   )  )\r\n"
				+ "                           ((/  ( _(   )   (   _) ) (  () )  )\r\n"
				+ "                          ( (  ( (_)   ((    (   )  .((_ ) .  )_\r\n"
				+ "                         ( (  )    (      (  )    )   ) . ) (   )\r\n"
				+ "                        (  (   (  (   ) (  _  ( _) ).  ) . ) ) ( )\r\n"
				+ "                        ( (  (   ) (  )   (  ))     ) _)(   )  )  )\r\n"
				+ "                       ( (  ( \\ ) (    (_  ( ) ( )  )   ) )  )) ( )\r\n"
				+ "                        (  (   (  (   (_ ( ) ( _    )  ) (  )  )   )\r\n"
				+ "                       ( (  ( (  (  )     (_  )  ) )  _)   ) _( ( )\r\n"
				+ "                        ((  (   )(    (     _    )   _) _(_ (  (_ )\r\n"
				+ "                         (_((__(_(__(( ( ( |  ) ) ) )_))__))_)___)\r\n"
				+ "                         ((__)        \\\\||lll|l||///          \\_))\r\n"
				+ "                                  (   /(/ (  )  ) )\\   )\r\n"
				+ "                                (    ( ( ( | | ) ) )\\   )\r\n"
				+ "                                 (   /(| / ( )) ) ) )) )\r\n"
				+ "                               (     ( ((((_(|)_)))))     )\r\n"
				+ "                                (      ||\\(|(|)|/||     )\r\n"
				+ "                              (        |(||(||)||||        )\r\n"
				+ "                                (     //|/l|||)|\\\\ \\     )\r\n"
				+ "                              (/ / //  /|//||||\\\\  \\ \\  \\ _)\r\n"
				+ "-------------------------------------------------------------------------------");
		System.out.println("________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");
	}	
	
	public void printMainMenu() {		
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
		System.out.println("|               2) Sign In: ");
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
	}
				
	public void printSignInLoading() {
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
				+ "            :: . . . . ::.:..:.\\           .   .   ..:/\r\n"
				+ "         .   .   .  .. :  -::::.\\.       | |     . .:/\r\n"
				+ "            .  :  .  .  .-:.\":.::.\\             ..:/\r\n"
				+ "       .      -.   . . . .: .:::.:.\\.           .:/\r\n"
				+ "      .   .   .  :      : ....::_:..:\\   ___.  :/\r\n"
				+ "         .   .  .   .:. .. .  .: :.:.:\\       :/\r\n"
				+ "           +   .   .   : . ::. :.:. .:.|\\  .:/|\r\n"
				+ "           .         +   .  .  ...:: ..|  --.:|\r\n"
				+ "      .      . . .   .  .  . ... :..:..\"(  ..)\"\r\n"
				+ "       .   .       .      :  .   .: ::/  .  .::\\ ");
		System.out.println(""
				+ ""
				+ " ");
		System.out.println("__________________________________________________________________");
		System.out.println("_____ ");
		System.out.println("_____                               Sign In      ___________________________________");
		System.out.println("__________________________________________________________________");
		System.out.println("__________________________________________________________________");
		System.out.println("__________________________________________________________________");
		System.out.println("_____ ");
		System.out.println("_____ ");		
		System.out.println("__________________________________________________________________");
		System.out.println("__________________________________________________________________");		
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("_____ ");
		System.out.println("_____ ");
		System.out.println("___________________________________________________________________________________________________________");
	}	
		
	public void printSignInReading() {
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________");
		System.out.println("__________________________________________________________________");
		System.out.println("_____ ");
		System.out.println("                         Digite UserName (visibilidade geral):_____________\n");
		System.out.println("                   Pressione 'Enter\n'                             \n");
		System.out.println("                         Digite email:_____________ \n");
		System.out.println("                   Pressione 'Enter\n'                                     \n");
		System.out.println("                         Digite senha:_____________\n");
		System.out.println("                   Pressione 'Enter\n'      \n");
		System.out.println("_____ ");
		System.out.println("_____ ");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________");
		String readNome = scan.nextLine();
		int nameUsed=0;
		for(int i=0; i<Database.users.size(); i++) {
			if (Database.users.get(i).getUserName().equals(readNome)) {
	    		try {
	    		throw new RuntimeException("UserName sendo usado por algum user!");
	    		}
	    		catch (RuntimeException ex) {
	    			System.out.println("UserName sendo usado por algum user!");
	    			nameUsed=1;
	    		}
			}
		}
	    	if(nameUsed==0){		
			this.user.setUserName(readNome);
			String readEmail = scan.nextLine();		
			this.user.setEmail(readEmail);	
			String readPassword = scan.nextLine();
			this.user.setPassword(readPassword);
	    	}		
	}
	
	public void printSignInConfirmMyData() {		
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
		if(this.user.getUserName()!= "PROGRAMADOR") {
		System.out.println("|                        Nome: " + this.user.getUserName());
		} else {
			System.out.println("| ");
			System.out.println("|                        ERRO! Informe os dados corretamente. \n"
					+ "                         Tente Novamente!");
		}
		System.out.println("| ");
		if(this.user.getUserName()!= "PROGRAMADOR") {
		System.out.println("|                        Email: " + this.user.getEmail());
		}
		System.out.println("| ");
		System.out.println("|____ ");
		System.out.println("| ");
		System.out.println("| ");
		System.out.println("| ");
		if(this.user.getUserName()!= "PROGRAMADOR") {
		System.out.println("|____           2) Confirmar ");
		}
		System.out.println("_____                                       1) Refazer Sign In ");
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
	}
	
	public void printLogin() {
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
	}
	
	public boolean printLoginCheckingData() {
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________");
		System.out.println("                                                        ");
		System.out.println("                   Digite seu email:_____________ ");
		System.out.println("                   Pressione 'Enter'              \n");
		System.out.println("                   Digite sua senha:_____________");
		System.out.println("                   Pressione 'Enter'                \n");
		System.out.println("_____ ");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________");
		String emailString = scan.nextLine();		
    	if (emailString==null) {
    		try {
    		throw new RuntimeException("Erro User: email não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Errado! Email de usuário não pode ser nulo!");
    		}
    	} else if(emailString.equals("")) {
    		try {
    		throw new RuntimeException("Erro User: email não pode ser vazio");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Errado! Email de usuário não pode ser vazio!");
    		}
    	}else if(emailString.length() < 15 ) {
    		try{
        		throw new RuntimeException("Erro User: email não pode ser menor que 15 digitos!");
        		}
        		catch (RuntimeException ex) {
        			System.out.println("Email não pode ser menor que 15 digitos!");
        		} 		
    	}
    	String passwordString = scan.nextLine();
    	 if (passwordString==null) {
        		try {
        		throw new RuntimeException("Erro User: password não pode ser null");
        		}
        		catch (RuntimeException ex) {
        			System.out.println("Errado! Senha não pode ser nula!");
        		}
        	} else if(passwordString.equals("")) {
        		try {
        		throw new RuntimeException("Erro User: password não pode ser vazio");
        		}
        		catch (RuntimeException ex) {
        			System.out.println("Errado! Senha não pode ser vazia!");
        		}    		
        	}else if(passwordString.length() < 15 ) {
        		try{
            		throw new RuntimeException("Erro User: password não pode ser menor que 15 digitos!");
            		}
            		catch (RuntimeException ex) {
            			System.out.println("Senha não pode ser menor que 15 digitos!");        			
            		}  		
        	}    	 
    	 		
    			if(passwordString.equals(this.user.getPassword()) && emailString.equals(this.user.getEmail())  ) {
    				//System.out.print("Senha ou email corretos! ");
    				return true;
    			} else {
    				//	System.out.print("Senha ou email errados! ");
    				return false;
    			}
    		    	
	}	
		
	
	
	public void printCleanConsole(){
		int i;
		for(i=0; i<100; i++) {
		System.out.println("    ");
		}		
	}
	
	public void printLoggedMainMenu() {		
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
		System.out.println("| 		      							1) Pesquisar ");
		System.out.println("|              ");
		System.out.println("| 		      		      	2) Amigos ");
		System.out.println("|              ");
		System.out.println("|        3) Grupos   ");
		System.out.println("|              ");
		System.out.println("|  				      4) Conversas ");
		System.out.println("|              ");
		System.out.println("| 		      						 5) Denúncias ");
		System.out.println("|              ");		
		System.out.println("|              ");
		System.out.println("|         Digite opção desejada:                       ");
		System.out.println("|________________________________________________");		
		System.out.println("_____ ");
		System.out.println("_____ ");
		System.out.println("                                			           	   0) Sair           ");
		System.out.println("__________________________________________________________________");		
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("________________________________________ ");
	}
	

	
	public void printLoading2(){		
		System.out.println("\n"
				+ ""
				+ "                 .-.__      \\ .-.  ___  __\r\n"
				+ "                 |_|  '--.-.-(   \\/\\;;\\_\\.-._______.-.\r\n"
				+ "                 (-)___     \\ \\ .-\\ \\;;\\(   \\       \\ \\\r\n"
				+ "                  Y    '---._\\_((Q)) \\;;\\\\ .-\\     __(_)\r\n"
				+ "                  I           __'-' / .--.((Q))---'    \\,\r\n"
				+ "                  I     ___.-:    \\|  |   \\'-'_          \\\r\n"
				+ "                  A  .-'      \\ .-.\\   \\   \\ \\ '--.__     '\\\r\n"
				+ "                  |  |____.----((Q))\\   \\__|--\\_      \\     '\r\n"
				+ "                     ( )        '-'  \\_  :  \\-' '--.___\\\r\n"
				+ "                      Y                \\  \\  \\       \\(_)\r\n"
				+ "                      I                 \\  \\  \\         \\,\r\n"
				+ "                      I                  \\  \\  \\          \\\r\n"
				+ "                      A                   \\  \\  \\          '\\\r\n"
				+ "                      |                    \\  \\__|           '\r\n"
				+ "                                            \\_:.  \\\r\n"
				+ "                                              \\ \\  \\\r\n"
				+ "                                               \\ \\  \\\r\n"
				+ "                                                \\_\\_|"
				+ "\n");		
		System.out.println("_____ ");
		System.out.println("_____                     Carregando sua Rede Social ________________");
		System.out.println("__________________________________________________________________");
		System.out.println("_____ ");
		System.out.println("_____                     O lugar perfeito para fingir intimidade ____________________");
		System.out.println("__________________________________________________________________");
		System.out.println("_____ ");
		System.out.println(""
				+ "                                                                    __,-~~/~    `---.\r\n"
				+ "                                                                  _/_,---(      ,    )\r\n"
				+ "                                                              __ /        <    /   )  \\___\r\n"
				+ "                                               - ------===;;;'====------------------===;;;===----- -  -\r\n"
				+ "                                                                 \\/  ~\"~\"~\"~\"~\"~\\~\"~)~\"/\r\n"
				+ "                                                                 (_ (   \\  (     >    \\)\r\n"
				+ "                                                                  \\_( _ <         >_>'\r\n"
				+ "                                                                     ~ `-i' ::>|--\"\r\n"
				+ "                                                                         I;|.|.|\r\n"
				+ "                                                                        <|i::|i|`.\r\n"
				+ "                                                                       (` ^'\"`-' \")\n"
				+ ""
				+ "\n"
				+ "                                            _.-^^---....,,--       \r\n"
				+ "                                        _--                  --_  \r\n"
				+ "                                       <                        >)\r\n"
				+ "                                       |                         | \r\n"
				+ "                                        \\._                   _./  \r\n"
				+ "                                           ```--. . , ; .--'''       \r\n"
				+ "                                                 | |   |             \r\n"
				+ "                                              .-=||  | |=-.   \r\n"
				+ "                                              `-=#$%&%$#=-'   \r\n"
				+ "                                                 | ;  :|     \r\n"
				+ "                                        _____.,-#%&$@%#&#~,._____"
				+ "");
		
	}
	
	public void printExiting(){		
		System.out.println("\n"
				+ "                                                    .do-\"\"\"\"\"'-o..                         \r\n"
				+ "                                                 .o\"\"            \"\"..                       \r\n"
				+ "                                               ,,''                 ``b.                   \r\n"
				+ "                                              d'                      ``b                   \r\n"
				+ "                                             d`d:                       `b.                 \r\n"
				+ "                                            ,,dP                         `Y.               \r\n"
				+ "                                           d`88                           `8.               \r\n"
				+ "                     ooooooooooooooooood888`88'                            `88888888888bo, \r\n"
				+ "                    d\"\"\"    `\"\"\"\"\"\"\"\"\"\"\"\"Y:d8P                              8,          `b \r\n"
				+ "                    8                    P,88b                             ,`8           8 \r\n"
				+ "                    8                   ::d888,                           ,8:8.          8 \r\n"
				+ "                    :                   dY88888                           `' ::          8 \r\n"
				+ "                    :                   8:8888                               `b          8 \r\n"
				+ "                    :                   Pd88P',...                     ,d888o.8          8 \r\n"
				+ "                    :                   :88'dd888888o.                d8888`88:          8 \r\n"
				+ "                    :                  ,:Y:d8888888888b             ,d88888:88:          8 \r\n"
				+ "                    :                  :::b88d888888888b.          ,d888888bY8b          8 \r\n"
				+ "                                        b:P8;888888888888.        ,88888888888P          8 \r\n"
				+ "                                        8:b88888888888888:        888888888888'          8 \r\n"
				+ "                                        8:8.8888888888888:        Y8888888888P           8 \r\n"
				+ "                    ,                   YP88d8888888888P'          \"\"888888\"Y            8 \r\n"
				+ "                    :                   :bY8888P\"\"\"\"\"''                     :            8 \r\n"
				+ "                    :                    8'8888'                            d            8 \r\n"
				+ "                    :                    :bY888,                           ,P            8 \r\n"
				+ "                    :                     Y,8888           d.  ,-         ,8'            8 \r\n"
				+ "                    :                     `8)888:           '            ,P'             8 \r\n"
				+ "                    :                      `88888.          ,...        ,P               8 \r\n"
				+ "                    :                       `Y8888,       ,888888o     ,P                8 \r\n"
				+ "                    :                         Y888b      ,88888888    ,P'                8 \r\n"
				+ "                    :                          `888b    ,888888888   ,,'                 8 \r\n"
				+ "                    :                           `Y88b  dPY888888OP   :'                  8 \r\n"
				+ "                    :                             :88.,'.   `' `8P-\"b.                   8 \r\n"
				+ "                    :.                             )8P,   ,b '  -   ``b                  8 \r\n"
				+ "                    ::                            :':   d,'d`b, .  - ,db                 8 \r\n"
				+ "                    ::                            `b. dP' d8':      d88'                 8 \r\n"
				+ "                    ::                             '8P\" d8P' 8 -  d88P'                  8 \r\n"
				+ "                    ::                            d,' ,d8'  ''  dd88'                    8 \r\n"
				+ "                    ::                           d'   8P'  d' dd88'8                     8 \r\n"
				+ "                     :                          ,:   `'   d:ddO8P' `b.                   8 \r\n"
				+ "                     :                  ,dooood88: ,    ,d8888\"\"    ```b.                8 \r\n"
				+ "                     :               .o8\"'\"\"\"\"\"\"Y8.b    8 `\"''    .o'  `\"\"\"ob.           8 \r\n"
				+ "                     :              dP'         `8:     K       dP''        \"`Yo.        8 \r\n"
				+ "                     :             dP            88     8b.   ,d'              ``b       8 \r\n"
				+ "                     :             8.            8P     8\"\"'  `\"                 :.      8 \r\n"
				+ "                     :            :8:           :8'    ,:                        ::      8 \r\n"
				+ "                     :            :8:           d:    d'                         ::      8 \r\n"
				+ "                     :            :8:          dP   ,,'                          ::      8 \r\n"
				+ "                     :            `8:     :b  dP   ,,                            ::      8 \r\n"
				+ "                     :            ,8b     :8 dP   ,,                             d       8 \r\n"
				+ "                     :            :8P     :8dP    d'                       d     8       8 \r\n"
				+ "                     :            :8:     d8P    d'                      d88    :P       8 \r\n"
				+ "                     :            d8'    ,88'   ,P                     ,d888    d'       8 \r\n"
				+ "                     :            88     dP'   ,P                      d8888b   8        8 \r\n\n");		
		System.out.println("_____ ");
		System.out.println("_____                     SAINDO...        ________________");
		System.out.println("__________________________________________________________________");
		System.out.println("___________________________________________________________________________________________");
		
	}
	
	
	
	
}// Scren_User
