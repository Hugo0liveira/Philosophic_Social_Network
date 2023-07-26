package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import domain.User;
import domain.Conversation;
import domain.Message;
import database.Database;
import domain.Service_Instantiator;

public class View_Conversation {	
	private List<Conversation> conversations  = new ArrayList<>();
	private User user;	
	protected static Scanner scan = new Scanner(System.in);
	
	public View_Conversation( User user) {	
		this.user = user;
	}
	
	public void setScreen_ConversationUser(User user) {
		this.user = user;
	}
		
	public List<Conversation> getScreen_Converstation() {
		return conversations;
	}	
	
	public void printUsers() {
		List<User> users = Database.users;
		System.out.println("____________________________________________________________________________________________________");		
		System.out.println("\n"
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
				+ "                              \"   `$$$$$$$$7         $$$$$       .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\r\n"
				+ "                             $$Ss..$$$$$$$7        $$$$$$$    .s$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\r\n"
				+ "                              $$$$$$$$$$$$        $$$$$$$$ .s$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\r\n"
				+ "                               $$$$$$$$$$$     .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\r\n"
				+ "                             .$$$$$$$$$$$$$   .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\r\n"
				+ "                             $$$$$$$$$$$$$$  .$$$$$$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\r\n"
				+ "");
		System.out.println("____________________________________________________________________________________________________");		
		System.out.println("_____ ");		
		System.out.println("_____                    Sobreviventes: ");
		System.out.println("_____ ");				
		for (User user : users) {
			System.out.println("|                          " + user.getUserName());
		}
		System.out.println("");
		System.out.println("_____ ");		
		System.out.println("_____ ");
		System.out.println("____________________________________________________________________");
		System.out.println("_____ ");		
		System.out.println("_____");
	}		
	
	
	
	public Conversation readAddUser(Conversation selectedConversation) {	
			printUsers();		
			System.out.println("____________________________________________________________________");
			System.out.println("____________________________________________________________________");
			System.out.println("_____ ");		
			System.out.println(" ");
			System.out.println("|                        Digite user para adicionar em conversa:" + selectedConversation);
			System.out.println("| ");
			System.out.println("| ");	
			int errorOfUserNotFound = 1; int errorAlreadyInConversation= 1; int addUserInConversation=1;
			String nameUser = scan.nextLine();
			User userHere = null;
			for (User u : Database.users) {
				if (u.getUserName().equals(nameUser)) {					
					userHere = u;					
					}		
				if(userHere!=null){
					errorOfUserNotFound = 0;
				}
			}	
			if(errorOfUserNotFound == 0) {
				for(int i=0; i< selectedConversation.getUsers().size(); i++) {							
					if(selectedConversation.getUsers().get(i).getUserName().equals(userHere.getUserName())) {
						addUserInConversation = 0;						
					}
				}
			}
			if(addUserInConversation==1 && userHere!=null){
			selectedConversation.addUser(userHere);	
			userHere.addMyConversation(selectedConversation);
			errorAlreadyInConversation= 0;
			}	
			if(errorOfUserNotFound!=0) {
			System.out.println("			Usuário inexistente!\n"); scan.nextLine();
			errorOfUserNotFound=0;
			} else if(errorAlreadyInConversation!=0) {
				System.out.println("			ERRO! Usuário já está em conversa!\n"); scan.nextLine();
				errorOfUserNotFound=0;
			}
			
			
			
			return selectedConversation;
		}
		
	public Conversation readAddMessage(Conversation selectedConversation, User user) {
		
		
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");		
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");		
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     ");
		System.out.println("|                     Digite mensagem: ");		
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     ");
		String newTextMessage = scan.nextLine();
		Message newMessage = Service_Instantiator.instantiateMessage(selectedConversation, user, newTextMessage);
		selectedConversation.addMessage(newMessage);
		Database.messages.add(newMessage);
		this.user.addMyMessage(newMessage);
		
		return selectedConversation;
	}
	
	public void namingNewConversation() {
		System.out.println(""
				+ "\n"
				+ "        		0===0\r\n"
				+ "        		 O=o\r\n"
				+ "        		  O\r\n"
				+ "        		 o=O\r\n"
				+ "        		0===0\r\n"
				+ "	        	 O=o\r\n"
				+ "		          O\r\n"
				+ "	        	 o=O\r\n"
				+ "        		0===0\r\n"
				+ "		         O=o\r\n"
				+ "  		      O\r\n"
				+ "	        	 o=O\r\n"
				+ "        		0===0\r\n"
				+ "									            ______              \r\n"
				+ "				  					         .-'      `-.           \r\n"
				+ "									       .'            `.         \r\n"
				+ "									      /                \\        \r\n"
				+ "									     ;                 ;`       \r\n"
				+ "									     |                 |;       \r\n"
				+ "									     ;                 ;|\r\n"
				+ "									     '\\               / ;       \r\n"
				+ "									      \\`.           .' /        \r\n"
				+ "									       `.`-._____.-' .'         \r\n"
				+ "									         / /`_____.-'           \r\n"
				+ "									        / / /                   \r\n"
				+ "									       / / /\r\n"
				+ "									      / / /\r\n"
				+ "									     / / /\r\n"
				+ "									    / / /\r\n"
				+ "									   / / /\r\n"
				+ "									  / / /\r\n"
				+ "									 / / /\r\n"
				+ "									/ / /\r\n"
				+ "									\\/_/"
				+ "\n");
		System.out.println("______________________________________________________________________");
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     ");
		System.out.println("|                     Digite nome para nova conversa (opcional): ");		
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     "
				+ "\n"
				+ "                   -. .-.   .-. .-.   .-. .-.   .  \r\n"
				+ "                   ||\\|||\\ /|||\\|||\\ /|||\\|||\\ /|\r\n"
				+ "                   |/ \\|||\\|||/ \\|||\\|||/ \\|||\\||\r\n"
				+ "                   ~   `-~ `-`   `-~ `-`   `-~ `-"
				+ "");
	}
	
	public void printCleanConsole(){
		int i;
		for(i=0; i<100; i++) {
		System.out.println("    ");
		}		
	}
	
	public void printConversationScreen(User me) {
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("    ");
		System.out.println("\n"
				+ "                         ,-.\r\n"
				+ "                        / \\  `.  __..-,O\r\n"
				+ "                       :   \\ --''_..-'.'\r\n"
				+ "                       |    . .-' `. '.\r\n"
				+ "                       :     .     .`.'\r\n"
				+ "                        \\     `.  /  ..\r\n"
				+ "                         \\      `.   ' .\r\n"
				+ "                          `,       `.   \\\r\n"
				+ "                         ,|,`.        `-.\\\r\n"
				+ "                        '.||  ``-...__..-`\r\n"
				+ "                         |  |\r\n"
				+ "                         |__|\r\n"
				+ "                         /||\\\r\n"
				+ "                        //||\\\\\r\n"
				+ "                       // || \\\\\r\n"
				+ "                    __//__||__\\\\__\r\n"
				+ "                   '--------------'   ");
		System.out.println("  ");
		System.out.println("_____                    Conversas ________________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("|  ");
		System.out.println("|                  Conversas ativas:  ");
		System.out.println("|  ");
		for(int i=0; i< me.getMyConversations().size(); i++) {
			System.out.println("|              " + (i+1) + ") " + me.getMyConversations().get(i).getName()); 
			System.out.println("|                    " + me.getMyConversations().get(i).getUsers());
			}
		System.out.println("|__________________________________________________________________________________________________________");
		System.out.println("|  ");
		System.out.println("|                     1) Selecionar conversa. ");
		System.out.println("|  ");		
		System.out.println("|                     2) Iniciar nova conversa");
		System.out.println("|  ");		
		System.out.println("|  ");
		System.out.println("|                     0) Sair");
		System.out.println("|  ");
		System.out.println("|  ");
		System.out.println("|__________________________________________________________________________________________________________");
	}
			
	public Conversation printConversation(Conversation selectedConversation) {		
			
		System.out.println("__________________________________________________________________________________________________________");		
		System.out.println("\n\n"
				+ "                             ==c(___(o(______(_()\r\n"
				+ "                                     \\=\\\r\n"
				+ "                                      )=\\\r\n"
				+ "                                     //|\\\\\r\n"
				+ "                                    //|| \\\\\r\n"
				+ "                                   // ||  \\\\\r\n"
				+ "                                  //  ||   \\\\\r\n"
				+ "                                 //         \\\\"
				+ "\n\n");
		System.out.println("_____ Conversa ___________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("|                                                                     ");		
		System.out.println("|  " + selectedConversation    );
		System.out.println("|_____________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");		
		System.out.println("                                                                    ");
		for(int i=0;i< selectedConversation.getMessages().size() ; i++) {
		System.out.println("  " + selectedConversation.getMessages().get(i)    );
		System.out.println("");
		System.out.println("__");		
		}		
		System.out.println("|_________________________________________________________________________________________________________");
		System.out.println("|                                                                     ");
		System.out.println("|                      1) Escrever mensagem                                              \n");
		System.out.println("|                      2) Adicionar user em conversa                                    \n");
		System.out.println("|                      0) Voltar                                                        \n");
		System.out.println("______________________________________________________________________");		
		System.out.println("______________________________________________________________________");
		System.out.println("______________________________________________________________________");		
		System.out.println("__________________________________________________________________________________________________________"
				+ "\n\n\n");
		
		return selectedConversation;
	}

	public String printSelectConversation(User me) {
		System.out.println(""
				+ "\n\n"
				+ "                               ___\r\n"
				+ "                              /(_))\r\n"
				+ "                            _/   /\r\n"
				+ "                           //   /\r\n"
				+ "                          //   /\r\n"
				+ "                          /\\__/\r\n"
				+ "                          \\O_/=-.\r\n"
				+ "                      _  / || \\  ^o\r\n"
				+ "                      \\\\/ ()_) \\.\r\n"
				+ "                       ^^ <__> \\()\r\n"
				+ "                         //||\\\\\r\n"
				+ "                        //_||_\\\\  ds\r\n"
				+ "                       // \\||/ \\\\\r\n"
				+ "                      //   ||   \\\\\r\n"
				+ "                     \\/    |/    \\/\r\n"
				+ "                     /     |      \\\r\n"
				+ "                    /      |       \\\r\n"
				+ "                           |"
				+ "\n");		
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("_____                    Conversas __________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");		
		System.out.println("|                                                                     ");
		System.out.println("|                  Conversas ativas:  ");
		System.out.println("|  ");
		for(int i=0; i< me.getMyConversations().size(); i++) {
		System.out.println("|              " + (i+1) + ") " + me.getMyConversations().get(i).getName()); 
		System.out.println("|                    " + me.getMyConversations().get(i).getUsers());
		}
		System.out.println("|   					                                              ");
		System.out.println("|                       							                  ");
		System.out.println("|                      Digite número de conversa  desejada:                           ");
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________"
				+ "\n\n\n\n\n\n");		
		String numberConversation = scan.nextLine();			
		int error = 0; 
		try {
			for(int i=0; i< me.getMyConversations().size(); i++) {			
				if (i+1 == Integer.parseInt(numberConversation) ) {
					error=0;
					return me.getMyConversations().get(i).getName();				
				} else {
					error++; 				
				}
			}
		}catch (NumberFormatException nfe) {
			System.out.println("ERRO! Digite número correspondente!"); scan.nextLine();
		}		
		if(error != 0) {		
				try {
	    		throw new RuntimeException("Erro Conversation: conversation inexistente"); 
	    		}
	    		catch (RuntimeException ex) {
	    			System.out.println("Erro: Conversa inexistente!"); scan.nextLine(); 	    				
	    		}				
			}
		return "Nenhuma conversa correspondente!";		
	}
	
	public void printLoadingNext(){
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


}




