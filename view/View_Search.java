package view;

import util.Keyboard;

public class View_Search {
	
	public String printView_Search(){
		Keyboard.printCleanConsole();
		System.out.println(""
				+ ""
				+ ".         _  .          .          .    +     .          .          .      .\r\n"
				+ "        .(_)          .            .            .            .       :\r\n"
				+ "        .   .      .    .     .     .    .      .   .      . .  .  -+-        .\r\n"
				+ "          .           .   .        .           .          /         :  .\r\n"
				+ "    . .        .  .      /.   .      .    .     .     .  / .      . ' .\r\n"
				+ "        .  +       .    /     .          .          .   /      .\r\n"
				+ "       .            .  /         .            .        *   .         .     .\r\n"
				+ "      .   .      .    *     .     .    .      .   .       .  .\r\n"
				+ "          .           .           .           .           .         +  .\r\n"
				+ "  . .        .  .       .   .      .    .     .     .    .      .   .\r\n"
				+ ""
				+ " .   +      .          ___/\\_._/~~\\_...__/\\__.._._/~\\        .         .   .\r\n"
				+ "       .          _.--'                              `--./\\          .   .\r\n"
				+ "           /~~\\/~\\                                         `-/~\\_            .\r\n"
				+ " .      .-'                                                      `-/\\_\r\n"
				+ "  _/\\.-'                                                          __/~\\/\\-.__\r\n"
				+ "                                         .\r\n"
				+ "                                        ( \\\r\n"
				+ "                                        \\  .     `{{{{}}\r\n"
				+ "                                         \\( \\     ).  c\r\n"
				+ "                                          \\  .     _  /\r\n"
				+ "                                           \\( \\ m/  _\\\\__\r\n"
				+ "                                            \\  V/\\`\\ ++ /|\r\n"
				+ "                                             \\( \\ \\ \\__/ |\r\n"
				+ "                                            o/\\_Z  \\_____)\r\n"
				+ "                                            /=\\.   .~~~~~|\r\n"
				+ "                                           // \\\\   |_____|\r\n"
				+ "                                          //   \\\\  | | | |\r\n"
				+ "                                         //     \\\\ | | | |\r\n"
				+ "                                        //      .\\\\( | ( |\r\n"
				+ "                                       //         \\\\ | | |\r\n"
				+ "                                      //          .\\\\| | |\r\n"
				+ "                                     //           _|\\\\_| |\r\n"
				+ "                                    //           (___\\\\__)\r\n"
				+ "                                  .//                 \\\\"
				+ "           \n ");		
		System.out.println("_____                                              _____________________");
		System.out.println("|              ");
		System.out.println("_____       Pesquise por usuários, grupos, posts e comentários       _____________________");
		System.out.println("|              ");
		System.out.println("|               Digite sua busca ___________________  ");
		System.out.println("|              ");
		System.out.println("                                			           	              ");
		System.out.println("|              ");
		System.out.println("|________________________________________________");
		System.out.println("________________________________________ ");
		 String readString = Keyboard.readString();
		 return readString;
		}	
	
	public void printView_SearchResult(String Text){		
		System.out.println(Text);	Keyboard.pressEnter();	
	}	
	
}
