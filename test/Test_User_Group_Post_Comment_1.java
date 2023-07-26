package test;

import domain.Service_Instantiator;
import domain.User;
import domain.Group;
import domain.Post;
import domain.Comment;

public class Test_User_Group_Post_Comment_1 {
	
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
			// Instanciar group1 
			
			Group group1;
			group1 = Service_Instantiator.instantiateGroup("Postmodernism","Postmodernism is associated...", user1);
			System.out.println(group1);
			
			System.out.println("=============== Etapa 3 ===============");
			// Instanciar post1
			
			Post post1 = Service_Instantiator.instantiatePost( group1, user1, "Bem-vindos ao grupo Postmodernism");
			System.out.println(post1);
			
			System.out.println("=============== Etapa 4 ===============");
			// add user2 ao grupo1
			group1.addMember(user2);
			System.out.println("Membros de group1: " + group1.getMembers());
			
			System.out.println("=============== Etapa 5 ===============");
			// Instanciar comment1 de user2 em post1
			Comment comment1 = Service_Instantiator.instantiateComment( post1, user2, "Obrigado por me aceitar..");
			System.out.println(comment1);
			post1.addComment(comment1);
			System.out.println("Comentários em post1" + post1.getComments());
									
		}
}
