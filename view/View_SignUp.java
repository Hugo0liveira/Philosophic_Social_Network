package view;

import util.Keyboard;

public class View_SignUp {
	public String printSignUpUsername(){
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
	System.out.println("_____                               Sign Up      ___________________________________");
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
	System.out.println("___________________________________________________________________________________________________________");
	System.out.println("__________________________________________________________________");
	System.out.println("__________________________________________________________________");
	System.out.println("_____ ");
	System.out.println("                         Digite UserName (visibilidade geral):_____________\n");
	System.out.println("                   Pressione 'Enter\n'                             \n");
		return Keyboard.readString();
	}
	
	public void printErrorUserName(String errorUserName){
		System.out.println( "\n\n" + errorUserName + "\n\n"); Keyboard.pressEnter();
	}
	
	public String printSignUpEmail(){
	System.out.println("\n\n                         Digite email:_____________ \n");
	System.out.println("                   Pressione 'Enter\n'                                     \n");
		return Keyboard.readString();
	}
	
	public void printErrorUserEmail(String errorUserEmail){
		System.out.println( "\n\n" + errorUserEmail + "\n\n"); Keyboard.pressEnter();
	}
	
	public String printSignUpPassword(){
	System.out.println("\n\n                         Digite senha:_____________\n");
	System.out.println("                   Pressione 'Enter\n'      \n");
	System.out.println("_____ ");
	System.out.println("_____ ");
		return Keyboard.readString(); 
	}
	
	public void printErrorUserPassword(String errorUserPassword){
		System.out.println( "\n\n" + errorUserPassword + "\n\n"); Keyboard.pressEnter();
	}
}

