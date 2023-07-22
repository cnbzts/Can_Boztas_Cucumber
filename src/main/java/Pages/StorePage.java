package Pages;

import wrappers.GenericWrappers;

public class StorePage extends GenericWrappers {
	
	 public MobilePage clickMobile() {
			clickById ("Secondary_Sidebar-Categories-Mobile");
			return new MobilePage (); 
	 }
}
