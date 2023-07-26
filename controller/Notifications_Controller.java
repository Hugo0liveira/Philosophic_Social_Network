package controller;

import view.View_Notifications;
import domain.Service_AfterLogin;
import domain.Service_Friends;
import domain.Service_Notification;

public class Notifications_Controller {
	private View_Notifications view_Notifications;
	
	
	
	public Notifications_Controller(String MyEmail){
		notifications_Controller(MyEmail);
	}
	
	public void notifications_Controller(String MyEmail){	
		view_Notifications = new View_Notifications();
		
		
		String loopNotifications = "0";
		String opNotifications;
		do {
			String allNotifications =	Service_Notification.allNotifications(Service_AfterLogin.getMySelf(MyEmail));
			opNotifications = view_Notifications.myNotifications(allNotifications);					
			
			switch (opNotifications) {
			case "1": 	// Notificações de solicitação de amizade   
				String name = view_Notifications.myNotificationsFriendship(allNotifications);				
				if(name == "error") {
					view_Notifications.printError();
				} else {
					Service_Friends.addFriendship(MyEmail, name);
					view_Notifications.printAddSuccess(name);
				}				
				loopNotifications = "0";
			 break;
			case "2": 	// Notificações de convite de grupo
				String nameGroup = view_Notifications.myNotificationsInvite(allNotifications);				
				if(nameGroup == "error") {
					view_Notifications.printError();
				} else {
					Service_Friends.addInvite(MyEmail, nameGroup);
					view_Notifications.printInviteSuccess(nameGroup);
				}				
				loopNotifications = "0";
				
				loopNotifications = "0";
			 break;
		/*	case "3": 	// Notificações de grupos que participo   
				
				loopNotifications = "0";
			 break;
			case "4": 	// Notificações de meus posts  
				
				loopNotifications = "0";
			 break;
			case "5": 	// Notificações de conversa 
				
				loopNotifications = "0";
			 break;			*/
			case "0": 	// Voltar				
				loopNotifications = "1";
			 break;
			default:
				loopNotifications = "0";
			 break;
			}
		
		
		} while (loopNotifications=="0");	
		
		
		
	}
	
	

}
