package test;

import domain.Report;
import domain.Service_Instantiator;
import domain.User;

import java.util.List;

public class Test_User_Report_1 {
	public static void main(String[] args) {
		
		System.out.println("=============== Etapa 1 ===============");
		// Instanciar user1 = Hugo e user2 = César
		
		User user1;
		user1 = Service_Instantiator.instantiateUser("Hugo", "senhaHugo", "hugo@email.com");
		System.out.println(user1);
		
		User user2;
		user2 = Service_Instantiator.instantiateUser("César", "senhaCésar", "cesar@email.com");
		System.out.println(user2);
		
		System.out.println("=============== Etapa 2 ===============");
		// Instanciar report1 de user1 contra user2
		
		Report report1;
		report1 = Service_Instantiator.instantiateReport( user1, user2, "Testanto report1...");
		System.out.println(report1);
		System.out.println(report1.getReportingUser());
		System.out.println(report1.getReportedUser());
		System.out.println(report1.getReason());
		
		System.out.println("=============== Etapa 3 ===============");
		// user1 utiliza método addReport(report1) e getyMyReports()
		
		user1.addMyReport(report1);		
		
		 //Pega todas os reports de User user1.
		List<Report> my_ReportsUser1;
		my_ReportsUser1 = user1.getMyReports();
		
		//Imprime esses reports:
		System.out.println("----- Todos os Reports de User user1 -----");
	    int i;
	    for (i = 0; i< my_ReportsUser1.size(); i++) {
	      report1 = my_ReportsUser1.get(i);
	      System.out.println("Report" + i + ": " + report1.getReportedUser() + ", " + report1.getReason());
	    }
		
		System.out.println("=============== Etapa 4 ===============");
		// user1 utiliza removeReport(report1) e getyMyReports");
		
		user1.removeMyReport(report1);	
		
		//Imprime esses reports:
		System.out.println("----- Todos os Reports de User user1 (vazio) -----");
	    
	    for (i = 0; i< my_ReportsUser1.size(); i++) {
	      report1 = my_ReportsUser1.get(i);
	      System.out.println("Report" + i + ": " + report1.getReportedUser() + ", " + report1.getReason());
	    }
		
	} //fim main() 
} //fim Test_User_Report_1
