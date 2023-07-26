package view;

import util.Keyboard;

public class View_OneConversation {
	public String printConversation(String selectedConversation) {		
		Keyboard.printCleanConsole();
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
		System.out.println("" + selectedConversation    );
		System.out.println("");
		System.out.println("__");		
		System.out.println("|_________________________________________________________________________________________________________");
		System.out.println("|                                                                     ");
		System.out.println("|                      1) Escrever mensagem                                     \n");
		System.out.println("|                      -) deletar mensagem                                     \n");
		System.out.println("|                      2) Adicionar usuário                                    \n");
		System.out.println("|                      3) Deixar de participar                                    \n");
		System.out.println("|                      0) Voltar                                                 \n");
		System.out.println("______________________________________________________________________");		
		System.out.println("______________________________________________________________________");
		System.out.println("______________________________________________________________________");		
		System.out.println("__________________________________________________________________________________________________________"
				+ "\n\n\n");
		
		return Keyboard.readString();
	}
	
	public String deleteMyMessage(String selectedConversation) {		
		Keyboard.printCleanConsole();
		System.out.println("__________________________________________________________________________________________________________");		
		System.out.println("\n				Deletando mensagem\n");
		System.out.println("_____ Conversa ___________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("|                                                                     ");		
		System.out.println("" + selectedConversation);
		System.out.println("");
		System.out.println("______________________________________________________________________");
		System.out.println("");
		System.out.println("		Selecione texto de mensagem para deletar");
		System.out.println("______________________________________________________________________");
		return Keyboard.readString();
	}
	
	public void printError(){
		System.out.println("\n\n			Opção ERRADA! Tente novamente!\n\n"); Keyboard.pressEnter();
	}
	
	public void printErrorAddUser(){
		System.out.println("\n\n			\"ERRO! OU usuário INEXISTENTE OU se ENCONTRA em conversa!\n\n"); Keyboard.pressEnter();
	}
	
	
	public String addMessage(String text) {
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
		return Keyboard.readString();
	}
	
	public String addUser(String allUsers) {
		Keyboard.printCleanConsole();
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
				+ "");
		System.out.println("____________________________________________________________________________________________________");		
		System.out.println("_____ ");		
		System.out.println("_____                    Sobreviventes: ");
		System.out.println("_____ \n\n"
				+ allUsers );
		System.out.println("");
		System.out.println("_____ ");		
		System.out.println("____________________________________________________________________");
		return Keyboard.readString();
	}

}
