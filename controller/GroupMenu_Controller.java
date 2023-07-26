package controller;

import view.View_GroupMenu;
import domain.Service_AfterLogin;
import domain.Service_Group;

public class GroupMenu_Controller {
	private View_GroupMenu view_GroupMainMenu;
	
	public GroupMenu_Controller(String MyEmail){
		groupMainMenu_Controller(MyEmail);
	}
	
	public void groupMainMenu_Controller(String MyEmail){
		view_GroupMainMenu = new View_GroupMenu();
		
	String loopGroupMainMenu_Controller = "0";
	String opGroupMainMenu_Controller = "0";
	do {	// EM mainMenu de GRUPO						
		String groups = Service_AfterLogin.allGroups();
		opGroupMainMenu_Controller = view_GroupMainMenu.mainMenu(groups);			
			switch(opGroupMainMenu_Controller) {
			case "0": 	// Voltar
				new LoggedMainMenu_Controller(MyEmail);				
				loopGroupMainMenu_Controller="1";
			 break;
			default:
				view_GroupMainMenu.printError();
				loopGroupMainMenu_Controller="0";
			break;
			case "1": 	// Selecionar grupo
				String groupsByNumber = Service_AfterLogin.allGroupsByNumber();
				String groupSelectedNumber = view_GroupMainMenu.selectingGroup(groupsByNumber);
				String selectedGroupName  = Service_Group.getGroupName(groupSelectedNumber);
				if(selectedGroupName != null) {					
					new GroupSelected_Controller(MyEmail, selectedGroupName);
					loopGroupMainMenu_Controller="0";
				} else {
					view_GroupMainMenu.printError();
				}				
				loopGroupMainMenu_Controller="0";
			 break;
			case "2": 	// Criar grupo
				String groupName = view_GroupMainMenu.CreateGroupName();
				String groupNameCondition = Service_Group.checkGroupName(groupName);
				if(groupNameCondition == "true") {
					String groupDescription = view_GroupMainMenu.CreateGroupDescription();
					Service_Group.createGroup(MyEmail, groupName, groupDescription);
					loopGroupMainMenu_Controller="0";
				} else {
					view_GroupMainMenu.errorCreatingGroup(groupNameCondition);
				}
				
				loopGroupMainMenu_Controller="0";
			 break;
			case "3": 	// Meus grupos
				String myGroupsByNumber = Service_AfterLogin.allMyGroupsByNumber(MyEmail);
				String groupNumber = view_GroupMainMenu.showMyGroups(myGroupsByNumber);
				String GroupName  = Service_Group.getMyGroupName(MyEmail, groupNumber);
				if(GroupName != null) {					
					new GroupSelected_Controller(MyEmail, GroupName);
					loopGroupMainMenu_Controller="0";
				} else {
					view_GroupMainMenu.printError();
				}
				loopGroupMainMenu_Controller="0";
			break;
			}
		} while(loopGroupMainMenu_Controller=="0");
			
	}
	
}

