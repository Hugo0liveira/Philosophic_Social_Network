package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domain.User;
import domain.Report;
import domain.Service_Instantiator;
import database.Database;

public class View_Report {
	
	private User user;
	public List<Report> reports = new ArrayList<Report>();
	protected static Scanner scan = new Scanner(System.in);
	
	public View_Report() {		
	}
	public View_Report(User user) {		
		this.setUser(user);
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	public void printReportScreen(User reportingUser) {
		System.out.println("___________________________________________________________________________________________________________");		
		System.out.println(" "
				+ "\n "
				+ "                          ,---__,------__---.\r\n"
				+ "                         ,'////<: =     ]\\\\\\\\\\`.\r\n"
				+ "                        ///__---^~~\"\"\"~~^---__\\\\\\\r\n"
				+ "                       //,' D E T E C T I V E `.\\\\\r\n"
				+ "                      /  \\   __---^~~~^---__   /  \\\r\n"
				+ "                     /,.  \\,'   /.-----.\\   `./  ,.\\\r\n"
				+ "                    //  `.     MMM ,^. MMM     ,'  \\\\\r\n"
				+ "                   //.--. ~~^^---^~   ~^---^^~~ .--.\\\\\r\n"
				+ "                  //  '> \\  __--'^^~~~^^`--__  / <'   \\\r\n"
				+ "                   \\   / _-^  o   L   I   c  ^-_ \\   /\r\n"
				+ "                    \\  ,'  P  __--^^^^^--__  E  `.  /\r\n"
				+ "                     \\ \\   ,-^             ^-.   / /\r\n"
				+ "                     i  \\,' ,^-__-^~/\\^-__-^. `./  i\r\n"
				+ "                     |     /|#`|`.| ||**\\ */-\\     |\r\n"
				+ "                     !     '>#| `|`.||--/* \\*<'    !\r\n"
				+ "                     /     /|#|_|#_|||________\\    \\    \r\n"
				+ "                    /      \\   *   *||.| |#| |/     \\\r\n"
				+ "                   i        \\**\\ */-[]|`.|#| /       i\r\n"
				+ "                   |         \\-/* \\/~~\\`|`.|/        |\r\n"
				+ "                   |   /`.    `. ./_[]_\\.`,'   ,'\\   |\r\n"
				+ "                   !  /   `-.   ^|______|^  ,-'   \\  !\r\n"
				+ "                    \\ `.     ~~^--_____--^~~     ,' /\r\n"
				+ "                     \\  `-_       REPORT      _-'  /\r\n"
				+ "                      `.   ^~--._________.--~^   ,'\r\n"
				+ "                        ^-_                   _-^\r\n"
				+ "                           ^~--__ 1 6 4 __--~^\r\n"
				+ "                                 `.   ,'\r\n"
				+ "                                   `-'  ");
		System.out.println("  ");
		System.out.println(" ____                         Minhas denúncias   _______________________________________________________");
		System.out.println(" __________________________________________________________________________________________________________");
		System.out.println("  ");    
		printAllMyReports(reportingUser);
		System.out.println(" __________________________________________________________________________________________________________");
		System.out.println("|  ");		
		System.out.println("|                              1) Fazer nova denúncia");
		System.out.println("|  ");
		System.out.println("|                                             0) Sair");
		System.out.println("|  ");	
		System.out.println("");
		System.out.println("_____ ");		
		System.out.println("_____ ");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println(" __________________________________________________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println(" __________________________________________________________________________________________________________");
					
	}	
	
	public String printReadSelectingReportedUser() {
		List<User> users = Database.users;		
		System.out.println("\n"
				+ "                                               .-\"\"\"\"-.\r\n"
				+ "                                              / j      \\\r\n"
				+ "                                             :.d;       ;\r\n"
				+ "                                             $$P        :\r\n"
				+ "                                  .m._       $$         :\r\n"
				+ "                                 dSMMSSSss.__$$b.    __ :\r\n"
				+ "                                :MMSMMSSSMMMSS$$$b  $$P ;\r\n"
				+ "                                SMMMSMMSMMMSSS$$$$     :b\r\n"
				+ "                               dSMMMSMMMMMMSSMM$$$b.dP SSb.\r\n"
				+ "                              dSMMMMMMMMMMSSMMPT$$=-. /TSSSS.\r\n"
				+ "                             :SMMMSMMMMMMMSMMP  `$b_.'  MMMMSS.\r\n"
				+ "                             SMMMMMSMMMMMMMMM \\  .'\\    :SMMMSSS.\r\n"
				+ "                            dSMSSMMMSMMMMMMMM  \\/\\_/; .'SSMMMMSSSm\r\n"
				+ "                           dSMMMMSMMSMMMMMMMM    :.;'\" :SSMMMMSSMM;\r\n"
				+ "                         .MMSSSSSMSSMMMMMMMM;    :.;   MMSMMMMSMMM;\r\n"
				+ "                        dMSSMMSSSSSSSMMMMMMM;    ;.;   MMMMMMMSMMM\r\n"
				+ "                       :MMMSSSSMMMSSP^TMMMMM     ;.;   MMMMMMMMMMM\r\n"
				+ "                       MMMSMMMMSSSSP   `MMMM     ;.;   :MMMMMMMMM;\r\n"
				+ "                       \"TMMMMMMMMMM      TM;    :`.:    MMMMMMMMM;\r\n"
				+ "                          )MMMMMMM;     _/\\\\    :`.:    :MMMMMMMM\r\n"
				+ "                         d$SS$$$MMMb.  |._\\\\\\   :`.:     MMMMMMMM\r\n"
				+ "                         T$$S$$$$$$$$$$m;O\\\\\\\\\"-;`.:_.-  MMMMMMM;\r\n"
				+ "                        :$$$$$$$$$$$$$$$b_l./\\\\ ;`.:    mMMSSMMM;\r\n"
				+ "                        :$$$$$$$$$$$$$$$$$$$./\\\\;`.:  .$$MSMMMMMM\r\n"
				+ "                         $$$$$$$$$$$$$$$$$$$$. \\\\`.:.$$$$SMSSSMMM;\r\n"
				+ "                         $$$$$$$$$$$$$$$$$$$$$. \\\\.:$$$$$SSMMMMMMM\r\n"
				+ "                         :$$$$$$$$$$$$$$$$$$$$$.//.:$$$$SSSSSSSMM;\r\n"
				+ "                         :$$$$$$$$$$$$$$$$$$$$$$.`.:$$SSSSSSSMMMP\r\n"
				+ "                          $$$$$$$$$;\"^$J \"^$$$$;.`.$$P  `SSSMMMM\r\n"
				+ "                          :$$$$$$$$$       :$$$;.`.P'..   TMMM$$b\r\n"
				+ "                          :$$$$$$$$$;      $$$$;.`/ c^'   d$$$$$S;\r\n"
				+ "                          $$$$$S$$$$;      '^^^:_d$g:___.$$$$$$SSS\r\n"
				+ "                          $$$$SS$$$$;            $$$$$$$$$$$$$$SSS;\r\n"
				+ "                         :$$$SSSS$$$$            : $$$$$$$$$$$$$SSS\r\n"
				+ "                         :$P\"TSSSS$$$            ; $$$$$$$$$$$$$SSS;\r\n"
				+ "                         j    `SSSSS$           :  :$$$$$$$$$$$$$SS$\r\n"
				+ "                        :       \"^S^'           :   $$$$$$$$$$$$$S$;\r\n"
				+ "                        ;.____.-;\"               \"--^$$$$$$$$$$$$$P\r\n"
				+ "                        '-....-\"                       \"\"^^T$$$$P\""
				+ "\n");
		System.out.println("_____ ");		
		System.out.println("_____                        Sobreviventes: ");		
		System.out.println("_____ ");
		System.out.println("");
		for (User user : users) {
			System.out.println("|   " + user.getUserName());
		}
		System.out.println("_____ ");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("_____ ");		
		System.out.println("_____                        Digite quem deve ser denunciado: ");		
		System.out.println("_____ ");		
		System.out.println("| ");	
		
		String name = scan.nextLine();
		String ReportedUser;
		if (Database.getUserData(name)==null) {
    		try {
    		throw new RuntimeException("Erro User: User não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Errado! Usuário não pode ser nulo!"); scan.nextLine();
    		}
    		return "User inexistente!";
		} else { 
		 User userReportedMatch = Database.getUserData(name);
		 ReportedUser = userReportedMatch.getUserName();		
		
		return ReportedUser;
		}		
	}

	public void readAddReportReason(User ReportingUser, String reportedUserSelected) {
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("\n"
				+ ""
				+ "                        .::::::::::.                          .::::::::::.\r\n"
				+ "                      .::::''''''::::.                      .::::''''''::::.\r\n"
				+ "                    .:::'          `::::....          ....::::'          `:::.\r\n"
				+ "                   .::'             `:::::::|        |:::::::'             `::.\r\n"
				+ "                  .::|               |::::::|_ ___ __|::::::|               |::.\r\n"
				+ "                  `--'               |::::::|_()__()_|::::::|               `--'\r\n"
				+ "                   :::               |::-o::|        |::o-::|               :::\r\n"
				+ "                   `::.             .|::::::|        |::::::|.             .::'\r\n"
				+ "                    `:::.          .::\\-----'        `-----/::.          .:::'\r\n"
				+ "                      `::::......::::'                      `::::......::::'\r\n"
				+ "                        `::::::::::'                          `::::::::::'"
				+ "\n\n");
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     ");
		System.out.println("|                                Digite razão: ");		                                                                    
		System.out.println("|                                                                     ");
		System.out.println("__________________________________________________________________________________________________________");		
		String reason = scan.nextLine();
		if (reason==null) {
    		try {
    		throw new RuntimeException("Erro String: reason não pode ser null");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("A razão não pode ser null!"); scan.nextLine();
    		}
    	} else if(reason.equals("")) {
    		try {
    		throw new RuntimeException("Erro String: reason não pode ser vazio");
    		}
    		catch(RuntimeException ex) {
    			System.out.println("A justificativa não pode ser vazia!"); scan.nextLine();
    		}
    	} else if(reason.length() < 20) {
    		try {
        		throw new RuntimeException("Erro String: reason não pode ser menor que 20 dígitos");
        		}
        	catch(RuntimeException ex) {
        		System.out.println("A justificativa não pode ser menor que 20 dígitos!"); scan.nextLine();
        		}    	
    	} else {
		User userReported = Database.getUserData(reportedUserSelected);																		    		
		Report NewReport = Service_Instantiator.instantiateReport( ReportingUser, userReported, reason);		//variável report para apontar para objeto denúncia														    		
		Database.reports.add( NewReport );
		ReportingUser.addMyReport( NewReport );
    	}
	}
	
	public void printCleanConsole(){
		int i;
		for(i=0; i<100; i++) {
		System.out.println("    ");
		}		
	}
	
	public void printAllMyReports(User reportingUser) {
		List<Report> reports = reportingUser.getMyReports();		
		for (Report report : reports) {
			System.out.println("   Denunciado: " + report.getReportedUser() 
			 + "\n   	Razão: " + report.getReason() + "\n");
		}		
	}	

}













