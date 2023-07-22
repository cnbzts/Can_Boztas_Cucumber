package stepdefinitions;

import wrappers.GenericWrappers;
import Pages.ClientAreaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ClientAreaPageSteps extends GenericWrappers {
	
	ClientAreaPage clientareapage = new ClientAreaPage();
	
	@Then ("Click Service")
	public void Click_Service () {
		clientareapage.clickService();
	}
	@And ("Click Order New services")
	public void Click_Order_New_services () {
		clientareapage.clickOrderNewservices();
	}
	

}
