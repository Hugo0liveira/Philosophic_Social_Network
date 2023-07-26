package controller;

import view.View_Loading;

public class Main_Controller {
	private View_Loading view_Loading;
	
	public Main_Controller(){
		view_Loading = new View_Loading();	
		view_Loading.printLoading(); 
		initiate();
	}
	private void initiate() {
		new MainMenu_Controller();
	}	
}
