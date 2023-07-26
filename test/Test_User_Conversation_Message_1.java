package test;


import domain.Conversation;
import domain.Message;
import domain.Service_Instantiator;
import domain.User;

public class Test_User_Conversation_Message_1 {
	
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
			// Instanciar Conversation
			Conversation conversation1 = Service_Instantiator.instantiateConversation("ct1", user1); conversation1.addUser(user2);
			System.out.println(conversation1);
			
			user1.addMyConversation(conversation1);			
			System.out.println(user1.getMyConversations());
			
			System.out.println("=============== Etapa 3 ===============");
			// Instanciar Messages			
			Message message1 = Service_Instantiator.instantiateMessage(conversation1, user1, "Olá, César..");
			conversation1.addMessage(message1);
			System.out.println(message1);
			
			Message message2 = Service_Instantiator.instantiateMessage(conversation1, user2, "Oi, Hugo..");
			conversation1.addMessage(message2);
			System.out.println(message2);
			
		}
}