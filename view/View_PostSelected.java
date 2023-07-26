package view;

import util.Keyboard;

public class View_PostSelected {
	public String showComments( String selectedGroupName, String accessLevel, String moderatorAccess, String postAuthorText, String comments, String isMyPost) {
		Keyboard.printCleanConsole();
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println(" ");
		System.out.println(" 						 "+selectedGroupName);		
		System.out.println(" ");
		System.out.println("_______ ");
		System.out.println("" + postAuthorText   );
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("___________________________________________________________________________________________________________"
				+ "\n"
				+ "                          _______________________________\r\n"
				+ "                        /| comments      |  ------------ |\\\r\n"
				+ "                       ||| ------------- | ------------- |||\r\n"
				+ "                       |||_____________  |  _____________|||\r\n"
				+ "                        /_____/--------\\\\_//--------\\_____\\"
				+ "\n\n");
		System.out.println("" + comments);		
		System.out.println("___________________________________________________________________________________________________________");
				System.out.println(" _____________________________________________________________________");
		System.out.println("|                                                                     ");
		if (accessLevel == "Member") {			
			System.out.println("|                    1) Selecionar Comentário          \n");
			
			System.out.println("|                    2) Escrever Comentário          \n");		
		}
		if (isMyPost == "true") {
			System.out.println("|                    			3) Deletar meu Post          \n");		
		} else if( moderatorAccess == "Moderator" && isMyPost != "true") {	
			System.out.println("|                                 3) Deletar Post      \n\n");
		}
		System.out.println("|                                            0) Voltar                         \n  ");
		System.out.println("|_____________________________________________________________________");		
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");		
		return  Keyboard.readString();
		}
		
		public void printError(){
			System.out.println("\n\n			Opção ERRADA! Tente novamente!\n\n"); Keyboard.pressEnter();
	}
		public String writingCommment(String postSelected) {
			Keyboard.printCleanConsole();
			System.out.println("___________________________________________________________________________________________________________"
					+ "\n " + postSelected + "\n\n"
					
					+ "                          _______________________________\r\n"
					+ "                        /| commenting    |               |\\\r\n"
					+ "                       |||               |               |||\r\n"
					+ "                       |||_____________  |  _____________|||\r\n"
					+ "                        /_____/--------\\\\_//--------\\_____\\"
					+ "\n\n");
			System.out.println("______________________________________________________________________");		
			System.out.println("____");
			System.out.println("___________________________________________________________________________________________________________");
			System.out.println("_________ ");
			System.out.println("___________________________________________________________________________________________________________");
			System.out.println("______________________________________________________________________");
			System.out.println("______________________________________________________________________");		
			System.out.println(" _____________________________________________________________________");
			System.out.println("|                                                                     ");
			System.out.println("|                                                                     ");
			System.out.println("|                         Digite comentário: ");		
			System.out.println("|                                                                     ");
			System.out.println("|                                                                     ");
			System.out.println("|                                                                     ");
			return  Keyboard.readString();
		}
		
		public void loading(String selectedGroupName) {
			Keyboard.printCleanConsole();
			System.out.println("___________________________________________________________________________________________________________"
					+ "\n						" + selectedGroupName + "\n\n"
					
					+ "                          _______________________________\r\n"
					+ "                        /|               | LOADING...    |\\\r\n"
					+ "                       |||               |               |||\r\n"
					+ "                       |||_____________  |  _____________|||\r\n"
					+ "                        /_____/--------\\\\_//--------\\_____\\"
					+ "\n\n");
			System.out.println("______________________________________________________________________");		
			System.out.println("____");
			System.out.println("___________________________________________________________________________________________________________");
			System.out.println("_________ ");
			System.out.println("___________________________________________________________________________________________________________");
			System.out.println("______________________________________________________________________");
			System.out.println("______________________________________________________________________");		
			System.out.println(" _____________________________________________________________________");
			System.out.println("|                                                                     ");
			System.out.println("|                                                                     ");
			Keyboard.pressEnter();
		}
		
		public String selectingComment( String selectedGroupName, String accessLevel, String moderatorAccess, String postAuthorText, String commentsOrdered) {
			Keyboard.printCleanConsole();
			System.out.println("___________________________________________________________________________________________________________");
			System.out.println(" ");
			System.out.println(" 						 "+selectedGroupName);		
			System.out.println(" ");
			System.out.println("_______ ");
			System.out.println("" + postAuthorText   );
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("___________________________________________________________________________________________________________"
					+ "\n"
					+ "                          _______________________________\r\n"
					+ "                        /| comments      |  ------------ |\\\r\n"
					+ "                       ||| ------------- | ------------- |||\r\n"
					+ "                       |||_____________  |  _____________|||\r\n"
					+ "                        /_____/--------\\\\_//--------\\_____\\"
					+ "\n\n");
			System.out.println("" + commentsOrdered);		
			System.out.println("___________________________________________________________________________________________________________");
					System.out.println(" _____________________________________________________________________");
			System.out.println("|                                                                     ");
		
			System.out.println("|                                     Digite número de comentário desejado:                       \n  ");
			System.out.println("|_____________________________________________________________________");		
			System.out.println("___________________________________________________________________________________________________________");
			System.out.println("___________________________________________________________________________________________________________");		
			return  Keyboard.readString();
		}
		
		public String commentSelected( String selectedGroupName, String moderatorAccess, String isMyComment, String postAuthorText, String commentString) {
			Keyboard.printCleanConsole();
			System.out.println("___________________________________________________________________________________________________________");
			System.out.println(" ");
			System.out.println(" 						 "+selectedGroupName);		
			System.out.println(" ");
			System.out.println("_______ ");
			System.out.println("" + postAuthorText   );
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("___________________________________________________________________________________________________________\n");
			System.out.println("" + commentString);		
			System.out.println("___________________________________________________________________________________________________________");
					System.out.println(" _____________________________________________________________________");
			System.out.println("|                                                                     ");			
			if (isMyComment == "true") {
				System.out.println("|                    			1) Deletar meu Comentário          \n");		
			} else if( moderatorAccess == "Moderator" && isMyComment != "true") {	
				System.out.println("|                                 1) Deletar Comentário      \n\n");
			}
			System.out.println("|                                            0) Voltar                         \n  ");			                
			System.out.println("|_____________________________________________________________________");		
			System.out.println("___________________________________________________________________________________________________________");
			System.out.println("___________________________________________________________________________________________________________");		
			return  Keyboard.readString();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
