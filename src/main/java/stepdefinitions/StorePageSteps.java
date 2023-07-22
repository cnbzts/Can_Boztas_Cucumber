package stepdefinitions;

import wrappers.GenericWrappers;
import Pages.StorePage;
import io.cucumber.java.en.Then;

public class StorePageSteps extends GenericWrappers {
	
	StorePage storePage = new StorePage();
	
	@Then ("Click Mobile")
	public void Click_mobile() {
		storePage.clickMobile();
	}
	
	
	

}
