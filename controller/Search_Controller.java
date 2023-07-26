package controller;

import domain.Service_Search;
import view.View_Search;

public class Search_Controller {	
	private View_Search view_Search;	
	
	
	public Search_Controller(String MyEmail){
		search_Controller(MyEmail);		
	}
	
	
	public void search_Controller(String MyEmail){
		view_Search = new View_Search();
		String search = view_Search.printView_Search();
		
		String loopSearchController = "0";
		String opSearchController = Service_Search.search(search);
		do {			
			switch (opSearchController) {	
						
			case "0": // voltar
				new LoggedMainMenu_Controller(MyEmail);
				loopSearchController = "1";
			 break;
			default:
				String searchResult	= opSearchController;
				view_Search.printView_SearchResult(searchResult);
				loopSearchController = "1";
			 break;
			}
		} while(loopSearchController == "0");
		
		
		
	}
}
