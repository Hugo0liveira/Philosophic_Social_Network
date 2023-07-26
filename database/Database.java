package database;

import java.util.ArrayList;
import java.util.List;

import domain.User;
import domain.Conversation;
import domain.Message;
import domain.Group;
import domain.Post;
import domain.Comment;
import domain.Report;
import domain.Service_Instantiator;

public class Database{
	public static List<User> users = new ArrayList<User>();
	public static List<Conversation> conversations = new ArrayList<Conversation>();
	public static List<Message> messages = new ArrayList<Message>();
	public static List<Group> groups = new ArrayList<Group>();
	public static List<Post> posts = new ArrayList<Post>();	
	public static List<Comment> comments = new ArrayList<Comment>();
	public static List<Report> reports = new ArrayList<Report>();
	
	public static void data(){				
		
		User user0 = Service_Instantiator.instantiateUser("Cohle", "senhaCohle", "cohle@email.com");
		User user1 = Service_Instantiator.instantiateUser("Hannibal", "senhaHannibal", "hannibal@email.com");
		User user2 = Service_Instantiator.instantiateUser("Dexter", "senhaDexter", "dexter@email.com"); 
		User user3 = Service_Instantiator.instantiateUser("PROGRAMADOR", "Philosophic_Social_Network", "Philosophic_Social_Network");		
		User user4 = Service_Instantiator.instantiateUser("Robot", "senhaRobot", "robot@email.com");
		User user5 = Service_Instantiator.instantiateUser("Bateman", "senhaBateman", "bateman@email.com");				
		User user6 = Service_Instantiator.instantiateUser("Fleck", "senhaFleck", "fleck@email.com");				
		User user7 = Service_Instantiator.instantiateUser("Bickle", "senhaBickle", "bickle@email.com"); 
		User user8 = Service_Instantiator.instantiateUser("Smith", "senhaSmith", "smith@email.com");				
		User user9 = Service_Instantiator.instantiateUser("Durden", "senhaDurden", "durden@email.com");				
		
		user3.addFriend(user9); user3.addFriend(user8); user3.addFriend(user6); user3.addFriend(user4); user3.addFriend(user0);
				
		Conversation conversation0 = Service_Instantiator.instantiateConversation("conversa0", user3); 
		conversation0.addUser(user1); conversation0.addUser(user0); conversation0.addUser(user4); conversation0.addUser(user9); conversation0.addUser(user8);
		
		 Service_Instantiator.instantiateMessage(conversation0, user0,""
				+ "I think human consciousness, is a tragic misstep in evolution. We became too self-aware, \n"
				+ "nature created an aspect of nature separate from itself, we are creatures that should not exist by natural law.\n"
				+ " We are things that labor under the illusion of having a self; an accretion of sensory, experience and feeling,\n"
				+ " programmed with total assurance that we are each somebody, when in fact everybody is nobody. \n"
				+ "Maybe the honorable thing for our species to do is deny our programming, stop reproducing, \n"
				+ "walk hand in hand into extinction, one last midnight - brothers and sisters opting out of a raw deal."); //Cohle
		 Service_Instantiator.instantiateMessage(conversation0,user4,""
				+ "Um bug nunca é apenas um erro. Representa algo maior. Um erro de pensar que faz de você quem você é."); //Alderson		
		Service_Instantiator.instantiateMessage(conversation0,user8,""
				+ "Você sabia que a primeira matrix foi projetada para ser\n "
				+ " um mundo humano perfeito? Onde ninguém sofreria, onde todos ficariam felizes. Foi um desastre.\n "
				+ " Ninguém aceitava o programa... Alguns acreditavam que não tínhamos\n "
				+ " a linguagem de programação para descrever seu mundo perfeito. Mas acredito que, como uma espécie,\n "
				+ " os seres humanos definem sua realidade através do sofrimento e miséria. \n "
				+ "O mundo perfeito era um sonho do qual os seus cérebros primitivos\n "
				+ " continuavam tentando acordar."); //Smith
		 Service_Instantiator.instantiateMessage(conversation0, user9, ""
				+ "Somente após o desastre podemos ressuscitar. Somente depois que se perdeu tudo estás livre para\n "
				+ " fazer qualquer coisa. Nada é estático, tudo está evoluindo, tudo está desmoronando."); //Durden		
		
		Group group0 = Service_Instantiator.instantiateGroup("Economia","If you don't claim your humanity you will become a statistic.",user9);		
		
		group0.addMember(user0);group0.addMember(user1);group0.addMember(user2);group0.addMember(user4);group0.addMember(user5);
		group0.addMember(user6);group0.addMember(user7); group0.addMember(user8);   
		group0.addModerator(user5); 		
		
		Post post2 = Service_Instantiator.instantiatePost( group0, user9, "Somente depois de perdermos tudo, somos livres para fazer qualquer coisa.");//Durden
				
		Service_Instantiator.instantiateComment(post2, user9, ""
				+ "ou are not your job, you're not how much money you have in the bank. You are not the car you drive. \n"
				+ "You're not the contents of your wallet. You are not your fucking khakis. You are all singing, \n"
				+ "all dancing crap of the world.");//Durden		
		
		 Service_Instantiator.instantiateComment(post2, user4, ""
				+ "Power belongs to the people that take it. Nothing to do with their hard work, strong ambitions, or rightful qualifications, no.\n "
				+ "The actual will to take is often the only thing that’s necessary."); // robot
		
		 Service_Instantiator.instantiateComment(post2, user5, ""
				+ "there is an idea of a Patrick Bateman, some kind of abstraction, but there is no real me, \n"
				+ "only an entity, something illusory, and though I can hide my cold gaze and you can shake my hand and feel flesh gripping yours\n"
				+ "and maybe you can even sense our lifestyles are probably comparable: I simply am not there...\n"
				+ "I have to return some videotapes..."); // bateman
		
		
		Group group1 = Service_Instantiator.instantiateGroup("Existencialismo", "This is your life and its ending one moment at a time... I don’t want to die without any scars.", user9);		
		 
		group1.addMember(user0);group1.addMember(user1);group1.addMember(user2);group1.addMember(user3); user3.addMyGroup(group1);
		group1.addMember(user4);group1.addMember(user5);group1.addMember(user6);group1.addMember(user7);group1.addMember(user8); 		
		group1.addModerator(user3);
		Post post0 = Service_Instantiator.instantiatePost(group1, user0, "A regra final");
		
		 Service_Instantiator.instantiateComment(post0, user0, "Vivemos num mundo onde nada se resolve.");	
		
		Service_Instantiator.instantiateComment(post0, user4, ""
				+ "The world is a dangerous place, Elliott, not because of those who do evil, but because of those who look on\n and do nothing."); // robot
		
		 Service_Instantiator.instantiateComment(post0, user5, ""
				+ "There are no more barriers to cross. All I have in common with the uncontrollable and the insane,\n"
				+ " the vicious and the evil, all the mayhem I have caused and my utter indifference toward it I have now surpassed.\n "
				+ "My pain is constant and sharp and I do not hope for a better world for anyone, in fact\n "
				+ "I want my pain to be inflicted on others. I want no one to escape, but even after admitting this there is no catharsis,\n "
				+ "my punishment continues to elude me and I gain no deeper knowledge of myself;\n "
				+ "no new knowledge can be extracted from my telling. This confession has meant nothing."); // bateman
		
		 Service_Instantiator.instantiateComment(post0, user9, "Nothing is static, everything is evolving, everything is falling apart."
				+ ""); // durden
		
		
		Post post1 = Service_Instantiator.instantiatePost(group1, user9, "Qual a primeira regra?"); 
		
		 Service_Instantiator.instantiateComment(post1, user9,""
				+ "We’re the middle children of history, man. No purpose or place. We have no Great War. No Great Depression.\n"
				+ "Our Great War’s a spiritual war… our Great Depression is our lives. We’ve all been raised on television to\n "
				+ "believe that one day we’d all be millionaires, and movie gods, and rock stars. But we won’t. And we’re slowly \n"
				+ "learning that fact. And we’re very, very pissed off.");
		 Service_Instantiator.instantiateComment(post1, user6, "\""
				+ "I used to think that my life was a tragedy. But now I realize, it's a f***ing comedy!");
		 Service_Instantiator.instantiateComment(post1, user7, ""
				+ "Loneliness has followed me my whole life. Everywhere. In bars, in cars, sidewalks, stores, "
				+ "\neverywhere. There's no escape. I'm God's lonely man.");		
		 Service_Instantiator.instantiateComment(post1, user8, ""
				+ "I'd like to share a revelation that I've had during my time here. It came to me when I tried to classify your\n"
				+ "species. I realized that you're not actually mammals. Every mammal on this planet instinctively develops a natural \n"
				+ "equilibrium with the surrounding environment, but you humans do not. You move to an area, and you multiply, and multiply,\n"
				+ "until every natural resource is consumed. The only way you can survive is to spread to another area. There is another \n"
				+ "organism on this planet that follows the same pattern. Do you know what it is? A virus. Human beings are a disease, a \n"
				+ "cancer of this planet, you are a plague, and we are the cure.");
		 Service_Instantiator.instantiateComment(post1, user5, "Acho que minha máscara de sanidade está "
				+ "prestes a cair.");
		Service_Instantiator.instantiateComment(post1, user2,"Eu não sou bom em sentir coisas. "
				+ "Mas uso máscaras muito bem.");
		Service_Instantiator.instantiateComment(post1, user8, ""
				+ "But, as you well know, appearances can be deceiving, which brings me back to the reason why we're here. We're not here \n"
				+ "because we're free. We're here because we're not free. There is no escaping reason; no denying purpose. Because as we \n"
				+ "both know, without purpose, we would not exist.\n"
				+ "It is purpose that created us.\n"
				+ "Purpose that connects us.\n"
				+ "Purpose that pulls us.\n"
				+ "That guides us.\n"
				+ "That drives us.\n"
				+ "It is purpose that defines us.\n"
				+ "Purpose that binds us.");		
		Service_Instantiator.instantiateComment(post1, user4,""
				+ "Oh, I don't know. Is it that we collectively thought Steve Jobs was a great man, even when we knew he made billions \n"
				+ "off the backs of children? Or maybe it's that it feels like all our heroes are counterfeit? The world itself's just \n"
				+ "one big hoax. Spamming each other with our running commentary of bullshit, masquerading as insight, our social media \n"
				+ "faking as intimacy. Or is it that we voted for this? Not with our rigged elections, but with our things, our property, \n"
				+ "our money. I'm not saying anything new. We all know why we do this, not because Hunger Games books makes us happy, but \n"
				+ "because we wanna be sedated. Because it's painful not to pretend, because we're cowards. F*** society.");
		Service_Instantiator.instantiateComment(post1, user0, ""
				+ "Bem, uma vez havia apenas escuridão. Se me perguntarem, a luz está ganhando.");
						
		Group group2= Service_Instantiator.instantiateGroup("Nature", "You are the all-singing all-dancing crap of the world", user9);
		
		group2.addMember(user0);group2.addMember(user1);group2.addMember(user2);group2.addMember(user3); user3.addMyGroup(group2);
		group2.addMember(user4);group2.addMember(user5);group2.addMember(user6);group2.addMember(user7);group2.addMember(user8);
		
		Post post44 = Service_Instantiator.instantiatePost( group2, user9, "May I never be complete. May I never be content. May I never be perfect.");//Durden
		
		 Service_Instantiator.instantiateComment(post44, user5, ""
				+ "Where there was nature and earth, life and water, I saw a desert landscape that was unending, \n"
				+ "resembling some sort of crater, so devoid of reason and light and spirit that the mind could not grasp it on any sort of conscious level\n "
				+ "and if you came close the mind would reel backward, unable to take it in. It was a vision so clear and real and vital to me\n"
				+ " that in its purity it was almost abstract. This was what I could understand, this was how I lived my life,\n"
				+ " what I constructed my movement around, how I dealt with the tangible. This was the geography around which my reality revolved:\n"
				+ " it did not occur to me, ever, that people were good or that a man was capable of change or that the world could be\n"
				+ " a better place through one’s own taking pleasure in a feeling or a look or a gesture, of receiving another person’s love or kindness.\n"
				+ "Nothing was affirmative, the term “generosity of spirit” applied to nothing, was a cliche, was some kind of bad joke. Sex is mathematics.\n"
				+ " Individuality no longer an issue. What does intelligence signify? Define reason. Desire- meaningless. Intellect is not a cure.\n"
				+ " Justice is dead. Fear, recrimination, innocence, sympathy, guilt, waste, failure, grief, were things, emotions, that no one really felt anymore.\n"
				+ " Reflection is useless, the world is senseless. Evil is its only permanence. God is not alive. Love cannot be trusted.\n"
				+ " Surface, surface, surface, was all that anyone found meaning in…this was civilization as I saw it, colossal and jagged…"); // bateman
		
		 Service_Instantiator.instantiateComment(post44, user4, ""
				+ "Hello friend. Hello friend? That's lame. Maybe I should give you a name. But that's a slippery slope, you're only in my head,\n"
				+ " we have to remember that. Shit, this actually happened, I'm talking to an imaginary person. What I'm about to tell you is top secret.\n"
				+ " A conspiracy bigger than all of us. There's a powerful group of people out there that are secretly running the world.\n"
				+ " I'm talking about the guys no one knows about, the ones that are invisible. The top 1% of the top 1%, the guys that play God without permission.\n"
				+ " And now I think they're following me..."); // robot
			
		Service_Instantiator.instantiateReport(user3, user6, "I never want to be right about my hacks, but people always find a way to disappoint.");
		Service_Instantiator.instantiateReport(user3, user3, "Maybe self-improvement isn’t the answer, maybe self-destruction is the answer.");
		Service_Instantiator.instantiateReport(user3, user5, ""
				+ "You are not your job, you’re not how much money you have in the bank.\n You are not the car you drive. \n"
				+ "You’re not the contents of your wallet. You are not special. You’re not a beautiful and unique snowflake. \n"
				+ "You’re the same decaying organic matter\n as everything else. We’re all part of the same compost heap.");
		Service_Instantiator.instantiateReport(user3, user7, ""
				+ "If the only thing keeping a person decent is the expectation of divine reward then, brother, that person is a piece of s***.\n"
				+ " And I’d like to get as many of them out in the open as possible. You gotta get together and tell yourself stories that violate \n"
				+ "every law of the universe just to get through the goddamn day? What’s that say about your reality?");
		
	}//data()
	
	  public static User getUserData(String userName) {
		    for (User u: users) {
		      if (u.getUserName().equals(userName))
		        return u;
		    }
		    return null;
		  }
	  public static Conversation getConversationData(String conversationId) {
		    for (Conversation cv: conversations) {
		      if (cv.getName().equals(conversationId))
		        return cv;
		    }
		    return null;
		  }
	  // Group
	  public static Group getGroupData(String groupName) {
		    for (Group g: groups) {
		      if (g.getName().equals(groupName))
		        return g;
		    }
		    return null;
		  }
	  // Post
	  public static Post getPostData(String text) {
		    for (Post p: posts) {
		      if (p.getText().equals(text)) 
		    	  return p;
		      }		    		      
		    return null;		    
	  }
	  // Comment
	  public static Comment getCommentData(String commentId) {
		    for (Comment cm: comments) {
		      if (cm.getText().equals(commentId))
		        return cm;
		    }
		    return null;
	  }
	
}//Database
