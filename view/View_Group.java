package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domain.User;
import domain.Group;
import domain.Post;
import domain.Service_Instantiator;
import domain.Comment;
import database.Database;


public class View_Group {
	private User user;
	private Group group;
	private List<Group> groups  = new ArrayList<>();	
	protected static Scanner scan = new Scanner(System.in);
	
	public View_Group(User user) {
		this.user = user;
	}
		
	public View_Group(Group group) {
		this.group = group;
	}	
	
	public User getScreen_GroupUser() {
		return user;
	}	
	
	
	public void setScreen_Group(Group group) {		
		this.group = group;
	}
	
	public Group getScreen_Group() {
		return group;
	}			
	
	public void printCleanConsole(){
		int i;
		for(i=0; i<100; i++) {
		System.out.println("    ");
		}		
	}
	
	public void printGroupScreen() {
		System.out.println("___________________________________________________________________________________________________________");		
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("             ");
		System.out.println("              \n"
				+ "                        .--.           .---.        .-.\n"
				+ "                    .---|--|   .-.     |   |  .---. |~|-=-=-.--.\r\n"
				+ "                 .--|===|Ex|---|_|--.__|   |--|:::| |~|     |==|---.\r\n"
				+ "                |%%%|   |is|===| |~~|%%|Ma |--|   |_|~| De  |  |___|-.\r\n"
				+ "                |   |Epi|te|===| |==|  |ter|  |:::|=| | Ter |Ni|---|=|\r\n"
				+ "                |On |ste|nc|   |_|__|  |ia |__|   | | | mi  |i |___| |\r\n"
				+ "                | To|mo |ia|   |_|__|  |lis|__|   | | | nis |li|___| |\r\n"
				+ "                |lo | lo|li|   |_|__|  |mo |__| ? | | | mo  | s|___| |\r\n"
				+ "                |gia|gia|sm|   |_|__|  |   |__|   | | |     |mo|___| |\r\n"
				+ "                |   |   |o |   |_|__|  |   |__|   | | |     |  |___| |\r\n"
				+ "                |~~~|===|--|===|~|~~|%%|~~~|--|:::|=|~|-----|==|---|=|\r\n"
				+ "                ^---^---'--^---^-^--^--^---'--^---^-^-^-=-=-^--^---^-'          ");
		System.out.println("  ");
		System.out.println(" ____                         Grupos   _______________________________________________________");
		System.out.println(" ___________________________________________________________________________________________________________");
		System.out.println("|  ");    
		List<Group> groups = Database.groups;		
		for (Group group : groups) {
			System.out.println("|   " + group.getName() );
		}
		System.out.println(" ___________________________________________________________________________________________________________");
		System.out.println("|  ");
		System.out.println("|                         1) Selecionar grupo. ");
		System.out.println("|  ");		
		System.out.println("|                                      2) Criar grupo");
		System.out.println("|  ");
		System.out.println("|                                                    0) Sair"
				+ "\n"
				+ "           \n"
				+ "                                       /|~|\\\r\n"
				+ "                                      / |=| \\\r\n"
				+ "                                     /  | |  \\\r\n"
				+ "                                    |   | |   |\r\n"
				+ "                                    |   | |   |\r\n"
				+ "                                    |   | |   |\r\n"
				+ "                                    |   |=|   |\r\n"
				+ "                                    |  //A\\\\  |\r\n"
				+ "                                    | /// \\\\\\ | \r\n"
				+ "                                    |///   \\\\\\|"
				+ "");
		System.out.println("  ");	
		System.out.println("___________________________________________________________________________________________________________");
				
	}
	
	public String printSelectGroup() {
		System.out.println("___________________________________________________________________________________________________________");		
		System.out.println(""
				+ ""
				+ "\n"
				+ "                       ||-------------------------------------------------------||\r\n"
				+ "                       ||.--.    .-._                        .----.             ||\r\n"
				+ "                       |||==|____| |H|___            .---.___|\"\"\"\"|_____.--.___ ||\r\n"
				+ "                       |||  |====| | |xxx|_          |+++|=-=|_  _|-=+=-|==|---|||\r\n"
				+ "                       |||==|    | | |   | \\         |   |   |_\\/_|Black|  | ^ |||\r\n"
				+ "                       |||  |    | | |   |\\ \\   .--. |   |=-=|_/\\_|-=+=-|  | ^ |||\r\n"
				+ "                       |||  |    | | |   |_\\ \\_( oo )|   |   |    |     |  | ^ |||\r\n"
				+ "                       |||==|====| |H|xxx|  \\ \\ |''| |+++|=-=|\"\"\"\"|-=+=-|==|---|||\r\n"
				+ "                       ||`--^----'-^-^---'   `-' \"\"  '---^---^----^-----^--^---^||\r\n"
				+ "                       ||-------------------------------------------------------||\r\n"
				+ "                       ||-------------------------------------------------------||\r\n"
				+ "                       ||               ___                   .-.__.-----. .---.||\r\n"
				+ "                       ||              |===| .---.   __   .---| |XX|<(*)>|_|^^^|||\r\n"
				+ "                       ||         ,  /(|   |_|III|__|''|__|:x:|=|  |     |=|   |||\r\n"
				+ "                       ||      _a'{ / (|===|+|   |++|  |==|   | |  |Illum| |   |||\r\n"
				+ "                       ||      '/\\\\/ _(|===|-|   |  |''|  |:x:|=|  |inati| |   |||\r\n"
				+ "                       ||_____  -\\{___(|   |-|   |  |  |  |   | |  |     | |   |||\r\n"
				+ "                       ||       _(____)|===|+|[I]|  |''|==|:x:|=|XX|<(*)>|=|^^^|||\r\n"
				+ "                       ||              `---^-^---^--^--'--^---^-^--^-----^-^---^||\r\n"
				+ "                       ||-------------------------------------------------------||\r\n"
				+ "                       ||_______________________________________________________||"
				+ ""
				+ "");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("______________________________________________________________________");
		System.out.println("_____                        Selecionar Grupo _______________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("|                                                                     ");
		System.out.println("|   					                                              ");			
		for (int i=0; i< Database.groups.size() ; i++) {
			System.out.println("|   " + (i+1) +") " + Database.groups.get(i).getName() );
		}
		System.out.println("|   					                                              ");		
		System.out.println("|                          Digite número de grupo  desejado:                                   ");
		System.out.println("|   					                                              ");
		System.out.println("___________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		String numberGroup = scan.nextLine();	
		int error = 0; 
		try {
			for(int i=0; i< Database.groups.size(); i++) {			
				if (i+1 == Integer.parseInt(numberGroup) ) {
					error=0;
					return Database.groups.get(i).getName();				
				} else {
					error++; 				
				}
			}
		}catch (NumberFormatException nfe) {
			System.out.println("ERRO! Digite número correspondente!"); scan.nextLine();
		}		
		if(error != 0) {		
				try {
	    		throw new RuntimeException("Erro: Nenhum grupo correspondente!"); 
	    		}
	    		catch (RuntimeException ex) {
	    			System.out.println("Erro: Nenhum grupo correspondente!"); scan.nextLine(); 	    				
	    		}				
			}
		return "Nenhum grupo correspondente!";	
	}
		
	public Post printSelectPost(Group selectedGroup) {
		printCleanConsole();
		System.out.println("___________________________________________________________________________________________________________"
				+ "\n"
				+ "                                            _________   _________\r\n"
				+ "                                       ____/POSTs 452\\ /     453 \\____\r\n"
				+ "                                     /| ------------- |  ------------ |\\\r\n"
				+ "                                    ||| ------------- | ------------- |||\r\n"
				+ "                                    ||| ------------- | ------------- |||\r\n"
				+ "                                    ||| ------- ----- | ------------- |||\r\n"
				+ "                                    ||| ------------- | ------------- |||\r\n"
				+ "                                    ||| ------------- | ------------- |||\r\n"
				+ "                                    |||  ------------ | ----------    |||\r\n"
				+ "                                    ||| ------------- |  ------------ |||\r\n"
				+ "                                    ||| ------------- | ------------- |||\r\n"
				+ "                                    ||| ------------- | ------ -----  |||\r\n"
				+ "                                    ||| ------------  | ------------- |||\r\n"
				+ "                                    |||_____________  |  _____________|||\r\n"
				+ "                                     /_____/--------\\\\_//--------\\_____\\"
				+ ""
				+ "");		
		System.out.println("______________________________________________________________________");
		System.out.println("_____                        Posts de " + selectedGroup.getName() );
		System.out.println("______________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");		
		System.out.println("                                                                     ");
		for(int i=0;i< selectedGroup.getPosts().size() ; i++) {
		System.out.println("    " + (i+1) + ") " + selectedGroup.getPosts().get(i)   );
		System.out.println("  					                                              ");
		}
		System.out.println("   					                                              ");
		System.out.println("|                       							                  ");
		System.out.println("|                          Digite opção de post desejado:                     ");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		String postSelected = scan.nextLine();
		int error = 0; 
		try { int i;
			for (i=0; i< selectedGroup.getPosts().size(); i++) {			
				if (i+1 == Integer.parseInt(postSelected) ) {
					error=0;
					return selectedGroup.getPosts().get(i);				
				} else {
					error++; 				
				}
			}
		}catch (NumberFormatException nfe) {
			System.out.println("ERRO! Digite número correspondente!"); scan.nextLine();
		}		
		if(error != 0) {		
				try {
	    		throw new RuntimeException("Erro: Nenhum post correspondente!"); 
	    		}
	    		catch (RuntimeException ex) {
	    			System.out.println("Erro: Nenhum post correspondente!"); scan.nextLine(); 	    				
	    		}				
			}
		return null;		
	  	}								
		
	public Post printPost(Post selectedPost, Group selectedGroup, User me) {				
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("_______ ");
		System.out.println("_______ Post: " + selectedPost   );
		System.out.println("_______ ");
		System.out.println("_______ ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("___________________________________________________________________________________________________________"
				+ "\n"
				+ "                          _______________________________\r\n"
				+ "                        /| comments      |  ------------ |\\\r\n"
				+ "                       ||| ------------- | ------------- |||\r\n"
				+ "                       ||| ------------- | ------------- |||\r\n"
				+ "                       ||| ------- ----- | ------------- |||\r\n"
				+ "                       ||| ------------- | ------------- |||\r\n"
				+ "                       ||| ------------- | ------------- |||\r\n"
				+ "                       |||  ------------ | ----------    |||\r\n"
				+ "                       ||| ------------- |  ------------ |||\r\n"
				+ "                       ||| ------------- | ------------- |||\r\n"
				+ "                       ||| ------------- | ------ -----  |||\r\n"
				+ "                       ||| ------------  | ------------- |||\r\n"
				+ "                       |||_____________  |  _____________|||\r\n"
				+ "                        /_____/--------\\\\_//--------\\_____\\"
				+ "\n");
		System.out.println("______________________________________________________________________");		
		System.out.println("____");
		for(int i=0;i< selectedPost.getComments().size() ; i++) {
		System.out.println("   " + selectedPost.getComments().get(i) );
		System.out.println(" ");
		System.out.println("___");
		}
		System.out.println("______________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println(" _____________________________________________________________________");
		System.out.println("|                                                                     ");
		int i;
		for(i=0; i < selectedGroup.getMembers().size(); i++ ) {
			if(selectedGroup.getMembers().get(i).getUserName().equals(me.getUserName()) ) {
				System.out.println("|                    1) Escrever Comentário                                               ");
				System.out.println("|                          2) Deletar meu comentário                               \n");
			}
		}
		for(i=0; i < selectedGroup.getModerators().size(); i++ ) {
			if (selectedGroup.getModerators().get(i).getUserName().equals(me.getUserName()) ) {
				System.out.println("|                                 3) Deletar algum comentário inadequado                  \n");
			}
		}
		System.out.println("|                                            0) Voltar                                                         ");
		System.out.println("|_____________________________________________________________________");		
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		
		return selectedPost;
	}
	
	public Post readAddCommment(Post postSelected, User user) {
		System.out.println(" ");
		System.out.println("___________________________________________________________________________________________________________"
				+ "\n"
				+ "                          _______________________________\r\n"
				+ "                        /| commenting    |               |\\\r\n"
				+ "                       |||               |               |||\r\n"
				+ "                       |||               |               |||\r\n"
				+ "                       |||               |               |||\r\n"
				+ "                       |||               |               |||\r\n"
				+ "                       |||               |               |||\r\n"
				+ "                       |||               |               |||\r\n"
				+ "                       |||               |               |||\r\n"
				+ "                       |||               |               |||\r\n"
				+ "                       |||               |               |||\r\n"
				+ "                       |||               |               |||\r\n"
				+ "                       |||_____________  |  _____________|||\r\n"
				+ "                        /_____/--------\\\\_//--------\\_____\\"
				+ "\n\n");
		System.out.println("______________________________________________________________________");		
		System.out.println("____");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("_________ Post: " + postSelected);
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
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     ");
		String newCommentString = scan.nextLine();
		if(newCommentString.equals("")) {
    		try {
    		throw new RuntimeException("Erro Comment: text não pode ser vazio");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Comentário não pode ser vazio!"); scan.nextLine(); return null;
    		}    		
    	}else if(newCommentString.length() < 11 ) {
    		try{
        		throw new RuntimeException("Comentário não pode ser menor que 11 digitos!");
        		}
        		catch (RuntimeException ex) {
        			System.out.println("Comentário não pode ser menor que 11 digitos!"); scan.nextLine(); return null;       			
        		}
    	} else {
		Comment newComment = Service_Instantiator.instantiateComment(postSelected, this.user, newCommentString);
		postSelected.addComment(newComment);
		this.user.addMyComments(newComment);
		Database.comments.add(newComment);
		
		return postSelected;
    	}
	}
	

	public Group printGroup(Group selectedGroup, User me) {			
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("\n"
				+ "                              .--.                   .---.\r\n"
				+ "                          .---|__|           .-.     |~~~|\r\n"
				+ "                       .--|===|--|_          |_|     |~~~|--.\r\n"
				+ "                       |  |===|  |'\\     .---!~|  .--|   |--|\r\n"
				+ "                       |%%|   |  |.'\\    |===| |--|%%|   |  |\r\n"
				+ "                       |%%|   |  |\\.'\\   |   | |__|  |   |  |\r\n"
				+ "                       |  |   |  | \\  \\  |===| |==|  |   |  |\r\n"
				+ "                       |  |   |__|  \\.'\\ |   |_|__|  |~~~|__|\r\n"
				+ "                       |  |===|--|   \\.'\\|===|~|--|%%|~~~|--|\r\n"
				+ "                       ^--^---'--^    `-'`---^-^--^--^---'--'"
				+ "");
		System.out.println("______________________________________________________________________");		
		System.out.println("____");
		System.out.println("____ "                        + selectedGroup.getName() + " ______");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("|                                                                     ");
		System.out.println("|                          Descrição: " + selectedGroup.getDescription());
		System.out.println("|                                                                     ");
		for(int i=0;i< selectedGroup.getPosts().size() ; i++) {
		System.out.println("|                          " + selectedGroup.getPosts().get(i) );
		System.out.println("|__ ");
		}
		System.out.println("|_____________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println(" _____________________________________________________________________");
		System.out.println("|                                                                     ");
		int i; int membro = 0;
		for(i=0; i < selectedGroup.getMembers().size(); i++ ) {
			if(selectedGroup.getMembers().get(i).getUserName().equals(me.getUserName()) ) {
				membro = 1;
			}
		}
		if(membro!=1) {
			System.out.println("|       +) Solicitar participação                                     \n");
		} else {
			System.out.println("|       -) Nâo ser membro de grupo                                     \n");
		}
		
		System.out.println("|                                                                     ");
		System.out.println("|                 1) Selecionar post                                     \n");
		System.out.println("|                                                                     ");		
		for(i=0; i < selectedGroup.getMembers().size(); i++ ) {
			if(selectedGroup.getMembers().get(i).getUserName().equals(me.getUserName()) ) {
				System.out.println("|                          2) Escrever Post                                               \n");
				System.out.println("|                                                                     ");
			}
		}
		for(i=0; i < selectedGroup.getModerators().size(); i++ ) {
			if (selectedGroup.getModerators().get(i).getUserName().equals(me.getUserName()) ) {		
				System.out.println("|         3) Visualizar membros                     4) Adicionar user            \n");           		
				System.out.println("|                                                                     ");				               
				System.out.println("|                5) Remover user                           6) Adicionar moderador         \n");	
			}
		}
		System.out.println("|                                                                   0) Voltar                          \n");
		System.out.println(" ____________________________________________________________________________");		
		System.out.println(" ");
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("___________________________________________________________________________________________________________");
		
		
		return selectedGroup;
	}
	
	
	public Post readAddPost(Group selectedGroup, User user) {		
		System.out.println(" ______________________________________________________________________");		
		System.out.println("_______ " + selectedGroup);
		System.out.println(" ______________________________________________________________________");
		System.out.println("\n\n\n"
				+ "                         __\r\n"
				+ "                        (`/\\\r\n"
				+ "                        `=\\/\\ __...--~~~~~-._   _.-~~~~~--...__\r\n"
				+ "                         `=\\/\\               \\ /               \\\\\r\n"
				+ "                          `=\\/    posting...  V                 \\\\\r\n"
				+ "                          //_\\___--~~~~~~-._  |  _.-~~~~~~--...__\\\\\r\n"
				+ "                         //  ) (..----~~~~._\\ | /_.~~~~----.....__\\\\\r\n"
				+ "                        ===( INK )==========\\\\|//====================\r\n"
				+ "                       __   \\___/________   `---`_________________________________________________________"
				+ "\n\n"
				+ "___________________________________________________________________________________________________________");;
		System.out.println(" ______________________________________________________________________");		
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println(" ______________________________________________________________________");		
		System.out.println("___________________________________________________________________________________________________________");
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     ");
		System.out.println("|                  Digite Post: ");		
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     \n\n\n\n\n");
		String newTextPost = scan.nextLine();	
		if(newTextPost.equals("")) {
    		try {
    		throw new RuntimeException("Erro Post: text não pode ser vazio");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Post não pode ser vazio!"); scan.nextLine(); return null;
    		}    		
    	}else if(newTextPost.length() < 11 ) {
    		try{
        		throw new RuntimeException("Post não pode ser menor que 11 digitos!");
        		}
        		catch (RuntimeException ex) {
        			System.out.println("Post não pode ser menor que 11 digitos!"); scan.nextLine(); return null;       			
        		}
    	} else {
		Post newPost = Service_Instantiator.instantiatePost(selectedGroup, user, newTextPost);
		selectedGroup.addPost(newPost);
		Database.posts.add(newPost);		
		this.user.addMyPosts(newPost);
		
		return newPost;
    	}
	}
	
	public void addGroup(Group group) {	 
		this.groups.add(group);
		
	}
	
	public Group readCreateGroup(User user) {
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println(" _________________________________________________________________________________________________________"
				+ "\n"
				+ "                           __________________   __________________\r\n"
				+ "                       .-/|                  \\ /                  |\\-.\r\n"
				+ "                       ||||                   |                   ||||\r\n"
				+ "                       ||||   Criando Grupo   |       ~~*~~       ||||\r\n"
				+ "                       ||||                   |                   ||||\r\n"
				+ "                       ||||                   |                   ||||\r\n"
				+ "                       ||||                   |                   ||||\r\n"
				+ "                       ||||  Novas            |     --==*==--     ||||\r\n"
				+ "                       ||||                   |                   ||||\r\n"
				+ "                       ||||  respons          |                   ||||\r\n"
				+ "                       ||||        abilidades |                   ||||\r\n"
				+ "                       ||||                   |                   ||||\r\n"
				+ "                       ||||__________________ | __________________||||\r\n"
				+ "                       ||/===================\\|/===================\\||\r\n"
				+ "                       `--------------------~___~-------------------''"
				+ ""
				+ "\n\n");		
		System.out.println(" _________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println(" ______________________________________________________________________");
		System.out.println(" ______________________________________________________________________");		
		System.out.println(" ______________________________________________________________________");
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     ");
		System.out.println("|                         Digite nome do Grupo e pressione 'Enter'. ");		
		System.out.println("|                         Em seguida,                                                         ");
		System.out.println("|                         digite descrição de Grupo:                    ");		
		System.out.println("|                                                                     ");
		System.out.println("|                                                                     ");

		System.out.println("__________________________________________________________________________________________________________");
		System.out.println(" _________________________________________________________________________________________________________");
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("_____ ");
		String groupName = scan.nextLine();
		if(groupName.equals("")) {
    		try {
    		throw new RuntimeException("Erro Group: name não pode ser vazio");
    		}
    		catch (RuntimeException ex) {
    			System.out.println("Nome de grupo não pode ser vazio!"); scan.nextLine(); return null;
    		}    		
    	}else if(groupName.length() < 8 ) {
    		try{
        		throw new RuntimeException("Erro Group: name não pode ser menor que 8 digitos!");
        		}
        		catch (RuntimeException ex) {
        			System.out.println("Nome não pode ser menor que 8 digitos!"); scan.nextLine(); return null;       			
        		}
    	}else {		
    		String groupDescription = scan.nextLine();    	
			if(groupDescription.equals("")) {
    			try {
    			throw new RuntimeException("Erro Group: description não pode ser vazio");
    			}
    			catch (RuntimeException ex) {
    				System.out.println("Descrição de grupo não pode ser vazia!"); scan.nextLine(); return null;
    			}    		
    		}else if(groupDescription.length() < 33 ) {
    			try{
        			throw new RuntimeException("Erro Group: description não pode ser menor que 33 digitos!");
        			}
        			catch (RuntimeException ex) {
        				System.out.println("Descrição não pode ser menor que 33 digitos!"); scan.nextLine(); return null;       			
        			}
    		}else {
    		Group newGroup = Service_Instantiator.instantiateGroup(groupName, groupDescription, this.user);
			Database.groups.add(newGroup);
			this.user.addMyGroup(newGroup);
		
			return newGroup;
    		}
    	}
	}	
	
	public Group readAddUserToGroup(Group selectedGroup) {	
		printUsersNames();				
		System.out.println("____________________________________________________________________");
		System.out.println("____________________________________________________________________");
		System.out.println("_____ ");		
		System.out.println(" ");
		System.out.println("|                            Digite user para adicionar em " + selectedGroup);
		System.out.println("| ");
		System.out.println("| ");	
		int error = 1;
		String nameUser = scan.nextLine();			
		for (User u : Database.users) {
			if (u.getUserName().equals(nameUser)) {
				User userHere;
				userHere = u;						
				selectedGroup.addMember(userHere);	
				userHere.addMyGroup(selectedGroup);
				error = 0;				
			}
		}
		if(error!=0) {
		System.out.println("Usuário inexistente!"); scan.nextLine();
		error=0;
		}
		return selectedGroup;
	}
	
	public void printUsersNames() {
		List<User> users = Database.users;
		System.out.println("____________________________________________________________________________________________________");		
		System.out.println(""
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
				+ "                             $$$$$$$$$$$$$$ .$$$$$$$$$$$' `$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\r\n"
				+ "                             $$$$$$$$$$$$$$ $$$$$$$$$$$$   `$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\r\n"
				+ "                             $$$$$$$$$$$$$$$$$$$$$$$$$$$    `$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\r\n"
				+ "");
		System.out.println("____________________________________________________________________________________________________");		
		System.out.println("_____ ");		
		System.out.println("_____                    Sobreviventes: ");
		System.out.println("_____ ");				
		for (User user : users) {
			System.out.println("|                   " + user.getUserName());
		}
		System.out.println("");
		System.out.println("_____ ");		
		System.out.println("_____ ");
		System.out.println("____________________________________________________________________");
		System.out.println("_____ ");		
		System.out.println("_____");
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
	
	
}// Screen_Group



















